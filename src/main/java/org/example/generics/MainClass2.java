package org.example.generics;

public class MainClass2
{
    public static void main(String[] args)
    {
        GenericClass2<String, Double> object1 = new GenericClass2<>();
        object1.setFirstValue("pizza");
        object1.setSecondValue(249.0);
        System.out.println(object1.getFirstValue());
        System.out.println(object1.getSecondValue());

        GenericClass2<Integer, String> object2 = new GenericClass2<>();
        object2.setFirstValue(101);
        object2.setSecondValue("Akshita");
        System.out.println(object2.getFirstValue());
        System.out.println(object2.getSecondValue());

        /// generic interface implemented class object
        GenericInterface1<Integer,Double> object3 = new ClassWithGenericInterface1();
        System.out.println(object3.printValue(15));
        GenericInterface1<Double,Integer> object4 = new ClassWithGenericInterface2();
        System.out.println(object4.printValue(45.60));

    }
}
