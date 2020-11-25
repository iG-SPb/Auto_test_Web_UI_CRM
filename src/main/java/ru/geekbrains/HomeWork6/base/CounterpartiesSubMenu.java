package ru.geekbrains.HomeWork6.base;

import org.openqa.selenium.WebDriver;
import ru.geekbrains.HomeWork6.enums.CounterpartiesSubMenuButtons;
import ru.geekbrains.HomeWork6.pages.ContactFacePage;

public class CounterpartiesSubMenu extends SubMenu {


    public CounterpartiesSubMenu(WebDriver driver) {
        super(driver);
    }

    @Override
    public BasePage clickSubMenuButton(SubMenuButtons buttons) {
        if (buttons instanceof CounterpartiesSubMenuButtons){
            switch ((CounterpartiesSubMenuButtons) buttons){
                case CONTACT_FACE:
                    driver.findElement(((CounterpartiesSubMenuButtons)buttons).getBy())
                            .click();
                    return new ContactFacePage(driver);
                default:
                    throw new IllegalArgumentException("Not implemented yet");
            }
        } else{
            throw new IllegalArgumentException("Not implemented yet");
        }
    }
}
