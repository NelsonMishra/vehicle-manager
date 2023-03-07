public class Vehicle{

    private PetolEngine pE;
        
    
    public static void main(String[] args) {
        PetolEngine pE = new PetolEngine();
        DiselEng dE = new DiselEng();
        electricEngine eN = new electricEngine();
        HydroEngine hE = new HydroEngine();

            pE.start();  
            dE.start();
            eN.start();
            eN.stop();
            hE.start();
            hE.stop();

 }
}





// public class electricEngine{
//     public void start(){
//         System.out.println("electric engine start");
//     }
//     public void stop(){
//         System.out.println("engine stop");
//     }
// }