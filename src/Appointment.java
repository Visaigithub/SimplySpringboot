import java.util.Date;
public class Appointment {
        private int appointmentID;
        private int patientID;
        private int doctorId;
        private Date appointmentDate;

        public Appointment(int appointmentID, Date appointmentdate, int doctorId, int patientID) {
            this.appointmentID = appointmentID;
            this.appointmentDate = appointmentDate;
            this.doctorId = doctorId;
            this.patientID = patientID;
        }

        public Appointment(int appointmentID, int patientId, int doctorId, Date appointmentDate) {
        }

        public int getAppointmentID() {
            return appointmentID;
        }

        public Date getAppointmentdate() {
            return appointmentDate;
        }

        public int getDoctorId() {
            return doctorId;
        }

        public int getPatientID() {
            return patientID;
        }

        @Override
        public String toString() {
            return "Appointment{" +
                    "appointmentID=" + appointmentID +
                    ", patientID=" + patientID +
                    ", doctorId=" + doctorId +
                    ", appointmentdate=" + appointmentDate +
                    '}';
        }

    }



