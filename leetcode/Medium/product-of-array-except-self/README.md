<div>
<p>
Given an array of <i>n</i> integers where <i>n</i> &gt; 1, <code>nums</code>, return an array <code>output</code> such that <code>output[i]</code> is equal to the product of all the elements of <code>nums</code> except <code>nums[i]</code>.</p>

<p>Solve it <b>without division</b> and in O(<i>n</i>).</p>

<p>For example, given <code>[1,2,3,4]</code>, return <code>[24,12,8,6]</code>.
</p>

<p><b>Follow up:</b><br>
Could you solve it with constant space complexity? (Note: The output array <b>does not</b> count as extra space for the purpose of space complexity analysis.)</p>
</div>

### ref.
- output[i] =  { i 前面的数的乘积}  X  { i 后面的数的乘积} http://fisherlei.blogspot.tw/2015/10/leetcode-product-of-array-except-self.html
