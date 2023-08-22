package HybridInh;


class Animal {
 void eat() {
     System.out.println("Animal is eating.");
 }
}


class Mammal extends Animal {
 void speak() {
     System.out.println("Mammal is making a sound.");
 }
}


class Bird extends Animal {
 void chirp() {
     System.out.println("Bird is chirping.");
 }
}


class Hybrid extends Mammal {
 void fly() {
     System.out.println("Hybrid is flying.");
 }

 public static void main(String[] args) 
 {
     Hybrid hybrid = new Hybrid();
     hybrid.eat();
     hybrid.speak();
     hybrid.fly();
 }
}
