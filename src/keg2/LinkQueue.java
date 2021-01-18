package keg2;

public class LinkQueue {
    public FristLastlist theList;

    public LinkQueue() {
        theList = new FristLastlist(); // return fungsi add list
    }

    public boolean isEmpty() { // jika queue kosong
        return theList.isEmpty();
    }

    public void enqueue(String j) { // menambah elemn terakhir ke queue
        theList.insertLast(j);
    }

    public String dequeue() { // menghapus elemen pertama dari queue
        return theList.deleteFirst();
    }

    public void displayQueue() { // menampilkan data queue
        System.out.println("Queue (Head-->Tail) : ");
        theList.displayList();
    }

    public String peek() { // melihat data pertama di queue
        return theList.headfont();
    }

    public int Size() { // ukuran data di queue
        return theList.size();
    }
}
