package TUGAS;

public class Program_Queue {
    static int terakhir = -1;
    static int maxantrian = 5;
    public static void addQueue(String antrian[], String data)
    { if (terakhir >= maxantrian)
        System.out.println("MAAF, ANTRIAN PENUH");
    else
    { //System.out.println("add Queue: "+data);
        terakhir++;
        antrian[terakhir]=data;
    }
    }
    public static String deQueue(String antrian[])
    { String hasil="";
        if (terakhir<0)
            hasil="ANTRIAN KOSONG";
        else
        { hasil = antrian[0];
            antrian[0]=null;
            for (int i=1;i<=terakhir;i++)
            {
                antrian[i-1]=antrian[i];
                antrian[i]=null;
            }
            terakhir--;
        }
        return (hasil);
    }
    public static void bacaAntrian(String antrian[])
    { System.out.println("Kondisi Antrian : ");
        for (int i=0;i<=maxantrian;i++)
        {
            if (i==terakhir)
                System.out.println(i+". "+ antrian[i]+" Antrian Terakhir");
            else if (antrian[i]==null)
                System.out.println(i+". ");
            else
                System.out.println(i+". "+antrian[i]);
        }
    }
    public static void main(String []Teller) {
        String antrian[] = new String[100];
        System.out.println("PROGRAM ANTRIAN TELLER BANK");
        addQueue(antrian, "Nasabah A");
        addQueue(antrian, "Nasabah B");
        addQueue(antrian, "Nasabah C");
        addQueue(antrian, "Nasabah D");
        addQueue(antrian, "Nasabah E");
        addQueue(antrian, "Nasabah F");//antrian terakhir
        addQueue(antrian, "Nasabah G");//lebih dari maximal antrian
        addQueue(antrian, "Nasabah H");//lebih dari maximal antrian

        //membaca antrian
        System.out.println("-----------------------------------------------------");
        bacaAntrian(antrian);
        System.out.println("\n-----------------------------------------------------");
        System.out.println("URUTAN KELUAR\nQueue : " + deQueue(antrian));
        System.out.println("Queue : " + deQueue(antrian));
        System.out.println("Queue : " + deQueue(antrian));
        System.out.println("Queue : " + deQueue(antrian));
        System.out.println("Queue : " + deQueue(antrian));
        System.out.println("Queue : " + deQueue(antrian));
        System.out.println("Queue : " + deQueue(antrian));//keluarnya antrian terakhir, antrian selanjutnya kosong
    }
}
