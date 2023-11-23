package com.bkhtdev.falsestock;

public class ReportGenerator {
    private ProdutDataAccess productManager = new ProdutDataAccess();

    public ReportGenerator(ProdutDataAccess productManager) {
        this.productManager = productManager;
    }

    public String generateReport() {
        StringBuilder report = new StringBuilder();
        for (Product product : productManager.getProducts()) {
            report.append(product.getName()).append(" - Quantity: ").append(product.getQuantity()).append("\n");
        }
        return report.toString();
    }
}
