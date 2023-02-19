public class Frequency {
    public static void main(String args[]) {
        String str="";
        int i, j;
        for(i=0; i<args.length; i++)
            str=str+args[i]+" ";
        str=str.trim();
        int[] freq=new int[str.length()];  
        char[] string=new char[str.length()];
        for(i=0; i<str.length(); i++)
            string[i]=str.charAt(i);
        for(i=0; i<str.length(); i++) {  
            freq[i]=1;  
            for(j=i+1; j<str.length(); j++) {  
                if(string[i]==string[j]) {  
                    freq[i]++;  
                    string[j]='0';  
                }  
            }  
        }  
        for(i=0; i<str.length(); i++)
            if(string[i]!='0')  
                System.out.println(string[i]+" - "+freq[i]);  
    }
}
