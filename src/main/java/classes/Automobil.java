package classes;

public class Automobil {
    private  String marka;
    private String model;
    private int godiste;
    private String registracioneTablice;
    private int brojVrata;
    private String boja;
    private Motor motor;
    
    public Automobil(String marka, String model, int godiste, String registracioneTablice, int brojVrata, String boja,
            int zapremina, int jacina, Gorivo tipGoriva){
        this.marka=marka;
        this.model=model;
        this.godiste=godiste;
        this.registracioneTablice=registracioneTablice;
        this.brojVrata=brojVrata;
        this.boja=boja;
        this.motor=new Motor(zapremina,jacina,tipGoriva);
        
    }
    
    public Automobil(){
        
    }
    
    public void ofarbaj(String novaBoja){
        this.boja=novaBoja;       
    }
    
    public void registruj(String Registracija){
        this.registracioneTablice=Registracija;     
    }
    
    public String getMarka(){
        return this.marka;
    }
    
    public String getModel(){
        return this.model;
    } 
    
    public int getGodiste(){
        return this.godiste;
    }
    
    public String getRegistracioneTablice(){
        return this.registracioneTablice;
    } 
    
    public int getBrojVrata(){
        return this.brojVrata;
    } 
    
    public String getBoja(){
        return this.boja;
    }
    
    public Motor getMotor(){
        return this.motor;
    }
    
    public void setMotor(Motor motor){
        this.motor=motor;
    }
    
    public void  dajMiInformacije(){
        System.out.println("Marka automobila je " +getMarka());
        System.out.println("Model automobila je " +getModel());
        System.out.println("Godiste automobila je " +getGodiste());
        System.out.println("Registracione tablice automobila su " +getRegistracioneTablice());
        System.out.println("Broj vrata automobila je " +getBrojVrata());
        System.out.println("Boja automobila je " +getBoja());
        System.out.println("Jacina motora automobila je " +this.getMotor().getJacina());
        System.out.println("Zapremina motora automobila je "+this.getMotor().getZapremina());
        System.out.println("Tip goriva koje koristi motor automobila je "+this.getMotor().getTipGoriva());
    }   
}
