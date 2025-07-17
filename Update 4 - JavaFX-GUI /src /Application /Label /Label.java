public class Label extends Application {

    @Override
    public void start(Stage primaryStage) {
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10));
        grid.setVgap(5);
        grid.setHgap(5);

        // Title
        Label titleLabel = new Label("Title:");
        TextField titleField = new TextField();
        titleField.setPromptText("Enter book title");
        grid.add(titleLabel, 0, 0);
        grid.add(titleField, 1, 0);

        // Author
        Label authorLabel = new Label("Author:");
        TextField authorField = new TextField();
        authorField.setPromptText("Enter author's name");
        grid.add(authorLabel, 0, 1);
        grid.add(authorField, 1, 1);

        // Genre
        Label genreLabel = new Label("Genre:");
        ComboBox<String> genreComboBox = new ComboBox<>();
        genreComboBox.getItems().addAll("Fiction", "Non-fiction", "Fantasy", "Science Fiction");
        grid.add(genreLabel, 0, 2);
        grid.add(genreComboBox, 1, 2);

        Scene scene = new Scene(grid, 400, 200);
        primaryStage.setTitle("Book Entry Form");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
  
  public static void main(String[] args) {
        launch(args);
    }
}
