package gr.aueb.cf.ch12;

/**
 * Data Class
 * POJO (Plain Old Java Object)
 * Java Bean
 */


        public class Student {
        private static int studentsCount = 0;
        private int id;
        private String firstname;
        private String lastname;


        static {
            studentsCount = 0;
        }

        public Student() {
            studentsCount++;
        }

        public Student(int id, String firstname, String lastname) {
                this.id = id;
                this.firstname = firstname;
                this. lastname = lastname;
                studentsCount++;

        }

        public static int getStudentCount() {
            return studentsCount;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getFirstname() {
            return firstname;
        }

        public void setFirstname(String firstname) {
            this.firstname = firstname;
        }

        public String getLastname() {
            return lastname;
        }

        public void setLastname(String lastname) {
            this.lastname = lastname;
        }



    //        // Default Constructor
//        public Student() {
////            id = 0;
////            firstname = null;
////            lastname = null;;
//        }
//
//
//        public int getId() {
//            return id;
//        }
//
//        public void setId(int id) {
//            this.id = id;
//        }
//
//        public String getFirstname() {
//            return firstname;
//        }
//
//        public void setFirstname(String firstname) {
//            this.firstname = firstname;
//        }
//
//        public String getLastname() {
//            return lastname;
//        }
//
//        public void setLastName(String lastname) {
//            this.lastname = lastname;
//        }


}
