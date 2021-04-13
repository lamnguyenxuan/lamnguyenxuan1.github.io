import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Team team = new Team();
        team.getAllPlayers();
        team.buildTeam();

        boolean check = true;
        while(check){
            System.out.println("Do you want to see another option? Type Y or N");
            String option = sc.nextLine();
            if(option.toUpperCase().equals("Y")){
                check = true;
            }
            else{
                check = false;
                System.exit(0);
            }

            System.out.println("Nhập sơ đồ đội hình:");
            System.out.println("Chọn 1: SƠ đồ 4-4-2");
            System.out.println("Chọn 2: SƠ đồ 3-5-2");
            System.out.println("Chọn 3: SƠ đồ 4-3-3");
            int n = Integer.parseInt(sc.nextLine());
            switch(n){
                case 1:
                team.buildTeam(4,4,2);
                break;
                case 2: 
                team.buildTeam(3,5,2);
                break;
                case 3:
                team.buildTeam(4,3,3);
                break;
                default:
                System.out.println("Không tồn tại lựa chọn này");
                break;
            }
        }
         sc.close();
    }
}
