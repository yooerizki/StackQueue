package keg2;

public class link {
    public String data; // data item

    public link next; // link pada list

    public link(String d) {
        data = d;
    }

    public void displaylink() { // menampilkan data
        System.out.println(data + " ");
    }
}
