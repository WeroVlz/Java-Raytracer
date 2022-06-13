/**
 * Java Raytracer
 */

package up.edu.isgc.raytracer;

import up.edu.isgc.raytracer.lights.DirectionalLight;
import up.edu.isgc.raytracer.lights.Light;
import up.edu.isgc.raytracer.lights.PointLight;
import up.edu.isgc.raytracer.objects.*;
import up.edu.isgc.raytracer.tools.OBJReader;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Date;
import java.util.List;

/**
 * This class controls the raytracer.
 *
 * @author Edgar Velazquez
 * @co-author Jafet Rodriguez
 */
public class RayTracer {
    /**
     * This is the main method.
     * @param args
     */
    public static void main(String[] args){
        System.out.println(new Date());

        //Render1
        Scene scene01 = new Scene();
        scene01.setCamera(new Camera(new Vector3D(0, 1, -8), 144, 160,
                400, 225, 0.5f,50f));
        scene01.addLight(new PointLight(new Vector3D(-2,1,-5), Color.WHITE,2.5));
        scene01.addLight(new PointLight(new Vector3D(2,1,-5), Color.RED,0.8));
        scene01.addObject(OBJReader.getModel3D("RingVertical.obj", new Vector3D(0, 2, 3),
                Color.WHITE, 50, true, false));
        scene01.addObject(OBJReader.getModel3D("Sword.obj", new Vector3D(2, 2, -1),
                Color.RED, 100, false, false));
        scene01.addObject(OBJReader.getModel3D("Shield.obj", new Vector3D(-2.4, 0, -2),
                Color.BLUE, 70, false, false));
        scene01.addObject(OBJReader.getModel3D("Ring.obj", new Vector3D(0, 4, 1),
                Color.WHITE, 60, true, false));
        scene01.addObject(new Model3D(new Vector3D(0, 0, 0),
                new Triangle[]{
                        new Triangle(new Vector3D(-600,0,-600), new Vector3D(600, 0, -600), new Vector3D(600, 0, 600)),
                        new Triangle(new Vector3D(-600,0,-600), new Vector3D(600, 0, 600), new Vector3D(-600, 0, 600)),},
                Color.WHITE, 0, false, false));

        scene01.addObject(new Model3D(new Vector3D(0, 0, 0),
                new Triangle[]{
                        new Triangle(new Vector3D(-400,-400,10), new Vector3D(400, -400, 10), new Vector3D(400, 400, 10)),
                        new Triangle(new Vector3D(-400,-400,10), new Vector3D(400, 400, 10), new Vector3D(-400, 400, 10)),},
                Color.WHITE, 0,false,false));

        //Render3
        Scene scene02 = new Scene();
        scene02.setCamera(new Camera(new Vector3D(0, 1, -8), 144, 160,
                1920, 1080, 0.5f,50f));
        scene02.addLight(new PointLight(new Vector3D(0,1,-5), Color.WHITE,2.5));
        scene02.addObject(OBJReader.getModel3D("Cube.obj", new Vector3D(0, 1, 1),
                Color.WHITE, 60, false, true));
        scene02.addObject(OBJReader.getModel3D("Sword.obj", new Vector3D(0, 2, 4),
                Color.RED, 60, false, false));
        scene02.addObject(OBJReader.getModel3D("Cube.obj", new Vector3D(-2, 1, 1),
                Color.WHITE, 60, false, true));
        scene02.addObject(OBJReader.getModel3D("Sword.obj", new Vector3D(-2, 2, 4),
                Color.RED, 60, false, false));
        scene02.addObject(OBJReader.getModel3D("Cube.obj", new Vector3D(2, 1, 1),
                Color.WHITE, 60, false, true));
        scene02.addObject(OBJReader.getModel3D("Sword.obj", new Vector3D(2, 2, 4),
                Color.RED, 60, false, false));
        scene02.addObject(OBJReader.getModel3D("Cube.obj", new Vector3D(0, 3, 1),
                Color.WHITE, 60, false, true));
        scene02.addObject(OBJReader.getModel3D("Sword.obj", new Vector3D(0, 4, 4),
                Color.RED, 60, false, false));
        scene02.addObject(OBJReader.getModel3D("Cube.obj", new Vector3D(-2, 3, 1),
                Color.WHITE, 60, false, true));
        scene02.addObject(OBJReader.getModel3D("Sword.obj", new Vector3D(-2, 4, 4),
                Color.RED, 60, false, false));
        scene02.addObject(OBJReader.getModel3D("Cube.obj", new Vector3D(2, 3, 1),
                Color.WHITE, 60, false, true));
        scene02.addObject(OBJReader.getModel3D("Sword.obj", new Vector3D(2, 4, 4),
                Color.RED, 60, false, false));
        scene02.addObject(new Model3D(new Vector3D(0, 0, 0),
                new Triangle[]{
                        new Triangle(new Vector3D(-600,0,-600), new Vector3D(600, 0, -600), new Vector3D(600, 0, 600)),
                        new Triangle(new Vector3D(-600,0,-600), new Vector3D(600, 0, 600), new Vector3D(-600, 0, 600)),},
                Color.RED, 50, true, false));

        //Render2
        Scene scene03 = new Scene();
        scene03.setCamera(new Camera(new Vector3D(0, 1, -8), 144, 160,
                1920, 1080, 0.5f,50f));
        scene03.addLight(new PointLight(new Vector3D(-1.5,1,-5), Color.WHITE,2.5));
        scene03.addLight(new PointLight(new Vector3D(1.5,1,-5), Color.BLUE,0.8));
        scene03.addObject(OBJReader.getModel3D("HandH1.obj", new Vector3D(2.2, 1.2, 1),
                Color.ORANGE, 60, false, false));
        scene03.addObject(OBJReader.getModel3D("HandH2.obj", new Vector3D(-2.3, 1.2, 1),
                Color.GREEN, 60, false, false));
        scene03.addObject(OBJReader.getModel3D("RingVertical.obj", new Vector3D(0, 3.4, 1),
                Color.YELLOW, 60, true, false));
        scene03.addObject(OBJReader.getModel3D("Hand2.obj", new Vector3D(-0.3, 0, 1),
                Color.RED, 60, false, false));
        scene03.addObject(OBJReader.getModel3D("Cylinder.obj", new Vector3D(-4.8, -0.2, 2),
                 Color.WHITE, 60, true, false));
        scene03.addObject(OBJReader.getModel3D("RingVerticalSmall.obj", new Vector3D(-4, 2, -1),
                Color.MAGENTA, 40, false, false));
        scene03.addObject(OBJReader.getModel3D("Cylinder.obj", new Vector3D(4.8, -0.2, 2),
                Color.WHITE, 60, true, false));
        scene03.addObject(OBJReader.getModel3D("RingVerticalSmall.obj", new Vector3D(4, 2, -1),
                Color.PINK, 0, false, false));
        scene03.addObject(new Model3D(new Vector3D(0, 0, 0),
                new Triangle[]{
                        new Triangle(new Vector3D(-600,0,-600), new Vector3D(600, 0, -600), new Vector3D(600, 0, 600)),
                        new Triangle(new Vector3D(-600,0,-600), new Vector3D(600, 0, 600), new Vector3D(-600, 0, 600)),},
                Color.WHITE, 0, true, false));

        scene03.addObject(new Model3D(new Vector3D(0, 0, 0),
                new Triangle[]{
                        new Triangle(new Vector3D(-400,-400,10), new Vector3D(400, -400, 10), new Vector3D(400, 400, 10)),
                        new Triangle(new Vector3D(-400,-400,10), new Vector3D(400, 400, 10), new Vector3D(-400, 400, 10)),},
                Color.WHITE, 0,true,false));


        BufferedImage image = raytrace(scene02);
        File outputImage = new File("image3.png");
        try{
            ImageIO.write(image, "png", outputImage);
        } catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(new Date());
    }

    /**
     * This method creates an image by raytrace.
     * @param scene where all the objects and lights are.
     * @return image
     */
    public static BufferedImage raytrace(Scene scene) {
        Camera mainCamera = scene.getCamera();
        float[] nearFarPlanes = mainCamera.getNearFarPlanes();
        float cameraZ = (float) mainCamera.getPosition().getZ();
        BufferedImage image = new BufferedImage(mainCamera.getResolutionWidth(), mainCamera.getResolutionHeight(), BufferedImage.TYPE_INT_RGB);
        List<Object3D> objects = scene.getObjects();
        List<Light> lights = scene.getLights();

        Vector3D[][] positionsToRaytrace = mainCamera.calculatePositionsToRay();

        double mainCameraX = mainCamera.getPosition().getX();
        double mainCameraY = mainCamera.getPosition().getY();
        double mainCameraZ = mainCamera.getPosition().getZ();

        for (int i = 0; i < positionsToRaytrace.length; i++) {
            for (int j = 0; j < positionsToRaytrace[i].length; j++) {
                double x = positionsToRaytrace[i][j].getX() + mainCameraX;
                double y = positionsToRaytrace[i][j].getY() + mainCameraY;
                double z = positionsToRaytrace[i][j].getZ() + mainCameraZ;

                Ray ray = new Ray(mainCamera.getPosition(), new Vector3D(x, y, z));
                Intersection closestIntersection = raycast(ray, objects, null, new float[]{cameraZ + nearFarPlanes[0],cameraZ + nearFarPlanes[1]});

                Color pixelColor = Color.BLACK;
                if(closestIntersection != null){
                    Color objColor = closestIntersection.getObject().getColor();
                    for(Light light : lights){
                        Vector3D lightDir = Vector3D.substract(light.getPosition(), closestIntersection.getPosition());

                        Intersection shadowIntersection = raycast(new Ray(Vector3D.add(closestIntersection.getPosition(), Vector3D.scalarMultiplication(closestIntersection.getNormal(), 0.001)), light.getPosition()), objects, closestIntersection.getObject(), null);
                        if(shadowIntersection != null) continue;

                        if(closestIntersection.getObject().isReflective()){
                            closestIntersection = reflection(closestIntersection, objects, mainCamera, 2);
                            objColor = closestIntersection.getObject().getColor();

                        }

                        if(closestIntersection.getObject().isRefractive()){
                            closestIntersection = refraction(closestIntersection, objects, mainCamera, ray);
                            objColor = closestIntersection.getObject().getColor();
                        }


                        double nDotL = light.getNDotL(closestIntersection);
                        double intensity = light.getIntensity() * nDotL;

                        Vector3D H = Vector3D.normalize(Vector3D.scalarDivision(Vector3D.add(ray.getDirection(),lightDir),Vector3D.magnitude(Vector3D.add(ray.getDirection(),lightDir))));
                        double nDotH = light.getNDotH(closestIntersection, H);

                        double shininess = closestIntersection.getObject().getShininess();
                        double specular = 0;
                        double ambient = 0.05;

                        if(shininess > 0){
                            specular = Math.pow(nDotH, shininess);
                        }

                        Vector3D position = light.getPosition();
                        if(position != null){
                            double distance = Vector3D.magnitude(Vector3D.substract(closestIntersection.getPosition(), light.getPosition()));
                            intensity = (intensity / Math.pow(distance,2));
                        }

                        Color lightColor = light.getColor();

                        float[] lightColors = new float[]{lightColor.getRed() / 255f, lightColor.getGreen() / 255f, lightColor.getBlue() / 255f};
                        float[] objColors = new float[]{objColor.getRed() / 255f, objColor.getGreen() / 255f, objColor.getBlue() / 255f};

                        for(int colorIndex = 0; colorIndex < objColors.length; colorIndex++){
                            objColors[colorIndex] *= (intensity+specular+ambient) * lightColors[colorIndex];
                        }

                        Color diffuse = new Color(clamp(objColors[0],0,1), clamp(objColors[1],0,1 ), clamp(objColors[2],0,1 ));
                        pixelColor = addColor(pixelColor, diffuse);
                    }
                }
                image.setRGB(i, j, pixelColor.getRGB());
            }
        }
        return image;
    }


    /**
     * This method clamps the input, so it is inside the RGB value range.
     * @param value to be clamped
     * @param min of the range
     * @param max of the range
     * @return rgb value
     */
    public static float clamp(float value, float min, float max){
        if(value < min){
            return min;
        }
        if(value > max){
            return max;
        }
        return value;
    }

    /**
     * This method computes a new color with light involvement.
     * @param original color with no light
     * @param otherColor with light diffusion
     * @return new color
     */
    public static Color addColor(Color original, Color otherColor){
        float red = clamp((original.getRed()/255f) + (otherColor.getRed()/255f), 0,1);
        float green = clamp((original.getGreen()/255f) + (otherColor.getGreen()/255f), 0,1);
        float blue = clamp((original.getBlue()/255f) + (otherColor.getBlue()/255f), 0,1);
        return new Color(red, green, blue);
    }

    /**
     * This method returns an interection of reflective surfaces.
     * @param closestIntersection of reflective materials.
     * @param objects of the scene, to reflect on the surface.
     * @param mainCamera of the scene
     * @param limit of recursion
     * @return reflection intersection
     */
    public static Intersection reflection(Intersection closestIntersection, List<Object3D> objects, Camera mainCamera, int limit){

        double nDotC = Vector3D.dotProduct(closestIntersection.getNormal(), Vector3D.substract(closestIntersection.getPosition(), mainCamera.getPosition() ));
        double reflectionCoefficient = -1.5;
        Vector3D I = Vector3D.scalarMultiplication(Vector3D.scalarMultiplication(closestIntersection.getNormal(), reflectionCoefficient), nDotC);
        Vector3D reflectionDir = Vector3D.add(I, closestIntersection.getNormal());

        if(limit <= 2){
            for(Object3D object: objects){
                Vector3D rayPosition = Vector3D.add(closestIntersection.getPosition(), Vector3D.scalarMultiplication(closestIntersection.getNormal(),0.01));
                Intersection reflectionIntersection = raycast( new Ray(rayPosition, reflectionDir), objects, closestIntersection.getObject(), null);
                if(reflectionIntersection != null ){
                    if(reflectionIntersection.getObject() != object){
                        return reflection(reflectionIntersection, objects, mainCamera, limit+1);
                    }
                }
            }
        }
        return closestIntersection;
    }

    public static Intersection refraction(Intersection closestIntersection, List<Object3D> objects, Camera mainCamera, Ray ray){
        double nDotR = Vector3D.dotProduct(closestIntersection.getNormal(), Vector3D.normalize(ray.getDirection()));
        double refractionCoefficient = 3.0;

        double c = Math.sqrt(1-Math.pow(refractionCoefficient, 2)*(1-Math.pow(nDotR,2)));
        Vector3D refractionDir = Vector3D.add(Vector3D.scalarMultiplication(Vector3D.normalize(ray.getDirection()),refractionCoefficient),Vector3D.scalarMultiplication(closestIntersection.getNormal(), (refractionCoefficient*nDotR)-c));

        for (Object3D object: objects){
            Intersection refractionIntersection = raycast(new Ray(closestIntersection.getPosition(), refractionDir), objects, closestIntersection.getObject(), null);
            if(refractionIntersection != null){
                if(refractionIntersection.getObject() != object){
                    return refraction(refractionIntersection, objects, mainCamera,ray);
                }
            }
        }
        return closestIntersection;
    }


    /**
     * This method checks which is the closest intersection if any.
     * @param ray
     * @param objects of the scene
     * @param caster object who cast ray
     * @return closestIntersection between the ray and an object in the scene if any.
     */
    public static Intersection raycast(Ray ray, List<Object3D> objects, Object3D caster, float[] clippingPlanes){
        Intersection closestIntersection = null;

        for (Object3D currentObj : objects) {
            if (!currentObj.equals(caster)) {
                Intersection intersection = currentObj.getIntersection(ray);
                if (intersection != null) {
                    double distance = intersection.getDistance();
                    double intersectionZ = intersection.getPosition().getZ();
                    if (distance >= 0 && (closestIntersection == null || distance < closestIntersection.getDistance()) &&
                            (clippingPlanes == null || (intersectionZ >= clippingPlanes[0] && intersectionZ <= clippingPlanes[1]))) {
                        closestIntersection = intersection;
                    }
                }
            }
        }

        return closestIntersection;
    }
}
