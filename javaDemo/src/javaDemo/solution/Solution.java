package javaDemo.solution;

public class Solution {

	public static void main(String[] args) {
		String s="leetcode";
	
		for(int i=0;i<s.length()-1;i++){
            boolean letter = true;
            for(int j=i+1;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j) ){
                    letter=false;
                    break;
                }
            }
            if(letter==true){
                System.out.println(i);
            }

	}
		System.out.println("-1");

}
}
