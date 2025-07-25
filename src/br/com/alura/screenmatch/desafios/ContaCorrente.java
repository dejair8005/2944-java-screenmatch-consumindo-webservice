package br.com.alura.screenmatch.desafios;

public class ContaCorrente {
    /**
     * @param args
     */
    public static void main(String[] args) { 

    String nome = "Dejair Silva";
    int tipoConta = 1; // 1 Conta corrente, 2 conta poupança
    double saldo = 2500.55;
    int opcao;
    
    System.out.println("***********************");
    System.out.println("Nome: " + nome);
    if (tipoConta == 1) {
        System.out.println("Tipo de Conta: Corrente");
    }
    System.out.println("Saldo Inicial: R$ " + saldo );
    System.out.println("***********************");


    do while (opcao != 4) {
       System.out.println(" ");  
       System.out.println(" ");

/*        System.out.println(" Operações\r\n" + //
                      "\r\n" + //
                      "1- Consultar saldos\r\n" + //
                      "2- Receber valor\r\n" + //
                      "3- Transferir valor\r\n" + //
                      "4- Sair"); */


       System.out.println(" ");
       System.out.println("Digite a opção desejada: ");
    }

    }
}


/* 
***********************
Dados iniciais do cliente:

Nome: Jacqueline Oliveira
Tipo conta: Corrente
Saldo inicial: R$ 2500,00
***********************

Operações

1- Consultar saldos
2- Receber valor
3- Transferir valor
4- Sair

Digite a opção desejada: 




Digite a opção desejada:
2

Informe o valor a receber:
700

Saldo atualizado R$ 3200.0




Digite a opção desejada:
3

Informe o valor que deseja transferir:
1000

Saldo atualizado R$ 2200.0


Por fim, para encerrarmos a aplicação, bastará apertarmos a tecla "4" 
em Digite a opção desejada:. Mas se digitarmos um número inválido como "9" por exemplo, 
receberemos a mensagem Opção inválida.

Se temos dois mil e duzentos reais e tentarmos transferir um valor maior que este, 
como 5000, teremos uma mensagem de que o saque não pode ser realizado:

Não há saldo suficiente para fazer essa transferência.
*/
