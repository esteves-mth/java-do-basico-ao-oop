import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String[] args) {
        double resultadofinal = 0;
        double temperatura = 0;
        Scanner ler = new Scanner(System.in);

        while (true){
        System.out.println("Selecione a opção que deseja");
        System.out.println(" 1- Celsius → Fahrenheit");
        System.out.println(" 2- Fahrenheit → Celsius");
        System.out.println(" 3- Celsius → Kelvin");
        System.out.println(" 4- Kelvin → Celsius");
        System.out.println(" 5- Fahrenheit → Kelvin");
        System.out.println(" 6- Kelvin → Fahrenheit");
        System.out.println(" 7- Celsius → Rankine");
        System.out.println(" 8- Rankine → Celsius");
        System.out.println(" 9- Fahrenheit → Rankine");
        System.out.println("10- Rankine → Fahrenheit");
        System.out.println("11- Kelvin → Rankine");
        System.out.println("12- Rankine → Kelvin");
        System.out.println("13- Converter várias temperaturas de uma vez");
        int menu = ler.nextInt();
        while (menu < 1 || menu > 13) {
            System.out.println("ERRO!! Digite o número correto!");
            System.out.println("Selecione a opção que deseja");
            System.out.println(" 1- Celsius → Fahrenheit");
            System.out.println(" 2- Fahrenheit → Celsius");
            System.out.println(" 3- Celsius → Kelvin");
            System.out.println(" 4- Kelvin → Celsius");
            System.out.println(" 5- Fahrenheit → Kelvin");
            System.out.println(" 6- Kelvin → Fahrenheit");
            System.out.println(" 7- Celsius → Rankine");
            System.out.println(" 8- Rankine → Celsius");
            System.out.println(" 9- Fahrenheit → Rankine");
            System.out.println("10- Rankine → Fahrenheit");
            System.out.println("11- Kelvin → Rankine");
            System.out.println("12- Rankine → Kelvin");
            System.out.println("13- Converter várias temperaturas de uma vez");
            menu = ler.nextInt();
        }
        switch (menu) {
            case 1:
                System.out.print("Escreva a temperatura em Celsius: ");
                temperatura = ler.nextDouble();
                resultadofinal = (temperatura * 9 / 5) + 32;
                System.out.println(temperatura + "°C em Fahrenheit: " + resultadofinal + "°F");
                break;
            case 2:
                System.out.print("Escreva a temperatura em Fahrenheit: ");
                temperatura = ler.nextDouble();
                resultadofinal = (temperatura - 32) * 5 / 9;
                System.out.println(temperatura + "°F em Celsius: " + resultadofinal + "°C");
                break;
            case 3:
                System.out.print("Escreva a temperatura em Celsius: ");
                temperatura = ler.nextDouble();
                resultadofinal = temperatura + 273.15;
                System.out.println(temperatura + "°C em Kelvin: " + resultadofinal + "K");
                break;
            case 4:
                System.out.print("Escreva a temperatura em Kelvin: ");
                temperatura = ler.nextDouble();
                resultadofinal = temperatura - 273.15;
                System.out.println(temperatura + " K em Celsius: " + resultadofinal + "°C");
                break;
            case 5:
                System.out.print("Escreva a temperatura em Fahrenheit: ");
                temperatura = ler.nextDouble();
                resultadofinal = (temperatura + 459.67) * 5 / 9;
                System.out.println(temperatura + "°F em Kelvin: " + resultadofinal + " K");
                break;
            case 6:
                System.out.print("Escreva a temperatura em Kelvin: ");
                temperatura = ler.nextDouble();
                resultadofinal = (temperatura * 9 / 5) - 459.67;
                System.out.println(temperatura + " K em Fahrenheit: " + resultadofinal + "°F");
                break;
            case 7:
                System.out.print("Escreva a temperatura em Celsius: ");
                temperatura = ler.nextDouble();
                resultadofinal = (temperatura + 273.15) * 1.8;
                System.out.println(temperatura + "°C em Rankine: " + resultadofinal + "°R");
                break;
            case 8:
                System.out.print("Escreva a temperatura em Rankine: ");
                temperatura = ler.nextDouble();
                resultadofinal = (temperatura / 1.8) - 273.15;
                System.out.println(temperatura + "°R em Celsius: " + resultadofinal + "°C");
                break;
            case 9:
                System.out.print("Escreva a temperatura em Fahrenheit: ");
                temperatura = ler.nextDouble();
                resultadofinal = temperatura + 459.67;
                System.out.println(temperatura + "°F em Rankine: " + resultadofinal + "°R");
                break;
            case 10:
                System.out.print("Escreva a temperatura em Rankine: ");
                temperatura = ler.nextDouble();
                resultadofinal = temperatura - 459.67;
                System.out.println(temperatura + "°R em Fahrenheit: " + resultadofinal + "°F");
                break;
            case 11:
                System.out.print("Escreva a temperatura em Kelvin: ");
                temperatura = ler.nextDouble();
                resultadofinal = temperatura * 1.8;
                System.out.println(temperatura + " K em Rankine: " + resultadofinal + "°R");
                break;
            case 12:
                System.out.print("Escreva a temperatura em Rankine: ");
                temperatura = ler.nextDouble();
                resultadofinal = temperatura / 1.8;
                System.out.println(temperatura + "°R em Kelvin: " + resultadofinal + " K");
                break;
            case 13:
                System.out.print("Escreva quantas temperaturas deseja adicionar: ");
                int qt = ler.nextInt();
                while (qt <= 0) {
                    System.out.println("ERRO!! Digite um número maior que zero.");
                    System.out.print("Escreva quantas temperaturas deseja adicionar: ");
                    qt = ler.nextInt();
                }
                double[] temperaturas = new double[qt];
                System.out.println(" 1- Celsius → Fahrenheit");
                System.out.println(" 2- Fahrenheit → Celsius");
                System.out.println(" 3- Celsius → Kelvin");
                System.out.println(" 4- Kelvin → Celsius");
                System.out.println(" 5- Fahrenheit → Kelvin");
                System.out.println(" 6- Kelvin → Fahrenheit");
                System.out.println(" 7- Celsius → Rankine");
                System.out.println(" 8- Rankine → Celsius");
                System.out.println(" 9- Fahrenheit → Rankine");
                System.out.println("10- Rankine → Fahrenheit");
                System.out.println("11- Kelvin → Rankine");
                System.out.println("12- Rankine → Kelvin");
                System.out.print("Escolha a conversão: ");
                int menu13 = ler.nextInt();
                while (menu13 < 1 || menu13 > 12) {
                    System.out.println("ERRO!! Digite o número correto!");
                    System.out.println("Selecione a opção que deseja");
                    System.out.println(" 1- Celsius → Fahrenheit");
                    System.out.println(" 2- Fahrenheit → Celsius");
                    System.out.println(" 3- Celsius → Kelvin");
                    System.out.println(" 4- Kelvin → Celsius");
                    System.out.println(" 5- Fahrenheit → Kelvin");
                    System.out.println(" 6- Kelvin → Fahrenheit");
                    System.out.println(" 7- Celsius → Rankine");
                    System.out.println(" 8- Rankine → Celsius");
                    System.out.println(" 9- Fahrenheit → Rankine");
                    System.out.println("10- Rankine → Fahrenheit");
                    System.out.println("11- Kelvin → Rankine");
                    System.out.println("12- Rankine → Kelvin");
                    System.out.println("13- Converter várias temperaturas de uma vez");
                    System.out.println("14- Sair");
                    menu13 = ler.nextInt();
                }
                for (int i = 0; i < qt; i++) {
                    if (menu13 == 1) {
                        System.out.printf("Escreva a temperatura n°%d em Celsius: ", i + 1);
                        temperaturas[i] = ler.nextDouble();
                        resultadofinal = (temperaturas[i] * 9 / 5) + 32;
                        System.out.println(temperaturas[i] + "°C em Fahrenheit: " + resultadofinal + "°F");
                    } else if (menu13 == 2) {
                        System.out.printf("Escreva a temperatura n°%d em Fahrenheit: ", i + 1);
                        temperaturas[i] = ler.nextDouble();
                        resultadofinal = (temperaturas[i] - 32) * 5 / 9;
                        System.out.println(temperaturas[i] + "°F em Celsius: " + resultadofinal + "°C");
                    } else if (menu13 == 3) {
                        System.out.printf("Escreva a temperatura n°%d em Celsius: ", i + 1);
                        temperaturas[i] = ler.nextDouble();
                        resultadofinal = temperaturas[i] + 273.15;
                        System.out.println(temperaturas[i] + "°C em Kelvin: " + resultadofinal + "K");
                    } else if (menu13 == 4) {
                        System.out.printf("Escreva a temperatura n°%d em Kelvin: ", i + 1);
                        temperaturas[i] = ler.nextDouble();
                        resultadofinal = temperaturas[i] - 273.15;
                        System.out.println(temperaturas[i] + " K em Celsius: " + resultadofinal + "°C");
                    } else if (menu13 == 5) {
                        System.out.printf("Escreva a temperatura n°%d em Fahrenheit: ", i + 1);
                        temperaturas[i] = ler.nextDouble();
                        resultadofinal = (temperaturas[i] + 459.67) * 5 / 9;
                        System.out.println(temperaturas[i] + "°F em Kelvin: " + resultadofinal + " K");
                    } else if (menu13 == 6) {
                        System.out.printf("Escreva a temperatura n°%d em Kelvin: ", i + 1);
                        temperaturas[i] = ler.nextDouble();
                        resultadofinal = (temperaturas[i] * 9 / 5) - 459.67;
                        System.out.println(temperaturas[i] + " K em Fahrenheit: " + resultadofinal + "°F");
                    } else if (menu13 == 7) {
                        System.out.printf("Escreva a temperatura n°%d em Celsius: ", i + 1);
                        temperaturas[i] = ler.nextDouble();
                        resultadofinal = (temperaturas[i] + 273.15) * 1.8;
                        System.out.println(temperaturas[i] + "°C em Rankine: " + resultadofinal + "°R");
                    } else if (menu13 == 8) {
                        System.out.printf("Escreva a temperatura n°%d em Rankine: ", i + 1);
                        temperaturas[i] = ler.nextDouble();
                        resultadofinal = (temperaturas[i] / 1.8) - 273.15;
                        System.out.println(temperaturas[i] + "°R em Celsius: " + resultadofinal + "°C");
                    } else if (menu13 == 9) {
                        System.out.printf("Escreva a temperatura n°%d em Fahrenheit: ", i + 1);
                        temperaturas[i] = ler.nextDouble();
                        resultadofinal = temperaturas[i] + 459.67;
                        System.out.println(temperaturas[i] + "°F em Rankine: " + resultadofinal + "°R");
                    } else if (menu13 == 10) {
                        System.out.printf("Escreva a temperatura n°%d em Rankine: ", i + 1);
                        temperaturas[i] = ler.nextDouble();
                        resultadofinal = temperaturas[i] - 459.67;
                        System.out.println(temperaturas[i] + "°R em Fahrenheit: " + resultadofinal + "°F");
                    } else if (menu13 == 11) {
                        System.out.printf("Escreva a temperatura n°%d em Kelvin: ", i + 1);
                        temperaturas[i] = ler.nextDouble();
                        resultadofinal = temperaturas[i] * 1.8;
                        System.out.println(temperaturas[i] + " K em Rankine: " + resultadofinal + "°R");
                    } else if (menu13 == 12) {
                        System.out.printf("Escreva a temperatura n°%d em Rankine: ", i + 1);
                        temperaturas[i] = ler.nextDouble();
                        resultadofinal = temperaturas[i] / 1.8;
                        System.out.println(temperaturas[i] + "°R em Kelvin: " + resultadofinal + " K");
                    }
                }
        }
        System.out.println("Deseja faz outra conversão? (s/n): ");
        char sair = ler.next().charAt(0);
        if (sair == 's' || sair == 'S') {
            System.out.println("=== NOVA CONVERSÃO ===");
        } else {
            break;
        }
    }
    }
} //Feito por Esteveszin
