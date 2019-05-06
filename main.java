import java.util.Arrays;
import java.util.Random;

class main {

    public static void main(String[] args) {
        Random r = new Random();
        int wek[] = new int[25];
        int wek2[] = new int[wek.length];
        boolean log[] = new boolean[wek.length];
        int min,number;

    for(int i = 0; i < wek.length -1; i++) {
         int a = r.nextInt(100) +1;
         wek[0] = a;
         wek[i + 1] = a; 
    }
    System.out.println("Wektor przed sortowaniem :");
    System.out.println(Arrays.toString(wek));




    for (int j=0;j<wek.length;j++) {
        min = wek[0];
        number = 0;

        for(int i = 0; i< wek.length; i++) {

            if(!log[i]) {
                if(wek[i] < min ) {
                    min = wek[i];
                    number = i;    
                    
                }
            }
        }
        log[number] = true;
        wek2[j] = min;    
    }
    System.out.println("Wektor po sortowaniu");
    System.out.println(Arrays.toString(wek2));
}
}
