import java.io.*;
import java.util.Scanner;

public class Pessoa{ 
    private String nome;
    private int anoNascimento;
    private int altura; 
    private int idade; 

    public String getNome() {
        return nome;
    }

    public int getanoNascimento() {
        return anoNascimento;
    }

    public int getAltura() {
        return altura;
    }

    public void setNome(String n) {
        this.nome = n;
    }

    public void setanoNascimento(int ano) {
        this.anoNascimento = ano;
    }

    public void setAltura(int a) {
        this.altura = a;
    }

    public void Idade(){
        int i = this.anoNascimento;
        this.idade = 2021-i;
    }

    public void ListarDados(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade + " anos");
        System.out.println("Altura: " + this.altura + " cm");
    }


    public static void main(String args[]) throws IOException {
        Pessoa obj = new Pessoa();
        Scanner ler = new Scanner(System.in);
        String endereco = ler.nextLine();
        BufferedReader leitura = new BufferedReader(new FileReader(endereco));

        obj.nome = leitura.readLine();
        String n = leitura.readLine();
        obj.anoNascimento = Integer.parseInt(n);
        String m = leitura.readLine();
        obj.altura = Integer.parseInt(m);

        obj.Idade(); //calcular a idade
        obj.ListarDados(); 
        
        leitura.close();
        ler.close();
    }
}