//假设你正在爬楼梯。需要 n 阶你才能到达楼顶。 
//
// 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？ 
//
// 注意：给定 n 是一个正整数。 
//
// 示例 1： 
//
// 输入： 2
//输出： 2
//解释： 有两种方法可以爬到楼顶。
//1.  1 阶 + 1 阶
//2.  2 阶 
//
// 示例 2： 
//
// 输入： 3
//输出： 3
//解释： 有三种方法可以爬到楼顶。
//1.  1 阶 + 1 阶 + 1 阶
//2.  1 阶 + 2 阶
//3.  2 阶 + 1 阶
// 
// Related Topics 动态规划 
// 👍 1575 👎 0

//懵逼的时候，考虑暴力求解？ 找重复子问题？
1:1
2:2
3:3..  f(3)=f(1)+f(2)
..
n: f(n)=f(n-1)+f(n+1)
//leetcode submit region begin(Prohibit modification and deletion)


class Solution {
    public int climbStairs(int n) {
        if (n <= 2) return n;

        int f1 = 1, f2 = 2;
        int temp;
        for( int i = 3; i <= n; i++) { //i代表求解第i个数字，i~3-n
            temp = f1 + f2;
            f1 = f2;
            f2 = temp;
        }
        return f2;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
