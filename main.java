// Coder: Muhammad Najwan
/*
Purpose: to determine highest , lowest and average marks for numbers of students
*/

import java.util.Scanner;

class Main{
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        double highest = -1, lowest = 101, total = 0;
        int students = input.nextInt();
        for (int i = 0; i < students; i++)  {
            double marks = input.nextDouble();
            if (marks > highest)    {
                highest = marks;
            } 
            if (marks < lowest) {
                lowest = marks;
            }
            total = total + marks;
        }
        int opt = input.nextInt();
        if (opt == 1)    {
            System.out.print("Higest mark: " + highest + "\nLowest mark: " + lowest);
        }   else if (opt == 2)   {
            System.out.print("average: " + (total / students));
        }   else{
            System.out.print("wrong command");
        }
    }
}
