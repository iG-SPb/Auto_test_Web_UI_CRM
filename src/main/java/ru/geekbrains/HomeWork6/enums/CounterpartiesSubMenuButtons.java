package ru.geekbrains.HomeWork6.enums;

import org.openqa.selenium.By;
import ru.geekbrains.HomeWork6.base.SubMenuButtons;

public enum CounterpartiesSubMenuButtons implements SubMenuButtons {
    CONTACT_FACE("//span[@class='title' and text()='Контактные лица']"),
    ORGANIZATION("//span[@class='title' and text()='Организации']");

    private final By by;

    CounterpartiesSubMenuButtons(String xpath){
        this.by = By.xpath(xpath);
    }

    public By getBy(){
        return by;
    }
}
