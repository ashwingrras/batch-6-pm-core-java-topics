package org.example.oops.inheritance.singlelevel;

class Company
{
    public String  companyName = "GRRAS";

    public static String companyAddress = "Gopal Pura, Jaipur, Rajasthan";

    protected String lockerNo = "1313";

    Company()
    {
        System.out.println(" at company class constructor ");
    }

    protected void showWelcome()
    {
        Students students = new Students();
        System.out.println("student name "+students.studentName);
        System.out.println("welcome to grras");
    }
}
