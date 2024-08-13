package section9;

     enum FuelType {
        BENZIN("بنزین"),
        DIESEL("دیزل"),
        BENZIN_SEFID("بنزین سفید");

        private final String persianName;

        FuelType(String persianName) {
            this.persianName = persianName;
        }

        public  String getName() {
            return persianName;
        }

        @Override
        public String toString() {
            return persianName;
        }
    }