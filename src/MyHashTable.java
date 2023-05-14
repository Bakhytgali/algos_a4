import java.util.ArrayList;
import java.util.List;


public class MyHashTable<K, V> {
    private static final int capacity = 16; // capacity  = variable that shows the capacity of the hashTable
    private static final double load_factor = 0.75; // load_factor  = variable that increases the size of the hashTable

    private List<Entry<K,V>>[] buckets; // buckets = variable that defines buckets of the hashTable
    private int size; // size = size of the hashTable

    public MyHashTable(){ // MyHashTable  = constructor that has capacity
        this(capacity);
    }

    public MyHashTable(int in_capacity) {
        buckets = new ArrayList[in_capacity];
        size = 0;
    }

    public void put(K key, V value) { // use to put elements into hashTable
        int index = getIndex(key);
        List<Entry<K,V>> bucket = getBucket(index);
        for (Entry<K,V> entry: bucket) {
            if (entry.getKey().equals(key)){
                entry.setValue(value);
                return;
            }
        }
        bucket.add(new Entry<>(key,value));
        size++;
        if (size> buckets.length * load_factor){
            resize();
        }
    }

    public V get(K key){ // to get the index
        int index = getIndex(key);
        List<Entry<K, V>> bucket = getBucket(index);
        for (Entry<K,V> entry: bucket) {
            if (entry.getKey().equals(key)){
                return entry.getValue();
            }
        }
        return null;
    }

    public void remove(K key){ // to remove element
        int index = getIndex(key);
        List<Entry<K, V>> bucket = getBucket(index);
        for (Entry<K,V> entry: bucket){
            if (entry.getKey().equals(key)){
                bucket.remove(entry);
                size--;
                return;
            }
        }
    }

    private int getIndex(K key){
        int hashCode = key.hashCode();
        return Math.abs(hashCode % buckets.length);
    }

    private List<Entry<K,V>> getBucket(int index){
        if (buckets[index] == null){
            buckets[index] = new ArrayList<>();
        }
        return buckets[index];
    }


    private void resize(){
        List<Entry<K,V>>[] oldBuckets = buckets;
        buckets = new List[buckets.length * 2];
        size = 0;
        for (List<Entry<K,V>> bucket: oldBuckets){
            if (bucket != null) {
                for (Entry<K,V> entry: bucket) {
                    put(entry.getKey(), entry.getValue());
                }
            }
        }
    }

    private static class Entry<K,V> {
        private K key;
        private V value;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
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
}