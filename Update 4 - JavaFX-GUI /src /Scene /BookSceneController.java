import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class BookSceneController {

    @FXML
    private Label titleLabel;

    @FXML
    private ImageView coverImageView;

    @FXML
    private TextArea descriptionTextArea;

    public void setBookDetails(String title, String coverImagePath, String description) {
        titleLabel.setText(title);

        if (coverImagePath != null && !coverImagePath.isEmpty()) {
            try {
                Image image = new Image(getClass().getResourceAsStream(coverImagePath));
                coverImageView.setImage(image);
            } catch (Exception e) {
                System.err.println("Error loading image: " + coverImagePath);
                e.printStackTrace();
            }
        } else {
            coverImageView.setImage(null); // Clear image if no path provided
        }

        descriptionTextArea.setText(description);
    }
}
