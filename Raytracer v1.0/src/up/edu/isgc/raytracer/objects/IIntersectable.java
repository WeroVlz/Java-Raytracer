package up.edu.isgc.raytracer.objects;

import up.edu.isgc.raytracer.Intersection;
import up.edu.isgc.raytracer.Ray;

public interface IIntersectable {
    Intersection getIntersection(Ray ray);
}

