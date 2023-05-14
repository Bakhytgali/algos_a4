public class MyHashTable {
    private class HashCode<K, V> {
        private K key;
        private V value;
        private HashCode<K, V> next;

        public HashCode(K key, V value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String toString() {
            return "{" + key + " " + value + "}";

        }
    }
    private HashCode[] chainArray; //array of Hash Nodes
    private int numOfBuckets; // capacity
    private int size; // size
}
