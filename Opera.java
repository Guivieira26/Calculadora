/*Criador e desenvolverdor: Guilherme Henrique Vieira Nascimento
  Ciencia da Computação-PUC Minas

  Ultima atualização em 14/09/2023
  Last Update 14/09/2023

  erros: erros com buffer de entrada quando repete o código, provavelmente limpar as variáveis antes do processo de repetição do código

  Email: guigavieira26@gmail.com
 */


import java.io.*;
import java.io.*;
import java.nio.charset.*;
import java.util.Scanner;

class MyIO {

   private static BufferedReader in = new BufferedReader(new InputStreamReader(System.in, Charset.forName("ISO-8859-1")));
   private static String charset = "ISO-8859-1";

   public static void setCharset(String charset_){
      charset = charset_;
      in = new BufferedReader(new InputStreamReader(System.in, Charset.forName(charset)));
   }

   public static void print(){
   }

   public static void print(int x){
      try {
         PrintStream out = new PrintStream(System.out, true, charset);
         out.print(x);
      }catch(UnsupportedEncodingException e){ System.out.println("Erro: charset invalido"); }
   }
   
   public static void print(float x){
      try {
         PrintStream out = new PrintStream(System.out, true, charset);
         out.print(x);
      }catch(UnsupportedEncodingException e){ System.out.println("Erro: charset invalido"); }
   }
   
   public static void print(double x){
      try {
         PrintStream out = new PrintStream(System.out, true, charset);
         out.print(x);
      }catch(UnsupportedEncodingException e){ System.out.println("Erro: charset invalido"); }
   }

   public static void print(String x){
      try {
         PrintStream out = new PrintStream(System.out, true, charset);
         out.print(x);
      }catch(UnsupportedEncodingException e){ System.out.println("Erro: charset invalido"); }
   }

   public static void print(boolean x){
      try {
         PrintStream out = new PrintStream(System.out, true, charset);
         out.print(x);
      }catch(UnsupportedEncodingException e){ System.out.println("Erro: charset invalido"); }
   }

   public static void print(char x){
      try {
         PrintStream out = new PrintStream(System.out, true, charset);
         out.print(x);
      }catch(UnsupportedEncodingException e){ System.out.println("Erro: charset invalido"); }
   }

   public static void println(){
   }

   public static void println(int x){
      try {
         PrintStream out = new PrintStream(System.out, true, charset);
         out.println(x);
      }catch(UnsupportedEncodingException e){ System.out.println("Erro: charset invalido"); }
   }

   public static void println(float x){
      try {
         PrintStream out = new PrintStream(System.out, true, charset);
         out.println(x);
      }catch(UnsupportedEncodingException e){ System.out.println("Erro: charset invalido"); }
   }
   
   public static void println(double x){
      try {
         PrintStream out = new PrintStream(System.out, true, charset);
         out.println(x);
      }catch(UnsupportedEncodingException e){ System.out.println("Erro: charset invalido"); }
   }

   public static void println(String x){
      try {
         PrintStream out = new PrintStream(System.out, true, charset);
         out.println(x);
      }catch(UnsupportedEncodingException e){ System.out.println("Erro: charset invalido"); }
   }

   public static void println(boolean x){
      try {
         PrintStream out = new PrintStream(System.out, true, charset);
         out.println(x);
      }catch(UnsupportedEncodingException e){ System.out.println("Erro: charset invalido"); }
   }

   public static void println(char x){
      try {
         PrintStream out = new PrintStream(System.out, true, charset);
         out.println(x);
      }catch(UnsupportedEncodingException e){ System.out.println("Erro: charset invalido"); }
   }

   public static void printf(String formato, double x){
      try {
         PrintStream out = new PrintStream(System.out, true, charset);
         out.printf(formato, x);// "%.2f"
      }catch(UnsupportedEncodingException e){ System.out.println("Erro: charset invalido"); }
   }

   public static double readDouble(){
      double d = -1;
      try{
         d = Double.parseDouble(readString().trim().replace(",","."));
      }catch(Exception e){}
      return d;
   }

   public static double readDouble(String str){
      try {
         PrintStream out = new PrintStream(System.out, true, charset);
         out.print(str);
      }catch(UnsupportedEncodingException e){ System.out.println("Erro: charset invalido"); }
      return readDouble();
   }

   public static float readFloat(){
      return (float) readDouble();
   }

   public static float readFloat(String str){
      return (float) readDouble(str);
   }

   public static int readInt(){
      int i = -1;
      try{
         i = Integer.parseInt(readString().trim());
      }catch(Exception e){}
      return i;
   }

   public static int readInt(String str){
      try {
         PrintStream out = new PrintStream(System.out, true, charset);
         out.print(str);
      }catch(UnsupportedEncodingException e){ System.out.println("Erro: charset invalido"); }
      return readInt();
   }

   public static String readString(){
      String s = "";
      char tmp;
      try{
         do{
            tmp = (char)in.read();
            if(tmp != '\n' && tmp != ' ' && tmp != 13){
               s += tmp;
            }
         }while(tmp != '\n' && tmp != ' ');
      }catch(IOException ioe){
         System.out.println("lerPalavra: " + ioe.getMessage());
      }
      return s;
   }

   public static String readString(String str){
      try {
         PrintStream out = new PrintStream(System.out, true, charset);
         out.print(str);
      }catch(UnsupportedEncodingException e){ System.out.println("Erro: charset invalido"); }
      return readString();
   }

   public static String readLine(){
      String s = "";
      char tmp;
      try{
         do{
            tmp = (char)in.read();
            if(tmp != '\n' && tmp != 13){
               s += tmp;
            }
         }while(tmp != '\n');
      }catch(IOException ioe){
         System.out.println("lerPalavra: " + ioe.getMessage());
      }
      return s;
   }

   public static String readLine(String str){
      try {
         PrintStream out = new PrintStream(System.out, true, charset);
         out.print(str);
      }catch(UnsupportedEncodingException e){ System.out.println("Erro: charset invalido"); }
      return readLine();
   }

   public static char readChar(){
      char resp = ' ';
      try{
         resp  = (char)in.read();
      }catch(Exception e){}
      return resp;
   }

   public static char readChar(String str){
      try {
         PrintStream out = new PrintStream(System.out, true, charset);
         out.print(str);
      }catch(UnsupportedEncodingException e){ System.out.println("Erro: charset invalido"); }
      return readChar();
   }

   public static boolean readBoolean(){
      boolean resp = false;
      String str = "";

      try{
         str = readString();
      }catch(Exception e){}

      if(str.equals("true") || str.equals("TRUE") || str.equals("t") || str.equals("1") || 
            str.equals("verdadeiro") || str.equals("VERDADEIRO") || str.equals("V")){
         resp = true;
            }

      return resp;
   }

   public static boolean readBoolean(String str){
      try {
         PrintStream out = new PrintStream(System.out, true, charset);
         out.print(str);
      }catch(UnsupportedEncodingException e){ System.out.println("Erro: charset invalido"); }
      return readBoolean();
   }

   public static void pause(){
      try{
         in.read();
      }catch(Exception e){}
   }

   public static void pause(String str){
      try {
         PrintStream out = new PrintStream(System.out, true, charset);
         out.print(str);
      }catch(UnsupportedEncodingException e){ System.out.println("Erro: charset invalido"); }
      pause();
   }
}

//Código com finalidade de converter operações em binário

class calculadora{
   public static String calc_D_B( int val ){ // calcular de decimaml para binario
      int resto = 0;
      if(val == 0) return "0";

      String binario = "";

      while (val > 0){
         resto = val%2;
         binario = Integer.toString(resto) + binario;
         val = val/2;
      }
      

      return binario;
   }
   public static int calc_B_D (String binaryNumber){ //calcular de binário para decimal
      int decimalValue = 0;
      int power = 0;
        
      // Percorre a string binária da direita para a esquerda
      for (int i = binaryNumber.length() - 1; i >= 0; i--) {
         int digit = Character.getNumericValue(binaryNumber.charAt(i));
         decimalValue += digit * Math.pow(2, power);
         power++;
        }   
      return decimalValue;
   }
   
   public static int apoioHexa_Dec(char hexDigit) {
        if (hexDigit >= '0' && hexDigit <= '9') {
            return hexDigit - '0';
        } else if (hexDigit >= 'A' && hexDigit <= 'F') {
            return 10 + (hexDigit - 'A');
        } else if (hexDigit >= 'a' && hexDigit <= 'f') {
            return 10 + (hexDigit - 'a');
        } else {
            throw new IllegalArgumentException("Caractere hexadecimal inválido: " + hexDigit);
        }
   }

   public static int  calc_H_D(String hexNumber){
      int decimal = 0;
      int power = 0;
      for (int i = hexNumber.length() - 1; i >= 0; i--) {
            char hexDigit = hexNumber.charAt(i);
            int digitValue = apoioHexa_Dec(hexDigit);
            decimal += digitValue * Math.pow(16, power);
            power++;
        }
      return 0;
   }


   public static char apoio_D_H(int value) {
      if (value >= 0 && value <= 9) {
         return (char) ('0' + value);
      } else {
         return (char) ('A' + (value - 10));
      }
   }

   public static String calc_D_H( int decimalNumber ){
      if (decimalNumber == 0) {
         return "0";
      }
      StringBuilder hex = new StringBuilder();
      while (decimalNumber > 0) {
            int remainder = decimalNumber % 16;
            hex.insert(0, apoio_D_H(remainder)); // Insere o dígito no início da sequência
            decimalNumber /= 16;
      }
        
      return hex.toString();
   }


   public static char apoio_B_H(int value) {
      if (value >= 0 && value <= 9) {
         return (char) ('0' + value);
      }  else {
         return (char) ('A' + (value - 10));
      }
   }
   public static String calc_B_H( String binaryNumber ){
      // Preenche com zeros à esquerda para garantir que o comprimento seja múltiplo de 4
      while (binaryNumber.length() % 4 != 0) {
         binaryNumber = "0" + binaryNumber;
      }
        
      StringBuilder hex = new StringBuilder();
        
      // Percorre a string binária de 4 em 4 dígitos
      for (int i = 0; i < binaryNumber.length(); i += 4) {
         String binaryGroup = binaryNumber.substring(i, i + 4);
         int decimalValue = Integer.parseInt(binaryGroup, 2);
         char hexDigit = apoio_B_H(decimalValue);
         hex.append(hexDigit);
      }
        
      return hex.toString();
   }

   public static String apoio_H_B(char hexDigit) {
      int decimalValue = Character.digit(hexDigit, 16);
      String binaryEquivalent = Integer.toBinaryString(decimalValue);
      
      // Preenche com zeros à esquerda para garantir 4 dígitos binários por dígito hexadecimal
      while (binaryEquivalent.length() < 4) {
         binaryEquivalent = "0" + binaryEquivalent;
      }
      return binaryEquivalent;
    }
   
   public static String calc_H_B(String hexNumber){
      StringBuilder binary = new StringBuilder();
        
      for (int i = 0; i < hexNumber.length(); i++) {
         char hexDigit = hexNumber.charAt(i);
         String binaryEquivalent = apoio_H_B(hexDigit);
         binary.append(binaryEquivalent);
      }
        
      return binary.toString();
   }
}


class metodos{
   public static void print_resultD( int x){
      System.out.println("A CONVERSÃO = "+ x);
   }

   public static void print_resultS( String x){
      System.out.println("A CONVERSÃO = "+ x);
   }
   
// conjunto de sets e menus
   public static int set_decimal( ){
      int x = 0;  
      System.out.println("DIGITE O VALOR DECIMAL: ");
      x = MyIO.readInt();
      return x;
   }

   public static String set_binario( ){
      String valor = "";
      System.out.println("DIGITE O VALOR BINARIO: ");
      valor = MyIO.readString();
      return valor;
   }

   public static String set_hexa( ){
      String valor = "";
      System.out.println("DIGITE O VALOR HEXADECIMAL: ");
      valor = MyIO.readString();
      return valor;
   }

   public static int menu_para( ){
      int x =0;  
      System.out.println("CONVERSOR DE BASES. ESCOLHA CONVERTER PARA: DECIMAL(1), BINARIO(2), HEXADECIMAL(3)");
      x = MyIO.readInt();
      return x;
   }

   public static int menu_de( ){
      int x=0;  
      System.out.println("CONVERSOR DE BASES. ESCOLHA CONVERTER DE: DECIMAL(1), BINARIO(2), HEXADECIMAL(3)");
      x = MyIO.readInt();
      return x;
   }
   
   
   //Funções definições "para":
   public static void para_decimal(int op){
      
      if(op == 1){ // de decimal
            int valor = set_decimal( );
            print_resultD(valor);
        }
        
        else if(op == 2){ // de binario
            String binario = set_binario();
            int resp = calculadora.calc_B_D( binario );
            print_resultD(resp);
        }
        
        else if(op == 3){ // de hexadecimal
            String hexa = set_hexa();
            int resp = calculadora.calc_H_D(hexa);
            print_resultD(resp);
        }
   }

   public static void para_hexa(int op){
      if(op == 1){ // de decimal
         int decimal = set_decimal();
         String resp = calculadora.calc_D_H(decimal);
         print_resultS(resp);
         }
         else if(op == 2){ // de binario
            String binario = set_binario();
            String resp = calculadora.calc_B_H(binario);
            print_resultS(resp);
         }
         else if(op == 3){ // de hexadecimal
            String valor = set_hexa();
            print_resultS(valor); 
        }
   }

   public static void para_binario(int op){
      if(op == 1){ // de decimal
            int valor = set_decimal();
            String resp = calculadora.calc_D_B( valor );
            print_resultS(resp);
        }
        
        else if(op == 2){ // de binario
            String valor = set_binario();
            print_resultS(valor);            
        }

         else if(op == 3){ // de hexadecimal
            String hexa = set_hexa();
            String resp = calculadora.calc_H_B(hexa);
            print_resultS(hexa);
        }
   }
   public static void apresenta(){
      System.out.println("*************");
      System.out.println("!CONVERSORES!");
      System.out.println("*************");
   }
   public static boolean repeat( ){
      boolean x = false;

      System.out.println("\n\n DESEJA REALIZAR NOVA CONVERSAO? Y/N");
      char y = MyIO.readChar();
      char z = Character.toUpperCase(y);
      if(z == 'Y' ){
         x = true;
      }
      return x;
   }
}

public class Opera{
    public static void main (String[]args)throws Exception{      
      Scanner scanner = new Scanner(System.in);
      
      //clear console
      for (int i = 0; i<50; i++){
         System.out.println();
      }


      System.out.println("Desenvolvedor - Guilherme Henrique Vieira Nascimento");
      System.out.println("Pontificia Universidade Catolica (PUC)\n");
      boolean repeat = false;
      do{
         metodos.apresenta();

         int option_de = metodos.menu_de( );
         int option_para = metodos.menu_para( );
         
         if(option_para == 1){ // para decimal
            metodos.para_decimal(option_de);
         }else if(option_para == 2){ // para binario
            metodos.para_binario(option_de);
         }else if(option_para == 3){ // para hexadecimal
            metodos.para_hexa(option_de);
         }
         repeat = metodos.repeat();
         scanner.close();
      }while(repeat); 
   }
}