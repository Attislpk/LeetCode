//给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。 
//
// 示例: 
//
// 输入: [0,1,0,3,12]
//输出: [1,3,12,0,0] 
//
// 说明: 
//
// 
// 必须在原数组上操作，不能拷贝额外的数组。 
// 尽量减少操作次数。 
// 
// Related Topics 数组 双指针 
// 👍 1010 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public void moveZeroes2(int[] nums) {
       if(nums.length == 0 || nums == null) return;
        int insertPos = 0;
        for(int num: nums){
            if(num != 0){
                nums[insertPos++] = num;
            }
        }

        while(insertPos < nums.length) {
            nums[insertPos ++] = 0;
        }
    }

    public void moveZeroes(int[] nums){
        //边界判断

        //[0,j-1]非零元素,起始大小为0,j初始值0
        int j = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                int temp = nums[j]; //0
                nums[j++] = nums[i];
                nums[i] = temp;
            }
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)
