/**
 * Java Raytracer
 *
 * @author Edgar Velazquez
 * @co-author Jafet Rodriguez
 */

package up.edu.isgc.raytracer.objects;


import up.edu.isgc.raytracer.Vector3D;

import java.awt.*;

public abstract class Object3D implements IIntersectable {

    private Vector3D position;
    private Color color;
    private double shininess;
    private boolean reflective;
    private boolean refractive;

    public Color getColor() { return color; }

    public void setColor(Color color) { this.color = color; }

    public Vector3D getPosition() {
        return position;
    }

    public void setPosition(Vector3D position) {
        this.position = position;
    }

    public double getShininess() { return shininess; }

    public void setShininess(double shininess) { this.shininess = shininess; }

    public boolean isReflective() { return reflective; }

    public void setReflective(boolean reflective) { this.reflective = reflective; }

    public boolean isRefractive() { return refractive; }

    public void setRefractive(boolean refractive) { this.refractive = refractive; }


    public Object3D(Vector3D position, Color color, double shininess, boolean reflection, boolean refraction) {
        setPosition(position);
        setColor(color);
        setShininess(shininess);
        setReflective(reflection);
        setRefractive(refraction);
    }

}
