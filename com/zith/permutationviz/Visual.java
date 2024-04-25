package com.zith.permutationviz;

import java.util.Arrays;

public class Visual {
    public String[][] triangle;
    int count,strlen;
    Visual(String str){
        triangleMaker(str);
        strlen=str.length();
    }
    void insEle(String s,int i){
        if(count==0){
            triangle[0][0]=s;
            count=1;
        }
        autoFill(triangle[i], s);
        disMatrix(triangle);
    }
    void autoFill(String[] sarr,String str){
        for(int i=0 ;i<sarr.length;i++){
            if (sarr[i]==null){
                sarr[i]=str;
                break;
            }
        }
    }

    private void triangleMaker(String s){
        int i= s.length();
        triangle = new String[i][];
        triangle[0]=new String[1];
        int fact=i,j=1,temp=i;
        while(j<i){
            triangle[j++]=new String[fact];
            fact*=(--temp);
        }
        disMatrix(triangle);
    }
    void disMatrix(String[][] matrix) {
        int spaces=strlen*2;
        for(String[] s : matrix){
            for(int i=0;i<spaces;i++)System.out.print("\t");
            System.out.println(Arrays.toString(s));
            spaces-=3;
        }
    }


}

//        for(int i =0;i<matrix.length;i++){
//            for(int j=0;j<spaces;j--){
//                System.out.print("\t");
//            }
//            for(int j=0; j<matrix[i].length;j++){
//                System.out.print(matrix[i][j]+"  ");
//            }
//            System.out.println();
//            count-=2;
//        }

