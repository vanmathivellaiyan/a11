package guviprogram;

import java.util.Scanner;

public class ArraFirstEleRepeat {
public  static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int temp = 0;
	int[] num=new int[5];
	for(int i=0;i<num.length;i++){
	num[i]=sc.nextInt();
	}
	/*for(int m=0;m<num.length;m++){
		for(int n=m+1;n<num.length;n++){
			if(num[m]>num[n]){
			temp=num[m];
			num[m]=num[n];
			num[n]=temp;
			}
	}
	
}
	for(int l=0;l<num.length;l++){
	System.out.println(num[l]);
	*/
	for(int p=0;p<num.length;p++){
		for(int j=p+1;j<num.length;j++){
			if(num[p]==num[j]){
				System.out.println(num[p]);
				break;
			}
		}
	}
}
}
