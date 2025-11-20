package org.example.arrays;

/*
    Searching
    1. Linear
    2. Binary


 */
public class SearchingExample
{
    public static void main(String[] args)
    {
          int[] array1 = {1, 4, 3, 5, 9, 10, 18, 19, 21, 8, 7};
          int searchValue = 10;
          int foundIndex = 0;
          int foundPosition = -1;
          boolean isValueFound = false;
          int arrayLoopCount = 0;
          for(int i =0; i < array1.length; i++)
          {
              if(array1[i] == searchValue)
              {
                  foundIndex = i;
                  foundPosition = i+1;
                  isValueFound = true;
                  arrayLoopCount++;
                  break;
              }
              arrayLoopCount++;
          }
        System.out.println("arrayLoopCount "+arrayLoopCount);
          //if(isValueFound)
        if(foundPosition != -1)
          {
              System.out.println("foundIndex "+foundIndex);
              System.out.println("foundPosition "+foundPosition);
          }
          else
          {
              System.out.println("value not found in this array");
          }
    }
}
