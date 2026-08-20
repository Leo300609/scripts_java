package com.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nome = "Leonardo";
        int idade = 17;
        double precoGasolina = 6.50;
        float temperaturaSP = 25.5f;
        char letraInicial = nome.charAt(0);
        char sexo = 'M';
        boolean maiorDeIdade = idade >= 18;
        int estoque = 50;

        System.out.println("Olá, " + nome + "! Bem-vindo ao Java.");
        System.out.println("A letra inicial do seu nome é '" + letraInicial + "'.");
        System.out.println("Seu sexo é '" + sexo + "'.");
        System.out.println("Você tem " + idade + " anos.");
        System.out.println("Você é maior de idade: " + maiorDeIdade);
        System.out.println("O preço da gasolina é R$ " + precoGasolina);
        System.out.println("A temperatura em São Paulo é " + temperaturaSP + "°C.");
        System.out.println("O estoque disponível é: " + estoque);

        estoque = 30; // Atualizando o valor da variável estoque
        System.out.println("O estoque atualizado é: " + estoque + ". \n \n \n \n");


        int a = 56;
        int b = 12;
        int soma = a + b;
        System.out.println("A soma de " + a + " e " + b + " é: " + soma);
    }
}

class Exercicio{
    public static void main(String[] args) {
        System.out.println("====================================  ");
        System.out.println("        Exercício de Variáveis        ");
        System.out.println("====================================\n");
        System.out.println("Meu sistema de estoque de produtos");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do produto: ");
        String nomeProduto = scanner.nextLine();
        System.out.print("Digite a quantidade em estoque: ");
        int quantidade = scanner.nextInt();
        System.out.print("Digite o preço unitário: ");
        double precoUnitario = scanner.nextDouble();
        double valorTotal = quantidade * precoUnitario;
        boolean emEstoque = quantidade > 0;

        System.out.println("\n \nNome do produto: " + nomeProduto);
        System.out.println("Quantidade em estoque: " + quantidade);
        System.out.printf("Preço unitário: R$ %.2f%n", precoUnitario);
        System.out.printf("Valor total em estoque: R$ %.2f%n", valorTotal);
        System.out.println("O produto está em estoque? " + emEstoque);

        scanner.close();
    }
}

class Aluno {
    public static void main(String[] args) {
        System.out.println("====================================  ");
        System.out.println("            Sistema de alunos         ");
        System.out.println("====================================\n");    

        Scanner scanner = new Scanner(System.in);

        System.out.println("Diga o nome do Aluno: ");
        String nomeAluno = scanner.nextLine();

        System.out.println("Diga a idade do Aluno: ");
        int idadeAluno = scanner.nextInt();

        System.out.println("Diga a situação de matrícula do Aluno (s/n): ");
        String matriculaAluno = scanner.nextLine();

        boolean matriculaAlunoBool;

        if (matriculaAluno.equalsIgnoreCase("s")) {
            matriculaAlunoBool = true;
        } else {
            matriculaAlunoBool = false;
        }

        System.out.println("\n--- Dados Cadastrados ---");
        System.out.println("Nome do aluno: " + nomeAluno);
        System.out.println("Idade do aluno: " + idadeAluno);
        System.out.println("Matrícula do aluno: " + (matriculaAlunoBool ? "Ativa" : "Inativa"));

        scanner.close();
    }
}

class Produtos {
    public static void main(String[] args) {
        System.out.println("====================================");
        System.out.println("            Sistema de produtos     ");
        System.out.println("====================================\n");    

        Scanner scanner = new Scanner(System.in);

        System.out.print("Diga quantos produtos você tem: ");
        int qttdProdutos = scanner.nextInt();

        for (int i = 0; i < qttdProdutos; i++) {
            System.out.println("\n--- Produto " + (i + 1) + " ---");

            scanner.nextLine(); 

            System.out.print("Nome do produto: ");
            String nome = scanner.nextLine();

            System.out.print("Preço do produto: R$ ");
            double preco = scanner.nextDouble();

            System.out.print("Quantidade em estoque: ");
            int quantidade = scanner.nextInt();

            System.out.println("Cadastrado: " + nome + " | R$ " + preco + " | Qtd: " + quantidade);
        }


        scanner.close();
    }
}