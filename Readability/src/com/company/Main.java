package com.company;
import java.util.Scanner;
import java.util.*;
import java.lang.Math;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Text:");
        String str = sc.nextLine();
        System.out.println(str);
        int l = 0;
        int w = 0;
        int s = 0;

        for (int i = 0; i < str.length()-1; i++) {
            if ((str.charAt(i) >= 'a' && str.charAt(i) <= 'z' || str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')) {
                l++;
            }
            if (str.charAt(i) == ' ' || str.charAt(i + 1) == ' ') {
                w++;
            }
            if (str.charAt(i) == '!' || str.charAt(i) == '.' || str.charAt(i) == '?') {
                s++;
            }
        }

        float averageWords = (100 / w) *  l;
        float averageSentence = (100/ w) * s;
            double index =(0.0588 * averageWords - 0.296 * averageSentence - 15.8);
            index = Math.round(index);
            if (index < 1) {
            System.out.println("Before Grade 1");
             }
            if (index >= 16) {
            System.out.println("Grade 16+");
            } else
             System.out.println("Grade " + index);
    }
    }
