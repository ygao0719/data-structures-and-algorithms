package hashtable;


public class Hashtable {

    private static int INITIAL_SIZE = 16;
    private HashEntry[] entries = new HashEntry[INITIAL_SIZE];

    public static class HashEntry{
        String key;
        String value;
        HashEntry next;

        public HashEntry(String key, String value){
            this.key = key;
            this.value = value;
            this.next = null;
        }

        public String toString(){
            return "[" + key + ", " + value + "]";
        }
    }


    public void add(String key, String value){
        int hash = hash(key);
        final HashEntry hashEntry = new HashEntry(key,value);

        //if hash index is empty, just add key/value in position. otherwise add this key/value to the end of linkedlist
        if (entries[hash] == null){
            entries[hash] = hashEntry;
        }else{
            HashEntry temp = entries[hash];
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = hashEntry;
        }
    }

    public String get(String key){
        int hash = hash(key);
        if (entries[hash] != null){
            HashEntry temp = entries[hash];

            while (!temp.key.equals(key) && temp.next != null){
                temp = temp.next;
            }
            return temp.value;
        }
        return null;
    }

    public boolean contains(String key){
        int hash = hash(key);
        if (entries[hash] != null){
            HashEntry temp = entries[hash];
            while (temp != null){

                if (temp.key.equals(key)){
                    return true;
                }
                temp = temp.next;
            }

        }
        return false;
    }


    public int hash(String key){
        return key.hashCode() % INITIAL_SIZE;
    }

}
