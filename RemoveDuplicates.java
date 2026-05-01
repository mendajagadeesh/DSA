import java.util.*;
public class RemoveDuplicates {
    public static void main(String args[]){
    Scanner in=new Scanner(System.in);
    int[] arr=new int[10];
    HashSet<Integer> map=new HashSet<>();

    int count=0;

    for(int i=0;i<arr.length;i++){
        arr[i]=in.nextInt();
    }
     
    int i=0;
    while(i<arr.length){
        if(!map.contains(arr[i])){
            map.add(arr[i]);
            count++;
        }
        i++;
    }
    System.out.println("unique elements"+map);
    System.out.println(map.size());
    System.out.println(count);
    in.close();
}

    
}
