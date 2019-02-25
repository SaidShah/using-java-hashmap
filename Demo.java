import java.util.*;
public class Demo{

  public static void main(String[] args) {

    int[] newArr = new int[]{2,3,6,2,5,3,2,3,2,5,4,6};
    System.out.println("the array is "+Arrays.toString(newArr));
    HashMap<Integer,Integer> hashMap = new HashMap<Integer,Integer>();
    System.out.println(hashMap+" is the hash map for ints");
    for(int i: newArr){
      if(hashMap.get(i)==null){
        hashMap.put(i,1);
      }else{
        int aNum = hashMap.get(i);
        aNum+=1;
        hashMap.put(i,aNum);

      }
    }

    for(int i : hashMap.keySet()){
            System.out.println("the value "+i+" appears " +hashMap.get(i)+" times");
    }
    System.out.println(hashMap+" is the hash map for ints");

    HashMap<String, Integer> newMap = new HashMap<String, Integer>();
    newMap.put("population", 2323222);
    newMap.put("days", 365);
    newMap.put("nights", 3);
    newMap.put("weeks", 52);
    System.out.println("get the value for the key 'days' is "+newMap.get("days"));
    System.out.println("The size of the hash map is "+newMap.size());
    System.out.println("the hash map at the moment is "+newMap);
    newMap.remove("days");
    System.out.println("the hash map after removing days is "+newMap);
    System.out.print("The keys in the map are ");
    for(String i : newMap.keySet()){
      System.out.print(i+", ");
    }
    System.out.print("\n");
    System.out.print("The values in the map are ");
    for(Integer i : newMap.values()){
      System.out.print(i+", ");
    }
  }

}
