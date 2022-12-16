package ma.education.expLambda;

public class TestExpLambda {
    public static void main(String[] args) {
        //ICalcul i1 = new ICalcul();
        ICalcul i2 = new ICalcul(){
            public double add(int a, int b){
                return a+b;
            }
        };

        ICalcul i3 = (a, b) -> a+b;

        System.out.println(i2.add(2,4));
        System.out.println(i3.add(5,2));
    }
}
