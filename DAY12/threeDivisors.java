package DAY12;

public class threeDivisors {
    public boolean isThree(int n) {
        int count=1;
        for(int i=2;i<=n;i++) {
            if(n%i==0) {
                count++;
            }
            if(count>3)
                break;
        }
        if(count==3)
            return true;
        else
            return false;
    }
}
