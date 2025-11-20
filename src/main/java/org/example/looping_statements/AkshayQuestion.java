package org.example.looping_statements;

public class AkshayQuestion
{
    public static void main(String[] args)
    {
        //
        String name = "AAshwin Akshya @@ % #";
        // A : 3
        // a : 1
        // s :
        // time complexity, space
        char[] chars = name.toCharArray();
        for(int i =0; i < chars.length; i++)
        {
            char ch = chars[i];
            if(ch == '0' || ch == ' ')
            {
                continue;
            }
            int count = 1;
            // i : 0, ch = A
            for(int j =i+1; j < chars.length; j++)
            // j = 1 : chars[3] s , s == A
            {
                if(chars[j] == ch)
                {
                    count++;
                    chars[j] = '0'; // as counted
                }
            }
            System.out.println(ch +" frequency is : "+count);
        }
    }
}
