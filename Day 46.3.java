/**
 * @param {Array} arr1
 * @param {Array} arr2
 * @return {Array}
 */
var join = function(arr1, arr2) {
    // Create a map to store objects by their id
    const map = new Map();

    // Helper function to merge two objects
    function mergeObjects(obj1, obj2) {
        const merged = { ...obj1, ...obj2 };
        return merged;
    }

    // Populate the map with elements from arr1
    arr1.forEach(obj => {
        map.set(obj.id, obj);
    });

    // Populate the map with elements from arr2, merging if id exists
    arr2.forEach(obj => {
        if (map.has(obj.id)) {
            map.set(obj.id, mergeObjects(map.get(obj.id), obj));
        } else {
            map.set(obj.id, obj);
        }
    });

    // Convert the map back to an array and sort by id
    const result = Array.from(map.values()).sort((a, b) => a.id - b.id);

    return result;
};
