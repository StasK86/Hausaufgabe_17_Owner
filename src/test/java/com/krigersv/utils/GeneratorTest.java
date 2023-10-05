package com.krigersv.utils;

import java.util.List;

public class GeneratorTest {
    private final RandomTest randomTest = new RandomTest();
    public String
            insertion = randomTest.getRandomLetterSelection(),
            enteringTasks = randomTest.getRandomCity(),
            city = randomTest.getRandomCitySelection(),
            bank = randomTest.getRandomBank(),
            name = randomTest.getRandomName(),
            number = randomTest.getRandomNumber();

    public List<String>
            baseSection = List.of("Переводы  с карты на карту", "Снятие наличных в банкоматах",
            "1% кэшбэк при оплате  #картакарта"),
            checks = List.of("Досрочное погашение Погашайте кредит досрочно в любое удобное для вас время",
                    "Всего один документ (удостоверение личности)", "Удобные способы погашения В мобильном приложении BCC.KZ, банкоматах и терминалах Банка и Kassa24",
                    "Кредит наличными это выдаваемый физическим лицам без залогового обеспечения, без предоставления справки о заработной плате и без указания цели кредитования.");
}
