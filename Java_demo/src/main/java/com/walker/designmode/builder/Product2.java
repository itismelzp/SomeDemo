package com.walker.designmode.builder;

public class Product2 {


    private String partA;
    private String partB;
    private String partC;

    @Override
    public String toString() {
        return "Product: partA=" + partA + ", partB=" + partB + ", partC=" + partC;
    }

    public static class Builder {

        private final Product2 product2;

        public Builder() {
            product2 = new Product2();
        }


        public Builder setPartA(String partA) {
            product2.partA = partA;
            return this;
        }

        public Builder setPartB(String partB) {
            product2.partB = partB;
            return this;
        }

        public Builder setPartC(String partC) {
            product2.partC = partC;
            return this;
        }

        public Product2 build() {
            return product2;
        }
    }

}
