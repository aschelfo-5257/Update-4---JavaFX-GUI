@FXML
private TableColumn<Book, String> titleColumn;
@FXML
private TableColumn<Book, String> authorColumn;
@FXML
private TableColumn<Book, String> isbnColumn;

@FXML
public void initialize() {
    titleColumn.setCellValueFactory(new PropertyValueFactory<>("title"));
    authorColumn.setCellValueFactory(new PropertyValueFactory<>("author"));
    isbnColumn.setCellValueFactory(new PropertyValueFactory<>("isbn"));
    bookTable.setItems(bookData);
}
