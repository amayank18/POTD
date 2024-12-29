import java.util.*;

public class almostPrime {

    static int N=3000;
    static boolean[] prime = new boolean[N];

    static void SieveOfEratosthenes() {
        for(int i=0;i<N;i++)
            prime[i] =true;
        prime[1] = false;

        for (int p = 2; p * p < N; p++) {
            if (prime[p]) {
                for (int i = p * 2; i < N; i += p)
                    prime[i] = false;
            }
        }
    }

    static int almostPrime(int n) {
        int count=0;
        for(int i=6;i<=n;i++) {
            int c=0;
            for(int j=2;j*j<=i;j++) {
                if(i%j==0) {
                    if(j*j==i) {
                        if (prime[j])
                            c++;
                    }
                    else {
                        if(prime[j])
                            c++;
                        if(prime[i/j])
                            c++;
                    }
                }
            }
            if(c==2)
                count++;
        }
        return count;
    }
    public static void main(String[] args) {
        SieveOfEratosthenes();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(almostPrime(n));
    }
}
