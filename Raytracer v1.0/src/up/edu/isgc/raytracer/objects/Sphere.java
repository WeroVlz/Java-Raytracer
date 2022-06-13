/**
 * Java Raytracer
 */

package up.edu.isgc.raytracer.objects;

import up.edu.isgc.raytracer.Intersection;
import up.edu.isgc.raytracer.Ray;
import up.edu.isgc.raytracer.Vector3D;
import up.edu.isgc.raytracer.objects.Object3D;

import java.awt.*;

/**
 * This class creates a Sphere from Object3D.
 *
 * @author Edgar Velazquez
 * @co-author Jafet Rodriguez
 */
public class Sphere extends Object3D {
    private double radius;

    public Sphere(Vector3D position,double radius, Color color, double shininess, boolean reflective, boolean refractive) {
        super(position, color, shininess, reflective, refractive);
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    /**
     * This method calculates the intersection while raycasting between an object and a ray.
     *
     * @param ray
     * @return intersection where the ray and an object collide
     */
    @Override
    public Intersection getIntersection(Ray ray) {
        Vector3D L = Vector3D.substract(ray.getOrigin(), getPosition());
        double tca = Vector3D.dotProduct(ray.getDirection(), L);
        double L2 = Math.pow(Vector3D.magnitude(L), 2);
        //radius^2
        double r2 = Math.pow(getRadius(),2);
        //Intersection
        double tca2 = Math.pow(tca, 2);
        double d2 = tca2 - L2 + r2;
        if(d2 >= 0){
            double d = Math.sqrt(d2);
            double t0 = -tca + d;
            double t1 = -tca - d;

            double distance = Math.min(t0, t1);
            Vector3D position = Vector3D.add(ray.getOrigin(), Vector3D.scalarMultiplication(ray.getDirection(), distance));
            Vector3D normal = Vector3D.normalize(Vector3D.substract(position, getPosition()));
            return new Intersection(position, distance, normal, this);
        }

        return null;
    }
}
