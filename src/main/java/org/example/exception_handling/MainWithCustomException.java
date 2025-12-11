package org.example.exception_handling;

public class MainWithCustomException
{
    public static void main(String[] args)
    {
        try {
            checkValidAge(10);
        } catch (CustomExceptionChecked e) {
            e.printStackTrace();
        }
        checkValidEmail("aman.com");
    }

    public static void checkValidAge(int age) throws CustomExceptionChecked {

        if(age < 18)
        {
            throw new CustomExceptionChecked("invalid age");
        }

    }

    public static void checkValidEmail(String email) {

        if(!email.contains("@"))
        {
            throw new CustomExceptionUnChecked("invalid email");
        }

    }

}
