import java.util.ArrayList;
public class SistemaClinica {
    private ArrayList<Paciente> pacientes = new ArrayList<>();
    private ArrayList<Historia> historias = new ArrayList<>();
    private ArrayList<Diagnostico> diagnosticos = new ArrayList<>();
    private ArrayList<Tratamiento> tratamientos = new ArrayList<>();

    public void registrarPaciente(String nombre, int edad, int dni, int contacto){
        pacientes.add(new Paciente(nombre, edad, dni, contacto));
		System.out.println("El paciente ha sido registrado");
    }

    public void registrarHistoria(Paciente paciente, Tratamiento tratamiento){
        historias.add(new Historia(paciente, tratamiento));
		System.out.println("El tratamiento ha sido añadido");
    }
    public void registrarDiagnostico(Paciente paciente, String diagnostico){
        diagnosticos.add(new Diagnostico(paciente, diagnostico));
		System.out.println("El tratamiento ha sido añadido");
    }

    public void registrarTratamiento(String tratamiento, double costo){
        tratamientos.add(new Tratamiento(tratamiento, costo));
		System.out.println("El tratamiento ha sido añadido");
    }
    public void mostrarDiagnostico(){
        for(Diagnostico d : diagnosticos) {
			d.VerDiagnostico();
        }
    }
}
