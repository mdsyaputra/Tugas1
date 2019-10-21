package TUGAS;
import java.util.Stack; //library stack
public class Program_Stack {
    public static void main(String[] args) {
        Stack kosong = new Stack(); //objek Stack
        Stack berisi =  new Stack(); //objek Stack

        for (int i=1; i<=10; i++){
            kosong.push("EMBER KE-"+i);
        }

        System.out.println("TUMPUKAN EMBER CAT SEBELUM DI ISI" +
                "\njumlah Ember Kosong= "+kosong.size()+
                "\nJumlah Ember Berisi= "+kosong.size()+
                "\nTumpukan Ember sebelum diisi: ");

        for(int i=1; i<=10; i++){
            System.out.println(kosong.peek());
            berisi.push(kosong.pop());
        }

        System.out.println("\nTUMPUKAN EMBER CAT SESUDAH PENGISIAN"+
                "\nJumlah Ember Kosong= "+kosong.size()+
                "\nJumlah Ember Berisi= "+berisi.size()+
                "\nTumpukan Ember yang sudah diisi");

        for (int i=9; i>=0; i--){
            System.out.println(berisi.elementAt(i));
        }
    }
}
