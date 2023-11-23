package com.bkhtdev.falsestock;

import javafx.scene.control.*;
import javafx.scene.layout.*;

public class ReportGenerationView  extends  VBox {
    private ReportGenerator reportGenerator;
    private TextArea reportTextArea;
    private Button generateReportButton;

    public ReportGenerationView(ReportGenerator reportGenerator) {
        this.reportGenerator = reportGenerator;

        // Initialize UI components
        reportTextArea = new TextArea();
        reportTextArea.setEditable(false);
        generateReportButton = new Button("Generate Report");

        // Set up layout
        setSpacing(10);
        getChildren().addAll(
                new Label("Product Report:"),
                reportTextArea,
                generateReportButton
        );

        // Set up event handling
        generateReportButton.setOnAction(event -> {
            reportTextArea.setText(reportGenerator.generateReport());
        });
    }
}
