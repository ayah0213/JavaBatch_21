package tasks.Inheritence.Restaurant;

import java.util.ArrayList;
import java.util.Arrays;

public class Restaurant {

    public String Owner, Location;
    int numberOfStarzzz;
    // create an Arraylist of SErvErs and Chefs
    public ArrayList<Server> servers=new ArrayList<>();
    public ArrayList<Chef> chefs = new ArrayList<>();

    // create and Constructor  with set of my attributes
    public Restaurant(String Owner, String Location, int numberOfStarzzz){
        this.Owner=Owner;
        this.Location=Location;
        this.numberOfStarzzz=numberOfStarzzz;
    }

    // adding all servers from Serverss list into ArrayList
    public void hireServer(Server server){
        servers.addAll(Arrays.asList(server));
    }

    // adding servers into Array of Servers
    public void hireServers(Server[] newServers){
        servers.addAll(Arrays.asList(newServers));
    }

    // adding chefs into Arraylist
    public void hireChef(Chef chef){
        chefs.addAll(Arrays.asList(chef));
    }
    // same here adding chef into Arr[]
    public void hiredChef(Chef[] newChefs){
        chefs.addAll(Arrays.asList(newChefs));
    }

    public String toString() {
        return "Restaurant{" +
                "Owner='" + Owner +
                ", Location='" + Location +
                ", numberOfStarzzz=" + numberOfStarzzz +
                ", servers=" + servers +
                ", chefs=" + chefs +
                '}';
    }
}
