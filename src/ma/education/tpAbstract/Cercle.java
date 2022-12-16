package ma.education.tpAbstract;

public class Cercle extends FormeGeoA{
    double rayon;

    @Override
    double calculerSurface(double rayon) {
        return rayon*rayon*Math.PI;
    }
}
