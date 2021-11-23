import java.util.Scanner;
public class main{
    public static void main(String []args){
        double kdv1 = 1.8;
        double kdv2 = 0.8;
        double kdvPara;
        Scanner para = new Scanner(System.in);
        System.out.println("Para girin:");
        kdvPara = para.nextDouble();
        if(kdvPara<1000 && kdvPara>0){
            kdvPara += kdv1;
        }
        else if(kdvPara>1000){
            kdvPara += kdv2;
        }
        System.out.println("para : "+ kdvPara);
    }
}