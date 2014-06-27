package ru.cardamo.showcase.ginger;

import com.vityuk.ginger.Localizable;
import com.vityuk.ginger.PluralCount;
import com.vityuk.ginger.Select;

public interface Messages extends Localizable {
    String hello(String who);

    String select(@Select String selection);

    String plural(@PluralCount Integer count, String param);
}
