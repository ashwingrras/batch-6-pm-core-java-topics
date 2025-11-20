package org.example.methods;

/*
    today task:
1. create all variable type: static, non-static, local
2. create all method type: static, non-static
3. create method with  different-2 return type: int, double, void etc.
4. create method with arguments: minimum with 1 argument
5. call all method from static and non-static method


 */
public class MethodExample3
{
    static int no = 1;
    static int tillPrint = 10;
    public static void main(String[] args)
    {
//        for(int i =1; i <= tillPrint; i++)
//        {
//            System.out.println("i "+i);
//        }
        //printInfo();
        System.out.println(" before printSeries method");
        printSeries(1);
        System.out.println(" after printSeries method");
    }


    public static void printInfo()
    {
        System.out.println("printing info ");
        if(no < 5)
        {
            no++;
            printInfo(); // recursive case
        }
        else

        {
            // base case
        }
    }

    public static void printSeries(int startValue)
    {
        System.out.println("value "+startValue);
        startValue++;
        if(startValue <= tillPrint)
        {
            printSeries(startValue); // recursive case
        }
        else
        {
            System.out.println(" base case , startValue "+startValue);
        }
    }
}
