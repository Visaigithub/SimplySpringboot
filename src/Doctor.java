
import java.security.PrivateKey;

    public class Doctor {
        private int id;
        private String name;
        private String specialization;

        public Doctor(int id, String specialization, String name) {
            this.id = id;
            this.specialization = specialization;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public String getSpecialization() {
            return specialization;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return "Doctor{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", specialization='" + specialization + '\'' +
                    '}';
        }
    }

