import java.util.List;

class MyLinkedList<E> implements List<E>{

    private Node<E> head, tail;
    private int size = 0;

    public MyLinkedList(){

    }

    public E getFirst(){
        if(size == 0)
            return null;
        else
            return head.item;
    }

    public E getLast(){
        if(size == 0)
            return null;
        else
            return tail.item;
    }

    public void addFirst(E e){

        Node<E> newNode = new Node<>(e);

        if(size == 0){
            head.item = e;
            head = tail = newNode;
        }
        else{
            head = newNode.next;
            head = newNode;
        }
    }

    public void addLast(E e){
        if(size == 0){
            addFirst(e);
        }
        else{
            Node<E> newNode = new Node<>(e);
            newNode = tail.next;
            tail = newNode;
        }

    }

    public void add(int index, E e){
        if(size == 0 || index == 0){
            addFirst(e);
        }
        else if(index >= size){
            addLast(e);
        }
        else{

            Node<E> current = head;
            for(int i = 0 ; i < index; ++i)
                current = current.next;

            Node<E> temp = current.next;
            current.next = new Node<>(e);
            (current.next).next = temp;
            size++;
        }
    }

    public E removeFirst(){

        E temp = head.item;
        head = head.next;
        size--;

        if(head == null) tail = null;

        return temp;
    }

    public E removeLast(){

        if(size == 0 || size == 1)
            return removeFirst();
        else{
            Node<E> current = head;
            for(int i = 0 ; i < size-2 ; ++i)
                current = current.next;

            E temp = tail.item;
            tail = current;
            tail.next = null;
            size--;

            return temp;
        }
    }

    public E remove(int index){
        if(size == 0) return null;

        else if(size == 1 || index == 0)
            return removeFirst();

        else if(index == size-1)
            return removeLast();

        else{

            Node<E> previous = head;
            for(int i = 1; i < index; ++i)
                previous = previous.next;

            Node<E> current = previous.next;
            previous.next = current.next;

            size--;
            return current.item;
        }
    }

    public boolean contains(Object e){

        Node<E> traversal = head;
        while(traversal != null){
            if(traversal.item.equals(e))
                return true;
            traversal = traversal.next;
        }

        return false;
    }

    public E get(int index){

        Node<E> current = head;
        for(int i = 0 ; i <index ; ++i)
            current = current.next;

        return current.item;
    }

    public int indexOf(Object e){

        Node<E> current = head;
        for(int i = 0 ; i < size; ++i){
            if(current.item.equals(e))
                return  i;

            current = current.next;
        }

        return -1;
    }

    public int lastIndexOf(Object e){

        Node<E> current = tail;
        for(int i = size ; i >= 0 ; --i){

            if(current.item.equals(get(i)))
                return i;
        }
    }

    public E set(int index, E e){
        add(index,e);
        return  e;
    }



    public int size(){
        return size;
    }
}

class Node<E>{
    E item;
    Node<E> next;

    public Node(E e){
        item = e;
    }
}
