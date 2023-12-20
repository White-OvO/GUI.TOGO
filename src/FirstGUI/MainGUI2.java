package FirstGUI;

import java.util.Stack;

public class MainGUI2 extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception { 
		StackPane root = new StackPane();
		scene scene = new Scene(root, 300, 200);
		primaryStage.setScene(scene);
		primaryStage.setTitle("javaFX window");
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);

	}

		
	}
