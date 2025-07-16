public class MyApp extends Application {
    @Override
      public void start(Stage stage) {
          Label label = new Label("Enter name:");
          TextField input = new TextField();
          Button button = new Button("Books");
        
      button.setOnAction(e -> {
          String name = input.getText();
          label.setText("MockingBird, " + Book + "!");
      });

      VBox layout = new VBox(10, label, input, button);
        layout.setPadding(new Insets(20));

      Scene scene = new Scene(layout, 300, 150);
        stage.setScene(scene);
        stage.setTitle("New Book Application");
        stage.show();
    }
      public static void main(String[] args) {
        launch(args);
    }
}
    
