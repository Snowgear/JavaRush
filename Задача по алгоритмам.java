package com.javarush.task.task05.task0532;

/* 
Задача по алгоритмам
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        if (n > 0)
        {
            int maximum = 0;
            for (int i = 1; i <= n; i++)
            {
                int s = Integer.parseInt(reader.readLine());
                if (i == 1)
                    maximum = s;
                else
                    maximum = s > maximum ? s : maximum;
            }
            System.out.println(maximum);
        }
        else
            reader.close();
    }
}
