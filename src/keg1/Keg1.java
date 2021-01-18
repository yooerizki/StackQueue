package keg1;

public class Keg1 {
    int array[];
    String hasilKonversi = "";// variabel data
    int sisa;
    int top = -1;

    public void setStack(int a) { // data stack
        array = new int[a];
    }

    public void push(int target) { // menambahkan data stack dari urutan pertama
        if (target >= 1) {
            sisa = target % 2; // rumus
            target = target / 2;
            array[++top] = sisa;
            push(target);
        }
    }

    public String pop() { // mengeluarkan data stack dari urutan terakhir
        if (top >= 0) {
            hasilKonversi += array[top];
            array[top--] = 0;
            return pop();
        }
        return hasilKonversi;
    }

}