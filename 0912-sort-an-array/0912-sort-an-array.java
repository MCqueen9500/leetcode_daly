class Solution {
    public static void quick(int arr[],int st,int endd){
        if(st>=endd){
            return;
        }
        int mid = st + (endd - st)/2;
        quick(arr,st,mid);
        quick(arr,mid+1,endd);
        int temp[] = new int[endd - st + 1];
        int i = st;
        int j = mid + 1;
        int k = 0;
        while(i <= mid && j<=endd){
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++;
                k++;
            }
            else{
                temp[k] = arr[j];
                j++;
                k++;
            }
        }

        while(i<=mid){
            temp[k] = arr[i];
                i++;
                k++;
        }

        while(j<=endd){
            temp[k] = arr[j];
                j++;
                k++;
        }

        for(int m = 0;m<k;m++){
            arr[st + m] = temp[m];
        }
        
    }
    
    public int[] sortArray(int[] nums) {
    quick(nums,0,nums.length - 1);
    return nums;
        
    }
}