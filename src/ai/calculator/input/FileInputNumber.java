package ai.calculator.input;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileInputNumber implements CalculatorInputData {
    private static List<String> list = new ArrayList<>();
    private String stringNumber;
    private String operation;
    int indexList;
    public static void createFolder() {
//        File folder = new File("C:/Users/ANILIE/IdeaProjects/test_project/src/ai/calculator/FileInput");
        File folder = new File("./src/ai/calculator/FileInput");
        folder.mkdirs();
    }
    public static void createFile() throws IOException {
        File file = new File("./src/ai/calculator/FileInput/outputFile.txt");
        file.createNewFile();
    }

    public static void readFile() throws IOException{
        BufferedReader br = new BufferedReader(new FileReader("./src/ai/calculator/Files/inputFile.txt"));
        String line;
        while ((line = br.readLine()) != null) {
            list.add(line);
        }
        br.close();
    }
    @Override
    public String getStringNumber() throws IOException{
        readFile();
        this.stringNumber = list.get(indexList);
        indexList += 2;
        return stringNumber;
    }

    @Override
    public String getOperation() throws IOException{
        readFile();
        this.operation = list.get(indexList - 1);
        return operation;
    }
}
