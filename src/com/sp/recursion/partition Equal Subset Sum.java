
public class Main
{
    public boolean recursion(int arr[],int sum,int n,int k,int m[][]){
        if(sum==0){
            return true;
        }
        if(k==n){
            return false;
        }
        if(m[k][sum]!=-1){
            return (m[k][sum]==1)? true : false;
        }
        
        
        if(arr[k]<=sum){
           if(recursion(arr,sum-arr[k],n,k+1,m)){
                m[k][sum]=1;
                return true;
            }
        }
        m[k][sum]= (recursion(arr,sum,n,k+1,m)) ? 1 : 0;
        return (m[k][sum]==1) ? true : false;
    }
    public boolean partitionEqualSubsetSum(int[] arr) {
        int sum  = 0;

        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }

        if(sum%2==0){
            int m[][] = new int[arr.length+1][sum/2+1];
            for(int i=0;i<m.length;i++){
                for(int j=0;j<m[0].length;j++){
                    m[i][j]=-1;
                }
            }
            return recursion(arr,sum/2,arr.length,0,m);
        }
        return false;
    }
	public static void main(String[] args) {
		int arr[] = {1,5,11,5};
		Main m = new Main();
		System.out.print(m.partitionEqualSubsetSum(arr));
	}
}
