package programme_24_method_overriding;
/**
 * Test class to create objects and call the methods
 * Output:
 * SBI Rate of Interest: 8
 * ICICI Rate of Interest: 7
 * AXIS Rate of Interest: 9
 */

public class Test {
    public static void main(String[] args) {
        Sbi s = new Sbi();
        IciciBank i = new IciciBank();
        AxisBank a = new AxisBank();
        System.out.println("Sbi Rate of Interest:" + s.getRateOfInterest());
        System.out.println("Icici Rate of Interest:" + i.getRateOfInterest());
        System.out.println("Axis Rate of Interest:" + a.getRateOfInterest());
    }
}
