import java.util.Scanner;

public class tugasmodul1
{
    static Scanner tugas = new Scanner(System.in);

    public static void main(String[] args)
    {
        int Pilihan;

        do
        {
            System.out.println("===== Library System =====");
            System.out.println("1. Login as a Student");
            System.out.println("2. Login as a Admin");
            System.out.println("3. Exit");
            System.out.print("Choose option (1-3) : ");
            Pilihan = tugas.nextInt();

            switch (Pilihan)
            {
                case 1:
                    JikaMurid();
                    break;
                case 2:
                    JikaAdmin();
                    break;
                case 3:
                    System.out.println("さようなら \nSayonara");
                    break;
                default:
                    System.out.println("Invalid option. Please choose again.");
            }

        }
        while (Pilihan != 3);
    }

    private static void JikaMurid()
    {
        System.out.print("Enter your NIM: ");
        String nim = tugas.next();

        if (isValidStudentNIM(nim)) {
            System.out.println("Successful Login as a Student");
        }
        else {
            System.out.println("User Not Found");
        }
    }

    private static boolean isValidStudentNIM(String nim)
    {
        return nim.length() == 15 && nim.matches("\\d+"); //("[0-9]+");
    }

    private static void JikaAdmin()
    {
        System.out.print("Enter your username (admin): ");
        String username = tugas.next();

        System.out.print("Enter your password (admin): ");
        String password =tugas.next();

        if (isValidAdmin(username, password)) {
            System.out.println("Successful Login as a Admin");
        } else {
            System.out.println("Admin User Not Found");
        }
    }

    private static boolean isValidAdmin(String username, String password)
    {
        return username.length() == 5 && password.length() == 5;
    }
}
