package org.Selcuk;

import java.util.ArrayList;

public class TeamClass<T extends Player> {
    private String name;
    private ArrayList<T> members = new ArrayList<>();

    public TeamClass(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public boolean addPlayer(T player){
        if (members.contains(player)){
            System.out.println(player.getName() + " is already on this team");
            return  false;
        }else {
            members.add(player);
            System.out.println(player.getName() + " is picked for team" + this.name);
            return  true;
        }
    }
    public int numPlayer(){
        return this.members.size();

    }
}

