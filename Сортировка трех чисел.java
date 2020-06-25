package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        String sN1 = reader.readLine();
        int nN1 = Integer.parseInt(sN1);
        
        String sN2 = reader.readLine();
        int nN2 = Integer.parseInt(sN2);
        
        String sN3 = reader.readLine();
        int nN3 = Integer.parseInt(sN3);
        
        if ((nN1 >= nN2) && (nN1 >= nN3)) {
            System.out.print(nN1);
        } else if ((nN2 >= nN1) && (nN2 >= nN3)) {
            System.out.print(nN2);
        } else if ((nN3 >= nN1) && (nN3 >= nN2)) {
            System.out.print(nN3);
        }
        
        if ((nN1 >= nN2) && (nN1 <= nN3) || (nN1 <= nN2) && (nN1 >= nN3)){
            System.out.print(" " + nN1 + " ");
        } else if ((nN2 >= nN1) && (nN2 <= nN3) || (nN2 <= nN1) && (nN2 >= nN3)) {
            System.out.print(" " + nN2 + " ");
        } else if ((nN3 >= nN1) && (nN3 <= nN2) || (nN3 <= nN1) && (nN3 >= nN2)) {
            System.out.print(" " + nN3 + " ");
        }
        
        if ((nN1 <= nN2) && (nN1 <= nN3)) {
            System.out.print(nN1);
        } else if ((nN2 <= nN1) && (nN2 <= nN3)) {
            System.out.print(nN2);
        } else if ((nN3 <= nN1) && (nN3 <= nN2)) {
            System.out.print(nN3);
        }
    }
}
