package sec3;

public class Ex7 {
	public static void main(String[] args) {
        int max = 0, min = 9;
        int[] array = { 1, 5, 3, 8, 2 };

        for(int i=0;i<array.length;i++){
        	if(array[i]>max) max = array[i];
        	if(array[i]<min) min = array[i];
        }
        
        System.out.println("max : "+max);
        System.out.println("min : "+min);
	}

}
