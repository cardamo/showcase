package ru.cardamo.showcase.ginger;

import com.vityuk.ginger.Localizable;
import java.util.List;
import java.util.Map;

public interface Constants extends Localizable {
    String noSuchParameter();

    Integer one();

    List<String> buzzwords();

    Map<String, String> map();
}
