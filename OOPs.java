import java.util.*;
public class OOPs {
    public static void main(String Args[]){
        /*Pen p1= new Pen();// created a pen object called p1
        p1.setColor("blue");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());
        p1.setColor("Yellow");
        p1.setColor("Yellow");
        System.out.println(p1.getColor());

        BankAccount myAcc = new BankAccount();
        myAcc.username = "Kunal Arya";
        myAcc.setPassword("asdsfdf");*/
        /*StudentA s1 = new StudentA("Hello");
        s1.roll= 111;
        s1.marks[1] = 123;
        s1.marks[0] = 1233;
        s1.marks[2] = 12345;
        s1.password = "123";
        /*StudentA s2 = new StudentA("kunal");
        StudentA s3 = new StudentA(123);
        StudentA s2 = new StudentA(s1);// copy constructor
        s2.password = "xyz";
        s1.marks[2]=100;
        System.out.println(s2);*/


        /*Fish shark = new Fish();
        shark.eat();
        Dog dobby =new Dog();
        dobby.eat();
        dobby.legs=4;
        System.out.println(dobby.legs);
        Calculator calc= new Calculator();
        System.out.println(calc.sum(1,2));
        System.out.println(calc.sum((float)1.5, (float)2.5));
        System.out.println(calc.sum(1,2,3));*/
        
        /*Deer d= new Deer();
        d.eat();*/


        /*Horse h = new Horse();
        h.eat();
        h.walk();


        Chicken c= new Chicken();
        c.eat();
        c.walk();
        System.out.println(h.color);

        Mustang my = new Mustang();

        Queen q= new Queen();
        q.moves();*/
        
        
        /*StudentB s1= new StudentB();
        s1.schoolName= "JMV";

        StudentB s2 = new StudentB();
        System.out.println(s2.schoolName);*/
        HorseA h1= new HorseA();
        System.out.println(h1.Color);
    }
}
class BankAccount{
    public String username;
    private String password;
    public void setPassword(String pwd){
        password = pwd;
    }
}
class Pen{
    private String color;
    private int tip;
        String getColor(){
            return this.color;
        }
        int getTip(){
            return this.tip;
        }
        void setColor(String newColor){
            this.color= newColor;
        }
        void setTip(int newTip){
            this.tip= newTip;
        }
}
class Student{
    String name;
    int age;;
    float percentage;
    void calPerc(int phy, int chem, int maths){

    }
}
/*
Four Pillars of OOPs in Java
 * Encapsulation 
 * Inheritance
 * Polymorphism
 * Abstraction
 */

 // Encalpsulation

// Constructors are of three types
 /*Non parameterized
  * 
 */
 //Constructor
 class StudentA{
    String name;
    int roll;
    int marks[];
    String password;
    StudentA() {
        System.out.println();
    }
    //copy constructor
    //shalow copy constructor
    /*StudentA(StudentA s1){
        marks = new int[3];
        this.name=s1.name;
        this.roll= s1.roll;
        this.password = s1.password;
        this.marks= s1.marks;
    }*/
    StudentA(StudentA s1){
        marks= new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        for(int i=0; i<marks.length; i++){
            this.marks[i]=  s1.marks[i];
        }
    }
    StudentA(String name){
        marks = new int[3];
        this.name=name; // parameterized constructor
    }
    StudentA(int roll){
        marks = new int[3];
        this.roll= roll;
    }
    StudentA(int marks[]){
        marks = new int[3];
        this.marks= marks;
    }
 }
// Destructor
// Garbage collector


// inheritance
class Animal{ // base class
    String color;

    void eat(){
        System.out.println("eats");
    }
    void breathes(){
        System.out.println("breathes");
    }
}
 
// Derived Class
class Fish extends Animal{
    int fins;
    void swim(){
        System.out.println("Swims");
    }
}
class Mammal extends Animal{
    int legs;
    void walks(){
        System.out.println("walks");
    }
}
class Dog extends Mammal{
    String breed;
}
// polymorphism
class Calculator{
    int sum(int a, int b){
        return a+b;
    }
    float sum(float a, float b){
        return a+b;
    }
    int sum (int a, int b, int c){
        return a+b+c;
    }
}
class AnimalA{
    void eat(){
        System.out.println("eats anything");
    }
}
class Deer extends AnimalA{
    void eat(){
        System.out.println("Eats Grass");
    }
}
abstract class AnimalB{
    String color;
    AnimalB(){
        System.out.println("Animal Constructor is called");
        color= "brown";
    }
    void eat(){
        System.out.println("Animal Eats");
    }
    abstract void walk();

}
class Horse extends AnimalB{
    Horse(){
        System.out.println("Horse Constructor is called");
    }
    void changeColor(){
    color= "Dark Brown";
    }
    void walk(){
        System.out.println("Walk on 4legs");
    }
}
class Mustang extends Horse{
    Mustang(){
    System.out.println("Mustang Constructor is called");
    }
}
class Chicken extends Animal{
    void changeColor(){
        color= "Yellow";
    }
    void walk(){
        System.out.println("Walk on 2 Legs");
    }
}
// Interface
interface ChessPlayer{
    void moves();
}
class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, left,right,diagonal(in all four directions)");
    }
}
class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, left,right,");
    }
}
class Pawn implements ChessPlayer{
    public void moves(){
        System.out.println("one ahead and two on first");
    }
}
class King implements ChessPlayer{
    public void moves(){
        System.out.println("one step anywhere");
    }
}
class StudentB{
    String name;
    int roll;
    static String schoolName;
    void setName(String name){
        this.name=name;
    }
    String getName(){
        return this.name;
    }
}
class AnimalC{
    String Color;
    AnimalC(){
        System.out.println("Animal constructor is called");
    }
}
class HorseA extends AnimalC{
    HorseA(){
        super.Color= "brown";
        System.out.println("horse constructor is called");
    }
    
}