package org.example;

import java.util.Stack;

public class Solution {
    public int[] dailyTemperatures(int[] temp) {
        //create a stack of integers
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[temp.length];
        //iterate through the given temperature array backward
        for (int i = temp.length - 1; i >= 0; i--) {
            //check if the stack is not empty and if the current temperare
            //is higher than temperatures on top of the stack
            while(!stack.empty() && temp[i] >= temp[stack.peek()]) {
                //remove the temperatures that qualify
                //with the if statement above
                stack.pop();
            }

            //populate the days the current index has to wait for a higher temperature
            if (!stack.empty()) {
                result[i] = stack.peek() - i;
            }

            //add the current day to the stack
            stack.push(i);
        }
        return result;
    }
}
