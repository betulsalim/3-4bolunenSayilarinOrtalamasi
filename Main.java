import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int i,sayi,sum=0,j=0;
        float ortalama;


        Scanner input = new Scanner(System.in);
        System.out.println("Sayıyı giriniz: ");
        sayi = input.nextInt();
        for (i=1;i<=sayi;i++){
            if((i%3==0) && (i%4==0)){
                sum=sum+i;
               j++;

            }

        }
        ortalama=(float) sum/j;
        System.out.println("Ortalama: "+ortalama);

    }
}
