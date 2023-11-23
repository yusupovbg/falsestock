package com.bkhtdev.falsestock;

public class StockTracker {
    private ProdutDataAccess productManager = new ProdutDataAccess();

    public StockTracker(ProdutDataAccess productManager) {
        this.productManager = productManager;
    }

    public int getStocksLevel() {
        int sum = productManager.getProducts().stream().mapToInt(p -> p.getQuantity()).sum();
        return sum;
    }


}
