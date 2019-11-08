class DnDCharacter {
    Integer strength;
    Integer dexterity;
    Integer constitution;
    Integer intelligence;
    Integer wisdom;
    Integer charisma;
    Integer hitpoints;

    int ability() {
        int try1 = (int) Math.floor(Math.random() * 6);
        int try2 = (int) Math.floor(Math.random() * 6);
        int try3 = (int) Math.floor(Math.random() * 6);
        int try4 = (int) Math.floor(Math.random() * 6);

        if(try1 < try2 && try1 < try3 && try1 < try4){
            return try2 + try3 + try4;
        } else if(try2 < try1 && try2 < try3 && try2 < try4){
            return try1 + try3 + try4;
        }else if(try3 < try1 && try3 < try2 && try3 < try4){
            return try1 + try2 + try4;
        }else{
            return try1 + try2 + try3;
        }
    }

    int modifier(int input) {
        double mod = (double)input;
        mod = (mod - 10) /2;
        return (int) Math.floor(mod);
    }

    int getStrength() {
        if(this.strength == null) {
            this.strength = ability();
        }
        return this.strength;
    }

    int getDexterity() {
        if(this.dexterity == null) {
            this.dexterity = ability();
        }
        return this.dexterity;
    }

    int getConstitution() {
        if(this.constitution == null) {
            this.constitution = ability();
        }
        return this.constitution;
    }

    int getIntelligence() {
        if(this.intelligence == null) {
            this.intelligence = ability();
        }
        return this.intelligence;
    }

    int getWisdom() {
        if(this.wisdom == null) {
            this.wisdom = ability();
        }
        return this.wisdom;
    }

    int getCharisma() {
        if(this.charisma == null) {
            this.charisma = ability();
        }
        return this.charisma;
    }

    int getHitpoints() {
        return 10 + modifier(getConstitution());
    }

}
