class TimeLimitedCache {
    constructor() {
        this.cache = new Map();
    }

    /**
     * @param {number} key
     * @param {number} value
     * @param {number} duration time until expiration in ms
     * @return {boolean} if un-expired key already existed
     */
    set(key, value, duration) {
        const now = Date.now();
        const hasKey = this.cache.has(key);
        if (hasKey) {
            clearTimeout(this.cache.get(key).timeout);
        }

        const timeout = setTimeout(() => {
            this.cache.delete(key);
        }, duration);

        this.cache.set(key, { value, expiration: now + duration, timeout });
        return hasKey;
    }

    /**
     * @param {number} key
     * @return {number} value associated with key
     */
    get(key) {
        const now = Date.now();
        if (this.cache.has(key)) {
            const entry = this.cache.get(key);
            if (entry.expiration > now) {
                return entry.value;
            } else {
                this.cache.delete(key);
            }
        }
        return -1;
    }

    /**
     * @return {number} count of non-expired keys
     */
    count() {
        const now = Date.now();
        let count = 0;
        for (const [key, entry] of this.cache.entries()) {
            if (entry.expiration > now) {
                count++;
            } else {
                this.cache.delete(key);
            }
        }
        return count;
    }
}

// Example usage and testing
const timeLimitedCache = new TimeLimitedCache();
console.log(timeLimitedCache.set(1, 42, 1000)); // false
console.log(timeLimitedCache.get(1)); // 42
console.log(timeLimitedCache.count()); // 1

// Simulating delays for testing purposes
setTimeout(() => {
    console.log(timeLimitedCache.get(1)); // 42 (if checked within 1000ms)
    console.log(timeLimitedCache.count()); // 1
}, 500);

setTimeout(() => {
    console.log(timeLimitedCache.get(1)); // -1 (after 1000ms)
    console.log(timeLimitedCache.count()); // 0
}, 1500);
