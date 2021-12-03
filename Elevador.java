import java.io.*;
import java.util.Scanner;

public class Elevador{ 
    private int andarAtual;
    private int andares; 
    private int capacidade; 
    private int QuantidadePessoas; 

    public void Inicializa(int cap, int and){
        this.andarAtual = 0;
        this.QuantidadePessoas = 0;
        this.capacidade = cap;
        this.andares = and;
    }

    public void Entra(){
        if(this.capacidade > this.QuantidadePessoas){
            this.QuantidadePessoas += 1;
        }else{
            System.out.println(" Elevador cheio! ");
        }
    }

    public void Sai(){
        if(this.QuantidadePessoas != 0){
            this.QuantidadePessoas -= 1;
        }else{
            System.out.println(" Elevador vazio! ");
        }
    }

    public void Sobe(){
        if(this.andarAtual < andares){
            this.andarAtual += 1;
        }else if(this.andarAtual == andares){
            System.out.println("Ja se encontra no ultimo andar");
        }else{
            System.out.println("Andar nao disponivel");
        }
    }

    
    public void Desce(){
        if(this.andarAtual != 0){
            this.andarAtual -= 1;
        }else{
            System.out.println("Ja se encontra no terreo");
        }
    } 


    //
    public int getAndarAtual() {
        return andarAtual;
    }
    public void setandarAtual(int n) {
        this.andarAtual = n;
    }

    //
    public int getAndares() {
        return andares;
    }
    public void setAndares(int n) {
        this.andares = n;
    }
    
    //
    public int getCapacidade() {
        return capacidade;
    }
    public void setCapacidade(int n) {
        this.capacidade = n;
    }

    //
    public int getQuantidadePessoas() {
        return QuantidadePessoas;
    }
    public void setQuantidadePessoas(int n) {
        this.QuantidadePessoas = n;
    }


    public static void main(String args[]) throws IOException {
        Elevador obj = new Elevador();

        Scanner ler = new Scanner(System.in);
        String endereco = ler.nextLine();
        BufferedReader leitura = new BufferedReader(new FileReader(endereco));

        
        String a0 = leitura.readLine();
        String b0 = leitura.readLine();
        int a = Integer.parseInt(a0); //capacidade do elevador (no arquivo vem primeiro)
        int b = Integer.parseInt(b0); //número de andares 

        obj.Inicializa(a,b);


        int continuar = 0;
        while(continuar != 1){
            System.out.println("Escolha opcao:");
            System.out.println("1. Sair");
            System.out.println("2. Entrar pessoas");
            System.out.println("3. Sair pessoas");
            System.out.println("4. Subir andar");
            System.out.println("5. Descer andar");
            continuar = ler.nextInt();

            switch(continuar){
                case 1: 
                    System.out.println("1. Saindo \n");
                    break;
                case 2:
                    obj.Entra();
                    break;
                case 3:
                    obj.Sai();
                    break;
                case 4: 
                    obj.Sobe();
                    break;
                case 5:
                    obj.Desce();
                    break;
                default:
                    System.out.println("Opcao invalida");
            }

            System.out.println("\n---Status do elevador---");
            System.out.println("Andar atual: " + obj.getAndarAtual());
            System.out.println("Total de pessoas: " + obj.getQuantidadePessoas() + "\n" );
        }

        
        leitura.close();
        ler.close();
    }

}




    
