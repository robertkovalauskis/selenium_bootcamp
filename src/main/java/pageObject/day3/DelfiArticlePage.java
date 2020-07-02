package pageObject.day3;

import core.BaseFunc;
import model.Article;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class DelfiArticlePage extends BaseFunc {

    public DelfiArticlePage(WebDriver driver) {
        super(driver);
    }

    Article article;

    @FindBy(how = How.XPATH, using = "//div[contains(@class, 'article-title mb-3 ')]")
    private List<WebElement> titleAndComment;

         public Article assertArticleTitleAndComment() {
        waitElementAppeared(titleAndComment);

        article = new Article();
        article.setTitle(titleAndComment.findElement(By.xpath(".//h1")).getText());

        List<WebElement> commentElements = titleAndComment.findElements(By.xpath(".//a[contains(@class,'comment-count')]"));
        if (commentElements.isEmpty()) {
            article.setCommentNumber(0);
        } else {
            article.setCommentNumber(commentElements.get(0).getText());
        }
             return article;
         }

    public List<WebElement> getTitle() {
             return title;
    }

    public Article getArticleAttributes() {
    }
}
