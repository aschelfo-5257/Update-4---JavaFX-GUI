public class Label {

  // Inside your start method

GridPane grid = new GridPane();
grid.setPadding(new Insets(10, 10, 10, 10)); // Add padding
grid.setVgap(5); // Vertical gap between rows
grid.setHgap(5); // Horizontal gap between columns

// Title Label and TextField
Label titleLabel = new Label("Title:");
TextField titleField = new TextField();
titleField.setPromptText("Enter book title");
grid.add(titleLabel, 0, 0); // Column 0, Row 0
grid.add(titleField, 1, 0); // Column 1, Row 0

// Author Label and TextField
Label authorLabel = new Label("Author:");
TextField authorField = new TextField();
authorField.setPromptText("Enter author's name");
grid.add(authorLabel, 0, 1); // Column 0, Row 1
grid.add(authorField, 1, 1); // Column 1, Row 1

// Genre Label and ComboBox (or TextField)
Label genreLabel = new Label("Genre:");
ComboBox<String> genreComboBox = new ComboBox<>();
genreComboBox.getItems().addAll("Fiction", "Non-fiction", "Fantasy", "Science Fiction");
grid.add(genreLabel, 0, 2);
grid.add(genreComboBox, 1, 2);
}
