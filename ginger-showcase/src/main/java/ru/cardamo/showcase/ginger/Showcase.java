package ru.cardamo.showcase.ginger;

import com.vityuk.ginger.Localization;
import com.vityuk.ginger.LocalizationBuilder;

import java.util.Arrays;

public class Showcase {
    public static void main(String[] args) {
        Localization localization = new LocalizationBuilder().withResourceLocations(Arrays.asList(
            "classpath:constants.properties",
            "classpath:messages.properties"
        )).build();

        Constants constants  = localization.getLocalizable(Constants.class);

        // constants
        System.out.println(constants.one());
        System.out.println(constants.buzzwords());
        System.out.println(constants.noSuchParameter());
        System.out.println(constants.map());

        Messages messages = localization.getLocalizable(Messages.class);

        // messages
        System.out.println(messages.hello("World"));

        // selectors
        System.out.println(messages.select("1"));
        System.out.println(messages.select(null));
        System.out.println(messages.select("2"));
        System.out.println(messages.select("3"));

        // plurals
        System.out.println(messages.plural(0, "param"));
        System.out.println(messages.plural(1, "param"));
        System.out.println(messages.plural(2, "param"));
        System.out.println(messages.plural(3, "param"));
        System.out.println(messages.plural(12, "param"));
        System.out.println(messages.plural(32, "param"));
        System.out.println(messages.plural(101, "param"));

        // TODO: formatting
    }
}
