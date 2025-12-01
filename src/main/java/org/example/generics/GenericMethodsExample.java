package org.example.generics;

public class GenericMethodsExample
{
    public static void main(String[] args)
    {
        String[] array1 = {"ashwin","akshita","ayush"};
        System.out.println(getGenericArrayFirstElement(array1));
        var val1 = getGenericArrayFirstElement(array1);
        System.out.println("val1 "+val1.length());
        Integer[] array2 = {1,2,3};
        System.out.println(getGenericArrayFirstElement(array2));
        var val2 = getGenericArrayFirstElement(array2);
        System.out.println("val2 "+val2);
        val2 = 10;
        Double[] array3 = {1.0,2.0,3.0};
        System.out.println(getGenericArrayFirstElement(array3));

        System.out.println(getSum(10,6));

    }

    /*public static String getArrayFirstElement(String[] array)
    {
        return array[0];
    }*/

    public static <T> T getGenericArrayFirstElement(T[] array)
    {
        return array[0];
    }

    public static <K, V> void printKV(K key, V value) {
        System.out.println("Key: " + key + ", Value: " + value);
    }

    public  static <T extends Number> Double getSum(T val1, T val2)
    {
        return  val1.doubleValue() + val2.doubleValue();
    }

}
