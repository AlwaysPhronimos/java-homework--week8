package multilevelinheritance22;

/**
 * Multilevel Inheritance Example(Create package name ‘multilevelinheritance22’ and create all below classes in this package)
 * 1. First class
 * class Animal{
 * public void eat(){System.out.println("eating...");}
 * }
 * 2. Second class
 * class Dog extends Animal{
 * public void bark(){System.out.println("barking...");}
 * }
 * 3. Third class
 * class BabyDog extends Dog{
 * public void weep(){System.out.println("weeping...");}
 * }
 * 4. Forth class
 * class TestInheritance{
 * public static void main(String args[]){
 * BabyDog d=new BabyDog();
 * d.weep();
 * d.bark();
 * d.eat();
 * }}
 */
public class TestInheritance {
    public static void main(String[] args) {
        BabyDog d = new BabyDog();
        d.weep();
        d.bark();
        d.eat();
    }
}
