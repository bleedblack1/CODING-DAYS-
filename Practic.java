import java.util.ArrayList;

public class Practic {

    /* 
    public static boolean Monotonic( ArrayList<Integer> nums  ){
        boolean isIncreasing = true;
        boolean isDecreasing = true;

        for(int i =0 ; i < nums.size()-1 ; i++){
            if(nums.get(i) < nums.get(i+1)){
                isDecreasing = false ;
            }

            if(nums.get(i) > nums.get(i+1)){
                isIncreasing = false ;
                }
            }
            return isIncreasing || isDecreasing;
        }
    public static void main (String  args[]){
        ArrayList<Integer> nums = new ArrayList<> ();
        nums.add(1);
        nums.add(2);
        nums.add(2);
        nums.add(3);

        boolean isMonotonic = Monotonic(nums);
        if(isMonotonic){
            System.out.println("The array is monotonic");
        }
        else{
            System.out.println("The array is not monotonic");
        }
      
    }

    */

    //Lonely Numbers in ArrayList

// Function to find lonely numbers in an ArrayList
    public static void Lonely(ArrayList<Integer> nums) {
        ArrayList<Integer> lonelyNumbers = new ArrayList<>();

        for (int i = 0; i < nums.size(); i++) {
            int currNum = nums.get(i);
            boolean isLonely = true;

            for (int j = 0; j < nums.size(); j++) {
                if (i != j) { // No need for this check if j starts from 0
                    int neighbor1 = currNum + 1;
                    int neighbor2 = currNum - 1;

                    if (neighbor1 == nums.get(j) || neighbor2 == nums.get(j) || currNum == nums.get(j)) {
                        isLonely = false;
                        break; // No need to check further if not lonely
                    }
                }
            }

            if (isLonely) {
                lonelyNumbers.add(currNum);
            }
        }

        if (lonelyNumbers.size() > 0) {
            System.out.println("The lonely numbers are: " + lonelyNumbers);
        } else {
            System.out.println("There are no lonely numbers.");
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(3);
        nums.add(5);
        nums.add(3);

        Lonely(nums);
    }
}

