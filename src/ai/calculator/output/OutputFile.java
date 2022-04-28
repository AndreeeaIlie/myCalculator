package ai.calculator.output;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class OutputFile implements OutputInterface{
    @Override
    public void outputResult(double result) throws IOException{
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("./src/ai/calculator/Files/outputFile.txt"));
        String fileResult = String.valueOf(result);
        bufferedWriter.write(fileResult);
        bufferedWriter.close();
    }
}
