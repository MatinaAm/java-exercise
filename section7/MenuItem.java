package section7;

public class MenuItem {




        private String name;
        private double price;
        private double rating;

        public MenuItem(String name, double price, double rating) {
            this.name = name;
            this.price = price;
            this.rating = rating;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return "Name: " + name + ", Price: " + price + ", Rating: " + rating;
        }
    }

    class Restaurant {
        private MenuItem[] menu;
        private int itemCount;

        public Restaurant() {
            menu = new MenuItem[10]; // ظرفیت اولیه
            itemCount = 0;
        }

        public void addItem(String name, double price, double rating) {
            // بررسی وجود آیتم تکراری
            for (int i = 0; i < itemCount; i++) {
                if (menu[i].getName().equalsIgnoreCase(name)) {
                    System.out.println("آیتم با نام '" + name  +"' قبلاً در منو موجود است.");
                    return;
                }
            }
            if (itemCount == menu.length) {
                System.out.println("منو پر است، امکان افزودن آیتم جدید وجود ندارد.");
                return;
            }
            menu[itemCount] = new MenuItem(name, price, rating);
            itemCount++;
            System.out.println("آیتم افزوده شد: " + name);
        }

        public void removeItem(String name) {
            for (int i = 0; i < itemCount; i++) {
                if (menu[i].getName().equalsIgnoreCase(name)) {
                    menu[i] = menu[itemCount - 1]; // جایگزینی با آخرین آیتم
                    menu[itemCount - 1] = null; // حذف آخرین آیتم
                    itemCount--;
                    System.out.println("آیتم حذف شد: " + name);
                    return;
                }
            }
            System.out.println("آیتم با نام '" + name + "' در منو یافت نشد.");
        }

        public void printMenu() {
            if (itemCount == 0) {
                System.out.println("منو خالی است.");
            } else {
                System.out.println("منو:");
                for (int i = 0; i < itemCount; i++) {
                    System.out.println(menu[i]);
                }
            }
        }

        public static void main(String[] args) {
            Restaurant restaurant = new Restaurant();
            restaurant.addItem("قورمه سبزی", 8.99, 4.5);
            restaurant.addItem("کباب", 5.99, 4.0);
            restaurant.addItem("پاستا", 7.49, 4.2);
            restaurant.addItem("پاستا", 7.49, 4.2);
            restaurant.printMenu();
            restaurant.removeItem("پاستا");
            restaurant.printMenu();
        }
    }


