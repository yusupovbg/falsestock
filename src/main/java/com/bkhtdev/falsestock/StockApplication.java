package com.bkhtdev.falsestock;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class StockApplication extends Application {
    @Override
    public void start(Stage primaryStage) {
        ProdutDataAccess productManager = new ProdutDataAccess();
        StockTracker stockTracker = new StockTracker(productManager);
        ReportGenerator reportGenerator = new ReportGenerator(productManager);

        // Create UI components
        ProductManagementView productManagementView = new ProductManagementView(productManager);
        StockTrackingView stockTrackingView = new StockTrackingView(stockTracker);
        ReportGenerationView reportGenerationView = new ReportGenerationView(reportGenerator);

        // Set up layout
        HBox root = new HBox(20);
        root.getChildren().addAll(productManagementView, stockTrackingView, reportGenerationView);

        // Create scene
        Scene scene = new Scene(root, 800, 400);

        primaryStage.setTitle("Inventory Management App");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}