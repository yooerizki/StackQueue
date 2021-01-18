package keg2;

public class App {
    public static void main(String[] args) { // driver
        LinkQueue coba = new LinkQueue();

        System.out.println(coba.isEmpty()); // cek kondisi kosong atau tidak

        coba.enqueue("D"); // tambah elemen ke queue
        coba.enqueue("E");
        coba.enqueue("F");
        coba.enqueue("G");

        System.out.println(coba.isEmpty());
        coba.displayQueue(); // menampilkan data dari queue

        coba.enqueue("H"); // masukkan item ke queue
        coba.enqueue("I");
        coba.displayQueue();

        coba.dequeue(); // hapus item 1,2,3
        coba.dequeue();
        coba.dequeue();
        coba.displayQueue();

        System.out.println("peek : " + coba.peek()); // melihat data
        System.out.println("Size : " + coba.Size()); // ukuran data
    }
}