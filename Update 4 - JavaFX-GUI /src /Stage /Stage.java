public class Stage extends Application {
  
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Book Information"); // Sets the title of the stage.

        VBox root = new VBox(10); // Creates a vertical box layout with spacing.
        root.setPadding(new Insets(10)); // Adds padding around the layout.

        Label titleLabel = new Label("Title: To Kill a Mockingbird"); // Creates a label for the book title.
        Label authorLabel = new Label("Author: Harper Lee"); // Creates a label for the author.
        Label yearLabel = new Label("Year: 1984"); // Creates a label for the year.

      root.getChildren().addAll(titleLabel, authorLabel, yearLabel); // Adds labels to the layout.

        Scene scene = new Scene(root, 300, 150); // Creates a scene with the VBox layout and specified size.
        primaryStage.setScene(scene); // Sets the scene for the stage.
        primaryStage.show(); // Makes the stage visible.
    }

    public static void main(String[] args) {
        launch(args); // Launches the JavaFX application.
    }
}
