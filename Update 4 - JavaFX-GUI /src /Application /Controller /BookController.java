import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class BookController {

    @FXML
    private TextField titleField;
    @FXML
    private TextField authorField;
    @FXML
    private TextField isbnField;
    @FXML
    private TableView<Book> bookTable;
    @FXML
    private Label messageLabel; // To display messages to the user

    private ObservableList<Book> bookData = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        // Initialize the table columns (if not done in FXML)
        // Example: bookTable.getColumns().get(0).setCellValueFactory(new PropertyValueFactory<>("title"));
        // Make sure to define columns and their cell value factories in your FXML or here
        bookTable.setItems(bookData); // Bind table to data
    }

    @FXML
    private void addBook() {
        String title = titleField.getText();
        String author = authorField.getText();
        String isbn = isbnField.getText();

        if (title.isEmpty() || author.isEmpty() || isbn.isEmpty()) {
            showAlert(AlertType.ERROR, "Error", "Please fill in all fields.");
            return;
        }

        Book newBook = new Book(title, author, isbn);
        bookData.add(newBook);
        clearFields();
        messageLabel.setText("Book added: " + newBook.getTitle());
    }

    @FXML
    private void updateBook() {
        Book selectedBook = bookTable.getSelectionModel().getSelectedItem();
        if (selectedBook == null) {
            showAlert(AlertType.WARNING, "No Selection", "Please select a book to update.");
            return;
        }

        selectedBook.setTitle(titleField.getText());
        selectedBook.setAuthor(authorField.getText());
        selectedBook.setIsbn(isbnField.getText());
        bookTable.refresh(); // Refresh the table to show updated data
        clearFields();
        messageLabel.setText("Book updated: " + selectedBook.getTitle());
    }

    @FXML
    private void deleteBook() {
        Book selectedBook = bookTable.getSelectionModel().getSelectedItem();
        if (selectedBook == null) {
            showAlert(AlertType.WARNING, "No Selection", "Please select a book to delete.");
            return;
        }
        bookData.remove(selectedBook);
        clearFields();
        messageLabel.setText("Book deleted: " + selectedBook.getTitle());
    }

    private void clearFields() {
        titleField.clear();
        authorField.clear();
        isbnField.clear();
    }

    private void showAlert(AlertType type, String title, String message) {
        Alert alert = new Alert(type);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
