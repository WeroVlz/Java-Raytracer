package up.edu.isgc.raytracer.lights;

import up.edu.isgc.raytracer.Intersection;
import up.edu.isgc.raytracer.Vector3D;

import java.awt.*;

/**
 * This class creates a PointLight that inherits from Light.
 *
 * @author Edgar Velazquez
 * @co-author Jafet Rodriguez
 */
public class PointLight extends Light{
    public PointLight(Vector3D position, Color color, double intensity) {
        super(position, color, intensity);
    }

    /**
     * This method calculates the dot product of a normal and the light direction.
     * @param intersection
     * @return double
     */
    @Override
    public double getNDotL(Intersection intersection) {
        return Math.max(Vector3D.dotProduct(intersection.getNormal(), Vector3D.substract(getPosition(), intersection.getPosition())), 0.0);
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
