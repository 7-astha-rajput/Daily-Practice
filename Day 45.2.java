/**
 * @return {null|boolean|number|string|Array|Object}
 */
Array.prototype.last = function() {
    if (this.length === 0) {
        return -1;
    } else {
        return this[this.length - 1];
    }
};

// Test cases

// Example 1
const nums1 = [null, {}, 3];
console.log(nums1.last()); // Output: 3

// Example 2
const nums2 = [];
console.log(nums2.last()); // Output: -1

// Additional test cases

// Array with one element
const nums3 = [42];
console.log(nums3.last()); // Output: 42

// Array with multiple elements
const nums4 = [1, 2, 3, 4, 5];
console.log(nums4.last()); // Output: 5

// Array with different types of elements
const nums5 = [true, 'hello', 100, {a: 1}];
console.log(nums5.last()); // Output: {a: 1}

// Empty array
const nums6 = [];
console.log(nums6.last()); // Output: -1
