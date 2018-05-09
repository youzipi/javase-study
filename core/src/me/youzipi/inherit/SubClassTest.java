//package me.youzipi.inherit;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//import java.util.stream.Collectors;
//
///**
// * Created by youzipi on 17/10/10 下午4:49
// */
//public class SubClassTest {
//    public static void test(List<Animal> animal) {
//
//    }
//
//
//    public static void main(String[] args) {
//        Dog dog = new Dog();
//        List<Dog> dogs = new ArrayList<>();
//        dogs.add(dog);
//        List<Animal> animals = dogs.stream().map(dog1 -> (Animal) dog1).collect(Collectors.toList());
//        Dog d = (Dog) animals.get(0);
//        SubClassTest.test(animals);
//    }
//}
