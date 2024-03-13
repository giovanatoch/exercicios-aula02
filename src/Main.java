import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /* 1. ==================================================== */

        System.out.println("\n ====== CADASTRO ======");

        System.out.println("\n Olá usuário, qual o seu nome?");
        String nome = scanner.next();

        System.out.println("\n Qual é a sua idade?");
        int idade = scanner.nextInt();

        System.out.println("Seu cadastro \n Nome: " + nome + "\n Idade: " + idade);


        /* 2. ==================================================== */

        System.out.println("Digite o primeiro número:");
        int primeiroNumb = scanner.nextInt();

        System.out.println("Digite o segundo número:");
        int segundoNumb = scanner.nextInt();

        int adição = primeiroNumb + segundoNumb;
        int subtração = primeiroNumb - segundoNumb;
        int multiplicação = primeiroNumb * segundoNumb;
        int divisão = primeiroNumb / segundoNumb;

        System.out.println("\n Adição ===" + adição + "\n Subtração ===" + subtração + "\n Multiplicação ==="
                + multiplicação + "\n Divisão ===" + divisão );

        /* 3. ==================================================== */

        System.out.println("Digite um número:");
        int numb = scanner.nextInt();

        if (numb > 0) {
            System.out.println("O número positivo.");
        } else if (numb < 0) {
            System.out.println("O número negativo.");
        } else {
            System.out.println("O número é zero.");
        }

        /* 4. ==================================================== */

        System.out.println("Digite um número de 1 a 7:");
        int diasemana = scanner.nextInt();

        switch (diasemana) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Opção inválida.");
        }

        /* 5. ==================================================== */

        System.out.println("Digite um número inteiro:");
        int numero = scanner.nextInt();

        if (numero > 0) {
            System.out.println("O número é positivo.");
        }
        else if (numero < 0) {
            System.out.println("O número é negativo.");
        }

        else {
            System.out.println("O número é zero.");
        }

        switch (numero % 2) {
            case 0:
                System.out.println("O número é par.");
                break;
            case 1:
            case -1:
                System.out.println("O número é ímpar.");
                break;
        }

        /* 6. ==================================================== */

        System.out.println("Digite o valor total da compra:");
        double valorTotal = scanner.nextDouble();

        double desconto = 0.0;
        if (valorTotal > 200) {
            desconto = 0.10;
        } else if (valorTotal >= 100 && valorTotal <= 200) {
            desconto = 0.05;
        } else {
            desconto = desconto;
        }

        double valorFinal = valorTotal - (valorTotal * desconto);

        System.out.printf("Valor final a ser pago: R$ %.2f%n", valorFinal);

        System.out.println("Escolha o método de pagamento:");
        System.out.println("1. Cartão de crédito");
        System.out.println("2. Boleto bancário");
        System.out.println("3. Transferência bancária");
        int opcaoPagamento = scanner.nextInt();

        switch (opcaoPagamento) {
            case 1:
                System.out.println("Você escolheu Cartão de Crédito. O pagamento será processado.");
                break;
            case 2:
                System.out.println("Você escolheu Boleto Bancário. O boleto será gerado.");
                break;
            case 3:
                System.out.println("Você escolheu Transferência Bancária. As informações serão fornecidas.");
                break;
            default:
                System.out.println("Opção de pagamento inválida.");
        }
    }
}