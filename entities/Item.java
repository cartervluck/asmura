package entities;

public abstract class Item {
    String name;
    String description;
    
    abstract int getItemID();

    abstract void use(PlayerCharacter player);
    abstract void useInBattle(PlayerCharacter player, Opponent enemy);

    void pick_up(PlayerCharacter player) {
        player.inventory.add(this);  // This  will eventually be a thing when an instance of player is made in main.
    }
}
