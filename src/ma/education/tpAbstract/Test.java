package ma.education.tpAbstract;

public class Test {
    public static void main(String[] args) {
        //FormeGeo f1 = new FormeGeo();
        //FormeGeo f2 = new FormeGeoA();
        FormeGeo f3 = new Cercle();
        FormeGeo f4 = new FormeGeo() {

            public double calculerSurface() {
                return 10.0;
            }
        };
        //FormeGeo f5 = () -> 10.0;
    }
}
