import java.util.ArrayList;
import java.util.Collections;
public class Array_List {
    public static void swap(ArrayList<Integer> list, int idx1, int idx2){
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }


    public static int storeWater(ArrayList<Integer> height){// O(n^2)
        int maxWater=0;

        //brute Force

        for(int i=0 ; i<height.size(); i++){
            for(int j=i+1; j<height.size(); j++){
                int ht= Math.min(height.get(i), height.get(j));
                int width= j-i;
                int currWater= ht*width;
                maxWater = Math.max(maxWater, currWater);

            }
        }
        return maxWater;
    }
    public static int storeWaterA(ArrayList<Integer> height){
        int maxWater=0;
        int lp=0;
        int rp= height.size()-1;

        while(lp<rp){
            int ht=Math.min(height.get(lp), height.get(rp));
            int width= rp-lp;
            int currWater= ht*width;
            maxWater= Math.max(maxWater, currWater);


            if(height.get(lp)< height.get(rp)){
                lp++;
            }
            else{
                rp--;
            }
        }
        return maxWater;
    }

    public static boolean pairSum1(ArrayList<Integer> list, int target){
        for(int i=0; i<list.size(); i++){
            for(int j=0; j<list.size() ; j++){
                return true;
            }
        }
        return false;
    }

    public static boolean pairSum1A(ArrayList<Integer> list, int target){
        int lp=0;
        int rp=list.size()-1;

        while(lp != rp){
            //case 1
            if(list.get(lp)+ list.get(rp)== target){
                return true;
            }

            //case 2
            if(list.get(lp)+ list.get(rp)< target){
                lp++;

            }
            //case 3
            else{
                rp--;
        }
        }
        return false;
    }

    public static boolean pairSSum2(ArrayList<Integer> list, int target){// O(n)
        int bp =-1;
        int n=list.size();
        for(int i=0; i<list.size(); i++){
            if(list.get(i)> list.get(i+1)){
                bp=i;
                break;
            }
        }
        int lp= bp+1;//smallest
        int rp=bp;//largest
        while(lp!=rp){
            //case1
            if(list.get(lp)+ list.get(rp)== target){
                return true;
            }

            //case2
            if(list.get(lp)+ list.get(rp)< target){
                lp= (lp+1)%n;
            }
            else{
                //case
                rp=(n+rp-1)%n;

            }
        }
        return false;

    }
    public static void main(String args[]){
        //ArrayList<Integer> list= new ArrayList<>();
        //ArrayList<String> list2 = new ArrayList<>();
        //ArrayList<Boolean> last3 = new ArrayList<>();

        /*list.add(2);        //O(1)
        list.add(5);
        list.add(9);
        list.add(6);
        list.add(8);

        Collections.sort(list); //Ascendeing

        System.out.println(list);

        //Descending
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);

        /*nt max = Integer.MIN_VALUE;
        for (int i=0; i<list.size(); i++){
            if(max < list.get(i)){
                max= list.get(i);
            }
        }
        System.out.println(max);
        System.out.println(list);
        swap(list, 1,3);
        System.out.println(list);*/
        


        /*for(int i=list.size()-1; i>=0; i--){
            System.out.print(list.get(i) + " ");
        }*/


        /*for(int i=0 ;i<list.size(); i++){
            System.out.print(list.get(i));
                }
        System.out.println();*/

        // list.add(1,9);//O(n)
        //System.out.println(list.size());

        //System.out.println(list);
        
        
        /*Get Operation


        int element = list.get(2);
        System.out.println(element);
        
        
        //Delete 
        list.remove(2);
        System.out.println(list);


        //set Element at index
        list.set(2, 10);
        System.out.println(list);*/


        //contains
        /*System.out.println(list.contains(1));
        System.out.println(list.contains(11));*/


        //MultiDimensional Array
        /*ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list= new ArrayList<>();
        list.add(1);
        list.add(2);
        mainList.add(list);


        ArrayList <Integer> list2 = new ArrayList<>();
        list2.add(3); list2.add(4) ;
        mainList.add(list2);

        for(int i=0; i<mainList.size() ; i++){
            ArrayList<Integer> currList = mainList.get(i);
            for(int j=0; j<currList.size(); j++){
                System.out.print(currList.get(j) + " ");
            }
            System.out.println();*/

            /*ArrayList<ArrayList<Integer>> mainList= new ArrayList<>();
            ArrayList<Integer> list1 = new ArrayList<>();
            ArrayList<Integer> list2 = new ArrayList<>();
            ArrayList<Integer> list3 = new ArrayList<>();


            for(int i=1 ; i<=5 ; i++){
                list1.add(i*1);
                list2.add(i*2);
                list3.add(i*3);
            }


            mainList.add(list1);
            mainList.add(list2);
            mainList.add(list3);
            System.out.println(mainList);
            list1.remove(2);
            list2.remove(3);



            

            //nested loops
            for(int i=0; i<mainList.size(); i++){
                ArrayList<Integer> currList = mainList.get(i);
                for(int j=0; j<currList.size(); j++){
                    System.out.print(currList.get(j) + " ");
                }
                System.out.println();
            }*/



            ArrayList<Integer> n= new ArrayList<>();
            n.add(1);
            n.add(8);
            n.add(6);
            n.add(2);
            n.add(5);
            n.add(4);
            n.add(8);
            n.add(3);
            n.add(7);
            //System.out.println(storeWaterA(n));
            ArrayList<Integer> list = new ArrayList<>();
            list.add(1);
            list.add(2);
            list.add(3);
            list.add(4);
            list.add(5);
            //System.out.println(pairSum1A(list, 5));]

            ArrayList<Integer> list1= new ArrayList<>();
            list1.add(11);
            list1.add(15);
            list1.add(6);
            list1.add(8);
            list1.add(9);
            list1.add(10);
            System.out.println(pairSSum2(list1, 16));

        }
    }