package keg2;

public class FristLastlist {
    public link first; // link pertama
    public link last;
    int a = 0;

    public FristLastlist() { // fungsi jika tidak ada item di list
        first = null;
        last = null;
    }

    public boolean isEmpty() { // menegembalikan fungsi jika tidak ada list
        return first == null;
    }

    public void insertLast(String dd) { // memasukkan list terakhir
        link newlink = new link(dd);
        if (isEmpty()) {
            first = newlink; // buat baru
        } else {
            last.next = newlink;
        }
        last = newlink;
        a++;

    }

    public String deleteFirst() {// menghapus list
        String temp = (String) first.data; // penampung data
        if (first.next == null) {
            last = null;
        }
        first = first.next;
        a--;
        return temp; // return data penampung
    }

    public void displayList() {
        link current = first; // link item
        while (current != null) { // looping dan tampilkan jiak tidak null
            current.displaylink();
            current = current.next;
        }
        System.out.println("");
    }

    public String headfont() { // melihat data dan mereturn
        String temp = (String) first.data;
        return temp;
    }

    public int size() { // melihat ukuran link list
        return a;
    }
}
