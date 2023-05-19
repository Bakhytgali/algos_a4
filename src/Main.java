public class Main {
    public static void main(String[] args)
    {
        MyHashTable<MyTestingClass, String> table = new MyHashTable<>();
        for (int i = 0; i<10000; i++){
            MyTestingClass key  = new MyTestingClass(i);
            table.put(key, "value" + i);
        }
        MyTestingClass key1 = new MyTestingClass(3);
        table.replace(key1, "Hash");
        table.get(key1);
    }
}