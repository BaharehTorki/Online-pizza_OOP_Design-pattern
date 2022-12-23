package se.nackademin;

public enum PizzaAdditionalType {


    CHEESE() {
        @Override
        public int getExtraPrice() {
            return 8 ;
        }
    }, BACON() {
        @Override
        public int getExtraPrice() {
            return 10;
        }
    }, CHICKEN() {
        @Override
        public int getExtraPrice() {
            return 10;
        }
    }, OLIVE() {
        @Override
        public int getExtraPrice() {
            return 5 ;
        }
    }, MUSHROOM() {
        @Override
        public int getExtraPrice() {
            return 8 ;
        }
    }, TOMATO() {
        @Override
        public int getExtraPrice() {
            return 5 ;
        }
    };

    public abstract int getExtraPrice();
}
