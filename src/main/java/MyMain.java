import java.util.ArrayList;
public class MyMain {

    // Returns the mean of the 2D array mat
    public static double mean(double[][] mat) { 
        double total = 0;
        int count = 0;
        for(int row=0;row<mat.length;row++){
            for(int col = 0;col<mat[0].length;col++){
                total += mat[row][col];
                count++;
            }
        }
        return total/count;
    }

    // Returns the median of the 2D array mat
    public static double median(double[][] mat) {
        ArrayList<Double> list1 = new ArrayList<Double>();
        for(int row=0;row<mat.length;row++){
            for(int col = 0;col<mat[0].length;col++){
                list1.add(mat[row][col]);
            }
        }
        int size = list1.size();
        int middle = size/2; //middle number
        double median = 0.0;
        if(size%2 == 1){ //odd number
            median = list1.get(middle);

        }
        else if(size%2 == 0){ //even number
            median = (list1.get(middle)+list1.get(middle-1))/2;
        }
        return median;
    }
    // Returns the mode of the 2D array mat
    public static double mode(double[][] mat) {
        int value = 0;
        int [] x = new int[100];
        for(int row=0;row<mat.length;row++){
            for(int col = 0;col<mat[0].length;col++){
                value = (int)mat[row][col];
                x[value]++;
            }
        }
        int big = 0;
        int mode = -1;

        for(int i = 0;i<100;i++){
            if(x[i] > big){
                big = x[i];
                mode = i;

            }
        }

        ArrayList<Double> list1 = new ArrayList<Double>();
        double maxc = 0.0;
        double maxv = 0.0;
        for(int i = 0;i<list1.size();i++){
            double count = 0.0;
            for(int j = 0;j<list1.size();j++){
                if(list1.get(j) == list1.get(i)){
                    count++;
                }
                if(count>maxc){
                    maxc = count;
                    maxv = list1.get(j);
                }
            }
        }
        
        return mode;
    }


    public static void main(String[] args) {
        // Write some code here to test your methods!
    }
}
