public class DiffBitCounter {
    public int cntBits(int[] A) {
        int sum=0;
       int  M=10^9+7;
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A.length;j++){
                sum=(sum+diffbits(A[i],A[j]))%M;
            }
        }
        return sum;
    }
    public int diffbits(int a, int b){
        int sum=0;
        for (int i=0;i<31;i++){
            if((a&1) != (b&1)) sum+=1;
            a=a >> 1 ;
            b=b >> 1;
        }
        return sum;
    }
}
