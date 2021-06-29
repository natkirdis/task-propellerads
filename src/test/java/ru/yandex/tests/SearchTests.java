package ru.yandex.tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import ru.yandex.app.Application;

public class SearchTests {
  protected static final Application app = new Application();

  @BeforeEach
  public void preconditions() {
    app.yandex().openPage();
    app.yandex().searchFor("propellerads");
  }

  @Test
  public void testResultsExistOnTheSearchPage() {
    app.results().sizeIsAtLeast(1);
  }

  @ParameterizedTest
  @ValueSource(strings = {"propellerads.com", "my.propellerads.com"})
  public void testUrlsExistOnTheSearchPage(String url) {
    app.results().haveUrl(url);
  }

}
