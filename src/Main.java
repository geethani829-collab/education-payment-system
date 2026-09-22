import java.util.Scanner;

    class Project1
    {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter Student ID : ");
            int inputId = scanner.nextInt();

            // Variables to hold the details we find
            String name = "Akila";
            String course = "Maths";
            double coursefee = 10000.00;
            String status = "PAID";
            boolean found = true;

            // "Database" logic using switch
            switch (inputId) {
                case 101:
                    name = "Kasuni Sara";
                    course = "ICT101";
                    coursefee = 10000.00;
                    status = "PAID";
                    break;
                case 102:
                    name = "Senuli Malki";
                    course = "Math102";
                    coursefee = 10000.00;
                    status = "PAID";
                    break;
                case 103:
                    name = "Safra Aisha";
                    course = "ICT101";
                    coursefee = 10000.00;
                    status = "PAID";
                    break;
                case 104:
                    name = "Aloka Nirmal";
                    course = "MATH102";
                    coursefee = 10000.00;
                    status = "UNPAID";
                    break;
                case 105:
                    name = "Mohomad Nazim";
                    course = "ENG103";
                    coursefee = 10000.00;
                    status = "UNPAID";
                    break;
                default:
                    found = false;
            }
            // Print results
            if (found) {
                System.out.println("\n--- Student Details Found ---");
                System.out.println("S_ID: " + inputId);
                System.out.println("S_Name: " + name);
                System.out.println("Course_Code: " + course );
                System.out.println("coursefee: " + coursefee);
                System.out.println("Status: " + status);
            } else {
                System.out.println("Error: Student ID " + inputId + " not found in our records.");
            }
            scanner.close();
        }
    }


