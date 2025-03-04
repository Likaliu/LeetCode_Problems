package desafiovetor;

public class Main {
    public static void main(String[] args) {

        int vector [] = {1,1,2,2,4,5,6};

        RemovendoDuplicados vetor = new RemovendoDuplicados(vector);

        vetor.removeDuplicates();

        System.out.println("Resultado: ");
        vetor.printElements();
    }
    
}
