import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        char[][] matriz = new char[10][10];

        //rellean con asteriscos
        for (int fil = 0; fil < matriz.length; fil++){
            for (int col = 0; col < matriz.length; col++){
                matriz[fil][col] = '*';
            }
        }
        //añadir R y F
        matriz[0][0] = 'R';
        matriz[9][9] = 'F';

        //Funcion random
        Random aleat = new Random();

        //Fila X
        for (int i = 0; i < 5;i++){


            int filaRX = aleat.nextInt(10);
            int colRX = aleat.nextInt(10);


            do {
                filaRX = aleat.nextInt(10);
                colRX = aleat.nextInt(10);
            }while (matriz[filaRX][colRX] != '*');
            matriz[filaRX][colRX] = 'X';

        }

        //LA B
        int filaBX = aleat.nextInt(10);
        int colBX = aleat.nextInt(10);
        do {
            filaBX = aleat.nextInt(10);
            colBX = aleat.nextInt(10);
        }while (matriz[filaBX][colBX] != '*');
        matriz[filaBX][colBX] = 'B';

        for (int fil = 0; fil < matriz.length; fil++){
            for (int col = 0; col < matriz.length; col++){
                System.out.print(matriz[fil][col] + " ");
            }
            System.out.println();
        }

        //Mover a la derecha

        int posicionFIN = 0;
        int posicionCIN = 0;
        int vidas = 10;
        int filR = 0;

        int columnR = 0;

        //scanner
        Scanner sc = new Scanner(System.in);

        System.out.println("Indique una letra ");
        char letra = sc.next().charAt(0);

        //Calcula destino

        //letra D
        matriz[0][4] = 'X';


        do {
            //Letra D
            if (letra == 'D'){

                columnR += 1;

                if((columnR +1)>9){
                    System.out.println("EHHHH! QUE TE VAS A FUERA ");
                    columnR = 9;
                }
                if (matriz[filR][columnR] == 'X'){
                    System.out.println("Movimiento bloqueado");
                    columnR = columnR;



                    columnR = columnR - 1;
                    matriz[filR][columnR] = '*';

                }
                if (matriz[filR][columnR] == '*'){
                    columnR = columnR - 1;
                    matriz[filR][columnR] = '*';
                    columnR +=1;
                    matriz[filR][columnR] = 'R';

                }
                if (matriz[filR][columnR] == 'B'){
                    vidas = vidas + 2;
                    System.out.println("Vidas = " + vidas);
                    matriz[filR][columnR] = '*';
                    matriz[filR][columnR]='R';


                }
                if (matriz[filR][columnR] == 'F'){
                    System.out.println("Rescate completado");;
                    matriz[filR][columnR]='R';
                    return;


                }




            }
            //Letra W
            if (letra == 'W'){

                if((filR - 1)<0){
                    System.out.println("EHHHH! QUE TE VAS A FUERA ");
                    filR = 0;
                }
                else {
                    filR = filR - 1;
                }
                if (matriz[filR][columnR] == 'X'){
                    System.out.println("Movimiento bloqueado");
                    filR = filR;



                    filR = filR + 1;
                    matriz[filR][columnR] = '*';

                }
                if (matriz[filR][columnR] == '*'){
                    filR +=1;
                    matriz[filR][columnR] = '*';
                    filR -=1;
                    matriz[filR][columnR] = 'R';

                }
                if (matriz[filR][columnR] == 'B'){
                    vidas = vidas + 2;
                    System.out.println("Vidas = " + vidas);
                    matriz[filR][columnR] = '*';
                    matriz[filR][columnR]='R';


                }
                if (matriz[filR][columnR] == 'F'){
                    System.out.println("Rescate completado");;
                    matriz[filR][columnR]='R';
                    return;


                }



            }

            //Letra A

            if (letra == 'A'){
                if((columnR - 1)< 0){
                    System.out.println("EHHHH! QUE TE VAS A FUERA ");
                    columnR = 0;
                }
                else {
                    columnR = columnR - 1;
                }
                if (matriz[filR][columnR] == 'X'){
                    System.out.println("Movimiento bloqueado");
                    columnR = columnR;



                    columnR = columnR + 1;
                    matriz[filR][columnR] = '*';

                }
                if (matriz[filR][columnR] == '*'){
                    columnR = columnR + 1;
                    matriz[filR][columnR] = '*';
                    columnR -=1;
                    matriz[filR][columnR] = 'R';

                }
                if (matriz[filR][columnR] == 'B'){
                    vidas = vidas + 2;
                    System.out.println("Vidas = " + vidas);
                    matriz[filR][columnR] = '*';
                    matriz[filR][columnR]='R';


                }
                if (matriz[filR][columnR] == 'F'){
                    System.out.println("Rescate completado");;
                    matriz[filR][columnR]='R';
                    return;


                }


            }

            //Letra S
            if (letra == 'S'){
                filR = filR + 1;
                if((filR +1)>10){
                    System.out.println("EHHHH! QUE TE VAS A FUERA ");
                    filR = 9;
                }
                if (matriz[filR][columnR] == 'X'){
                    System.out.println("Movimiento bloqueado");
                    filR = filR;



                    filR = filR - 1;
                    matriz[filR][columnR] = '*';

                }
                if (matriz[filR][columnR] == '*'){
                    filR = filR - 1;
                    matriz[filR][columnR] = '*';
                    filR +=1;
                    matriz[filR][columnR] = 'R';

                }
                if (matriz[filR][columnR] == 'B'){
                    vidas = vidas + 2;
                    System.out.println("Vidas = " + vidas);
                    matriz[filR][columnR] = '*';
                    matriz[filR][columnR]='R';


                }
                if (matriz[filR][columnR] == 'F'){
                    System.out.println("Rescate completado");;
                    matriz[filR][columnR]='R';
                    return;


                }



            }



            for (int fil = 0; fil < matriz.length; fil++){
                for (int col = 0; col < matriz.length; col++){
                    System.out.print(matriz[fil][col] + " ");
                }
                System.out.println();
            }
            System.out.println("Indique una letra ");
            letra = sc.next().charAt(0);
        }while (vidas !=0);








    }
}