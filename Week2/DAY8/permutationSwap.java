package Week2.DAY8;

import java.util.*;
import java.io.*;

public class permutationSwap {
    static class FastReader{
        BufferedReader br;
        StringTokenizer st;
        public FastReader(){
            br=new BufferedReader(new InputStreamReader(System.in));
        }
        String next(){
            while(st==null || !st.hasMoreTokens()){
                try {
                    st=new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt(){
            return Integer.parseInt(next());
        }
        long nextLong(){
            return Long.parseLong(next());
        }
        double nextDouble(){
            return Double.parseDouble(next());
        }
        char nextChar() {
            return next().charAt(0);
        }
        String nextLine(){
            String str="";
            try {
                str=br.readLine().trim();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    static class FastWriter {
        private final BufferedWriter bw;

        public FastWriter() {
            this.bw = new BufferedWriter(new OutputStreamWriter(System.out));
        }

        public void print(Object object) throws IOException {
            bw.append("" + object);
        }

        public void println(Object object) throws IOException {
            print(object);
            bw.append("\n");
        }

        public void close() throws IOException {
            bw.close();
        }
    }

//    static return_type function_name(input parameters) { ... }


    public static void main(String[] args) {
        try {
            FastReader in=new FastReader();
            FastWriter out=new FastWriter();

            int t = in.nextInt();
            while(t-- > 0) {
                int n=in.nextInt();
                int[] arr=new int[n];
                int sum=0;
                for(int i=0;i<n;i++) {
                    arr[i] = in.nextInt();
                    sum+=arr[i];
                }
                int ts=n*(n+1)/2;
                if(ts !=sum)
                    break;
                int i=0,j=arr.length-1,count=0;
                while(i<j) {
                    if(arr[i]<arr[j]) {
                        int temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                        count++;
                        i++;
                    }
                    //i++;
                    j--;
                }
                out.println(count);
            }
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}