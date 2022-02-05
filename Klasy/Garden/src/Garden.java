public class Garden {
    public static void main(String[] args) {
        Plant plant1=new Plant();
        plant1.title="Róza";
        plant1.title="Czerwona";
        plant1.dailywaterdemand=0.5;
        Plant plant2=new Plant();
        plant2.title="Tulipan";
        plant2.title="Żółty";
        plant2.dailywaterdemand=0.8;
        Plant plant3=new Plant();
        plant3.title="Chryzantema";
        plant3.title="Złocista";
        plant3.dailywaterdemand=0.9;
        int d=(int)(plant1.dailywaterdemand+plant2.dailywaterdemand+plant3.dailywaterdemand);
        // zaokraglenie w postaci uciecia miejsc po przecinku
        int w=7*d;
        int y=365*d;

        System.out.println("Dzienne zuzycie wody przez wszystkie rosliny wynosi: " + d + "l"); // dzienne zapotrzebowanie na wode
        System.out.println("Tygodniowe zuzycie wody wynosi: " + w + "l"); // tygodniowe zapotrzebowanie na wode
        System.out.println("Roczne Zuzycie wody wynosi: " + y + "l"); // roczne zapotrzebowanie na wode


    }
}
