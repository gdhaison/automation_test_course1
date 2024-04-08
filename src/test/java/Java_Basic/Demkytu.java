package Java_Basic;

import java.util.Scanner;

public class Demkytu {
    public static void main (String[] args){
        String character = "Vu Ha Vi Vui Ve";
        char countcharacter = 'V';
        int count = 0;
        for(int i=0; i < character.length(); i++)
        {
            if(countcharacter == character.charAt(i))
            {
                count = count + 1;

            }
        }
        System.out.print("So ky tu trong chuoi la: " + count);
    }

}

