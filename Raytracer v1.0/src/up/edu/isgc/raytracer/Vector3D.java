/**
 * Java Raytracer
 */

package up.edu.isgc.raytracer;

/**
 * This class creates a vector with 3 dimensions.
 *
 *  * @author Edgar Velazquez
 *  * @co-author Jafet Rodriguez
 */
public class Vector3D {
    private double x, y, z;
    private static final Vector3D ZERO = new Vector3D(0.0,0.0,0.0);

    public double getX() { return x; }

    public void setX(double x) { this.x = x; }

    public double getY() { return y; }

    public void setY(double y) { this.y = y; }

    public double getZ() { return z; }

    public void setZ(double z) { this.z = z; }

    public Vector3D(double x, double y, double z) {
        setX(x);
        setY(y);
        setZ(z);
    }

    /**
     * This method calculates the dot product of two vectors.
     * @param vectorA
     * @param vectorB
     * @return double - dot product of two vectors.
     */
    public static double dotProduct(Vector3D vectorA, Vector3D vectorB) {
        return (vectorA.getX() * vectorB.getX()) + (vectorA.getY() * vectorB.getY()) + (vectorA.getZ() * vectorB.getZ());
    }

    /**
     * This method calculates the cross product of two vectors.
     * @param vectorA
     * @param vectorB
     * @return Vector3D - cross product of two vectors.
     */
    public static Vector3D crossProduct(Vector3D vectorA, Vector3D vectorB){
        return new Vector3D((vectorA.getY() * vectorB.getZ()) - (vectorA.getZ() * vectorB.getY()),
                (vectorA.getZ() * vectorB.getX()) - (vectorA.getX() * vectorB.getZ()),
                (vectorA.getX() * vectorB.getY()) - (vectorA.getY() * vectorB.getX()));
    }

    /**
     * This method calculates the magnitude of a vector.
     * @param vectorA
     * @return double - magnitude of a vector.
     */
    public static double magnitude (Vector3D vectorA){
        return Math.sqrt(dotProduct(vectorA, vectorA));
    }

    /**
     * This method adds two vectors.
     * @param vectorA
     * @param vectorB
     * @return Vector3D - sum of two vectors.
     */
    public static Vector3D add (Vector3D vectorA, Vector3D vectorB){
        return new Vector3D(vectorA.getX() + vectorB.getX(), vectorA.getY() + vectorB.getY(), vectorA.getZ() + vectorB.getZ());
    }

    /**
     * This method subtracts two vectors.
     * @param vectorA
     * @param vectorB
     * @return Vector3D - subtract of two vectors
     */
    public static Vector3D substract (Vector3D vectorA, Vector3D vectorB){
        return new Vector3D(vectorA.getX() - vectorB.getX(), vectorA.getY() - vectorB.getY(), vectorA.getZ() - vectorB.getZ());
    }

    /**
     * This method normalizes a vector.
     * @param vectorA
     * @return Vector3D - normalized vector.
     */
    public static Vector3D normalize (Vector3D vectorA){
        double mag = Vector3D.magnitude(vectorA);
        return new Vector3D(vectorA.getX()/mag, vectorA.getY()/mag, vectorA.getZ()/mag);
    }

    /**
     * This method multiplies a vector by a scalar.
     * @param vectorA
     * @param scalar
     * @return Vector3D - a vector multiplied by a scalar
     */
    public static Vector3D scalarMultiplication (Vector3D vectorA, double scalar){
        return new Vector3D( vectorA.getX() * scalar, vectorA.getY() * scalar, vectorA.getZ() * scalar);
    }

    /**
     * This method divides a vector by a scalar.
     * @param vectorA
     * @param scalar
     * @return Vector3D - a vector divided by a scalar.
     */
    public static Vector3D scalarDivision(Vector3D vectorA, double scalar){
        return new Vector3D(vectorA.getX() / scalar, vectorA.getY() / scalar, vectorA.getZ() / scalar);
    }


    @Override
    public String toString() {
        return "Vector3D{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

    /**
     * This method clones a vector into a new vector.
     * @return Vector3D - newly cloned.
     */
    public Vector3D clone() {
        return new Vector3D(getX(),getY(),getZ());
    }

    public static Vector3D ZERO(){
        return ZERO.clone();
    }
}
