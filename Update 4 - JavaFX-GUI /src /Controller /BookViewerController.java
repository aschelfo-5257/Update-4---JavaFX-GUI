public class BookViewerController {
    @FXML private Label titleLabel;
    @FXML private Label authorLabel;
    @FXML private TextArea contentArea;
    @FXML private Button prevButton;
    @FXML private Button nextButton;

    private List<String> pages;
    private int currentPageIndex = 0;

    public void initialize() {
        titleLabel.setText("To Kill a Mockingbird");
        authorLabel.setText("Harper Lee");

        pages = List.of(
            "This is the content of the first page. It's quite interesting!",
            "Here's the second page. More exciting things are happening here.",
            "And finally, the last page. What a journey!"
        );

        updatePageContent();

        prevButton.setOnAction(e -> showPreviousPage());
        nextButton.setOnAction(e -> showNextPage());
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
