<div>
<p>
Given a <b>non-empty</b> string <i>s</i> and a dictionary <i>wordDict</i> containing a list of <b>non-empty</b> words, determine if <i>s</i> can be segmented into a space-separated sequence of one or more dictionary words. You may assume the dictionary does not contain duplicate words.
</p>

<p>For example, given<br>
<i>s</i> = <code>"leetcode"</code>,<br>
<i>dict</i> = <code>["leet", "code"]</code>.
</p>

<p>
Return true because <code>"leetcode"</code> can be segmented as <code>"leet code"</code>.
</p>
</div>

### thinking
- Backtracking
- DFS
- DP

### ref.
- DP Solution http://buttercola.blogspot.tw/2014/08/leetcode-word-break.html

### complexity
#### Time: O(n^2)
#### Space: O(n)
