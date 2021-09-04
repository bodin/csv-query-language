package com.bodins;

import com.bodins.model.CSVParser;

import java.util.Scanner;

public class Main {
    private static final CSVParser parser = new CSVParser();

    public static void main(String [] args) throws Exception {
        if(args.length > 0){
            parser.execute(args[0]);
        }else{
            repl();
        }
    }
    public static void repl(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome!");
        System.out.println("Enter 'q;' to quit.");
        System.out.println();
        System.out.println("Examples:");
        System.out.println("\twith file test.csv select *;");
        System.out.println("\twith file test.csv select col1, col2;");
        System.out.println("\twith file test.csv select col1, col2, col1, col2;");
        System.out.println();

        boolean run = true;

        while(run) {
            System.out.print("csv> ");

            StringBuilder statement = new StringBuilder(scanner.nextLine());
            while(!statement.toString().contains(";")) {
                statement.append(" ").append(scanner.nextLine());
            }

            run = !"q;".equalsIgnoreCase(statement.toString());
            try {
                if (run) {
                   parser.execute(statement.toString());
                }
            } catch(Exception e) {
                e.printStackTrace();
            }
        }
    }
}
