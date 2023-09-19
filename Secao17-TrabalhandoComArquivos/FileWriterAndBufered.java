import java.io.*;

public class FileWriterAndBufered {

    public static void main (String[] args) {

        String[] lines = new String[] {"Good morning","Good afternoon","Good night"};

        String path = "C:\\temp\\ws-learning\\.out.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }
        }

        catch (IOException e) {
            e.printStackTrace();
        }
        try (BufferedReader br =new BufferedReader(new FileReader(path))) {
            String line = br.readLine();

            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
            System.out.println("text saved");
        }
        catch (IOException e) {
            System.out.println("error: " + e.getMessage());
        }
        }
    }

