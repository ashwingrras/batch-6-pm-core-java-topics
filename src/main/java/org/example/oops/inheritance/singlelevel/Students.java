package org.example.oops.inheritance.singlelevel;

// parent class : Company
// child class : Students
 public class Students extends Company
{
     public String studentName = "Alwaz";

    String studentCourse = "Java";

    private String password = "123456";

    protected String phoneNo = "1232323";

    public Students()
    {
        System.out.println(" at student class constructor ");
        System.out.println(password);
        System.out.println(lockerNo);
        showWelcome();
    }

    public static void main(String[] args)
    {
        System.out.println(" inside Students main method ");
        //System.out.println("company name "+companyName);
        Students  students = new Students();
        System.out.println("company address : "+companyAddress);
        students.printStudentInfo();
    }

    protected void printStudentInfo()
    {
        System.out.println("student name "+studentName);
        //Company company = new Company();
        //System.out.println("company name "+company.companyName);
        System.out.println("company name "+companyName);
    }

}
