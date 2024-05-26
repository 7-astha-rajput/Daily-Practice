class Solution(object):
    def findDifference(self, nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: List[List[int]]
        """
        # Convert lists to sets to remove duplicates and for efficient difference computation
        set1 = set(nums1)
        set2 = set(nums2)
        
        # Find elements in nums1 that are not in nums2
        diff1 = list(set1 - set2)
        
        # Find elements in nums2 that are not in nums1
        diff2 = list(set2 - set1)
        
        # Return the result as a list of two lists
        return [diff1, diff2]

# Example test cases
solution = Solution()
print(solution.findDifference([1, 2, 3], [2, 4, 6]))  # Output: [[1, 3], [4, 6]]
print(solution.findDifference([1, 2, 3, 3], [1, 1, 2, 2]))  # Output: [[3], []]
