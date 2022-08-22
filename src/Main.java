public class Main {
    public static void main(String[] args) {
        boolean found=false;
        int n=1;
        while(found==false)
        {
            if(((n*n*n+91) % 47)==0)
            {
                found=true;
            }

            else
            {
                n++;
            }
        }
        System.out.println(n);
        int t=0;
        int initial=0;

        while(t<=100)
        {
            int calc=t*(t-20)*(t-100)+120000;
            if (calc<initial)
                initial=calc;
            t++;
        }
        System.out.println(initial);

    }
}