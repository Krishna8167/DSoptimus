# DSoptimus
📘 LeetCode Solutions in Java — My Actual Problem Solving

This repository contains my real and complete Java solutions to LeetCode problems, organized strictly by question number.
Each solution reflects my genuine approach, debugging process, optimization attempts, and learning while working through the LeetCode platform.

📂 Repository Structure

All solutions are stored in numerical order following LeetCode’s official problem numbering:

.
├── xxx-Two-Sum/
│   └── Solution.java
├── xxx-Add-Two-Numbers/
│   └── Solution.java
├── xxx-Longest-Substring-Without-Repeating-Characters/
│   └── Solution.java
├── ...
└── xxxx+ ongoing...


Each folder typically includes:

Solution.java — the full working code


🧠 What This Repository Represents

This repo is:

My personal learning record

A real archive of problems I solved in Java

A reflection of my logic, mistakes, and improvements over time

A structured preparation for coding interviews

No generated or copied solutions — every file is written by me while solving the problem.

📝 Solution Style

Most solutions include:

A clean and readable Java implementation

Time & space complexity notes

Clear method names and commented logic (if i feel necessary, mostly not ..)

Example pattern:

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (map.containsKey(diff)) {
                return new int[] { map.get(diff), i };
            }
            map.put(nums[i], i);
        }
        
        return new int[0];
    }
}

📈 Progress

I update this repository as I continue solving problems, aiming to complete:

🔹 Easy

🔸 Medium

🔺 Hard

…across all major LeetCode categories (arrays, DP, graphs, trees, math, and more).

🔧 Language Used

All solutions in this repository are written in:

☕ Java (primary and only language here)

🤝 Contributions

This is a personal learning repository, but suggestions or improvements are always welcome through Issues or PRs.
