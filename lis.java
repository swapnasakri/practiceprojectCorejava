package com.lis;

public class lis {
	static int max_ref;
	static int _liss(int arr[],long n) {
		if (n==1)
			  return 1;
		
		
	int res,max_end=1;
	for(int i=1;i<n;i++) {
		res=_liss(arr,i);
		if(arr[i-1] <arr[(int) (n-1)]&&res+1>max_end)
			max_end=res+1;
		}
	
	if(max_ref<max_end)
		max_ref=max_end;
	return max_end;
	}


static final  int liss( int arr[], long n)
{
	max_ref=1;
	_liss(arr,n);
	return max_ref;
}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]=  {10,20,30,9,41,50,60,13};
long  n= (int) arr.length;
System.out.println("length of lis is " +liss(arr,n)+"\n");
	}
	}
	

