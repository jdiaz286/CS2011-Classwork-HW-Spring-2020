/*
Name: Jonathan Diaz, CIN: 400075634, Course: CS 2011-03/04
Description: The goal of this code is to simply write a program that Approximate Pi
using the Leibniz formula
*/
public class LeibnizPi1{
	public static void main (String[] args) {
        int amountOfRuns=0;
        System.out.println("  n     pi(n) ");
        System.out.println("--------------");
        while(amountOfRuns<10){
            pi(amountOfRuns);
            amountOfRuns++;
        }
    }
    
    public static double pi(int n){
        //calculation for pi
        double pi=0.0;
        double upper=0.0;
        double lower=0.0;
        n=1+(n*100);
        for(int i=1; i<=n ; i++){
            upper=Math.pow(-1,(i+1));
            lower=(2*i)-1;
            pi=pi+(upper/lower)*4;
        }   
        System.out.printf(" %3d    %1.4f%n",n ,pi);
        return pi;
    }
}