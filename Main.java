package com.company;


import java.util.Scanner;

public class Main {



    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("This is a simple programme to find the square : ");
        System.out.println("Please insert Radius : ");
        int r = scanner.nextInt();
        float PI_NUMBER = 3.14f;

        float SQUARE = (r*r) * PI_NUMBER;

        System.out.println(SQUARE);

    }
}