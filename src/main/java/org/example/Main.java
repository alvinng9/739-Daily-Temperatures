package org.example;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        int[] tempOne = new int[]{73,74,75,71,69,72,76,73};
        int[] tempTwo = new int[]{30,40,50,60};
        int[] tempThree = new int[]{30,60,90};
        printIntArray(dailyTemperatures(tempOne));
        printIntArray(dailyTemperatures(tempTwo));
        printIntArray(dailyTemperatures(tempThree));
    }

    public static int[] dailyTemperatures(int[] temp) {
        int[] result = new int[temp.length];
        Stack<Integer> st = new Stack<>();
        for (int i = temp.length - 1; i >= 0; i--) {
            while (!st.empty() && temp[st.peek()] <= temp[i]) {
                st.pop();
            }

            if (!st.empty()) {
                result[i] = st.peek() - i;
            }

            st.push(i);
        }
        return result;
    }

    public static void printIntArray(int[] array) {
        System.out.print("[ ");
        for (int here : array) {
            System.out.print(here + " ");
        }
        System.out.println("]");
    }
}