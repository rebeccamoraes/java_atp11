package modulo1;

import java.util.Scanner;

public class Financiamentos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short opcao = 0;
        boolean continua = false;


        System.out.println("============= Bradesco Financiamentos =============");

        do {
            opcao = menu();
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

                case 0:
                    System.out.println("========= Aplicação finalizada =========");
                    continua = false;
                    break;
            }

            char resposta = '0';

            while ((opcao != 0) && (resposta != 'S' && resposta != 'V')) {
                System.out.print("Digite 'V' para voltar ao menu principal ou 'S' para sair: ");
                resposta = scanner.nextLine().toUpperCase().charAt(0);

                continua = resposta == 'V';
            }

        } while(continua);

        scanner.close();
    }

    static short menu () {
        Scanner scanner = new Scanner(System.in);
        boolean opcaoIvalida = false;
        short opcao;

        do {
            System.out.println("Menu");
            System.out.println("1. Crédito Pessoal");
            System.out.println("2. Crédito Imobiliário");
            System.out.println("3. Crédito Empresarial");
            System.out.println("4. Crédito Consignado");
            System.out.println("0. Sair");
            
            System.out.print("Digite o número correspondente a opção desejada: ");
            opcao = Short.parseShort(scanner.nextLine());

            opcaoIvalida = opcao < 0 || opcao > 4;
        } while (opcaoIvalida);
        
        //scanner.close();
        return opcao;
    }
}