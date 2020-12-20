package ru.suleymanovtat.model;

import ru.suleymanovtat.Music;

public class ContemporaryMusic implements Music {
    @Override
    public String getSong() {
        return "Blues";
    }
}
