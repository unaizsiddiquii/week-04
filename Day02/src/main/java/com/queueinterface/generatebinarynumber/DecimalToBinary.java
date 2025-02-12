package com.queueinterface.generatebinarynumber;

import java.util.LinkedList;
import java.util.Queue;

public class DecimalToBinary {

    //method to convert decimal to binary
    public static Queue<String> decimalToBinary(int n) {

        //create queue to store binary number
        Queue<String> binaryQueue = new LinkedList<>();

        for (int i = 1; i <= n; i++) {

            //convert decimal to binary in string
            binaryQueue.add(Integer.toBinaryString(i));
        }

        return binaryQueue;

    }
}
