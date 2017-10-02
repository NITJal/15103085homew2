package assignment2;

public class PrintAllkLength {
	public static void main(String args[]){
		System.out.println("First test:For length=one");
		char set[] ={'A','A','C','E'};
		int k=1;
		PrintAllkLength(set,k);
		System.out.println("Second test:For length=two");
		int p=2;
		PrintAllkLength(set,p);
		System.out.println("Third test:For length=three");
		int s=3;
		PrintAllkLength(set,s);
		System.out.println("Fourth test:For length=four");
		
		int t=4;
		PrintAllkLength(set,t);
	}


static void PrintAllkLength(char set[],int k)
{
	int n=set.length;
	PrintAllkLengthRec(set,"",n,k);
}
static void PrintAllkLengthRec(char set[],String prefix,int n,int k)
{
	if(k==0)
	{
		System.out.println(prefix);
		return;
		}
	for(int i=0;i<n;++i)
	{
		String  newPrefix=prefix+set[i];
		PrintAllkLengthRec(set,newPrefix,n,k-1);
		
	}
}
}
