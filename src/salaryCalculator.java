import java.util.Scanner;

public class salaryCalculator {
    final static float hourlyWage = 300;

    public static void main(String[] args) {

        //Girdi alma işlemi yapılması ardından hesaplama kontrollü bir şekilde yapılması için Calculator fonksiyonu girdi parametresiyle çağrılır.
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("İşçi Kaç Saat Çalışma Saati Kaçtır? ");

            System.out.println("İşçiye Ödenecek Miktar: ₺" + Calculator(scanner.nextFloat()));
        } catch (Exception e) {
            System.out.println("Bir Hata Oluştu, Hata Mesajı: " + "\u001B[33m" + e + "\u001B[0m");
        }
    }

    //işçinin çalışma saatine göre sabit olarak belirlenen çalışma ücretinin hesaplamasını yapar
    static float Calculator(float value){
        if (value < 40) {
            return value * hourlyWage;
        } else {
            return 40 * hourlyWage + (value - 40) * (hourlyWage * 2);
        }
    }
}