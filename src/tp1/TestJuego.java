package tp1;

import java.util.Scanner;

public class TestJuego {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        Robot rob = new Robot();
        int pasos, aux = 0;
        Hombre homb1 = new Hombre("Juan");
        Hombre homb2 = new Hombre("Rosa");
        Hombre jugador = homb1;

        //Informar la modalidad de uso en un menu o lista de opciones.
        do {
            System.out.println("************ MENU *************");
            System.out.println("**** Seleccione una opción ****");
            System.out.println("1 - Juego automático (JugarConRobot())");
            System.out.println("2 - Avanzar");
            System.out.println("3 - Retroceder");
            System.out.println("4 - Dormir");
            System.out.println("5 - Despertar");
            System.out.println("6 - Recargar");
            System.out.println("7 - Consultar bateria"); // elegir entre los tres metodos del robot
            System.out.println("8 - Cambiar jugador"); // elegir entre los tres metodos del robot
            System.out.println("10 - Salir");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    //1 - Juego automático (JugarConRobot())
                    System.out.println("\nHola! " + jugador.getNombreID() + "\nVamos a jugar.");
                    jugador.jugarConRobot(rob);
                    break;
                case 2:
                    //2 - Avanzar
                    System.out.println("Ingrese cantidad de pasos a avanzar");
                    pasos = sc.nextInt();
                    aux = rob.avanzar(pasos);
                    if (aux == pasos) {
                        System.out.println("Avance " + pasos + " pasos indicados.");
                        System.out.println("Carga de bateria: " + rob.energiaActual());
                    }
                    if (pasos != -1) {
                        System.out.println("Solo pude avanzar: " + pasos + " pasos.");
                        System.out.println("Carga de bateria: " + rob.energiaActual());
                    } else {
                        System.out.println("No hubo movimiento, debe recargar mi bateria! Pasos: " + pasos);
                        System.out.println("Carga de bateria: " + rob.energiaActual());
                    }
                    break;
                case 3:
                    //
                    break;
                case 4:
                    //
                    break;
                case 5:
                    //
                    break;
                case 6:
                    //
                    break;
                case 7:
                    //
                    break;
                case 8:
                    //
                    if (jugador == homb1) {
                        jugador = homb2;
                    } else {
                        jugador = homb1;
                    }
                    break;
            }
        } while (opcion != 10);

        /* System.out.println("Estado de Bateria: " + rob.energiaActual());

        System.out.println("\nHola! " + homb1.getNombreID() + "\nIngrese los pasos a Retroceder:");
        pasos = sc.nextInt();
        int pasosVar = rob.retroceder(pasos);
        if (pasos == pasosVar) {
            System.out.println("Retrocedi " + pasosVar + " pasos indicados.");
            System.out.println("Carga de bateria: " + rob.energiaActual());
        } else {
            if (pasosVar != 0) {
                System.out.println("Solo retrocedi: " + pasosVar + " pasos.");
                System.out.println("Carga de bateria: " + rob.energiaActual());
            } else {
                System.out.println("No hubo movimiento, debe recargar mi bateria! Pasos: " + pasosVar);
                System.out.println("Carga de bateria: " + rob.energiaActual());
            }
        }
        pasos = sc.nextInt();
        pasosVar = rob.retroceder(pasos);
        if (pasos == pasosVar) {
            System.out.println("Retrocedi " + pasosVar + " pasos indicados.");
            System.out.println("Carga de bateria: " + rob.energiaActual());
        } else {
            if (pasosVar != 0) {
                System.out.println("Solo retrocedi: " + pasosVar + " pasos.");
                System.out.println("Carga de bateria: " + rob.energiaActual());
            } else {
                System.out.println("No hubo movimiento, debe recargar mi bateria! Pasos: " + pasosVar);
                System.out.println("Carga de bateria: " + rob.energiaActual());
            }
        }

        System.out.println("\nHola! " + homb1.getNombreID() + "\n***Vamos a jugar!!***");
        if (rob.bateriaVacia() || rob.energiaActual() < 52) {
            rob.recargar();
            rob.despertar();
            homb1.jugarConRobot(rob);
        } else {
            rob.despertar();
            homb1.jugarConRobot(rob);
        }
        System.out.println("\nHola! " + homb2.getNombreID() + "\n***Vamos a jugar!!***");
        if (rob.bateriaVacia() || rob.energiaActual() < 52) {

            rob.recargar();
            rob.despertar();
            homb1.jugarConRobot(rob);
        } else {
            rob.despertar();
            homb1.jugarConRobot(rob);
        }
         */
    }
}
