import.java.util.*;
  public class MenorIdade{
    public static void main (String[]args){
    Scanner in = new Scanner (System.in);
    int anoA, anoN, idade, i;
      system.out.println("Digite o ano atual:");
      anoA = in.nextInt();
        do{
          system.out.println("Digite o ano de nascimento:");
          anoN = in.nextInt();
          idade = anoA - anoN;
        if(idade<18){
          system.out.println("Menor de idade");
          }else{
            system.out.println("Maior de idade");
          }
            system.out.println("Executar novamente? 1=sim 2=não");
            i = in.nextInt();
          }while(i == 1);
        in.close();
        }
      }
          
