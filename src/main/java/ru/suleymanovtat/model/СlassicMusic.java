package ru.suleymanovtat.model;

import ru.suleymanovtat.Music;

public class СlassicMusic implements Music {
    @Override
    public String getSong() {
        return "Eine kleine Nachtmusik";
    }
}
