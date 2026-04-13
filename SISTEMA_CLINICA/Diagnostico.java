public class Diagnostico {
    //Atributos
    private String diagnostico;
    private Paciente paciente;

    //Constructor
    public Diagnostico(Paciente paciente, String diagnostico){
        this.diagnostico = diagnostico;
        this.paciente = paciente;
    }

    //getters
    public String getDiagnostico(){
        return diagnostico;
    }
    public Paciente getPaciente(){
        return paciente;
    }

    //Setters
    public void setDiagnostico(String diagnostico){
        this.diagnostico = diagnostico;
    }

    public void setPaciente(Paciente paciente){
        this.paciente = paciente;
    }

    //Método mostrar diagnostico
    public void VerDiagnostico(){
        System.out.println("Diagnóstico del paciente: "+ paciente);
        System.out.println(diagnostico);
    }
}
