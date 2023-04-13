import java.util.Scanner;
import java.util.Arrays;        //importando bibliotecas para utilizar funções de arrays e input do usuário

import javax.sound.sampled.AudioFileFormat.Type;

public class Desafio5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite uma string: ");                 //Exibe mensagem para receber a entrada
        String palavra = scanner.nextLine();                       //Recebe uma String do usuário
        char[] palavraReverse = new char[palavra.length()];        //Cria array para inserir a string invertida
        
        char[] letras = palavra.toCharArray();                     //Converte string em array
        
        for(int i = letras.length ; i>0; i--){

          palavraReverse[letras.length-i] = letras[i-1];           //Insere os caracteres em ordem inversa na string nova
        }
        
        System.out.println(palavraReverse);                        //Exibe a string nova
        
        scanner.close();
    }
}