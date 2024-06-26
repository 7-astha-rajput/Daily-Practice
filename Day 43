/**
 * @param {Function} fn
 * @param {number} t milliseconds
 * @return {Function}
 */
var debounce = function(fn, t) {
    let timeoutId;
    
    return function(...args) {
        // Clear the previous timeout
        if (timeoutId !== undefined) {
            clearTimeout(timeoutId);
        }
        
        // Set a new timeout to execute the function after delay t
        timeoutId = setTimeout(() => {
            fn(...args);
        }, t);
    };
};

/**
 * Example usage:
 * const log = debounce(console.log, 100);
 * log('Hello'); // cancelled
 * log('Hello'); // cancelled
 * log('Hello'); // Logged at t=100ms
 */
