public class Runner {
    public static void main(String[] args) {
        Car mycar = new Car(1999, "benz", 100000, "S class" );
        System.out.println(mycar.toString());
        mycar.drive(100);
        System.out.println(mycar.toString());
        Rectangle myrectangle = new Rectangle(10, 10);
        System.out.println(myrectangle.toString());
    }
}
