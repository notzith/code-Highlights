package com.zith.permutationviz;

public class Permutation  {
    static Visual v;
    public static void main(String[] args) {
 
        String s="abcd";
        v= new Visual(s);
        v.insEle(s,0);
        display(s,0,s.length()-1);
        v.disMatrix(v.triangle);
    }

    static void display(String s,int start,int end) {
        if(start==end) {
            //System.out.println(s);
            return;
        }
        for(int i=start; i<=end; i++) {
            String s1 = swap(s,start,i);
            v.insEle(s1,start+1);
            display(s1,start+1,end);
        }
    }
    static String swap(String s,int i,int j) {
        char[]a=s.toCharArray();
        char t = a[i];
        a[i]=a[j];
        a[j]=t;
        return new String(a);
    }
}
