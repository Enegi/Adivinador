package adivinar;
import java.util.*;

/**
 *
 * @author Cahara
 */
public class Adivinar {

    public static void main(String[] args) {
        Scanner amogus = new Scanner(System.in);
        Random x = new Random();
        String opc;
        int F[] = new int[3], N[] = new int[9], D[] = new int[18];
        int cor, res;
        int fallos = 0;
        boolean invalido;
        do {
            System.out.println("INICIO \n");
            System.out.println("Elige un modo de juego. \n");
            System.out.println("Adivinador o Adivinado");
            System.out.println();
            opc = amogus.next();
            System.out.println();

            if ("Adivinador".equals(opc)) {
                System.out.println("Adivinaras cual es el numero que eligio la maquina.");
                System.out.println("Elige una dificultad. \n");
                System.out.println("Dificil");
                System.out.println("Normal");
                System.out.println("Facil");
                opc = amogus.next();

                if ("Normal".equals(opc)) {
                    do {
                        for (int i = 0; i < 9; i++) {
                            N[i] = x.nextInt(100) + 1;
                            System.out.print(N[i] + "  ");
                        }
                        System.out.println();
                        cor = N[x.nextInt(9)];
                        do {
                            res = amogus.nextInt();
                            if (res != cor) {
                                fallos += 1;
                                System.out.println("Incorrecto, intenta de nuevo");
                                for (int i = 0; i < 9; i++) {
                                    System.out.print(N[i] + "  ");
                                }
                                System.out.println();
                            }
                        } while (res != cor);
                        System.out.println("Acertaste, el numero era " + cor + ", y fallaste " + fallos + " veces");
                        System.out.println("Quieres jugar otra ronda?");
                        opc = amogus.next();
                    } while ("Si".equals(opc));
                } else if ("Dificil".equals(opc)) {
                    do {
                        for (int i = 0; i < 18; i++) {
                            D[i] = x.nextInt(100) + 1;
                            System.out.print(D[i] + "  ");
                        }
                        System.out.println();
                        cor = D[x.nextInt(18)];
                        do {
                            res = amogus.nextInt();
                            if (res != cor) {
                                fallos += 1;
                                System.out.println("Incorrecto, intenta de nuevo");
                                for (int i = 0; i < 18; i++) {
                                    System.out.print(D[i] + "  ");
                                }
                                System.out.println();
                            }
                        } while (res != cor);
                        System.out.println("Acertaste, el numero era " + cor + ", y fallaste " + fallos + " veces");
                        System.out.println("Quieres jugar otra ronda?");
                        opc = amogus.next();
                    } while ("Si".equals(opc));
                } else {
                    do {
                        for (int i = 0; i < 3; i++) {
                            F[i] = x.nextInt(100) + 1;
                            System.out.print(F[i] + "  ");
                        }
                        System.out.println();
                        cor = F[x.nextInt(3)];
                        do {
                            res = amogus.nextInt();
                            if (res != cor) {
                                fallos += 1;
                                System.out.println("Incorrecto, intenta de nuevo");
                                for (int i = 0; i < 3; i++) {
                                    System.out.print(F[i] + "  ");
                                }
                                System.out.println();
                            }
                        } while (res != cor);
                        System.out.println("Acertaste, el numero era " + cor + ", y fallaste " + fallos + " veces");
                        System.out.println("Quieres jugar otra ronda?");
                        opc = amogus.next();
                    } while ("Si".equals(opc));
                }
            } else {
                System.out.println("La maquina intentara adivinar el numero que tu elegiste.");
                System.out.println("Elige una dificultad. \n");
                System.out.println("Dificil");
                System.out.println("Normal");
                System.out.println("Facil");
                opc = amogus.next();

                if ("Normal".equals(opc)) {
                    do {
                        for (int i = 0; i < 9; i++) {
                            N[i] = x.nextInt(100) + 1;
                            System.out.print(N[i] + "  ");
                        }
                        System.out.println();
                        do {
                            cor = amogus.nextInt();
                            if ((cor == N[0]) || (cor == N[1]) || (cor == N[2]) || (cor == N[3]) || (cor == N[4]) || (cor == N[5]) || (cor == N[6]) || (cor == N[7]) || (cor == N[8])) {
                                invalido = false;
                            } else {
                                invalido = true;
                                System.out.println("El numero que ingresaste no es valido, selecciona otro.");
                            }
                        } while (invalido);
                        do {
                            res = N[x.nextInt(9)];
                            System.out.println(res);
                            if (res != cor) {
                                fallos += 1;
                                System.out.println("Incorrecto, intenta de nuevo");
                                for (int i = 0; i < 9; i++) {
                                    System.out.print(N[i] + "  ");
                                }
                                System.out.println();
                            }
                        } while (res != cor);
                        System.out.println("La maquina adivino tu numero, " + cor + ", y le tomo " + fallos + " intentos");
                        System.out.println("Quieres jugar otra ronda?");
                        opc = amogus.next();
                    } while ("Si".equals(opc));
                } else if ("Dificil".equals(opc)) {
                    do {
                        for (int i = 0; i < 18; i++) {
                            D[i] = x.nextInt(100) + 1;
                            System.out.print(D[i] + "  ");
                        }
                        System.out.println();
                        do {
                            cor = amogus.nextInt();
                            if ((cor == D[0]) || (cor == D[1]) || (cor == D[2]) || (cor == D[3]) || (cor == D[4]) || (cor == D[5]) || (cor == D[6]) || (cor == D[7]) || (cor == D[8]) || (cor == D[9]) || (cor == D[10]) || (cor == D[11]) || (cor == D[12]) || (cor == D[13]) || (cor == D[14]) || (cor == D[15]) || (cor == D[16]) || (cor == D[17])) {
                                invalido = false;
                            } else {
                                invalido = true;
                                System.out.println("El numero que ingresaste no es valido, selecciona otro.");
                            }
                        } while (invalido);
                        do {
                            res = D[x.nextInt(18)];
                            System.out.println(res);
                            if (res != cor) {
                                fallos += 1;
                                System.out.println("Incorrecto, intenta de nuevo");
                                for (int i = 0; i < 18; i++) {
                                    System.out.print(D[i] + "  ");
                                }
                                System.out.println();
                            }
                        } while (res != cor);
                        System.out.println("La maquina adivino tu numero, " + cor + ", y le tomo " + fallos + " intentos");
                        System.out.println("Quieres jugar otra ronda?");
                        opc = amogus.next();
                    } while ("Si".equals(opc));
                } else {
                    do {
                        for (int i = 0; i < 3; i++) {
                            F[i] = x.nextInt(100) + 1;
                            System.out.print(F[i] + "  ");
                        }
                        System.out.println();
                        do {
                            cor = amogus.nextInt();
                            if ((cor == F[0]) || (cor == F[1]) || (cor == F[2])) {
                                invalido = false;
                            } else {
                                invalido = true;
                                System.out.println("El numero que ingresaste no es valido, selecciona otro.");
                            }
                        } while (invalido);
                        do {
                            res = F[x.nextInt(3)];
                            System.out.println(res);
                            if (res != cor) {
                                fallos += 1;
                                System.out.println("Incorrecto, intenta de nuevo");
                                for (int i = 0; i < 3; i++) {
                                    System.out.print(F[i] + "  ");
                                }
                                System.out.println();
                            }
                        } while (res != cor);
                        System.out.println("La maquina adivino tu numero, " + cor + ", y le tomo " + fallos + " intentos");
                        System.out.println("Quieres jugar otra ronda?");
                        opc = amogus.next();
                    } while ("Si".equals(opc));
                    
                }
            }System.out.println("Deseas volver al INICIO?");
                    opc = amogus.next();
        } while ("Si".equals(opc));
    }
}
