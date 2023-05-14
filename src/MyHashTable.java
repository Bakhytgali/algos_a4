import java.util.ArrayList;
import java.util.List;
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

        public K getKey() {
            return key;
        }

        public void setKey(K key) {
            this.key = key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }
    }
    private List<HashCode<K, V>>[] chainArray; //array of Hash Nodes
    private int numOfBuckets; // capacity
    private int size; // size
    public MyHashTable(int capacity){
        this.numOfBuckets = capacity;
        chainArray = new ArrayList[capacity];
        size = 0;
    }
    public void put(K key, V value){
        int index = getIndex(key);
        List<HashCode<K, V>>
    }
}
