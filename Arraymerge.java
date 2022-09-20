import java.util.*;

public class Arraymerge{

public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.println("Enter size of all arrays");

int size = input.nextInt();

int[] arr1 = new int[size];
int[] arr2 = new int[size];
int[] arr3 = new int[size*2];

System.out.println("enter elements of first Array1");

for(int a = 0;a<size;a++){
arr1[a] = input.nextInt();
}

System.out.println("Enter elements of Second Array2");

for(int a = 0;a<size;a++){
arr2[a] = input.nextInt();
}

for(int a = 0;a<size;a++){

for(int b = a ;b<size;b++){

if(arr1[a]>arr2[a]){
arr3[a+b] = arr2[a];
arr3[a+b+1] = arr1[a];
}
else{

arr3[a+b] = arr1[a];
arr3[a+b+1] = arr2[a];
}
break;

}

}

System.out.println(Arrays.toString(arr3));


}

}
