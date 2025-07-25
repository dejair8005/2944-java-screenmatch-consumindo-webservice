package br.com.alura.screenmatch.desafios.classes;

public class Soma {
   private int resultado;

   public Soma(int n1, int n2) {
      this.setResultado(n1 + n2);
   }
   
   public int getResultado() {
       return resultado;
   }

   private void setResultado(int resultado) {
       this.resultado = resultado;
   }




}
