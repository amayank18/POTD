package Week4.DAY23;

public class minimizeMaxDistanceToGasStation {
    public static double findSmallestMaxDist(int[] stations, int k) {
        // code here
        int[] placed=new int[stations.length-1];
        for (int i = 0; i < k; i++) {
            double maxValue=-1;
            int maxInd=-1;
            //Pick and place k gas stations:
            for (int j = 0; j < stations.length-1; j++) {
                //Find the maximum section
                //and insert the gas station:
                double diff=stations[i+1]-stations[i];
                double sectionLength=diff/(double)(placed[i]+1);
                if(maxValue<sectionLength) {
                    maxValue=sectionLength;
                    maxInd=i;
                }
            }
            //insert the current gas station
            placed[maxInd]++;
        }
        //Find the maximum distance i.e. the answer:
        double maxAns=-1;
        for (int i = 0; i < stations.length - 1; i++) {
            double diff=stations[i+1]-stations[i];
            double sectionLength=diff/(double)(placed[i]+1);
            maxAns=Math.max(maxAns,sectionLength);
        }
        return maxAns;
    }

    public static void main(String[] args) {
        int[] stations = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int k=9;
        System.out.println(findSmallestMaxDist(stations,k));
    }
}
