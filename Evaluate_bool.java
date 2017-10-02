package assignment2;

import java.util.Scanner;

interface boolExpression
{
	int TRUE =1 ;
	int FALSE=0;
	char AND= 'A';
	char OR='B';
	public static boolean EvaluateExpression(StringBuffer s);

}

public class Evaluate_bool implements boolExpression
{
 static boolean EvaluateExpression(StringBuffer s)
{
	int n=s.length();
	for(int i=0;i<n;i+=2)
	{
		if(i+1<n && i+2<n)
		{
			if(s.charAt(i+1)=='A'){
				if(s.charAt(i+2)=='0'||s.charAt(i)=='0')
				{
					s.setCharAt(i+2,'0');
				}
				else
					s.setCharAt(i+2,'1');
				
					
			}
			else if((i+1)<n &&s.charAt(i+1)=='B')
			{
				if(s.charAt(i+2)=='1'||s.charAt(i)=='1')
					s.setCharAt(i+2, '1');
				else s.setCharAt(i+2, '0');
			}
		}
	}
		
		System.out.println (s.charAt(n-1)-'0');
		int c=s.charAt(n-1)-'0';
		
		if(c==1){
			System.out.println( "true");
			boolean b= true;
			return b;
		}
		else if(c==0)
		{
			System.out.println("false");
			boolean b= false;
			return b;
		}
	
		
	
}
public static void main(String args[]){
	Scanner sc= new Scanner(System.in);
	String exp=sc.next();
	StringBuffer sb= new StringBuffer(exp);
    boolean d;
    d=EvaluateExpression(sb);
    System.out.println(d);
    sc.close();
	
}
}
