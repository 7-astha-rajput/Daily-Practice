/**
 * @param {Function} fn
 * @return {Object}
 */
Array.prototype.groupBy = function(fn) {
    return this.reduce((acc, item) => {
        const key = fn(item);
        if (!acc[key]) {
            acc[key] = [];
        }
        acc[key].push(item);
        return acc;
    }, {});
};

/**
 * Example usage:
 * console.log([1, 2, 3].groupBy(String)); // {"1":[1],"2":[2],"3":[3]}
 * 
 * array = [
 *   {"id":"1"},
 *   {"id":"1"},
 *   {"id":"2"}
 * ];
 * fn = function (item) { 
 *   return item.id; 
 * };
 * console.log(array.groupBy(fn)); // { "1": [{"id": "1"}, {"id": "1"}], "2": [{"id": "2"}] }
 * 
 * array = [
 *   [1, 2, 3],
 *   [1, 3, 5],
 *   [1, 5, 9]
 * ];
 * fn = function (list) { 
 *   return String(list[0]); 
 * };
 * console.log(array.groupBy(fn)); // { "1": [[1, 2, 3], [1, 3, 5], [1, 5, 9]] }
 * 
 * array = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
 * fn = function (n) { 
 *   return String(n > 5);
 * };
 * console.log(array.groupBy(fn)); // { "true": [6, 7, 8, 9, 10], "false": [1, 2, 3, 4, 5] }
 */

