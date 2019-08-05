package rpg;

public class Character{
   public int health;
   public int armor;
   public int strength;
   public int weaponDamage;

   boolean holdingWeapon;

   public boolean isAlive(){
       return this.health > 0;
   }

    public int lightAttack(Character target){
       int damageDealt = target.strength * 2;
       if (holdingWeapon = true){
           damageDealt = target.strength + target.weaponDamage;

       }
       return damageDealt;
   }
   public int heavyAttack(Character target){
        int heavyDamageDealt = target.strength * 3;
        if (holdingWeapon = true){
            heavyDamageDealt += target.weaponDamage;
        }
        System.out.println(target.armor);
        return heavyDamageDealt-target.armor;
   }

   public int takeDamage(int damage){
       int damageTaken = damage - this.armor;
       this.health = health - damageTaken;

        return damageTaken;
   }
}
