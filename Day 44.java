/**
 * @param {Array<Function>} functions
 * @return {Promise<any>}
 */
var promiseAll = function(functions) {
    return new Promise((resolve, reject) => {
        let resolvedCount = 0;
        const results = new Array(functions.length);
        
        functions.forEach((func, index) => {
            func()
                .then(result => {
                    results[index] = result;
                    resolvedCount++;
                    if (resolvedCount === functions.length) {
                        resolve(results);
                    }
                })
                .catch(error => {
                    reject(error);
                });
        });
    });
};

/**
 * Example usage:
 * const promise = promiseAll([() => new Promise(res => res(42))])
 * promise.then(console.log); // [42]
 */

// Example usage
const functions1 = [
    () => new Promise(res => setTimeout(() => res(42), 200)),
    () => new Promise(res => setTimeout(() => res(24), 100))
];

promiseAll(functions1).then(
    result => console.log(result), // Expected output: [42, 24]
    error => console.error(error)
);
