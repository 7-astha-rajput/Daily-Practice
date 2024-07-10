import java.util.PriorityQueue;
import java.util.HashSet;
import java.util.Set;

class SmallestInfiniteSet {
    private int current;
    private PriorityQueue<Integer> minHeap;
    private Set<Integer> setBack;

    public SmallestInfiniteSet() {
        this.current = 1;
        this.minHeap = new PriorityQueue<>();
        this.setBack = new HashSet<>();
    }

    public int popSmallest() {
        if (!minHeap.isEmpty()) {
            int smallest = minHeap.poll();
            setBack.remove(smallest);
            return smallest;
        } else {
            return current++;
        }
    }

    public void addBack(int num) {
        if (num < current && setBack.add(num)) {
            minHeap.offer(num);
        }
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */
