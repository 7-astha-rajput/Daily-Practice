class Solution(object):
    def equalPairs(self, grid):
        """
        :type grid: List[List[int]]
        :rtype: int
        """
        from collections import defaultdict
        
        n = len(grid)
        row_count = defaultdict(int)
        
        # Count frequency of each row as a tuple
        for row in grid:
            row_tuple = tuple(row)
            row_count[row_tuple] += 1
        
        # Now count matches with columns
        result = 0
        for c in range(n):
            col_tuple = tuple(grid[r][c] for r in range(n))
            if col_tuple in row_count:
                result += row_count[col_tuple]
        
        return result

# Example usage:
sol = Solution()
print(sol.equalPairs([[3,2,1],[1,7,6],[2,7,7]]))  # Output: 1
print(sol.equalPairs([[3,1,2,2],[1,4,4,5],[2,4,2,2],[2,4,2,2]]))  # Output: 3
