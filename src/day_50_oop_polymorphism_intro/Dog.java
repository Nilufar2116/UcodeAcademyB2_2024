package day_50_oop_polymorphism_intro;

public class Dog extends Animal{

    protected String dogName;

    public Dog(int age, String name, String dogName){
        this.age = age;
        this.name = name;
        this.dogName = dogName;
    }

    @Override
    public void eat(){
        System.out.println(dogName+" is eating");
    }
    @Override
    public void sleep(){
        System.out.println(dogName+" is sleeping");
    }
    @Override
    public void method1(){
        System.out.println("Dog class");
    }
}
