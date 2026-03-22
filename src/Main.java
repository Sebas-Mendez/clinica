import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opc;
        List<Paciente> lstPacientes = new ArrayList<>();

        do{
            System.out.println("Elija la opcion que necesite ");
            System.out.println("1. Registro pacientes");
            System.out.println("2. bucarlos");
            System.out.println("3. mostrar info");
            System.out.println("4. salir");
            opc = teclado.nextInt();
            switch (opc){
                case 1:
                    System.out.println("Elija la opcion que necesite ");
                    System.out.println("1. Paciente particular");
                    System.out.println("2. Paciente EPS");
                    System.out.println("3. Paciente VIP");
                    int opcion = teclado.nextInt();
                    switch (opcion) {
                        case 1:
                            System.out.println("Sistema de registro de pacientes particulares");
                            System.out.println("Ingrese el nombre del Paciente");
                            String nombre1 = teclado.next();
                            System.out.println("Ingrese el documento del Paciente");
                            int doc1 = teclado.nextInt();
                            System.out.println("Ingrese el costo de la consulta del Paciente");
                            double consulta1 = teclado.nextDouble();
                            pacienteParticular ppar1 = new pacienteParticular(nombre1,doc1,consulta1);
                            lstPacientes.add(ppar1);
                            break;

                        case 2:
                            System.out.println("Sistema de registro de pacientes por EPS");
                            System.out.println("Ingrese el nombre del Paciente");
                            String nombre2 = teclado.next();
                            System.out.println("Ingrese el documento del Paciente");
                            int doc2 = teclado.nextInt();
                            System.out.println("Ingrese el costo de la consulta del Paciente");
                            double consulta2 = teclado.nextDouble();
                            System.out.println("Ingrese el nombre de la eps del Paciente");
                            String EPS2 = teclado.next();
                            pacienteEPS pEPS1 = new pacienteEPS(nombre2,doc2,consulta2,EPS2);
                            lstPacientes.add(pEPS1);
                            break;

                        case 3:
                            System.out.println("Sistema de registro de pacientes VIP");
                            System.out.println("Ingrese el nombre del Paciente");
                            String nombre3 = teclado.next();
                            System.out.println("Ingrese el documento del Paciente");
                            int doc3 = teclado.nextInt();
                            System.out.println("Ingrese el costo de la consulta del Paciente");
                            double consulta3 = teclado.nextDouble();
                            System.out.println("Ingrese los años de fidelidad del Paciente");
                            int fidelidad = teclado.nextInt();
                            pacienteVIP pvip1 = new pacienteVIP(nombre3,doc3,consulta3,fidelidad);
                            lstPacientes.add(pvip1);
                            break;


                    }break;


                case 2:
                    System.out.println("Sistema de busqueda del paciente");
                    System.out.println("Ingrese el documento del paciente");
                    int paciente = teclado.nextInt();
                    if (lstPacientes.isEmpty()){
                        System.out.println("paciente no encontrado");
                    }
                    Paciente pa1 = null;
                    for (Paciente p: lstPacientes){
                        if ( p.getDocumento() == paciente){
                            pa1 = p;
                            System.out.println(pa1);
                        }
                    }
            }

        }while (opc != 3);
    }
}