package com.company;

public class Calculator {

    Drob first;
    Drob second;

    public Calculator(Drob first, Drob second){

        this.first = first;
        this.second = second;
    }

    public void sum(){

        int sum1 = 0;
        int sum2 = 0;
        sum1 = first.getNum() * second.getDenom() + second.getNum() * first.getDenom();
        sum2 = first.getDenom() * second.getDenom();
        if(sum1 == sum2){
            System.out.println("1");
        }
        if(sum1 > sum2){
            int full = sum1/sum2;
            sum1 = sum1 - (full*sum2);
            System.out.println(full + " " + sum1 + "/" + sum2);
        }
        if(sum1 < sum2){

            System.out.println(sum1 + "/" + sum2);
        }

    }

    public void minus(){

        int sum1 = 0;
        int sum2 = 0;
        sum1 = first.getNum() * second.getDenom() - second.getNum() * first.getDenom();
        sum2 = first.getDenom() * second.getDenom();
        if(sum1 == sum2){
            System.out.println("1");
        }
        if(sum1 > sum2){
            int full = sum1/sum2;
            sum1 = sum1 - (full*sum2);
            System.out.println(full + " " + sum1 + "/" + sum2);
        }
        if(sum1 < sum2){

            System.out.println(sum1 + "/" + sum2);
        }

    }

    public void times(){

        int sum1 = 0;
        int sum2 = 0;
        sum1 = first.getNum() * second.getNum();
        sum2 = first.getDenom() * second.getDenom();
        if(sum1 == sum2){
            System.out.println("1");
        }
        if(sum1 > sum2){
            int full = sum1/sum2;
            sum1 = sum1 - (full*sum2);
            System.out.println(full + " " + sum1 + "/" + sum2);
        }
        if(sum1 < sum2){

            System.out.println(sum1 + "/" + sum2);
        }

    }

    public void divide(){

        int sum1 = 0;
        int sum2 = 0;
        sum1 = first.getNum() * second.getDenom();
        sum2 = first.getDenom() * second.getNum();
        if(sum1 == sum2){
            System.out.println("1");
        }
        if(sum1 > sum2){
            int full = sum1/sum2;
            sum1 = sum1 - (full*sum2);
            System.out.println(full + " " + sum1 + "/" + sum2);
        }
        if(sum1 < sum2){

            System.out.println(sum1 + "/" + sum2);
        }

    }

}
