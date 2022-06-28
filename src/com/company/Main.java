package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void numberComparison() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try  {
            int a = Integer.parseInt(reader.readLine());
            int b = Integer.parseInt(reader.readLine());
            System.out.println(String.format("is %1$d equal to %2$d? - %3$s\n" +
                            "is %1$d less than %2$d? - %4$s\n" +
                            "is %1$d less or equal to %2$d? - %5$s\n" +
                            "is %1$d greater than %2$d? - %6$s\n" +
                            "is %1$d greater or equal to %2$d? - %7$s\n",
                    a,b,a==b, a<b,a<=b,a>b,a>=b));
        } catch (NumberFormatException e) {
            System.out.println("input data not a number");
        } catch (IOException e) {e.printStackTrace();}

    }

    public static void booleanComparison() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try  {
            String b1 = reader.readLine();
            String b2 = reader.readLine();
            if ((b1.equalsIgnoreCase("true") || b1.equalsIgnoreCase("false") &&
                    (b2.equalsIgnoreCase("true") || b2.equalsIgnoreCase("false")))) {
                    System.out.println(String.format("Is %s and %s equal? - %s", b1,b2, b1.equalsIgnoreCase(b2)?true:false));
            } else System.out.println("input data not a boolean");
        } catch (IOException e) { e.printStackTrace();
            }
    }
    public static void evenCheck(){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            int a = Integer.parseInt(reader.readLine());
            System.out.println(String.format("Number is even? - %s", a%2==0));
        }
        catch (NumberFormatException E) { System.out.println("input data not a number");}
        catch (IOException e) {e.printStackTrace();}
    }

    public static void oddCheck(){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            int a = Integer.parseInt(reader.readLine());
            System.out.println(String.format("Number is odd? - %s", a%2!=0));
        }
        catch (NumberFormatException E) { System.out.println("input data not a number");}
        catch (IOException e) {e.printStackTrace();}
    }
    public static void oppositeBoolean() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String b1 = reader.readLine();
            if(b1.equalsIgnoreCase("true")) {
                System.out.println("Opposite of \"true\" is \"false\"");
            }
            else if (b1.equalsIgnoreCase("false")) {
                System.out.println("Opposite of \"false\" is \"true\"");
            }
            else System.out.println("input data not a boolean");
        } catch (IOException e) {e.printStackTrace();}
    }

    public static void secondNumberComparison() {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            int a = Integer.parseInt(reader.readLine());
            int b = Integer.parseInt(reader.readLine());
            if (a==b) System.out.println("true");
            else if (a<0 && b>0) System.out.println("true");
            else if (a>100 && b>100) System.out.println("true");
            else System.out.println("false");

        } catch (NumberFormatException E) {System.out.println("input data not a number");
        } catch (IOException e) {e.printStackTrace();}
    }


    public static void main(String[] args)  {
        numberComparison();
        booleanComparison();
        evenCheck();
        oddCheck();
        oppositeBoolean();
        secondNumberComparison();


    }
}
