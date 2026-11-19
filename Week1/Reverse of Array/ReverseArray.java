public class ReverseArray {
    public static void main(String args[]){
       int []A={1,2,3,4,5};
       int n=A.length;
       int []B=new int[n];
       for(int i=0;i<n;i++){
        B[i]=A[n-1-i];
       }
       for(int i=0;i<n;i++)A[i]=B[i];
       for(int i:A){
        System.out.print(i+" ");
       }
    }
}
