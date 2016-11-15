package sote.Jobs;

import cn.nukkit.Player;
import cn.nukkit.item.Item;
import sote.Main;

public class Job_Guard extends Job{

    public Job_Guard(Player player){
        this.owner = player;
    }

    @Override
    public void Night(){
        Item item = new Item(Main.GuardItem);
        this.owner.getInventory().setHotbarSlotIndex(0,0);
        this.owner.getInventory().setItem(0,item);
        this.owner.getInventory().sendContents(this.owner);
    }

    @Override
    public void setTarget(Player player){
        if(this.used) return;
        this.GuardTarget = player;
        this.owner.sendMessage(player.getName()+"を選択しました");
        this.used = true;
    }

    @Override
    public int getSide(){
        return 0;
    }

    @Override
    public int getTalkRoom(){
        return 0;
    }

    @Override
    public int getNumber(){
        return 2;
    }

    @Override
    public String getDivinerResult(){
        return "人間";
    }

    @Override
    public String getPsychicResult(){
        return "人間";
    }

    @Override
    public String getName(){
        return "霊媒師";
    }

}