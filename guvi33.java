import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String word = "HH sadsd";
      int i = 0,spaceCount = 0;
      while( i < word.length() ){
        if( word.charAt(i) == ' ' ) {
            spaceCount++;
        }
        i++;
      }

      System.out.println("Spaces in string: "+spaceCount);
    }
}
