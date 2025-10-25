Problem Statement:

Given a non-empty binary tree, return the maximum path sum.
A path can start and end anywhere in the tree, but it must go downward (parent → child connections only).

The path must contain at least one node.


---

🔹 Example:

Input: [-10, 9, 20, null, null, 15, 7]

Tree structure:
      -10
      /  \
     9   20
        /  \
       15   7

Output: 42

Explanation: Path is [15 → 20 → 7]
15 + 20 + 7 = 42


---

💡 Approach:

At each node, we consider 4 possibilities:

1. Node alone


2. Node + left subtree


3. Node + right subtree


4. Node + left + right → this may be optimal path through root



We maintain:

global max = best full path anywhere in the tree

For recursion return: max one-side path (left or right)
✅ Output:

Maximum Path Sum: 42


---

⚙️ Complexity:

Type	Complexity

Time	O(n) — each node visited once
Space	O(h) — recursion stack (h = height of tree)



---

🔍 Key Insight:

Ignore negative contributions because they lower the path sum# Binary-Tree-Maximum-Path-Sum-in-Java
