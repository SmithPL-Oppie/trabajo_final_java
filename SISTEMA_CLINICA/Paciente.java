public class Paciente {
    //Atributos
    private String nombre;
    private int edad;
    private int dni;
    private int contacto;

    //Constructor
    public Paciente(String nombre, int edad, int dni, int contacto) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.contacto = contacto;
    }

    //Getters - Permite realizar lectura
    public String getNombre(){
        return nombre;
    }
    public int getEdad(){
        return edad;
    }
    public int getDni(){
        return dni;
    }
    public int getContacto(){
        return contacto;
    }

    //Setterrs - Permite establecer o modificar
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    //Método para mostrar al paciente
    public void VerPaciente(){
        System.out.println(" | Nombre: " + nombre + " | Edad: " + edad + "| DNI: " + dni + "| Contacto: " + contacto);
    }
}
