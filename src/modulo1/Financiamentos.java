package modulo1;

import java.util.Scanner;

public class Financiamentos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short opcao = 0;
        boolean continua = false;


        System.out.println("============= Bradesco Financiamentos =============");

        do {
            System.out.println("Menu");
            System.out.println("1. Crédito Pessoal");
            System.out.println("2. Crédito Imobiliário");
            System.out.println("3. Crédito Empresarial");
            System.out.println("4. Crédito Consignado");
            System.out.println("0. Sair");
            
            System.out.print("Digite o número correspondente a opção desejada: ");
            opcao = Short.parseShort(scanner.nextLine());

            continua = false;

            switch (opcao) {
                case 1:
                    System.out.println("========= Crédito Pessoal ==========");
                    break;

                case 2:
                    System.out.println("========= Crédito Imobiliário =========");
                    break;
                
                case 3:
                    System.out.println("========= Crédito Empresarial =========");
                    break;
                
                case 4:
                    System.out.println("========= Crédito Consignado =========");
                    break;

                case 5:
                    System.out.println("========= Aplicação finalizada =========");
                    break;

                default:
                    System.out.println("Opção inválida.");
                    continua = true;
                    break;
            }

        } while(continua);
    }
}