package org.example.generics;

public class ResponseMainClass
{
    public static void main(String[] args)
    {
        Response<String> object1 = new Response<>(true,"pass");
        System.out.println(object1.getData());
        Response<Boolean> object2 = new Response<>(true,false);
        System.out.println(object2.getData());
        User user = new User();
        Response<User> object3 = new Response<>(true,user);
        User res = object3.getData();
        System.out.println(res.name);
    }
}
