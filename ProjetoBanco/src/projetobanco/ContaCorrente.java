package projetobanco;

/**
 *
 * @author laboratorio
 */
public class ContaCorrente {
    
    public float saldo;
    
    public void definirSaldoInicial(float saldoInicial){
        this.saldo = saldoInicial;
    }
    
    public void depositar(float valor){
        saldo = this.saldo + valor;
        System.out.println("\nValor do depósito: " + valor);
        System.out.println("Saldo Atual: " +this.saldo);
    }
    
    public boolean sacar(float valor){
        
        if(saldo >= valor){
        
            saldo = this.saldo - valor;
            System.out.println("\nValor do saque: " + valor);
            System.out.println("Saldo Atual: " +this.saldo);
            
            return true;
        }
        else{
            System.out.println("Saldo insuficiente para saque!");
            return false;
        }
    }
    
    
}