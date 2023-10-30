package methodoverriding24;

/**
 * A real example of Java Method Overriding (Create package name
 * ‘methodoverriding24’ and create all below classes in this package)
 * //Java Program to demonstrate the real scenario of Java Method Overriding
 * //where three classes are overriding the method of a parent class.
 * //Creating a parent class.
 * class Bank{
 * public int getRateOfInterest(){return 0;}
 * }
 * //Creating child classes.
 * class SBI extends Bank{
 * public int getRateOfInterest(){return 8;}
 * }
 * class ICICI extends Bank{
 * public int getRateOfInterest(){return 7;}
 * }
 * class AXIS extends Bank{
 * public int getRateOfInterest(){return 9;}
 * }
 * //Test class to create objects and call the methods
 * class Test2{
 * public static void main(String args[]){
 * SBI s=new SBI();
 * ICICI i=new ICICI();
 * AXIS a=new AXIS();
 * System.out.println("SBI Rate of Interest: "+s.getRateOfInterest());
 * System.out.println("ICICI Rate of Interest: "+i.getRateOfInterest());
 * System.out.println("AXIS Rate of Interest: "+a.getRateOfInterest());
 * }
 * }
 */
public class Bank {
    public int gerRateOfInterest() {return 0;}
}
