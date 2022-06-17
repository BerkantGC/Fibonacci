import java.util.Arrays;

public class fibonacci {

    /*public int[] addElement(int[] array)
    {
       
    }*/

    public void select(int choosen)
    {
        int[] array = new int[2];
        array[0] = 0;
        array[1] = 1;
        int i = 0;
        int j = 0;
        int size;
        int[] tmp;

        for(; array[j] != choosen; j+=1)
        {
            //array = addElement(array);
            i = 0;
            size = array.length;

            
            //System.out.println(size);
    
            tmp = new int[size+1];
    
            //bi yolunu bul!
            for(i = 0; i<size; i++)
            {
                tmp[i] = array[i];
            }
    
            tmp[size] = tmp[size-1] + tmp[size-2];
            array = tmp;
        }

        System.out.println("Previous: " + array[j-1] + " " + "Next: " + array[j+1]);
    }


}
