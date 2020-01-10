package ejerciciodos;

public class Avion {
    private double vrKg;
    private double peso; //kg
    private double pesoMenor;
    private double pesoMayor;
    private double pesoPromedio;
    private double ingresoPesos;
    private double ingresoDolares;
    
    private double acumudorPrecioBulto;
    
    // private int cantidad;
    private int numTotalBultos;
    
    
    
    

    public Avion( double peso) {
//        this.vrKg = vrKg;
        this.peso = peso;
       // getValorKiloBulto();
    }

    public double getVrKg() {
        return vrKg;
    }

    public void setVrKg(double vrKg) {
        this.vrKg = vrKg;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPesoMenor() {
        return pesoMenor;
    }

    public void setPesoMenor(double pesoMenor) {
        this.pesoMenor = pesoMenor;
    }

    public double getPesoMayor() {
        return pesoMayor;
    }

    public void setPesoMayor(double pesoMayor) {
        this.pesoMayor = pesoMayor;
    }

    public double getPesoPromedio() {
        return pesoPromedio;
    }

    public void setPesoPromedio(double pesoPromedio) {
        this.pesoPromedio = pesoPromedio;
    }

    public double getIngresoPesos() {
        return ingresoPesos;
    }

    public void setIngresoPesos(double ingresoPesos) {
        this.ingresoPesos = ingresoPesos;
    }

    public double getIngresoDolares() {
        return ingresoDolares;
    }

    public void setIngresoDolares(double ingresoDolares) {
        this.ingresoDolares = ingresoDolares;
    }

    public int getNumTotalBultos() {
        return numTotalBultos;
    }

    public void setNumTotalBultos(int numTotalBultos) {
        this.numTotalBultos = numTotalBultos;
    }
    
    
    public void getValorKiloBulto()
    {
        double vr = 0;
        double acumulaPrecio = 0;
        
        if(peso >= 0 && peso <= 25)
        {
            vr = 0;
            acumulaPrecio = acumulaPrecio + vr;
            setAcumudorPrecioBulto( acumulaPrecio);
            setVrKg(acumulaPrecio);
        }else if(peso >= 26 && peso <= 300)
        {
              vr = 15000;
//             acumulaPrecio = acumulaPrecio + vr;
            setAcumudorPrecioBulto( vr);
            acum();
//             setVrKg(acumulaPrecio);

        }else if(peso >= 301 && peso <= 500)
        {
             vr = 2500;
             acumulaPrecio = acumulaPrecio + vr;
             setAcumudorPrecioBulto( acumulaPrecio);
             setVrKg(acumulaPrecio);
        }    
//        return vr;  
        //setVrKg(acumulaPrecio);

    }

    public double getAcumudorPrecioBulto() {
        return acumudorPrecioBulto;
    }

    public void setAcumudorPrecioBulto(double acumudorPrecioBulto) {
        this.acumudorPrecioBulto = acumudorPrecioBulto;
    }
    
    public double acum(){
        double can = 0;
        can = can + getAcumudorPrecioBulto();
        return can;
    }
    
    
    
    public void getTotalBultosIngresados(){
        int cantidad = 0;
        cantidad = cantidad + 1;
//        return cantidad;
        setNumTotalBultos(cantidad);
    }
    
    public double sumaBultos(){
        double suma = 0;
        double peso = getPeso();
 
        return suma = suma + peso ;
    }
    

    
    public double getMenor(){
        double menor    = 0;
        double peso     = getPeso();
        int    cantidad = getNumTotalBultos();

        for(int i=0; i< cantidad; i++){
            if(i == 0){
                menor = peso;
            }

            if(menor < peso){
                menor = peso;
            }
        }
        return menor;
    }
            
   
    public double getMayor(){
        double mayor    = 0;
        double peso     = getPeso();
        int    cantidad = getNumTotalBultos();

        for(int i=0; i< cantidad; i++){
            if(i == 0){
                mayor = peso;
            }

            if(mayor > peso){
                mayor = peso;
            }
        }
        return mayor;
    }
    
    public double getPromedioBultos(){
        int  cantidad = getNumTotalBultos();
        double promedio = 0;
        
        promedio = sumaBultos() / cantidad;

        return promedio;
    }
}
