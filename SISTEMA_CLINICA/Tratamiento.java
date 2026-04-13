public class Tratamiento {
    //Atributos
    private String tratamiento;
    private double costo;
    
    //Constructor
    public Tratamiento(String tratamiento, double costo){
        this.tratamiento = tratamiento;
        this.costo = costo;
    }
    //getter
    public String getTratamiento(){
        return tratamiento;
    }
    public double getCosto(){
        return costo;
    }

    //Setters
    public void setTratamiento(String tratamiento){
        this.tratamiento = tratamiento;
    }

    //Método para ver el tratamiento
    public void verTratamiento(){
        System.out.println("Tratamiento: " + tratamiento + " | Costo: " + costo);
    }
}
