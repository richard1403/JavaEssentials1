import java.util.Scanner;

public class Calculadora {
        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);


            Double numero1;
            char operador;
            Double numero2;
            Double resultado;

            System.out.println("Ingresa Primer Numero");
            numero1 = input.nextDouble();

            System.out.println("Selecciona un operador: +, -, *, /");
            operador = input.next().charAt(0);

            System.out.println("Ingresa Segundo Numero");
            numero2 = input.nextDouble();

            switch (operador) {

                 // Suma de 2 numeros
                case '+':
                    resultado = numero1 + numero2;
                    System.out.println(numero1 + " + " + numero2 + " = " + resultado);
                    break;

                // Resta de 2 numeros
                case '-':
                    resultado = numero1 - numero2;
                    System.out.println(numero1 + " - " + numero2 + " = " + resultado);
                    break;

                // Multiplicacion de 2 numeros
                case '*':
                    resultado = numero1 * numero2;
                    System.out.println(numero1 + " * " + numero2 + " = " + resultado);
                    break;

                // Division entre 2 numeros
                case '/':
                    if(numero1==0||numero2==0){
                        System.out.println("Error al dividir un numero por 0");
                    } else{
                    resultado = numero1 / numero2;
                    System.out.println(numero1 + " / " + numero2 + " = " + resultado);}
                    break;

                default:
                    System.out.println("Error en la operacion");
                    break;
            }

            input.close();
        }
    }
