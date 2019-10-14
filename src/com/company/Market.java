package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Market {

    public static void main(String[] args) throws IOException {

        List<Drob> drobs = new ArrayList<Drob>();
        List<String> lines = new ArrayList<String>();

        try(BufferedReader reader = new BufferedReader(new FileReader("./src/com/company/input.txt"))){

            String line;
            while((line = reader.readLine()) != null){

                lines.add(line);
            }
        }

        int c;

        Drob d = new Drob(0, 0);
        for(c=0;c<lines.size()/2;c++) {
            drobs.add(d);
        }
        int i;
        for(i = 0; i<=lines.size()-2; i=+2){
            drobs.get(i/2).setNum(Integer.parseInt(lines.get(i)));
        }
        for(i = 1; i<lines.size(); i=+2){
            drobs.get(i/2).setDenom(Integer.parseInt(lines.get(i)));
        }

        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int number1 = in.nextInt();
        System.out.print("Input an operation: ");
        String op = in.next();
        System.out.print("Input a number: ");
        int number2 = in.nextInt();
        in.close();

        System.out.println(number1 + op + number2);
        Calculator k = new Calculator(drobs.get(number1), drobs.get(number2));
        if(op.equals("+")){
            k.sum();
        }
        if(op.equals("-")){
            k.minus();
        }
        if(op.equals("*")){
            k.times();
        }
        if(op.equals("/")){
            k.divide();
        }
    }

}
