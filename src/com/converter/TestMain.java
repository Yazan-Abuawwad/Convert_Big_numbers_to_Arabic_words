package com.converter;

import java.util.Scanner;

public class TestMain {

    public static void main(String[] args) {
	// write your code here


        Scanner scanner= new Scanner(System.in);
        UtilityTOArabic utilityTOArabic=new UtilityTOArabic();

        while (true){
  System.out.println(utilityTOArabic.numberToArabicWords(scanner.next()));

        }


    }
}
