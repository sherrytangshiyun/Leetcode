/*
* author sherry
* 动态规划
* 二位动态数组，给初始状态后，如果当前位置两个字符串中的字符相同，则dp[i][j] = dp[i-1][j-1],
* 如果不同，状态转移方程为 dp[i][j] = min(dp[i-1][j-1],dp[i][j-1],dp[i-1][j])+1，意思是加入对当前两个字符进行插入删除或替换，这三者之间最小的操作次数+1就是当前长度字符要操作的总次数
* +1的是让本次当下两个字符相同的操作，这个操作要么是插入要么是删除要么是替换，所以+1
* */

package com.test;

public class bianjijuli {
        public static int minDistance(String word1, String word2,int dp[][]) {
           // int[][] dp = new int[word1.length()+1][word2.length()+1];

            for(int i = 0; i <= word1.length();i++)
                dp[i][0] = i;
            for(int i = 0; i <= word2.length(); i++)
                dp[0][i] = i;

            for(int i = 1;i < word1.length()+1;i++)
                for(int j = 1; j < word2.length()+1;j++){
                    if(word1.charAt(i-1) == word2.charAt(j-1))
                        dp[i][j] = dp[i-1][j-1];
                    else{
                        int minx = (dp[i-1][j-1]<dp[i-1][j]) ? dp[i-1][j-1] : dp[i-1][j];
                        dp[i][j] = Math.min(minx,dp[i][j-1]) + 1;
                    }
                }
           return dp[word1.length()][word2.length()];
        }

    public static void main(String[] args) {
        String l ="horse";
        String l1 ="ros";
        int[][] dp = new int[l.length()+1][l1.length()+1];
        int ans = minDistance(l,l1,dp);

        System.out.println(ans);
    }
    }

//leetcode提交的代码
//class Solution {
//    public int minDistance(String word1, String word2) {
//        int[][] dp = new int[word1.length()+1][word2.length()+1];
//
//        for(int i = 0; i <= word1.length();i++)
//            dp[i][0] = i;
//        for(int i = 0; i <= word2.length(); i++)
//            dp[0][i] = i;
//        for(int i = 1;i < word1.length()+1;i++)
//            for(int j = 1; j < word2.length()+1;j++){
//                if(word1.charAt(i-1) == word2.charAt(j-1))
//                    dp[i][j] = dp[i-1][j-1];
//                else{
//                    int minx = (dp[i-1][j-1]<dp[i-1][j]) ? dp[i-1][j-1] : dp[i-1][j];
//                    dp[i][j] = Math.min(minx,dp[i][j-1]) + 1;
//                }
//            }
//        return dp[word1.length()][word2.length()];
//    }
//}