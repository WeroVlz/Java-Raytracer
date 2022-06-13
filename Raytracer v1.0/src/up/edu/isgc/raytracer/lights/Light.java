package up.edu.isgc.raytracer.lights;

import up.edu.isgc.raytracer.Intersection;
import up.edu.isgc.raytracer.Ray;
import up.edu.isgc.raytracer.Vector3D;
import up.edu.isgc.raytracer.objects.Object3D;

import java.awt.*;

/**
 * This class creates a Light from Object3D.
 *
 * @author Edgar Velazquez
 * @co-author Jafet Rodriguez
 */
public abstract class Light extends Object3D {

    private double intensity;

    public Light(Vector3D position, Color color, double intensity) {
        super(position, color,0, false, false);
        setIntensity(intensity);
    }

    public double getIntensity() { return intensity; }

    public void setIntensity(double intensity) { this.intensity = intensity; }

    public abstract double getNDotL(Intersection intersection);

    public abstract double getNDotH(Intersection intersection, Vector3D H);

    public Intersection getIntersection(Ray ray){
        return new Intersection(Vector3D.ZERO(), -1, Vector3D.ZERO(), null);
    }
}
