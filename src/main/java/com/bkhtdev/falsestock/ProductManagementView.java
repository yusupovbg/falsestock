package com.bkhtdev.falsestock;

import javafx.scene.control.*;
import javafx.scene.layout.*;

public class ProductManagementView extends VBox {
    private TextField productNameField;
    private TextField productDescriptionField;
    private TextField productPriceField;
    private TextField productQuantityField;
    private Button addProductButton;

    public ProductManagementView(ProdutDataAccess productManager) {
        productNameField = new TextField();
        productDescriptionField = new TextField();
        productPriceField = new TextField();
        productQuantityField = new TextField();
        addProductButton = new Button("Add Product");

        setSpacing(10);
        getChildren().addAll(
                new Label("Product Name"),
                productNameField,
                new Label("Product Description"),
                productDescriptionField,
                new Label("Product Price"),
                productPriceField,
                new Label("Product Quantity"),
                productQuantityField,
                addProductButton
        );

        addProductButton.setOnAction(event -> {
            String name = productNameField.getText();
            String description = productDescriptionField.getText();
            double price = Double.parseDouble(productPriceField.getText());
            int quantity = Integer.parseInt(productQuantityField.getText());

            Product newProduct = new Product(name, description, price, quantity);
            productManager.addProduct(newProduct);

            // Clear form fields
            productNameField.clear();
            productDescriptionField.clear();
            productPriceField.clear();
            productQuantityField.clear();
        });
    }
}
