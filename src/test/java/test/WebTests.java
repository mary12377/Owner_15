package test;


import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class WebTests extends TestBase {
    public static void auth(String login,String password) {
        step("", () -> open("https://doramalive.ru/"));
        step("войти в личный кабинет", () -> {
            $(By.xpath("//*[@id=\"user_panel\"]/li[2]/a")).click();
            $(".form-control.login").setValue(login);
            $("#passwordShow").setValue(password);
            $(".btn.btn-danger.btn-block").click();

        });
    }
}
