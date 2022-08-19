public class Permutation {
    public static void main(String[] args) {
        String s = "abs";
        char ch[] = s.toCharArray();
        int n=s.length();
        ans(ch,0,n-1);

    }

    static void ans(char[] str,int s ,int e){
        if (s==e){
            System.out.println(str);

            return;
        }

        for (int i = s; i <=e; i++) {
            swap(str,s,i);
            ans(str,s+1,e);
            swap(str,s,i);
        }
    }


    static void swap(char[] ch, int i, int j)
    {

        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;

    }


}

//print all the permutation of the given string
//time complexity O()
