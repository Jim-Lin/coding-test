> A graph is minimally-connected if it is connected and there is no edge that can be removed while still leaving the graph connected. For example, any binary tree is minimally-connected.  
Given an undirected graph, check if the graph is minimally-connected. You can choose to represent the graph as either an adjacency matrix or adjacency list.

### DFS
- [How can I check an adjacency matrix is a tree?](https://www.quora.com/How-can-I-check-an-adjacency-matrix-is-a-tree)
- [Determining if an undirected connected graph is minimally connected](http://cs.stackexchange.com/a/52159)
  - G is a tree.
  - G is connected and has no cycles.
  - G is connected and the number of edges is one less than the number of vertices.
- [4. Trees](http://compalg.inf.elte.hu/~tony/Oktatas/TDK/FINAL/Chap%204.PDF)
  - Theorem 4.4  
    A graph is a tree if and only if it is minimally connected.
  - Proof  
    Let the graph G be minimally connected. Then G has no cycles and therefore is a tree.
