package org.Selcuk;

public class AppleGreenColorPredicate implements ApplePredicate {
    @Override
    public boolean test(AppleClass apple) {
        return apple.getColor().equals(Color.GREEN);
    }

    @Override
    public String print(AppleClass appleClass) {
        return "An apple of "+appleClass.getWeight() + "g";
    }
}
