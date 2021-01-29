package com.youfan.control;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextLine()){
            double x = scanner.nextDouble();
            String next = scanner.next();
            System.out.println(next);
        }
        scanner.close();
    }

}
