import java.io.*;
import java.util.*;
public class A_Countdown {

    static class FastReader
    {
        BufferedReader br;
        StringTokenizer st;
 
        public FastReader()
        {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }
 
        String next()
        {
            while (st == null || !st.hasMoreElements())
            {
                try
                {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException  e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt()
        {
            return Integer.parseInt(next());
        }
 
        long nextLong()
        {
            return Long.parseLong(next());
        }
 
        double nextDouble()
        {
            return Double.parseDouble(next());
        }
        String nextLine()
        {
            String str = "";
            try
            {
                str = br.readLine();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            return str;
        }
    }
    
    public static void main(String[] args){
         FastReader f=new FastReader();
         StringBuilder sb=new StringBuilder();
         int t = f.nextInt();
         while(t-->0){
             int inp=f.nextInt();
            String s=f.nextLine();
            int ans=0;
            for(int i=0;i<s.length();i++){
                int y=s.charAt(i)-'0';
                if(y!=0){
                    if(i==s.length()-1){
                       ans+=y;
                    }else{
                       ans+=y+1;
                    }
                }
            }
            sb.append(ans+"\n");
         }
         System.out.println(sb);
    }
    }


    

