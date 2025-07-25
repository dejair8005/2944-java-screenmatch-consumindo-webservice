package br.com.alura.screenmatch.desafios;

import java.util.ArrayList;

import br.com.alura.screenmatch.desafios.classes.Soma;

public class Desafios {
    public static void main(String[] args) { 


        ArrayList<String> listaFrutas = new ArrayList<>();
        listaFrutas.add("Banana");
        listaFrutas.add("Melançia");
        listaFrutas.add("Manga");

        System.out.println("Tamanho da lista " + listaFrutas.size());
        System.out.println("Mostrando to String");

// Crie uma classe chamada Estudos para imprimir anotações de estudos no console.

//Crie um programa que realize a média de duas notas decimais e exiba o resultado.

//Declare uma variável do tipo double e uma variável do tipo int. Faça o casting da variável 
//double para int e imprima o resultado.

//Declare uma variável do tipo char (letra) e uma variável do tipo String (palavra). 
//Atribua valores a essas variáveis e concatene-as em uma mensagem.

//Declare uma variável do tipo double precoProduto e uma variável do tipo int (quantidade). Calcule o valor total multiplicando o preço do produto pela quantidade e apresente o resultado em uma mensagem.
//Declare uma variável do tipo double valorEmDolares. Atribua um valor em dólares a essa variável. Considere que o valor de 1 dólar é equivalente a 4.94 reais. Realize a conversão do valor em dólares para reais e imprima o resultado formatado.
//Declare uma variável do tipo double precoOriginal. Atribua um valor em reais a essa variável, representando o preço original de um produto. Em seguida, declare uma variável do tipo double percentualDesconto e atribua um valor percentual de desconto ao produto (por exemplo, 10 para 10%). Calcule o valor do desconto em reais, aplique-o ao preço original e imprima o novo preço com desconto.

//Crie um programa que solicite ao usuário digitar um número. Se o número for positivo, exiba "Número positivo", caso contrário, exiba "Número negativo".
//Peça ao usuário para inserir dois números inteiros. Compare os números e imprima uma mensagem indicando se são iguais, diferentes, o primeiro é maior ou o segundo é maior.
//Crie um menu que oferece duas opções ao usuário: "1. Calcular área do quadrado" e "2. Calcular área do círculo". Solicite a escolha do usuário e realize o cálculo da área com base na opção selecionada.
//Crie um programa que solicite ao usuário um número e exiba a tabuada desse número de 1 a 10.
//Crie um programa que solicite ao usuário a entrada de um número inteiro. Verifique se o número é par ou ímpar e exiba uma mensagem correspondente.
//Crie um programa que solicite ao usuário um número e calcule o fatorial desse número.



// Crie uma classe Soma em Java para imprimir no console o resultado da operação 10 + 5. 
// Crie uma classe Subtracao para imprimir o resultado de 10 - 5 no console.
        System.out.println(" ");
        System.out.println("--------------------------------------------");
        System.out.println("Soma 2 numero");
        System.out.println("--------------------------------------------");
        System.out.println(" ");
 
        Soma adicao = new Soma(1,2); 

        System.out.println(adicao.getResultado());


    }
}    