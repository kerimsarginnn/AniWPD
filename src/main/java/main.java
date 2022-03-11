import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int i = 0;
        Boolean x;
        int y;
        int z;
        System.out.printf("Kaç adet görsel indirilsin? ");
        Scanner scanner  = new Scanner(System.in);
        z = scanner.nextInt()+5;
        String data = "https://pic.re/image";
        for (y=5;y<z;y++) {
            i++;
            try {
                InputStream stream = new URL(data).openStream();
                Files.copy(stream, Paths.get("/home/kerim/Masaüstü/AniWPData/Gorsel_%i%".replace("%i%",String.valueOf(i))));
                System.out.println("Görsel %i%, başarıyla kaydedildi.".replace("%i%",String.valueOf(i)));
            } catch (MalformedURLException e) {
                // STOPSHIP: 11.03.2022
            } catch (IOException e) {
                x = false;
                while (!x) {
                    i++;
                    try {
                        InputStream stream = new URL(data).openStream();
                        Files.copy(stream, Paths.get("/home/kerim/Masaüstü/AniWPData/Gorsel_%i%".replace("%i%",String.valueOf(i))));
                        System.out.println("Görsel %i%, başarıyla kaydedildi.".replace("%i%",String.valueOf(i)));
                        x = true;
                    } catch (MalformedURLException urlException) {
                        // STOPSHIP: 11.03.2022
                    } catch (IOException ioException) {
                        // STOPSHIP: 11.03.2022
                    }
                }
            }
        }
    }
}
