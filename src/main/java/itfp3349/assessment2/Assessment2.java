/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package itfp3349.assessment2;

import java.util.Scanner;
import java.io.*;

/**
 *
 * @author jmazzie
 */
public class Assessment2 {

    public static void main(String[] args) 
    {
        System.out.println("Teacher's Copy");
        try 
        {
            java.io.File txtFile = new java.io.File("course.txt");
            try (Scanner input = new Scanner(txtFile)) 
            {
                while (input.hasNext()) 
                {
                    String courseCode = input.next();
                    int courseHrs = input.nextInt();
                    String courseTitle = input.nextLine();
                    System.out.println("Course Code = " + courseCode + " | Credit Hours = " + courseHrs + " | Course Title = " + courseTitle);
                }
                input.close();
            }
        } 
        catch (FileNotFoundException unknown) 
        {
            System.out.println("404 File not Found");
        }
    }
}