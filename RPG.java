package rpg;

import java.util.Scanner;

public class RPG {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        int permHealth = 100;
        int permStrength = 5;

        Character player = new Character();
        player.health = 100;
        player.armor = 0;
        player.strength = 5;
        player.weaponDamage = 0;
        player.holdingWeapon = false;

        Character e1 = new Character();
        e1.health = 100;
        e1.armor = 5;
        e1.strength = 2;
        e1.weaponDamage = 2;
        e1.holdingWeapon = true;

        Character e2 = new Character();
        e2.health = 110;
        e2.armor = 5;
        e2.strength = 2;
        e2.weaponDamage = 2;
        e2.holdingWeapon = true;

        Character e3 = new Character();
        e3.health = 100;
        e3.armor = 0;
        e3.strength = 7;
        e3.weaponDamage = 0;
        e3.holdingWeapon = false;

        Character e4 = new Character();
        e4.health = 100;
        e4.armor = 5;
        e4.strength = 2;
        e4.weaponDamage = 5;
        e4.holdingWeapon = true;

        Character e5 = new Character();
        e5.health = 110;
        e5.armor = 5;
        e5.strength = 5;
        e5.weaponDamage = 0;
        e5.holdingWeapon = false;
        Character e6 = new Character();
        e6.health = 110;
        e6.armor = 10;
        e6.strength = 2;
        e6.weaponDamage = 0;
        e6.holdingWeapon = false;
        Character e7 = new Character();
        e7.health = 110;
        e7.armor = 5;
        e7.strength = 7;
        e7.weaponDamage = 8;
        e7.holdingWeapon = true;
        Character e8 = new Character();
        e8.health = 130;
        e8.armor = 5;
        e8.strength = 6;
        e8.weaponDamage = 9;
        e8.holdingWeapon = true;
        Character e9 = new Character();
        e9.health = 130;
        e9.armor = 5;
        e9.strength = 5;
        e9.weaponDamage = 10;
        e9.holdingWeapon = true;
        Character boss = new Character();
        boss.health = 200;
        boss.armor = 10;
        boss.strength = 10;
        boss.weaponDamage = 10;
        boss.holdingWeapon = true;


        System.out.println( "You wake in a dark room...");
        System.out.println("The only thing visible is a door with light coming from under it...");
        System.out.println("A hooded figure walks into the room, holding an axe");
        System.out.println("He grabs you and brings you out of the room");
        System.out.println("You are thrown into a huge colosseum");
        System.out.println("You quickly notice that the stands are filled with people");
        System.out.println("You notice a man with a sword approaching you almost as quickly");
        System.out.println("You enter a fight:");


        while (player.isAlive() && e1.isAlive()) {
            System.out.println("What do you do?");
            System.out.println("(1) Light Attack");
            System.out.println("(2) Heavy Attack");

            int playerchoice1;
            playerchoice1 = userInput.nextInt();
            if (playerchoice1 == 1){
                player.health = player.health - e1.lightAttack(e1);
                e1.health = e1.health- player.lightAttack(player);
                System.out.println("Your Health : " + player.health);
                System.out.println("Enemy's Health : " + e1.health);
            }
            else if (playerchoice1 == 2){
                player.health = player.health - e1.lightAttack(e1);
                e1.health = e1.health - player.heavyAttack(player)+e1.armor;
                player.health -= 5;
                System.out.println("Your Health : " + player.health);
                System.out.println("Enemy's Health : " + e1.health);
            }
            }
        if (player.health <= 0){
            System.out.println("YOU DIED");
            System.exit(0);
        }
        if (e1.health <= 0){
            System.out.println("You Win! Move on to the next round?");
            player.health = permHealth;
        }
        System.out.println("1 : Yes");
        System.out.println("2 : No");

        int playerChoice2 = userInput.nextInt();
        if (playerChoice2 == 1){
            System.out.println("You chose to move on to the next round.");
        }
        else if (playerChoice2 == 2){
            System.out.println("Thanks for playing OwO");
            System.exit(0);
        }

        System.out.println("Before you move on, would you like to search his body for items");
        System.out.println("1 : Yes");
        System.out.println("2 : No");
        int playerChoice3 = userInput.nextInt();
        if (playerChoice3 == 1){
            System.out.println("He has...");
            System.out.println("1 Sword +2 Weapon Damage");
            System.out.println("And");
            System.out.println("1 Weak Armor +5 Armor");
            System.out.println("Would you like to take these items?");
            System.out.println("1 : Yes");
            System.out.println("2 : No");

            int playerChoice4 = userInput.nextInt();
            if (playerChoice4 == 1){
                player.armor  = 5;
                player.weaponDamage = 2;
            }
            else if (playerChoice4 == 2){
                System.out.println("You do not take these items");
            }
        }
        else if (playerChoice3 == 2){
            System.out.println("You do not search the body for items");
        }
        System.out.println("A CHALLENGER APPEARS");
        System.out.println("He seems to have a glowing aura surrounding his body");
        System.out.println("He shares the same attire and weapon as the previous enemy");
        System.out.println("You enter a fight:");

        while (player.isAlive() && e2.isAlive()){
            System.out.println("What do you do?");
            System.out.println("(1) Light Attack");
            System.out.println("(2) Heavy Attack");
            int playerChoice5;
            playerChoice5 = userInput.nextInt();
            if (playerChoice5 == 1){
                player.health = player.health - e2.lightAttack(e2);
                e2.health = e2.health- player.lightAttack(player);
                System.out.println("Your Health : " + player.health);
                System.out.println("Enemy's Health : " + e2.health);
            }
            else if (playerChoice5 == 2){
                player.health = player.health - e2.lightAttack(e2);
                e2.health = e2.health - player.heavyAttack(player)+e2.armor;
                player.health -= 5;
                System.out.println("Your Health : " + player.health);
                System.out.println("Enemy's Health : " + e2.health);
            }
        }
        if (player.health <= 0){
            System.out.println("YOU DIED");
            System.exit(0);
        }
        if (e2.health <= 0){
            System.out.println("You Win! Move on to the next round?");
            player.health = permHealth;
        }
        System.out.println("(1) Yes");
        System.out.println("(2) No");

        int playerChoice6;
        playerChoice6 = userInput.nextInt();
        if (playerChoice6 == 1){
            System.out.println("You move on to the next round");
        }
        else if (playerChoice6 == 2){
            System.out.println("Thanks for playing OwO");
            System.exit(0);
        }
        System.out.println("Before you move on, would you like to search his body?");
        System.out.println("(1) Yes");
        System.out.println("(2) No");
        int playerChoice7;
        playerChoice7 = userInput.nextInt();
        if (playerChoice7 == 1){
            System.out.println("He has...");
            System.out.println("1 Sword +2 Weapon Damage");
            System.out.println("1 Weak Armor +5 Armor");
            System.out.println("What's this? 1 Health Potion +10 Health");
            System.out.println("Would you like to take these items");
            System.out.println("(1) Yes");
            System.out.println("(2) No");
            int playerChoice8 ;
            playerChoice8 = userInput.nextInt();

            if (playerChoice8 == 1){
                player.weaponDamage = 2;
                player.armor = 5;
                permHealth += 10;
                player.health = permHealth;
            }
            else if (playerChoice8 == 2){
                System.out.println("You do not take the items");
            }
        }
        else if (playerChoice7 == 2){
            System.out.println("You do not search the body for items");
        }
        System.out.println("A CHALLENGER APPEARS");
        System.out.println("This one also has an aura around him");
        System.out.println("He also appears incredibly muscular");
        System.out.println("You enter a fight:");

        while (player.isAlive() && e3.isAlive()){
            System.out.println("What do you do?");
            System.out.println("(1) Light Attack");
            System.out.println("(2) Heavy Attack");
            int playerChoice9;
            playerChoice9 = userInput.nextInt();
            if (playerChoice9 == 1){
                player.health = player.health - e3.lightAttack(e3);
                e3.health = e3.health- player.lightAttack(player);
                System.out.println("Your Health : " + player.health);
                System.out.println("Enemy's Health : " + e3.health);
            }
            else if (playerChoice9 == 2){
                player.health = player.health - e3.lightAttack(e3);
                e3.health = e3.health - player.heavyAttack(player)+e3.armor;
                player.health -= 5;
                System.out.println("Your Health : " + player.health);
                System.out.println("Enemy's Health : " + e3.health);
            }
        }
        if (player.health <= 0){
            System.out.println("YOU DIED");
            System.exit(0);
        }
        if (e3.health <= 0){
            System.out.println("You Win! Move on to the next round?");
            player.health = permHealth;
        }
        System.out.println("(1) Yes");
        System.out.println("(2) No");
        int playerChoice10;
        playerChoice10 = userInput.nextInt();
        if (playerChoice10 == 1){
            System.out.println("You move on to the next round");
        }
        else if (playerChoice10 == 2){
            System.out.println("Thanks for playing OwO");
            System.exit(0);
        }
        System.out.println("Before you move on, would you like to search his body");
        System.out.println("(1) Yes");
        System.out.println("(2) No");
        int playerChoice11;
        playerChoice11 = userInput.nextInt();
        if (playerChoice11 == 1){
            System.out.println("He has...");
            System.out.println("What's this? 1 Strength Potion +2 Strength");
            System.out.println("Would you like to take these items");
            System.out.println("(1) Yes");
            System.out.println("(2) No");
            int playerChoice12;
            playerChoice12 = userInput.nextInt();
            if (playerChoice12 == 1){
                permStrength = 7;
                player.strength = permStrength;
            }
            else if (playerChoice12 == 2){
                System.out.println("You do not take the items");
            }
        }
        else if (playerChoice11 == 2){
            System.out.println("You do not search the body for items");
        }
        System.out.println("A Challenger Appears");
        System.out.println("As he approaches you, you notice he has a battle axe");
        System.out.println("You enter a fight:");
        System.out.println("What do you do?");
        System.out.println("(1) Light Attack");
        System.out.println("(2) Heavy Attack");
        while (player.isAlive() && e4.isAlive()){
            int playerChoice13;
            playerChoice13 = userInput.nextInt();
            if (playerChoice13 == 1){
                player.health = player.health - e4.lightAttack(e4);
                e4.health = e4.health- player.lightAttack(player);
                System.out.println("Your Health : " + player.health);
                System.out.println("Enemy's Health : " + e4.health);
            }
            else if (playerChoice13 == 2){
                player.health = player.health - e4.lightAttack(e4);
                e4.health = e4.health - player.heavyAttack(player)+e4.armor;
                player.health -= 5;
                System.out.println("Your Health : " + player.health);
                System.out.println("Enemy's Health : " + e4.health);
            }
        }
        if (player.health <= 0){
            System.out.println("YOU DIED");
            System.exit(0);
        }
        if (e4.health <= 0){
            player.health = permHealth;
            System.out.println("You Win! Move on to the next round?");
            System.out.println("(1) Yes");
            System.out.println("(2) No");
        }
        int playerChoice14;
        playerChoice14 = userInput.nextInt();
        if (playerChoice14 == 1){
            System.out.println("You move on to the next round");
        }
        if (playerChoice14 == 2){
            System.out.println("Thanks for playing");
            System.exit(0);
        }
        System.out.println("Before you move on, would you like to search his body?");
        System.out.println("(1) Yes");
        System.out.println("(2) No");
        int playerChoice15;
        playerChoice15 = userInput.nextInt();
        if (playerChoice15 == 1){
            System.out.println("He has...");
            System.out.println("1 Weak Armor +5 Armor");
            System.out.println("1 Battle Axe +5 Weapon Damage");
            System.out.println("Would you like to take these items");
            System.out.println("(1) Yes");
            System.out.println("(2) No");
            int playerChoice16;
            playerChoice16 = userInput.nextInt();
            if (playerChoice16 == 1){
                player.weaponDamage = 5;
                player.armor = 5;
            }
            else if (playerChoice16 == 2){
                System.out.println("You do not take the items");
            }
        }
        else if (playerChoice15 == 2){
            System.out.println("You do not search his body for items");
        }
        System.out.println("A CHALLENGER APPROACHES");
        System.out.println("You see that he has a glowing aura around him");
        System.out.println("You Enter A Fight: ");
        while (player.isAlive() && e5.isAlive()) {
            System.out.println("What do you do?");
            System.out.println("(1) Light Attack");
            System.out.println("(2) Heavy Attack");

            int playerchoice17;
            playerchoice17 = userInput.nextInt();
            if (playerchoice17 == 1){
                player.health = player.health - e5.lightAttack(e5);
                e5.health = e5.health- player.lightAttack(player);
                System.out.println("Your Health : " + player.health);
                System.out.println("Enemy's Health : " + e5.health);
            }
            else if (playerchoice17 == 2){
                player.health = player.health - e5.lightAttack(e5);
                e5.health = e5.health - player.heavyAttack(player)+e5.armor;
                player.health -= 5;
                System.out.println("Your Health : " + player.health);
                System.out.println("Enemy's Health : " + e5.health);
            }
        }
        if (player.health <= 0){
            System.out.println("YOU DIED");
            System.exit(0);
        }
        if (e5.health <= 0){
            System.out.println("You Win! Move on to the next round?");
            player.health = permHealth;
        }
        System.out.println("1 : Yes");
        System.out.println("2 : No");

        int playerChoice18 = userInput.nextInt();
        if (playerChoice18 == 1){
            System.out.println("You chose to move on to the next round.");
        }
        else if (playerChoice18 == 2){
            System.out.println("Thanks for playing OwO");
            System.exit(0);
        }

        System.out.println("Before you move on, would you like to search his body for items");
        System.out.println("1 : Yes");
        System.out.println("2 : No");
        int playerChoice19 = userInput.nextInt();
        if (playerChoice19 == 1){
            System.out.println("He has...");
            System.out.println("1 Health Potion +10 Health");
            System.out.println("Would you like to take these items?");
            System.out.println("1 : Yes");
            System.out.println("2 : No");

            int playerChoice20 = userInput.nextInt();
            if (playerChoice20 == 1){
                permHealth += 10;
                player.health = permHealth;
            }
            else if (playerChoice20 == 2){
                System.out.println("You do not take these items");
            }
        }
        else if (playerChoice19 == 2){
            System.out.println("You do not search the body for items");
        }
        System.out.println("A CHALLENGER APPROACHES");
        System.out.println("As he approaches you see that he has an aura around him");
        System.out.println("He also has a new type of armor on");
        System.out.println("You Enter A Fight: ");

        while (player.isAlive() && e6.isAlive()) {
            System.out.println("What do you do?");
            System.out.println("(1) Light Attack");
            System.out.println("(2) Heavy Attack");

            int playerchoice21;
            playerchoice21 = userInput.nextInt();
            if (playerchoice21 == 1){
                player.health = player.health - e6.lightAttack(e6);
                e6.health = e6.health- player.lightAttack(player);
                System.out.println("Your Health : " + player.health);
                System.out.println("Enemy's Health : " + e6.health);
            }
            else if (playerchoice21 == 2){
                player.health = player.health - e6.lightAttack(e6);
                e6.health = e6.health - player.heavyAttack(player)+e6.armor;
                player.health -= 5;
                System.out.println("Your Health : " + player.health);
                System.out.println("Enemy's Health : " + e6.health);
            }
        }
        if (player.health <= 0){
            System.out.println("YOU DIED");
            System.exit(0);
        }
        if (e6.health <= 0){
            System.out.println("You Win! Move on to the next round?");
            player.health = permHealth;
        }
        System.out.println("1 : Yes");
        System.out.println("2 : No");

        int playerChoice22 = userInput.nextInt();
        if (playerChoice22 == 1){
            System.out.println("You chose to move on to the next round.");
        }
        else if (playerChoice22 == 2){
            System.out.println("Thanks for playing OwO");
            System.exit(0);
        }

        System.out.println("Before you move on, would you like to search his body for items");
        System.out.println("1 : Yes");
        System.out.println("2 : No");
        int playerChoice23 = userInput.nextInt();
        if (playerChoice23 == 1){
            System.out.println("He has...");
            System.out.println("1 Health Potion +10 Health");
            System.out.println("And");
            System.out.println("1 Strong Armor +10 Armor");
            System.out.println("Would you like to take these items?");
            System.out.println("1 : Yes");
            System.out.println("2 : No");

            int playerChoice24 = userInput.nextInt();
            if (playerChoice24 == 1){
                player.armor  = 10;
                permHealth += 10;
                player.health = permHealth;
            }
            else if (playerChoice24 == 2){
                System.out.println("You do not take these items");
            }
        }
        else if (playerChoice23 == 2){
            System.out.println("You do not search the body for items");
        }
        System.out.println("A CHALLENGER APPROACHES");
        System.out.println("As he approaches you, you see that he has two auras around him");
        System.out.println("He's also holding a great sword in his hand");
        System.out.println("You Enter A Fight: ");

        while (player.isAlive() && e7.isAlive()) {
            System.out.println("What do you do?");
            System.out.println("(1) Light Attack");
            System.out.println("(2) Heavy Attack");

            int playerchoice25;
            playerchoice25 = userInput.nextInt();
            if (playerchoice25 == 1){
                player.health = player.health - e7.lightAttack(e7);
                e7.health = e7.health- player.lightAttack(player);
                System.out.println("Your Health : " + player.health);
                System.out.println("Enemy's Health : " + e7.health);
            }
            else if (playerchoice25 == 2){
                player.health = player.health - e7.lightAttack(e7);
                e7.health = e7.health - player.heavyAttack(player)+e7.armor;
                player.health -= 5;
                System.out.println(player.heavyAttack(player));
                System.out.println("Your Health : " + player.health);
                System.out.println("Enemy's Health : " + e7.health);
            }
        }
        if (player.health <= 0){
            System.out.println("YOU DIED");
            System.exit(0);
        }
        if (e1.health <= 0){
            System.out.println("You Win! Move on to the next round?");
            player.health = permHealth;
        }
        System.out.println("1 : Yes");
        System.out.println("2 : No");

        int playerChoice26 = userInput.nextInt();
        if (playerChoice26 == 1){
            System.out.println("You chose to move on to the next round.");
        }
        else if (playerChoice26 == 2){
            System.out.println("Thanks for playing OwO");
            System.exit(0);
        }

        System.out.println("Before you move on, would you like to search his body for items");
        System.out.println("1 : Yes");
        System.out.println("2 : No");
        int playerChoice27 = userInput.nextInt();
        if (playerChoice27 == 1){
            System.out.println("He has...");
            System.out.println("1 Health Potion +10 Health");
            System.out.println("1 Great Sword + 8 Weapon Damage");
            System.out.println("And");
            System.out.println("1 Strength Potion +2 Strength");
            System.out.println("Would you like to take these items?");
            System.out.println("1 : Yes");
            System.out.println("2 : No");

            int playerChoice28 = userInput.nextInt();
            if (playerChoice28 == 1){
                permHealth += 10;
                permStrength += 2;
                player.health = permHealth;
                player.strength = permStrength;
                player.weaponDamage = 8;
            }
            else if (playerChoice28 == 2){
                System.out.println("You do not take these items");
            }
        }
        else if (playerChoice27 == 2){
            System.out.println("You do not search the body for items");
        }
        System.out.println("A CHALLENGER APPROACHES");
        System.out.println("You notice a very strong aura around him");
        System.out.println("He's also holding a mace in his hand");
        System.out.println("You Enter A Fight: ");

        while (player.isAlive() && e8.isAlive()) {
            System.out.println("What do you do?");
            System.out.println("(1) Light Attack");
            System.out.println("(2) Heavy Attack");

            int playerchoice30;
            playerchoice30 = userInput.nextInt();
            if (playerchoice30 == 1){
                player.health = player.health - e8.lightAttack(e8);
                e8.health = e8.health- player.lightAttack(player);
                System.out.println("Your Health : " + player.health);
                System.out.println("Enemy's Health : " + e8.health);
            }
            else if (playerchoice30 == 2){
                player.health = player.health - e8.lightAttack(e8);
                e8.health = e8.health - player.heavyAttack(player)+e8.armor;
                player.health -= 5;
                System.out.println("Your Health : " + player.health);
                System.out.println("Enemy's Health : " + e8.health);
            }
        }
        if (player.health <= 0){
            System.out.println("YOU DIED");
            System.exit(0);
        }
        if (e1.health <= 0){
            System.out.println("You Win! Move on to the next round?");
            player.health = permHealth;
        }
        System.out.println("1 : Yes");
        System.out.println("2 : No");

        int playerChoice31 = userInput.nextInt();
        if (playerChoice31 == 1){
            System.out.println("You chose to move on to the next round.");
        }
        else if (playerChoice31 == 2){
            System.out.println("Thanks for playing OwO");
            System.exit(0);
        }

        System.out.println("Before you move on, would you like to search his body for items");
        System.out.println("1 : Yes");
        System.out.println("2 : No");
        int playerChoice32 = userInput.nextInt();
        if (playerChoice32 == 1){
            System.out.println("He has...");
            System.out.println("1 Mace +9 Weapon Damage");
            System.out.println("1 Strength Potion +1 Strength");
            System.out.println("And");
            System.out.println("1 Strong Health Potion +30 Health");
            System.out.println("Would you like to take these items?");
            System.out.println("1 : Yes");
            System.out.println("2 : No");

            int playerChoice33 = userInput.nextInt();
            if (playerChoice33 == 1){
                permHealth += 30;
                permStrength += 1;
                player.health = permHealth;
                player.strength = permStrength;
                player.weaponDamage = 2;
            }
            else if (playerChoice33 == 2){
                System.out.println("You do not take these items");
            }
        }
        else if (playerChoice32 == 2){
            System.out.println("You do not search the body for items");
        }
        System.out.println("A CHALLENGER APPROACHES");
        System.out.println("As he approaches you, you see that he has a strong aura around him");
        System.out.println("He's also holding a warhammer in his hands");
        System.out.println("You Enter A Fight: ");

        while (player.isAlive() && e9.isAlive()) {
            System.out.println("What do you do?");
            System.out.println("(1) Light Attack");
            System.out.println("(2) Heavy Attack");

            int playerchoice34;
            playerchoice34 = userInput.nextInt();
            if (playerchoice34 == 1){
                player.health = player.health - e9.lightAttack(e9);
                e9.health = e9.health- player.lightAttack(player);
                System.out.println("Your Health : " + player.health);
                System.out.println("Enemy's Health : " + e9.health);
            }
            else if (playerchoice34 == 2){
                player.health = player.health - e9.lightAttack(e9);
                e9.health = e9.health - player.heavyAttack(player)+e9.armor;
                player.health -= 5;
                System.out.println("Your Health : " + player.health);
                System.out.println("Enemy's Health : " + e9.health);
            }
        }
        if (player.health <= 0){
            System.out.println("YOU DIED");
            System.exit(0);
        }
        if (e1.health <= 0){
            System.out.println("You Win! Move on to the next round?");
            player.health = permHealth;
        }
        System.out.println("1 : Yes");
        System.out.println("2 : No");

        int playerChoice35 = userInput.nextInt();
        if (playerChoice35 == 1){
            System.out.println("You chose to move on to the next round.");
        }
        else if (playerChoice35 == 2){
            System.out.println("Thanks for playing OwO");
            System.exit(0);
        }

        System.out.println("Before you move on, would you like to search his body for items");
        System.out.println("1 : Yes");
        System.out.println("2 : No");
        int playerChoice36 = userInput.nextInt();
        if (playerChoice36 == 1){
            System.out.println("He has...");
            System.out.println("1 warhammer +10 Weapon Damage");
            System.out.println("And");
            System.out.println("1 Strong Health Potion +30 Health");
            System.out.println("Would you like to take these items?");
            System.out.println("1 : Yes");
            System.out.println("2 : No");

            int playerChoice37 = userInput.nextInt();
            if (playerChoice37 == 1){
                permHealth += 30;
                player.health = permHealth;
                player.weaponDamage += 10;
            }
            else if (playerChoice37 == 2){
                System.out.println("You do not take these items");
            }
        }
        else if (playerChoice36 == 2){
            System.out.println("You do not search the body for items");
        }
        System.out.println("A CHALLENGER APPROACHES");
        System.out.println("This is the last enemy, the boss");
        System.out.println("You Enter A Fight: ");

        while (player.isAlive() && boss.isAlive()) {
            System.out.println("What do you do?");
            System.out.println("(1) Light Attack");
            System.out.println("(2) Heavy Attack");

            int playerchoice38;
            playerchoice38 = userInput.nextInt();
            if (playerchoice38 == 1){
                player.health = player.health - boss.lightAttack(boss);
                boss.health = boss.health- player.lightAttack(player);
                System.out.println("Your Health : " + player.health);
                System.out.println("Enemy's Health : " + boss.health);
            }
            else if (playerchoice38 == 2){
                player.health = player.health - boss.lightAttack(boss);
                boss.health = boss.health - player.heavyAttack(player)+boss.armor;
                player.health -= 5;
                System.out.println("Your Health : " + player.health);
                System.out.println("Enemy's Health : " + boss.health);
            }
        }
        if (player.health <= 0){
            System.out.println("YOU DIED");
            System.exit(0);
        }
        if (e1.health <= 0){
            System.out.println("You Win! Thanks for playing");
            System.exit(0);
        }
    }
}
