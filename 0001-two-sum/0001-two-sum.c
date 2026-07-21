/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* twoSum(int* nums, int numsSize, int target, int* returnSize) {
    int *retur ;
    int k = 0;
    int i = 0,j;
    retur = (int*)malloc(2*sizeof(int));
    while(i<numsSize){
        for(j = i + 1; j<numsSize; j++){
            if( nums[i] + nums[j] == target){
                retur[0] = i;
                retur[1] = j;
                k = 1;
                break;
            }
        }
        if(k == 1){
            break;
        }
        i++;
    }
    *returnSize = 2;
    return retur;
} 