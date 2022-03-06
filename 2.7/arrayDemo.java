public class arrayDemo {

public static void main(String[] args) {

//single-dimensional array
int a[]= {10,20,30,40,50,60};
for(int i=0;i<6;i++) {
System.out.println("Elements of array a: "+a[i]);
}


//multidimensional array
int[][] e = { {2, 4, 6, 8}, 
            {3, 6, 9} };
      
      System.out.println("\nLength of row 1: " + e[1].length);
      }
}
