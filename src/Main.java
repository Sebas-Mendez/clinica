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
                            System.out.println("Desea calcular el costo de la consulta?");
                            System.out.println("1. SI");
                            System.out.println("2. NO");
                            int c = teclado.nextInt();
                            switch (c){
                                case 1:
                                    p.costoFinal();
                                    break;
                                case 2:
                                    break;

                            }break;
                        }
                    }break;
                case 3:
                    System.out.println("Sistema de muestra de pacientes");
                    System.out.println("Elija la opcion que requiera");
                    System.out.println("1. Mostrar a todos los pacientes");
                    System.out.println("2. Mostrar pacientes por tipo");
                    System.out.println("3. Mostrar pacientes con consulta costosa");
                    int a = teclado.nextInt();
                    switch (a){
                        case 1:
                            for (Paciente P1 : lstPacientes) {
                                System.out.println(P1);
                            }break;
                        case 2:
                            System.out.println("Ingrese el tipo de paciente que requiera");
                            System.out.println("1. Particular");
                            System.out.println("2. Eps");
                            System.out.println("3. VIP");
                            int b = teclado.nextInt();
                            switch (b){
                                case 1:
                                    for (Paciente P2: lstPacientes){
                                        if (P2 instanceof pacienteParticular){
                                            System.out.println(P2);
                                        }
                                    }break;
                                case 2:
                                    for (Paciente P3: lstPacientes){
                                        if (P3 instanceof pacienteEPS){
                                            System.out.println(P3);
                                        }
                                    }break;
                                case 3:
                                    for (Paciente P4: lstPacientes){
                                        if (P4 instanceof pacienteVIP){
                                            System.out.println(P4);
                                        }
                                    }break;
                            }break;
                        case 3:
                            System.out.println("Pacientes con consulta costosa");
                            for (Paciente E3 : lstPacientes) {
                                if (E3.consultaCostosa()==true) {
                                    System.out.println(E3);
                                }
                            }
                            break;
                    }break;

            }

        }while (opc != 4);
    }
}