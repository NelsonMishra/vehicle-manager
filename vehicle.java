public class Vehicle{

    private PetolEngine pE;
        
    
    public static void main(String[] args) {
        PetolEngine pE = new PetolEngine();
        DiselEng dE = new DiselEng();

            pE.start();  
            dE.start();
            

 }
}