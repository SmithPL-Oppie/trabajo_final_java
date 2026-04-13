import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        SistemaClinica sistema = new SistemaClinica();
        int opcion;

        do{
            System.out.println("=== Sistema Educativo ===");
            System.out.println("1. Registrar paciente");
            System.out.println("2. Registrar historia ");
            System.out.println("3. Registrar diagnostico");
            System.out.println("4. Registrar tratamiento");
            System.out.println("5. Mostrar diagnostico");
            System.out.println("6. Salir");

            System.out.print("Seleccione una opcion");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1: //Registrar paciente
                    System.out.print("Nombres: ");
                    String nom = sc.nextLine();

                    System.out.print("Edad: ");
                    int edad = sc.nextInt();

                    System.out.print("Dni: ");
                    int dni = sc.nextInt();

                    System.out.print("Contacto: ");
                    int contacto = sc.nextInt();

                    sistema.registrarPaciente(nom, edad, dni, contacto);
                    break;
                
                case 2: // Registrar historia
                    System.out.print("Nombre del paciente: ");
                    String paciente = sc.nextLine();

                    System.out.print("Tratamiento: ");
                    String tratamiento = sc.nextLine();
                    sistema.registrarHistoria(null, null);
                    break;

                case 3: // Registrar diagnostico
                    System.out.print("Código de estudiante: ");
                    String pac = sc.nextLine();

                    System.out.print("Código de curso: ");
                    String nomb = sc.nextLine();

                    sistema.registrarDiagnostico(null, nomb);
                    break;

                case 4: /// Registrar tratamiento
                    System.out.print("Código de estudiante: ");
                    String trata = sc.nextLine();

                    System.out.print("Código de curso: ");
                    Double cost = sc.nextDouble();

                    sistema.registrarTratamiento(trata, cost);
                    break;

                case 5: // Mostrar diagnostico
                    sistema.mostrarDiagnostico();
                    break;
            }
        } while(opcion != 6);
        sc.close();
        System.out.println("Sistema finalizado");
    }
}
