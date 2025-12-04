
public class Main
{
    public boolean recursion(int arr[],int sum,int n,int k){
        if(sum==0){
            return true;
        }
        if(k==n){
            return false;
        }
        
        if(arr[k]<=sum){
           if( recursion(arr,sum-arr[k],n,k+1)){
               return true;
           }
        }
        return recursion(arr,sum,n,k+1);
        
        
    }
    public boolean partitionEqualSubsetSum(int arr[]){
        int sum  = 0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        if(sum%2==0){
            return recursion(arr,sum/2,arr.length,0);
        }
        return false;
    }
	public static void main(String[] args) {
		int arr[] = {1,5,11,5};
		Main m = new Main();
		System.out.print(m.partitionEqualSubsetSum(arr));
	}
}
