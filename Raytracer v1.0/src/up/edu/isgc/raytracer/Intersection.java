/**
 * Java Raytracer
 */

package up.edu.isgc.raytracer;

import up.edu.isgc.raytracer.objects.Object3D;

/**
 * This class creates an intersection of a ray with an object.
 *
 *@author Edgar Velazquez
 *@co-author Jafet Rodriguez
 */
public class Intersection {

    private double distance;
    private Vector3D normal;
    private Vector3D position;
    private Object3D object;

    public Intersection(Vector3D position, double distance, Vector3D normal, Object3D object) {
        setDistance(distance);
        setNormal(normal);
        setPosition(position);
        setObject(object);
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public Vector3D getNormal() {
        return normal;
    }

    public void setNormal(Vector3D normal) {
        this.normal = normal;
    }

    public Vector3D getPosition() {
        return position;
    }

    public void setPosition(Vector3D position) {
        this.position = position;
    }

    public Object3D getObject() {
        return object;
    }

    public void setObject(Object3D object) {
        this.object = object;
    }
}
