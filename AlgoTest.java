package algotest;
public class AlgoTest{
    public static void main(String[] args) {
      int arr[] = {1,5,7,9,2,15,100,32,4,5};
      int i,sk=100,find;
      
      for(i = 0; i < 10; i++){
        if(arr[i] == sk){
          System.out.println("Search Key ("+arr[i]+") Is Found");
        }
      }
    }
}
