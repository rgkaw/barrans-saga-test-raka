import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BarrensSagaRiddle {
    public static void main(String[] args) {

        try{
            System.out.println("Enter :Age of Death Person A, Year of Death Person A, Age of Death Person B, Year of Death Person B");
            System.out.print("separate number with space ' ' : " );
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String lines=br.readLine();
            String[] strs = lines.trim().split("\\s+");
             Villager A=new Villager(Integer.parseInt(strs[0]),Integer.parseInt(strs[1]));
            Villager B=new Villager(Integer.parseInt(strs[2]),Integer.parseInt(strs[3]));
            Double averageKilled= AveragePeopleKilled(A,B);
            System.out.println(averageKilled);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    public static Double AveragePeopleKilled(Villager A, Villager B){
        int a=A.getPeopleKilledOfYear();
        int b=B.getPeopleKilledOfYear();
        if ((a<=0)|(b<0)){
            return -1d;
        }
        else{
            return Double.valueOf(a+b)/2D;
        }
    }

}
