package classes;

public class MainClass {
    
    public static void main(String[] args) {
        
        Automobil mercedes = new Automobil("mercedes", "a170", 2012, "BG78789", 4, "crvena", 1090, 1090, Gorivo.BENZIN);
        Automobil audi = new Automobil("audi", "a4", 2020, "BG947332", 5, "crna", 2777, 2777, Gorivo.DIZEL );
        Automobil toyota = new Automobil("toyota", "korola", 2000, "BG7777777", 5, "roze", 333, 333, Gorivo.ELEKTRO);
        
        mercedes.getMotor().setJacina(100);
        mercedes.getMotor().setZapremina(1000);
        mercedes.getMotor().setTipGoriva(Gorivo.BENZIN);
        mercedes.getMotor().povecajSnagu(77);
        mercedes.dajMiInformacije();
        mercedes.ofarbaj("Plava");
        mercedes.registruj("BG47474774");
        
        audi.getMotor().setJacina(100);
        audi.getMotor().setZapremina(4322);
        audi.getMotor().setTipGoriva(Gorivo.BENZIN);
        audi.getMotor().povecajSnagu(33);
        audi.dajMiInformacije();
        audi.ofarbaj("Zuta");
        audi.registruj("BG6464646");
        
        toyota.getMotor().setJacina(4333);
        toyota.getMotor().setZapremina(5555);
        toyota.getMotor().setTipGoriva(Gorivo.DIZEL);
        toyota.getMotor().povecajSnagu(33432);
        toyota.dajMiInformacije();
        toyota.getMotor().dajMiInformacije();
        toyota.ofarbaj("Zelena");
        toyota.registruj("BG77777778676");
        
    }
    
}
