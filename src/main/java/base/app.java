package base;

import java.util.Scanner;

public class app {
    public static void main(String[] args){

    Scanner in = new Scanner(System.in);

    System.out.print("Enter the principal:");
    String input0 = in.nextLine();
    int i0 = Integer.parseInt(input0);

    System.out.print("Enter the rate of interest:");
    String input1 = in.nextLine();
    double i1 = Double.parseDouble(input1);
    double inter = i1/100;

    System.out.print("Enter the number of years:");
    String input2 = in.nextLine();
    int i2 = Integer.parseInt(input2);

    double total;
        total = i0*(1 + (inter*i2));


        System.out.print("After " + i2 + " years at "+ i1 + " the investment will be worth " +
            "$" + Math.ceil(total) + ".");



}}
