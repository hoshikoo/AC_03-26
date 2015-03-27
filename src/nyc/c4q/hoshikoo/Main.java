package nyc.c4q.hoshikoo;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        ArrayList <Integer> numberList= new ArrayList();

        System.out.println("Give me some numbers to add:");

        while(true){
            int num = input.nextInt();

            if (num == -2){
                break;
            }else{

                numberList.add(num);
            }


        }

        int total = 0;

       /* for(int n:numberList){
            total = total+n;
        }
*/
        //System.out.println(total);

        //this is the same as
        //for (int i = 0; i < numberList.size(); i++) {
        //  System.out.println(numberList.get(i) );
        //}

        //System.out.println(numberList);


        Iterator<Integer> numbersIter = numberList.iterator();
        while (numbersIter.hasNext()) {
            //numbersIter.next();


            total+=numbersIter.next();

        }
        System.out.println(numberList.size());
        System.out.println("Thanks! Your sum is "+total);
    }
}
