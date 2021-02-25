不使用任何内建的哈希表库设计一个哈希映射

具体地说，你的设计应该包含以下的功能

put(key, value)：向哈希映射中插入(键,值)的数值对。如果键对应的值已经存在，更新这个值。
get(key)：返回给定的键所对应的值，如果映射中不包含这个键，返回-1。
remove(key)：如果映射中存在这个键，删除这个数值对。

示例：

MyHashMap hashMap = new MyHashMap();
hashMap.put(1, 1);          
hashMap.put(2, 2);         
hashMap.get(1);            // 返回 1
hashMap.get(3);            // 返回 -1 (未找到)
hashMap.put(2, 1);         // 更新已有的值
hashMap.get(2);            // 返回 1 
hashMap.remove(2);         // 删除键为2的数据
hashMap.get(2);            // 返回 -1 (未找到) 



//拉链法
class MyHashMap {
    Node[] a = new Node[100000];
    int len  = a.length;
    /** Initialize your data structure here. */
    public MyHashMap() {

    }
    
    /** value will always be non-negative. */
    public void put(int key, int value) {
      Node node = new Node(key,value);
      int idx = key%len;
      if(a[idx] == null){
          a[idx] = node;
      }
     Node cur = a[idx];
     if(cur.key== key){
         cur.value = value;
     }
    }
    
    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    public int get(int key) {
      int idx  = key%len;
      return a[idx]==null?-1:a[idx].value;
    }
    
    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    public void remove(int key) {
       int idx = key % len;
      a[idx] =null;
    }
    static class Node{
        int key;
        int value;
        Node next;
        Node(){}
        Node(int key,int value){
            this.key = key;
            this.value =value;
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */