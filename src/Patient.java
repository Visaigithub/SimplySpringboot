public class Patient {
        private int id;
        private String  name;
        private int age;
        private String ailment;

        public Patient(int age, String ailment, String name, int id) {
            this.age = age;
            this.ailment = ailment;
            this.name = name;
            this.id = id;
        }

        public Patient(int age, int age1, String ailment, String name) {
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public String getAilment() {
            return ailment;
        }

        @Override
        public String toString() {
            return "Patient{" +
                    "id=" + id +
                    ", name=" + name +
                    ", age=" + age +
                    ", ailment=" + ailment +
                    '}';
        }
    }


