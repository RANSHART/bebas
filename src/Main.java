import java.util.*;
class hari{
    public static void main (String[] args) throws Exception{
        Scanner input = new Scanner(System.in);
        int hari1,bulan,tahun,hari2;
        System.out.print ("Masukan hari : ");
        hari1 = input.nextInt();
        tahun = Tahun(hari1);
        bulan = Bulan(hari1, tahun);
        hari2 = Hari(hari1, bulan, tahun);
        System.out.println ("\n"+tahun+" tahun, "+bulan+" bulan, "+hari2+" hari");
    }

    private static int Hari(int hari1, int bulan, int tahun) {
        int hari2;
        hari2 = (hari1 -((tahun *365)+(bulan *30)));
        return hari2;
    }

    private static int Bulan(int hari1, int tahun) {
        int bulan;
        bulan = (hari1 -(tahun *365))/30;
        return bulan;
    }

    private static int Tahun(int hari1) {
        int tahun;
        tahun = (hari1 /365);
        return tahun;
    }
}

