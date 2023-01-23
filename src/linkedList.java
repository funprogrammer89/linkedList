public class linkedList {
    int size = 0;
    node start;

    int size(){
        return size;
    }

    void delete(int data) {
        if (start == null) {
            return;
        }
        node current = start;
        if(current.data == data){
            start = current.next;
        }
        while (current.next != null ) {

            if (current.next.data == data) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
        size--;
    }

    void add(int data){
        node newNode = new node();
        newNode.data = data;
        size ++;

        if(start==null){
            start = newNode;
        }
        else {
            node current = start;

            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    void addMultiple(int... args){
        for(int data:args) {
            node newNode = new node();
            newNode.data = data;
            size++;

            if (start == null) {
                start = newNode;
            } else {
                node current = start;

                while (current.next != null) {
                    current = current.next;
                }
                current.next = newNode;
            }
        }
    }

    void deleteMultiple(int... args) {
        for (int data : args) {
            if (start == null) {
                return;
            }
            node current = start;
            if(current.data == data){
                start = current.next;
            }
            while (current.next != null ) {

                if (current.next.data == data) {
                    current.next = current.next.next;
                    break;
                }
                current = current.next;
            }
            size--;
        }
    }
    void printLink(){
        node current = start;
        while(current != null){
            System.out.println(current.data);
            current = current.next;
        }
    }

}

class node{
    int data;
    node next;
}

