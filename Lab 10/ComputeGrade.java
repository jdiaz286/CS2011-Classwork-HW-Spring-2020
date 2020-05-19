/*
Name: Jonathan Diaz, CIN: 400075634, CS 2011-03/CS 2011-04
Description: The objective of this program is to write a program which 
prompts the user to enter some graded items and computes the grade out 
of 100%. Each graded item consists of a score and the total, and we will 
assume that each item has the same weight. User can opt to drop the lowest 
grade from the calculation.
*/
import java.util.Scanner;
public class ComputeGrade {
    public static void main(String[] args){
        //ask for the amount of grades
        Scanner input=new Scanner(System.in);
        System.out.print("How many graded items?: ");
        int gradedItems=input.nextInt();
        //make sure amount of grades>0
        while(gradedItems<=0){
            System.out.print("Please type in a value that is greater than 0: ");
            gradedItems=input.nextInt();
        }
        //create new array that holds percent of doubles
        double[] grades=new double[gradedItems];
        System.out.println("For each item, enter the score followed by total: ");
        //gets each of the scores
        for(int i=0; i<gradedItems;i++){
            System.out.print("Graded item "+(i+1)+": ");
            double score = input.nextInt();
            double total=input.nextInt();
            //calls calculatePercentOfScore() to add value to index of array
            grades[i]=calculatePercentOfScore(score, total);
        }
        //check to see if the user wants to drop the lowest grade
        System.out.print("Drop lowest mark? [Y/N]: ");
        char dropGrade=input.next().charAt(0);
        
        System.out.print("Your grade is: "+Math.ceil(returnTotalGrade(grades,dropGrade))+"%");
    }

    //calculates percentage of score given points earned and total possible points per assignment
    public static double calculatePercentOfScore(double score, double total){
        double totalOfItem=0;
        totalOfItem=score/total;
        return totalOfItem;
    }

    //takes all values in grades[] and divides them by the total number of values in the array
    public static double returnTotalGrade(double[] allGrades, char dropGrade){
        double finalScore=0;
        double totalNumberOfPercents=0.0;
        //drop lowest grade here if asked to do so
        if(dropGrade=='y' || dropGrade=='Y'){
            for(int j=0; j<allGrades.length;j++){
                finalScore=finalScore+allGrades[j];
                totalNumberOfPercents++;
            }
            //call find minimum score and reduce length of array
            double lowesetScore=findMinimum(allGrades);
            totalNumberOfPercents--;
            finalScore=( (finalScore-lowesetScore) /totalNumberOfPercents)*100;
            finalScore=Math.ceil(finalScore);
            return finalScore;
        }
        else{
            for(int j=0; j<allGrades.length;j++){
                finalScore=finalScore+allGrades[j];
                totalNumberOfPercents++;
            }
            finalScore=(finalScore/(totalNumberOfPercents)*100);
            finalScore=Math.ceil(finalScore);
            return finalScore;
        }
    }
    
    public static double findMinimum(double[] a){
        double minimumValue=a[0];
		for(int z=1; z<a.length; z++){
			if(a[z]<minimumValue){
				minimumValue=a[z];
			}
		}
		return minimumValue; 
    }
    


}