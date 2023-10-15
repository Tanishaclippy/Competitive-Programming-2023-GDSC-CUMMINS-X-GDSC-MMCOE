class Sorted {
public int search (int[] nums, int target) {
int low=0;
int high=nums.length-1;
while(low<=high) {
int midp=(low+high)/2;
int midnum=nums[midp];
if(midnum==target){
return midp;
}
else if(nums[low]<=midnum) {
if (nums[low]<=target&&target<midnum) {
high=midp-1;
}
else{
low=midp+1;
}
}
else{
if(midnum<target&&target<=nums[high]){
low=midp+1;
}
else{
high=midp-1;
}
}
}
return -1;//if target not found will return this value
}
}
