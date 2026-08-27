
public class p039_Numeros1a100 {
    
    public static void main(String[] args) {
        
        System.out.print("\033[H\033[2J"); System.out.flush();
        int num;

        num = 1;

        while( num <=100 ){
            System.out.print(num + "");
            num++;            
        }
        System.out.println("\nProceso terminado...");
    }
}
