
class Shape{

    private static double radius;

    final static double PI = Math.PI;

    public static void setRadius(double radius){
        Shape.radius = radius;
    }

    public  double getradius(){
        return radius;
    }

}

class circumstanceofcircle extends Shape{

    public double raidus;

    public void setradiusforCircustanceofCircle(double Radius){
        this.raidus = Radius;
    }

    public double calculateCircustanceofCircle() {
        double result = 2 * Shape.PI * raidus ;
        return  result;
    }
}

class areaofcircle extends  Shape{
    public double  calculateareaofcircle(){
        double result = Shape.PI * Math.pow(super.getradius(),2.0d);
        return  result;
    }
}



public class Encapsulation {
    public static void main(String[] args) {

        Shape.setRadius(5.7);

        circumstanceofcircle circumstanceofcircle = new circumstanceofcircle();

        circumstanceofcircle.raidus = 7.5;

        areaofcircle areaofcircle = new areaofcircle();

        System.out.printf("Area of Circle : %.2f",areaofcircle.calculateareaofcircle());
        System.out.println();
        System.out.printf("Circumstance of Circle : %.2f",circumstanceofcircle.calculateCircustanceofCircle());

    }
}
