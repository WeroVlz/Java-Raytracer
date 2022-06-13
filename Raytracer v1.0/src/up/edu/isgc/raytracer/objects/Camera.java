/**
 * Java Raytracer
 */

package up.edu.isgc.raytracer.objects;

import up.edu.isgc.raytracer.Intersection;
import up.edu.isgc.raytracer.Ray;
import up.edu.isgc.raytracer.Vector3D;

import java.awt.*;

/**
 * This class creates a camera of type Object3D.
 *
 *  * @author Edgar Velazquez
 *  * @co-author Jafet Rodriguez
 */

public class Camera extends Object3D {

    //0 is width, 1 is height
    private int[] resolution;

    //0 is horizontal, 1 is vertical
    private float[] fieldOfView = new float[2];
    private float defaultZ = 15f;

    //0 is near, 1 is far
    private float[] nearFarPlanes = new float[2];


    public Camera(Vector3D position, float fieldOfViewHorizontal, float fieldOfViewVertical, int widthResolution, int heightResolution, float nearPlane, float farPlane) {
        super(position, Color.black, 0, false, false);
        setFieldOfViewHorizontal(fieldOfViewHorizontal);
        setFieldOfViewVertical(fieldOfViewVertical);
        setResolution(new int[]{widthResolution, heightResolution});
        setNearFarPlanes(new float[]{nearPlane, farPlane});
    }

    public float[] getFieldOfView() {
        return fieldOfView;
    }

    private void setFieldOfView(float[] fieldOfView) {
        this.fieldOfView = fieldOfView;
    }

    public float getFieldOfViewHorizontal(){
        return fieldOfView[0];
    }

    public void setFieldOfViewHorizontal(float fieldOfViewHorizontal){
        fieldOfView[0] = fieldOfViewHorizontal;
    }

    public float getFieldOfViewVertical(){
        return fieldOfView[1];
    }

    public void setFieldOfViewVertical(float fieldOfViewVertical){
        fieldOfView[1] = fieldOfViewVertical;
    }

    public float getDefaultZ() {
        return defaultZ;
    }

    public void setDefaultZ(float defaultZ) {
        this.defaultZ = defaultZ;
    }

    public int[] getResolution() {
        return resolution;
    }

    public int getResolutionWidth(){
        return resolution[0];
    }

    public int getResolutionHeight(){
        return resolution[1];
    }

    private void setResolution(int[] resolution) {
        this.resolution = resolution;
    }

    public float[] getNearFarPlanes() { return nearFarPlanes; }

    public void setNearFarPlanes(float[] nearFarPlanes) { this.nearFarPlanes = nearFarPlanes; }

    /**
     * This method calculates each position where a ray should be raycasted according to the FOV and resolution.
     * @return positions[][] where to be raycasted
     */
    public Vector3D[][] calculatePositionsToRay() {
        float angleMaxX = 90 - (getFieldOfViewHorizontal() / 2f);
        float radiusMaxX = getDefaultZ() / (float) Math.cos(Math.toRadians(angleMaxX));

        float maxX = (float) Math.sin(Math.toRadians(angleMaxX)) * radiusMaxX;
        float minX = -maxX;

        float angleMaxY = 90 - (getFieldOfViewVertical() / 2f);
        float radiusMaxY = getDefaultZ() / (float) Math.cos(Math.toRadians(angleMaxY));

        float maxY = (float) Math.sin(Math.toRadians(angleMaxY)) * radiusMaxY;
        float minY = -maxY;

        float rangeX  = maxX - minX;
        float rangeY = maxY - minY;

        Vector3D[][] positions = new Vector3D[getResolutionWidth()][getResolutionHeight()];
        float posZ = getDefaultZ();

        for(int x = 0; x < positions.length; x++){
            for(int y = 0; y < positions[x].length; y++){
                float posX = minX + ((rangeX / (float) getResolutionWidth()) * x);
                float posY = maxY - ((rangeY / (float) getResolutionHeight()) * y);
                positions[x][y] = new Vector3D(posX, posY, posZ);
            }
        }

        return positions;
    }

    @Override
    public Intersection getIntersection(Ray ray) {
        return new Intersection(Vector3D.ZERO(), -1, Vector3D.ZERO(), null);
    }
}
