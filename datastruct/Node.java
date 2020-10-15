package com.df.SingleLinkedList;

import java.util.Stack;

class Node {
    public int val;
    public Node next;

    public Node(int val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return "Node{" +
                "val=" + val +
                '}';
    }
}

class SingleLinkedLsit {
    private Node head = new Node(0);

    public Node getHead() {
        return head;
    }


    public void add(Node node) {
        Node temp = head;
        while (true) {
            if (temp.next == null) {
                temp.next = node;
                break;
            } else {
                temp = temp.next;
            }
        }
    }

    public void addByIndex(Node node) {
        Node temp = head;
        boolean flag = false;
        while (true) {
            if (temp.next == null) {
                break;
            }
            if (temp.next.val > node.val) {
                break;
            } else if (temp.next.val == node.val) {
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if (flag) {
            System.out.println("当前值已存在");
        } else {
            node.next = temp.next;
            temp.next = node;
        }
    }

    public void delete(int no) {
        Node temp = head;
        boolean flag = false;
        while (true) {
            if (temp.next == null) {
                break;
            }
            if (temp.next.val == no) {
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if (flag) {
            temp.next = temp.next.next;
        } else {
            System.out.println("不存在要删除的节点");
        }
    }

    public void show() {
        if (head.next == null) {
            System.out.println("当前链表节点为空");
            return;
        }
        Node temp = head.next;
        while (temp != null) {
            System.out.println(temp);
            temp = temp.next;
        }
    }

    public void modify(int no, int val) {
        if (head.next == null) {
            System.out.println("当前链表为空,不能修改");
        }
        boolean flag = false;
        Node temp = head.next;
        while (temp != null) {
            if (temp.val == no) {
                flag = true;
                break;
            } else {
                temp = temp.next;
            }
        }
        if (flag) {
            temp.val = val;
        } else {
            System.out.println("要修改的节点不存在");
        }
    }

    /**
     * @param head 不计算头结点
     * @return count 链表中的结点个数
     */
    public static int getLength(Node head) {
        if (head.next == null) {
            return 0;
        }
        Node temp = head.next;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    /**
     * @param k
     * @param head
     * @return 返回倒数第k个节点
     */
    public static Node findIndexNode(int k, Node head) {
        if (head.next == null) {
            System.out.println("链表为空");
            return null;
        }
        int size = getLength(head);
        int num = size - k; //要遍历的次数
        Node temp = head.next;
        for (int i = 0; i < num; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public static void reverse(Node head) {
        if (head.next == null || head.next.next == null) {
            return;
        }
        Node cur = head.next;
        Node next = null;
        Node newList = new Node(0);
        while (cur != null) {
            next = cur.next; //next保存下一节点
            cur.next = newList.next; //将cur的下一节点加入新链表的最前端
            newList.next = cur; //当前节点链接到新链表
            cur = next; //cur指向下一节点
        }
        head.next = newList.next;
    }

    public static void reversePrint(Node head) {
        Stack<Node> stack = new Stack();
        Node temp = head.next;
        //将所有节点压入栈
        while (temp != null) {
            stack.push(temp);
            temp = temp.next;
        }
        //当栈不为空时，弹栈并显示
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }

}
