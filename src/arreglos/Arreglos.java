
package arreglos;


public class Arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String arreglo[] = new String[5];
        arreglo[0] = "variable 1";
        arreglo[1] = "variable 2";
        arreglo[2] = "variable 3";
        arreglo[3] = "variable 4";
        arreglo[4] = "variable 5";
        
        for(int contador = 0; contador < arreglo.length; contador++){
                System.out.println(arreglo[contador]);
               
        }
        System.out.println("ARREGLO 2");
        String arreglo2[] = {"variable 1", "variable 2"};
         
            for(int contador = 0; contador < arreglo.length; contador++){
                System.out.println(arreglo[contador]);                    
                
            }
            
        int arreglo3[] = new int[2];
        arreglo3[0] = 1;
        arreglo3[1] = 2;
         for(int contador = 0; contador < arreglo3.length; contador++){
                System.out.println(arreglo3[contador]);
    }




    }



}






