/*
Name: Jonathan Diaz, CIN: 400075634, Course: CS 2011-03/04
Description: The goal of this code is to simply write a program that Approximate Pi
using the Leibniz formula
*/
public class LeibnizPi{
	public static void main (final String[] args) {
        //calculation for pi
        double pi=0.0;
        double upper=0.0;
        double lower=0.0;
        for(int i=1; i<=101 ; i++){
            upper=Math.pow(-1,(i+1));
            lower=(2*i)-1;
            pi=pi+(upper/lower);
        }
        pi=pi*4;
        System.out.println("pi: " + pi+" ");
	}
}