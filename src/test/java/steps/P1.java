package steps;

import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        System.out.println("enter the string");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int count =0;
        for (int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if (Character.isAlphabetic(ch))
            {
                if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
                {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
