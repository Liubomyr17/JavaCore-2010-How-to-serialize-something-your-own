package com.company;

/*

2010 How to serialize something your own
Make serialization of the Object class possible.

Requirements:
1. The Object class must exist inside the Solution class.
2. The Solution.Object class must be static.
3. The Solution.Object class must be public.
4. The Solution.Object class must support the Serializable interface.
5. The Solution.String class must support the Serializable interface.


 */


import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Solution {


    public static void main(String[] args) {


        class Object implements Serializable {
            public String string1;
            public String string2;
        }

        final int[] countStrings = {0};

    class String implements Serializable {
        private final int number;

        public String() {
            number = ++countStrings[0];
        }

        public void print() {
            System.out.println("string #" + number);
        }
    }
    }
}