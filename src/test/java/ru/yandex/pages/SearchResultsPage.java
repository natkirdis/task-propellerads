package ru.yandex.pages;

import com.codeborne.selenide.ElementsCollection;
//import io.qameta.allure.Step;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.$$;

public class SearchResultsPage {

  ElementsCollection results = $$("li.serp-item");
  ElementsCollection urls = $$("div.Path b");

  //@Step("Check that there is a result with url {url}")
  public void haveUrl(String url) {
    urls.filter(exactText(url)).shouldHave(sizeGreaterThan(1));
  }

  //@Step("Check that there is at least {expectedSize} result")
  public void sizeIsAtLeast(int expectedSize) {
    results.shouldHave(sizeGreaterThan(expectedSize));
  }
}
