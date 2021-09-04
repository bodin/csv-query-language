package com.bodins;

import com.bodins.model.CSVParser;

import java.util.Scanner;

public class Main {

    public static void main(String [] args){
        CSVParser parser = new CSVParser();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome!");
        System.out.println("Enter 'q' to quit.");
        System.out.println();
        System.out.println("Examples:");
        System.out.println("\topen test.csv select *");
        System.out.println("\topen test.csv select col1, col2");
        System.out.println("\topen test.csv select col1, col2, col1, col2");
        System.out.println();

        boolean run = true;
        while(run) {
            System.out.print("csv> ");
            String statement = scanner.nextLine();
            if("".equals(statement.trim())) continue;

            run = !"q".equalsIgnoreCase(statement);
            try {
                if (run){
                   parser.execute(statement);
                }
            }catch(Exception e){
                System.err.println(e.getMessage());
            }
        }
    }
}
