import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        //System.out.println(Integer.MAX_VALUE);
        //System.out.println(Integer.MIN_VALUE);
        int numberRev = Main.reverse(-12345);
        System.out.println(numberRev);
    }

    public static int reverse(int liczba)
    {
        String text = liczba + "";
        //System.out.println(text);
       char[] tabChar = new char[text.length()];
       String text2 = "";
       int wynik = 0;

       if(text.charAt(0) == '-')
       {
           for(int i = 1; i < text.length(); i++)
           {
               tabChar[i] = text.charAt(i);
               //System.out.println("to ta petla");
           }

           //System.out.print("-");
           for(int i = tabChar.length-1; i > 0 ; i--)
           {
               //System.out.print(tabChar[i]);
               text2 += tabChar[i];
           }
            text2 = "-" + text2;
           //System.out.println(text2);
           wynik = Integer.parseInt(text2);
       }
       else
       {
           for(int i = 0; i < text.length(); i++)
           {
               tabChar[i] = text.charAt(i);
               //System.out.println(tabChar[i]);
           }

           for(int i = tabChar.length-1; i >= 0 ; i--)
           {
               //System.out.print(tabChar[i]);
               text2 += tabChar[i];
           }

           wynik = Integer.parseInt(text2);
       }
        return wynik;
    }
}
