/**
 * Java Raytracer
 */

package up.edu.isgc.raytracer;

/**
 * This class creates a ray with an origin and a direction.
 *
 *  * @author Edgar Velazquez
 *  * @co-author Jafet Rodriguez
 */
public class Ray {

    private Vector3D origin;
    private Vector3D direction;

    public Ray(Vector3D origin, Vector3D direction) {
        setOrigin(origin);
        setDirection(direction);
    }

    public Vector3D getOrigin() {
        return origin;
    }

    public void setOrigin(Vector3D origin) {
        this.origin = origin;
    }

    public Vector3D getDirection() {
        return Vector3D.normalize(direction);
    }

    public void setDirection(Vector3D direction) {
        this.direction = direction;
    }
}
