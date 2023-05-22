package kg.geeks.game.players;

public class Magic extends Hero {
    private int boost;


    public Magic(int health, int damage, String name,int boost) {

        super(health, damage, SuperAbility.BOOST, name);
        this.boost=boost;

    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {

        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() > 0 && this.getHealth()>0) {
                heroes[i].setDamage(heroes[i].getDamage() + boost  );
            }
        }
        System.out.println("Hendolf делает усиление урона на "+boost+" едениц");
    }
}
