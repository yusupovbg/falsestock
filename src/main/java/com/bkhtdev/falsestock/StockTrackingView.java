package com.bkhtdev.falsestock;

import javafx.scene.control.*;
import javafx.scene.layout.*;

public class StockTrackingView extends VBox {
    private StockTracker stockTracker;
    private Label stockLevelLabel;

    public StockTrackingView(StockTracker stockTracker) {
        this.stockTracker = stockTracker;
        stockLevelLabel = new Label();

        setSpacing(10);
        getChildren().addAll(
                new Label("Stock Level:"),
                stockLevelLabel
        );

        updateStockLevelLabel();
    }

    private void updateStockLevelLabel() {
        stockLevelLabel.setText(Integer.toString(stockTracker.getStocksLevel()));
    }
}
