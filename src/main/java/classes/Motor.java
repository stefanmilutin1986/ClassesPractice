package classes;

class Motor {
    private int zapremina;
    private int jacina;
    private Gorivo tipGoriva;
    
    public Motor(){        
    }
    
    public Motor(int zapremina, int jacina, Gorivo tipGoriva){
        this.zapremina=zapremina;
        this.jacina=jacina;
        this.tipGoriva=tipGoriva;
    }
   
    public void setZapremina(int zapremina){
        this.zapremina=zapremina;
    }
    
    public void setJacina(int jacina){
        if(jacina>0){
            this.jacina=jacina;
        }
        
    }
    
    public void setTipGoriva(Gorivo tipGoriva){
        this.tipGoriva=tipGoriva;
    }
    
    public int getZapremina(){
        return this.zapremina;
    }
    
    public int getJacina(){
        return this.jacina;
    }
    
    public Gorivo getTipGoriva(){
        return this.tipGoriva;
    }
    
    public void povecajSnagu(int zaKolikoSeMenja){
        this.jacina=this.jacina+zaKolikoSeMenja;
    }
    
    public void dajMiInformacije(){
        System.out.println("Zapremina motora je " + getZapremina());
        System.out.println("Jacina motora je " + getJacina());
        System.out.println("Tip goriva koje koristi motor je " + getTipGoriva());
    }  
}
