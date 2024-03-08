package tabuladoNotas;

import java.util.Scanner;

public class TabuladoNotas {
    // variables de clase
    public static Scanner sc = new Scanner(System.in);
    public static int seleccion;
    public static Object buscar;
    public static char q;
    public static String[] cMateria = new String[2];
    public static Object[][] fMateria;
    private static int contadorM;
	public static char num = 'a';

    public static void main(String[] args) {

        q = 'S';
        //menú tabulado de notas
        System.out.println("\t El colegio.");
        // inicia while de formulario
        menuPrincipal();

    }

    public static void menuPrincipal() {

        //menuPrincipal(seleccion);
        do {
            System.out.println("Seleccione una opción:"
                    + "\n 1) Insertar Datos."
                    + "\n 2) Modificar Datos."
                    + "\n 3) Eliminar Datos."
                    + "\n 4) Consultar Datos."
                    + "\n 5) Salir.");
            seleccion = sc.nextInt();

            // Inicio selección 
            switch (seleccion) {

                case 1:
                    System.out.println("\t Inserción de Datos.");
                    insertarDatos();
                    break;

                case 2: {
                    System.out.println("\t Modificación de Datos.");
                    break;
                }
                case 3: {
                    System.out.println("\t Eliminación de Datos.");
                    
                    break;
                }
                case 4: {
                    System.out.println("\t Consulta de Datos.");
                    consultarDatos();
                    break;
                }
                case 5: {
                    System.out.println("-- Sesión cerrada");
                    break;
                }

                default: {
                    System.out.println("....");
                }

            }

            // fin selección
        } while (seleccion != 5);
    }
    //menu insertar datos

    public static void insertarDatos() {
        System.out.println("Insertar datos en: \n"
                + "1 Profesores.\n"
                + "2 Alumnos.\n"
                + "3 Materias.\n"
                + "4 Notas.\n"
                + "5 Grados.\n"
                + "6 Jornadas.\n"
                + "7 Salir.");
        seleccion = sc.nextInt();
        switch (seleccion) {
            case 1: {
                System.out.println("Profesores.");
            }
            break;

            case 2: {
                System.out.println("Alumnos.");
            }
            break;
            case 3: {
                insertarDatosMaterias();
            }
            break;

            case 4: {
                System.out.println("Notas");
            }
            break;

            case 5: {
                System.out.println("Grados");
            }
            break;

            case 6: {
                System.out.println("Jornadas");
            }
            break;
            case 7: {
                menuPrincipal();
            }
            default:
                System.out.println("---");
        }
    }
    // fin menu insertar datos

    public static void insertarDatosMaterias() {

        do {
            /*
        indica los datos de la cabezera para el vector de materias
        indica nombre de las columnas
             */
            cMateria[0] = "ID";
            cMateria[1] = "Nombre Materia";

            // pregunta cuantas materias desea crear//
            System.out.println("\t Módulo creación de materias.");
            System.out.println("* ¿Cuantas materias desea crear?");
            int cantM = sc.nextInt();
            fMateria = new String[cantM][2];
            // ingreso de nombres de materias
            for (int i = 0; i < fMateria.length; i++) {
                for (int j = 0; j < cMateria.length; j++) {
                    System.out.println("\n - " + cMateria[j]);
                    fMateria[i][j] = sc.next();
                }
            }
            // fin del ingreso del nombre de las materias
            System.out.println("Presiones 2 para regresar al menú anterior.");
            seleccion = sc.nextInt();
        } while (seleccion != 2);

    }
    
    //metodo para la consulta de los datos
    public static void consultarDatos(){
        System.out.println("Consultar datos en: \n"
                + "1 Profesores.\n"
                + "2 Alumnos.\n"
                + "3 Materias.\n"
                + "4 Notas.\n"
                + "5 Grados.\n"
                + "6 Jornadas.\n"
                + "7 Salir.");
        seleccion = sc.nextInt();
        switch (seleccion) {
            case 1: {
                System.out.println("Profesores.");
            }
            break;

            case 2: {
                System.out.println("Alumnos.");
            }
            break;
            case 3: {
                consultarDatosMaterias();
            }
            break;

            case 4: {
                System.out.println("Notas");
            }
            break;

            case 5: {
                System.out.println("Grados");
            }
            break;

            case 6: {
                System.out.println("Jornadas");
            }
            break;
            case 7: {
                menuPrincipal();
            }
            default:
                System.out.println("---");
        }
    }

    // consulta datos de materias
    public static void consultarDatosMaterias(){
        System.out.println("\t Consultar materias");
        System.out.println("* Ingrese nombre de la materia a consultar");
        buscar = sc.nextLine();
        
        for (int i = 0; i < 10; i++) {
            
        }
        
        
    }
}
