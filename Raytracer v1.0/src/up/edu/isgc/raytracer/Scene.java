/**
 * Java Raytracer
 */

package up.edu.isgc.raytracer;

import up.edu.isgc.raytracer.lights.Light;
import up.edu.isgc.raytracer.objects.Camera;
import up.edu.isgc.raytracer.objects.Object3D;

import java.util.ArrayList;
import java.util.List;

/**
 * This class creates a scene where you can add cameras and Objects3D.
 *
 *  * @author Edgar Velazquez
 *  * @co-author Jafet Rodriguez
 */
public class Scene {

    private Camera camera;
    private List<Object3D> objects;
    private List<Light> lights;

    public Scene() {
        setObjects(new ArrayList<>());
        setLights(new ArrayList<>());
    }

    public Camera getCamera() {
        return camera;
    }

    public void setCamera(Camera camera) {
        this.camera = camera;
    }

    /**
     * This method adds an object to the existing Objects List.
     * @param object
     */
    public void addObject(Object3D object){
        getObjects().add(object);
    }

    public List<Object3D> getObjects() {
        if(objects == null){
            objects = new ArrayList<>();
        }
        return objects;
    }

    public void setObjects(List<Object3D> objects) {
        this.objects = objects;
    }

    public List<Light> getLights() { return lights; }

    public void setLights(List<Light> lights) { this.lights = lights; }

    /**
     * This method adds a light to the existing Light List.
     * @param light
     */
    public  void addLight(Light light){ getLights().add(light); }

}
