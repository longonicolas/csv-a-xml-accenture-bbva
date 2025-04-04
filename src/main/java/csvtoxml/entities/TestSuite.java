package csvtoxml.entities;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
public class TestSuite {
    public static void wrapWithTestSuite(String inputPath, String outputPath) {
        try {
            // Leer todo el contenido del archivo XML original
            String content = new String(Files.readAllBytes(Paths.get(inputPath)));

            String xmlHeader = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>";

            if (!content.startsWith(xmlHeader)) {
                throw new IllegalArgumentException("El archivo no contiene un encabezado XML válido.");
            }

            String xmlBody = content.substring(xmlHeader.length()).trim();

            // Definir correctamente el namespace ns2 dentro de la etiqueta
            String wrappedContent = xmlHeader + "\n" +
                    "<ns2:test-suite xmlns:ns2=\"urn:model.allure.qatools.yandex.ru\" ns2=\"12345\" start=\"1741374521042\" stop=\"1741374539822\">\n" +
                    "    <name>DWP</name>\n" +
                    "    <title>DWP</title>\n" +
                    xmlBody + "\n" +
                    "</ns2:test-suite>";

            Files.write(Paths.get(outputPath), wrappedContent.getBytes());

            System.out.println("Archivo guardado en: " + outputPath);
        } catch (IOException e) {
            System.err.println("Error al procesar el archivo: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }
}