public class linklist {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size = 0;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void add(int idx, int data) {
        if (idx == 0) {
            addFirst(data);
            return;
        }
        size++;
        Node newNode = new Node(data);
        Node temp = head;
        for (int i = 0; i < idx - 1; i++) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst() {
        if (size == 0) {
            System.out.println("LinkedList is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast() {
        if (size == 0) {
            System.out.println("LinkedList is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }
        int val = tail.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    public int itrSearch(int key) {
        Node temp = head;
        int i = 0;
        while (temp != null) {
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    public int helper(Node head, int key) {
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }
        int idx = helper(head.next, key);
        return (idx == -1) ? -1 : idx + 1;
    }

    public int recSearch(int key) {
        return helper(head, key);
    }

    public void reverse() {
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public void removeNthFromEnd(int n) {
        if (n > size) {
            System.out.println("Invalid value of n: " + n);
            return;
        }
        if (n == size) {
            removeFirst();
            return;
        }
        int iToFind = size - n;
        Node prev = head;
        for (int i = 1; i < iToFind; i++) {
            prev = prev.next;
        }
        prev.next = prev.next.next;
        size--;
    }

    //check if ll is a palindrome
    //slow-fast APPROACH
    public Node FindMind(Node head) {
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next !=null){
            slow = slow.next; //+1
            fast = fast.next.next; //+2
        }
        return slow; //slow is my midNode

    }
    public boolean checkPsalindrome(){
        if(head == null || head.next == null){
            return true;

        }
        //step 1 - find mid node
        Node midNode = FindMind(head);

        //step2 - reverse the 2nd half
       Node prev = null ;
       Node curr = midNode;
       Node next ;
       while(curr != null){
        next = curr.next ;
        curr.next = prev ;
        prev = curr ;
        curr = next ;
       }

       Node right = prev ; // right half head
       Node left = head ; // left half head

       //step3 - check left half & right half
       while(right != null){
        if(left.data != right.data){
            return false ;

        }
        left = left.next ;
        right = right.next ;
       }
       return true ;
    }
    

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data);
            temp = temp.next;
            if (temp != null) {
                System.out.print(" --> ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        linklist ll = new linklist();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addFirst(3);
        ll.print();
        ll.addLast(6);
        ll.print();
        ll.addLast(5);
        ll.print();
        ll.add(2, 7);
        ll.print();
        ll.removeFirst();
        ll.print();
        ll.removeLast();
        //ll.print();
        //ll.reverse();
        ll.print();
        ll.removeNthFromEnd(2);
        ll.print();

        System.out.println(ll.checkPsalindrome());
        System.out.println("Size of LinkedList: " + size);
    }
}
