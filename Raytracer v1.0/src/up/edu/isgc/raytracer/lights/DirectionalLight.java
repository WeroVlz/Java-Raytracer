package up.edu.isgc.raytracer.lights;

import up.edu.isgc.raytracer.Intersection;
import up.edu.isgc.raytracer.Vector3D;

import java.awt.*;

/**
 * This class creates a DirectionalLight that inherits from Light.
 *
 * @author Edgar Velazquez
 * @co-author Jafet Rodriguez
 */
public class DirectionalLight extends Light{
    private Vector3D direction;

    public DirectionalLight(Vector3D direction, Color color, double intensity) {
        super(Vector3D.ZERO(), color, intensity);
        setDirection(direction);
    }


    public Vector3D getDirection() { return direction; }

    public void setDirection(Vector3D direction) { this.direction = direction; }

    /**
     * This method calculates the dot product of a normal and the light direction.
     * @param intersection
     * @return double
     */
    @Override
    public double getNDotL(Intersection intersection) {
        return Math.max(Vector3D.dotProduct(intersection.getNormal(), Vector3D.scalarMultiplication(getDirection(), -1.0)), 0.0);
    }

    /**
     * This method calculates the dot product of a normal and the half vector of the light and camera direction.
     * @param intersection
     * @param H Half vector when calculating reflection
     * @return double
     */
    @Override
    public double getNDotH(Intersection intersection, Vector3D H) {
        return Math.max(Vector3D.dotProduct(intersection.getNormal(),H), 0.0);
    }
}
