
    public class Drug {
        private String name;
        private String id;
        private double price;
        private int quantity;
        private boolean allowed;

    public boolean isAllowed() {
        return allowed;
    }

    public void setAllowed(boolean allowed) {
        this.allowed = allowed;
    }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public int getQuantity() {
            return quantity;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }

        public Drug() {
        }

        public Drug(String name, String id, double price, int quantity,boolean flag) {
            this.name = name;
            this.id = id;
            this.price = price;
            this.quantity = quantity;
            this.allowed = flag;
        }


        public void displayAll() {
            System.out.println("Name: " + name);
            System.out.println("ID: " + id);
            System.out.println("Price: " + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("need permission "+allowed);
        }


    }

