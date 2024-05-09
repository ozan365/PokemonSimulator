package org.example;

public class Type {
    private boolean[] superEffective = new boolean[18];
    private boolean[] notEffective = new boolean[18];
    private boolean[] noEffect = new boolean[18];
    private int numType;


    private Type (boolean[] superEffective, boolean[] notEffective, int numType) {

    }

    public int getEffective(Type attacker, Type defender) {
        if (attacker.superEffective[defender.getNumType()])
            return 0;
        if (attacker.notEffective[defender.getNumType()])
            return 1;
        if (attacker.noEffect[defender.getNumType()])
            return 2;
        return 3;
    }

    public int getNumType() {
        return this.numType;
    }

}
