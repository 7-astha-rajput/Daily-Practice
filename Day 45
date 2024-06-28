/**
 * @param {Array} arr
 * @param {number} size
 * @return {Array}
 */
var chunk = function(arr, size) {
    const result = [];
    for (let i = 0; i < arr.length; i += size) {
        result.push(arr.slice(i, i + size));
    }
    return result;
};

// Test cases

// Example 1
console.log(chunk([1, 2, 3, 4, 5], 1)); // Output: [[1], [2], [3], [4], [5]]

// Example 2
console.log(chunk([1, 9, 6, 3, 2], 3)); // Output: [[1, 9, 6], [3, 2]]

// Example 3
console.log(chunk([8, 5, 3, 2, 6], 6)); // Output: [[8, 5, 3, 2, 6]]

// Example 4
console.log(chunk([], 1)); // Output: []

// Additional test cases

// Case where size is greater than array length
console.log(chunk([1, 2, 3], 5)); // Output: [[1, 2, 3]]

// Case where array length is exactly divisible by size
console.log(chunk([1, 2, 3, 4], 2)); // Output: [[1, 2], [3, 4]]
