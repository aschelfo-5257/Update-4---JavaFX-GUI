import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.Button;
import java.util.ArrayList;
import java.util.List;

public class Scene {

    @FXML
    private Label titleLabel;

    @FXML
    private Label authorLabel;

    @FXML
    private TextArea contentArea;

    @FXML
    private Button prevButton;

    @FXML
    private Button nextButton;

    private List<String> pages;
    private int currentPageIndex = 0;

    public void initialize() {
        // Initialize book data (replace with actual book loading)
        titleLabel.setText("To Kill a Mockingbird");
        authorLabel.setText("Harper Lee");

        pages = new ArrayList<>();
        pages.add("This is the content of the first page. It's quite interesting!");
        pages.add("Here's the second page. More exciting things are happening here.");
        pages.add("And finally, the last page. What a journey!");

        updatePageContent();

        // Button actions
        prevButton.setOnAction(event -> showPreviousPage());
        nextButton.setOnAction(event -> showNextPage());
    }

    private void updatePageContent() {
        if (!pages.isEmpty()) {
            contentArea.setText(pages.get(currentPageIndex));
            prevButton.setDisable(currentPageIndex == 0);
            nextButton.setDisable(currentPageIndex == pages.size() - 1);
        } else {
            contentArea.setText("No content available.");
            prevButton.setDisable(true);
            nextButton.setDisable(true);
        }
    }

    private void showPreviousPage() {
        if (currentPageIndex > 0) {
            currentPageIndex--;
            updatePageContent();
        }
    }

    private void showNextPage() {
        if (currentPageIndex < pages.size() - 1) {
            currentPageIndex++;
            updatePageContent();
        }
    }
}
