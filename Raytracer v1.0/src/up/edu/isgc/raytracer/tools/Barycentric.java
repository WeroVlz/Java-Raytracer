/**
 * Java Raytracer
 */

package up.edu.isgc.raytracer.tools;

import up.edu.isgc.raytracer.Vector3D;
import up.edu.isgc.raytracer.objects.Triangle;

/**
 * This class implements barycentric coordinates.
 *
 * @author Jafet Rodriguez
 */
public class Barycentric {

    /**
     * This method calculates the barycentric coordinates of a triangle in a certain point.
     * @param point of triangle
     * @param triangle
     * @return barycentric coordinates
     */
    public static double[] CalculateBarycentricCoordinates(Vector3D point, Triangle triangle){
        double u, v, w;
        Vector3D[] vertices = triangle.getVertices();
        Vector3D a = vertices[0];
        Vector3D b = vertices[1];
        Vector3D c = vertices[2];

        Vector3D v0 = Vector3D.substract(b, a);
        Vector3D v1 = Vector3D.substract(c, a);
        Vector3D v2 = Vector3D.substract(point, a);
        double d00 = Vector3D.dotProduct(v0, v0);
        double d01 = Vector3D.dotProduct(v0, v1);
        double d11 = Vector3D.dotProduct(v1, v1);
        double d20 = Vector3D.dotProduct(v2, v0);
        double d21 = Vector3D.dotProduct(v2, v1);
        double denominator = d00 * d11 - d01 * d01;
        v = (d11 * d20 - d01 * d21) / denominator;
        w = (d00 * d21 - d01 * d20) / denominator;
        u = 1.0 - v - w;

        return new double[]{u, v, w};
    }
}
