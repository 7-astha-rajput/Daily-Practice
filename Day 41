/**
 * @param {Function} fn
 * @param {number} t
 * @return {Function}
 */
var timeLimit = function(fn, t) {
    return async function(...args) {
        return new Promise((resolve, reject) => {
            // Set up the timeout
            const timeoutId = setTimeout(() => {
                reject("Time Limit Exceeded");
            }, t);

            // Call the original function
            fn(...args).then((result) => {
                clearTimeout(timeoutId); // Clear the timeout if the function resolves in time
                resolve(result);
            }).catch((error) => {
                clearTimeout(timeoutId); // Clear the timeout if the function rejects
                reject(error);
            });
        });
    };
};
