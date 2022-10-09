package NumberToLetterGrade;

import java.util.Scanner;
public class NumberToLetterGrade {

    public static void main(String[] args)
    {
        int avg;
        Scanner kb=new Scanner(System.in);
        System.out.print("Enter your average as an integer");
        avg=kb.nextInt();
        /*At least 95 is an A
         * Grading system + other outputs as invalid entry.
         */
        if(avg>=95)
            System.out.println("A");
        else if((avg>=90)&&(avg<=94))
            System.out.println("A-");
        else if((avg>=87)&&(avg<=89))
            System.out.println("B+");
        else if((avg>=83)&&(avg<=86))
            System.out.println("B");
        else if((avg>=80)&&(avg<=82))
            System.out.println("B-");
        else if((avg>=77)&&(avg<=79))
            System.out.println("C+");
        else if((avg>=73)&&(avg<=76))
            System.out.println("C");
        else if((avg>=70)&&(avg<=72))
            System.out.println("C-");
        else if((avg>=65)&&(avg<=69))
            System.out.println("D+");
        else if((avg>=60)&&(avg<=64))
            System.out.println("D");
        else if((avg>=0)&&(avg<=60))
            System.out.println("F");
        else
            System.out.println("INVALID ENTRY. AVG MUST BE A POSITIVE INTEGER VALUE");
	/*
	 * Enter your average as an integer
100
A
Enter your average as an integer
86
B
Enter your average as an integer
79
C+
Enter your average as an integer66
D+
Enter your average as an integer60
D
Enter your average as an integer-3
INVALID ENTRY. AVG MUST BE A POSITIVE INTEGER VALUE
	 */



    }
}