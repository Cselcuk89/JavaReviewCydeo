package org.Selcuk;

public class AppleHeavyPredicate implements ApplePredicate{
    @Override
    public boolean test(AppleClass apple) {
        return apple.getWeight() > 200;
    }

    @Override
    public String print(AppleClass appleClass) {
        return (appleClass.getWeight() > 200) ? "A heavy "
                + appleClass.getColor()
                + " apple" : "A light "
                + appleClass.getColor() + " apple." ;
    }
}
