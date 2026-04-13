public class Historia {
    //Atributos
    private Paciente paciente;
    private Tratamiento tratamiento;
    private String codigo;
    private static int contador;
    //Constructor
    public Historia(Paciente paciente, Tratamiento tratamiento){
        this.codigo = "T00" + contador++;
        this.paciente = paciente;
        this.tratamiento = tratamiento;
    }

    //Getters
    public String getCodigo(){
        return codigo;
    }
    public Paciente getPaciente(){
        return paciente;
    }
    public Tratamiento getTratamiento(){
        return tratamiento;
    }

    //metodo mostrar
    public void mostrar(){
        System.out.println("=== Historia del paciente ===");
        System.out.println("Código: "+ codigo);
        paciente.VerPaciente();
        tratamiento.verTratamiento();
    }
}
