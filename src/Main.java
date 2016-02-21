public class Main{
int i;
public static void main(String[] args) {
        Computer Dell = new Computer();
        Computer HP = new Computer();
        Computer Asus = new Computer();
        Computer Acer = new Computer();
        Computer Samsung = new Computer();

        Computer[] compArr = {Dell, HP, Asus, Acer, Samsung};

        Samsung.setPrice(1700);
        Dell.setPrice(2200);
        HP.setPrice(2000);
        Asus.setPrice(1500);
        Acer.setPrice(1300);

        System.out.println(Dell.getPrice());

        float Z = (float) 1.1;
        for (Computer i: compArr) { i.setPrice(i.getPrice()*Z);   }
        System.out.println(Dell.getPrice());

        for (Computer i: compArr) { i.view(); System.out.println();   }}}

