package javaDemo;
//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class Solution{
 

  static List<Integer> pattern(int N){
      List<Integer> list = new ArrayList<>();
      list.add(N);
      int ch=1;
      int val = N;

     switch(ch)
     {
         case 1: 
            {
            if(ch>0) {
              val=val-5;
              list.add(val);
              ch=1;
            }
            else if(ch<0)
            {
            	ch=2;
            }
            else
            {
            	ch=3;
            }
            }
          case 2:
          {
        	  if(ch<0) {
              val=ch+5;
              list.add(val);
              ch=2;
              break;
          }
          }
          default:
              {
            	  if(ch==N) {
            		  
                  break;
              }
              }
     }
     
     
	return list;  
      
  }
  public static void main(String args[])throws IOException
  {
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      int t = Integer.parseInt(in.readLine());
      while(t-- > 0){
          int N = Integer.parseInt(in.readLine().trim());
          
          Solution ob = new Solution();
          List<Integer> ans = new ArrayList<Integer>();
          ans = ob.pattern(N);
          for(int i = 0;i < ans.size();i++)
              System.out.print(ans.get(i) + " ");
          System.out.println();
      }
  }
  }
  

