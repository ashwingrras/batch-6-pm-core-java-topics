package org.example.control_statements;

public class SwitchExample1
{
    public static void main(String[] args)
    {
        // 1: sunday, 2: monday, 3: tuesday, 4: wednesday, 5: thursday, 6: friday 7: saturday
         int no = 19;
        // switch : int, char, String
        switch (no) //
        {
            case 1:
                System.out.println(" this is case 1");
                break;
            case 2:
                System.out.println(" this is case 2");
                break;
            case 3:
                System.out.println(" this is case 3");
                break;
            case 4:
                System.out.println(" this is case 4");
                break;
            default:
                System.out.println(" this is default case");
                switch (no)
                {
                    case 19:
                        System.out.println(" this is  case 19");
                        break;
                }
                break;
            case 5,6,7,8:
            case 9,10:
                System.out.println(" this is case no "+no);
                break;
            /*case no: // here constant required, we can use final variable here
                System.out.println(" this is case no "+no);
                break;*/
        }
        System.out.println("after switch");
    }
}
