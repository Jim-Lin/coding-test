<div><div><p>A matrix is <em>Toeplitz</em> if every diagonal from top-left to bottom-right has the same element.</p>

<p>Now given an <code>M x N</code> matrix, return&nbsp;<code>True</code>&nbsp;if and only if the matrix is <em>Toeplitz</em>.<br>
&nbsp;</p>

<p><strong>Example 1:</strong></p>

<pre><strong>Input:</strong> matrix = [[1,2,3,4],[5,1,2,3],[9,5,1,2]]
<strong>Output:</strong> True
<strong>Explanation:</strong>
1234
5123
9512

In the above grid, the&nbsp;diagonals are "[9]", "[5, 5]", "[1, 1, 1]", "[2, 2, 2]", "[3, 3]", "[4]", and in each diagonal all elements are the same, so the answer is True.
</pre>

<p><strong>Example 2:</strong></p>

<pre><strong>Input:</strong> matrix = [[1,2],[2,2]]
<strong>Output:</strong> False
<strong>Explanation:</strong>
The diagonal "[1, 2]" has different elements.
</pre>

<p><strong>Note:</strong></p>

<ol>
	<li><code>matrix</code> will be a 2D array of integers.</li>
	<li><code>matrix</code> will have a number of rows and columns in range <code>[1, 20]</code>.</li>
	<li><code>matrix[i][j]</code> will be integers in range <code>[0, 99]</code>.</li>
</ol>

<p>&nbsp;</p></div></div>

### ref.
- https://segmentfault.com/a/1190000013191265
