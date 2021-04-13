import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Team {
    ArrayList<Player>listAllPlayer;
    ArrayList<Player>listTeam;
   
    public List<Player> getAllPlayers(){
        listAllPlayer = new ArrayList<Player>();
        listAllPlayer.add(new Player("Marc-André ter Stegen", Position.GK, 1));
        listAllPlayer.add(new Player("Sergiño Dest", Position.DF, 2));
        listAllPlayer.add(new Player("Gerard Piqué", Position.DF, 3));
        listAllPlayer.add(new Player("Ronald Araújo", Position.DF, 4));
        listAllPlayer.add(new Player("Sergio Busquets", Position.MF, 5));
        listAllPlayer.add(new Player("Antoine Griezmann", Position.FW, 6));
        listAllPlayer.add(new Player("Miralem Pjanić", Position.MF, 7));
        listAllPlayer.add(new Player("Martin Braithwaite", Position.FW, 8));
        listAllPlayer.add(new Player("Lionel Messi", Position.FW, 9));
        listAllPlayer.add(new Player("Ousmane Dembélé", Position.FW, 10));
        listAllPlayer.add(new Player("Riqui Puig", Position.MF, 11));
        listAllPlayer.add(new Player("Neto", Position.GK, 12));
        listAllPlayer.add(new Player("Clément Lenglet", Position.DF, 13));
        listAllPlayer.add(new Player("Pedri", Position.MF, 14));
        listAllPlayer.add(new Player("Francisco Trincão", Position.FW, 15));
        listAllPlayer.add(new Player("Jordi Alba", Position.DF, 16));
        listAllPlayer.add(new Player("Matheus Fernandes", Position.MF, 17));
        listAllPlayer.add(new Player("Sergi Roberto", Position.DF, 18));
        listAllPlayer.add(new Player("Frenkie de Jong", Position.MF, 19));
        listAllPlayer.add(new Player("Ansu Fati", Position.FW, 20));
        listAllPlayer.add(new Player("Samuel Umtiti", Position.DF, 21));
        listAllPlayer.add(new Player("Junior Firpo", Position.DF, 22));
        return listAllPlayer;
    }

    public List<Player> buildTeam(){
        listTeam = new ArrayList<Player>();
        Random random = new Random();
        int gateKeeperSize = 0;
        int defenderSize = 0;
        int midFieldSize = 0;
        int forwarderSize = 0;
        System.out.println("List player: ");
        
        while(gateKeeperSize<1){
            int rdGateKeeper = random.nextInt(22);
            if(listAllPlayer.get(rdGateKeeper).getPosition().equals(Position.GK)){
                listTeam.add(listAllPlayer.get(rdGateKeeper));
                gateKeeperSize++;
            }
        }

        while(defenderSize<4){
            int rdDefender = random.nextInt(22);
            if(listAllPlayer.get(rdDefender).getPosition().equals(Position.DF) && !listTeam.contains(listAllPlayer.get(rdDefender))){
                listTeam.add(listAllPlayer.get(rdDefender));
                defenderSize++;
            }
        }
        
        while(midFieldSize<4){
            int rdMidField = random.nextInt(22);
            if(listAllPlayer.get(rdMidField).getPosition().equals(Position.MF) && !listTeam.contains(listAllPlayer.get(rdMidField))){
                listTeam.add(listAllPlayer.get(rdMidField));
                midFieldSize++;
            }
        }

        while(forwarderSize<2){
            int rdForwarder = random.nextInt(22);
            if(listAllPlayer.get(rdForwarder).getPosition().equals(Position.FW) && !listTeam.contains(listAllPlayer.get(rdForwarder))){
                listTeam.add(listAllPlayer.get(rdForwarder));
                forwarderSize++;
            }
        }
         listTeam.forEach(System.out::println);
        return null;
    }

    public int buildTeam(int defender, int midfielder, int forwarder){
        listTeam = new ArrayList<Player>();
        Random random = new Random();
        int gateKeeperSize = 0;
        int defenderSize = 0;
        int midFieldSize = 0;
        int forwarderSize = 0;
        System.out.println("List player: ");
        
        while(gateKeeperSize<1){
            int rdGateKeeper = random.nextInt(22);
            if(listAllPlayer.get(rdGateKeeper).getPosition().equals(Position.GK)){
                listTeam.add(listAllPlayer.get(rdGateKeeper));
                gateKeeperSize++;
            }
        }

        while(defenderSize<defender){
            int rdDefender = random.nextInt(22);
            if(listAllPlayer.get(rdDefender).getPosition().equals(Position.DF) && !listTeam.contains(listAllPlayer.get(rdDefender))){
                listTeam.add(listAllPlayer.get(rdDefender));
                defenderSize++;
            }
        }
        
        while(midFieldSize<midfielder){
            int rdMidField = random.nextInt(22);
            if(listAllPlayer.get(rdMidField).getPosition().equals(Position.MF) && !listTeam.contains(listAllPlayer.get(rdMidField))){
                listTeam.add(listAllPlayer.get(rdMidField));
                midFieldSize++;
            }
        }

        while(forwarderSize<forwarder){
            int rdForwarder = random.nextInt(22);
            if(listAllPlayer.get(rdForwarder).getPosition().equals(Position.FW) && !listTeam.contains(listAllPlayer.get(rdForwarder))){
                listTeam.add(listAllPlayer.get(rdForwarder));
                forwarderSize++;
            }
        }
         listTeam.forEach(System.out::println);
        return 1;
    }
}
