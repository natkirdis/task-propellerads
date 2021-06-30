package ru.yandex.tests;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import ru.yandex.app.Application;

public class SearchTests {
  protected static final Application app = new Application();

  @BeforeEach
  @Description("Open yandex page. Enter 'propellerads' in search bar")
  public void preconditions() {
    app.yandex().openPage();
    app.yandex().searchFor("propellerads");
  }

  @Test
  @Severity(SeverityLevel.CRITICAL)
  @Description("Check that there is at least one result")
  public void testResultsExistOnTheSearchPage() {
    app.results().sizeIsAtLeast(1);
  }

  @ParameterizedTest
  @ValueSource(strings = {"propellerads.com", "my.propellerads.com"})
  @Severity(SeverityLevel.CRITICAL)
  @Description("Check that there propellerads sites are found")
  public void testUrlsExistOnTheSearchPage(String url) {
    app.results().haveUrl(url);
  }
}
