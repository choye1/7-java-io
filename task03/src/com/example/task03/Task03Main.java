package com.example.task03;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

public class Task03Main {
    public static void main(String[] args) throws IOException {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        /*
        System.out.println(readAsString(new FileInputStream("task03/src/com/example/task03/input.test"), Charset.forName("KOI8-R")));
        */
    }

    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {

        if(inputStream == null || charset == null){
            throw new IllegalArgumentException("Input stream or charset are null");
        }

        InputStreamReader reader = new InputStreamReader(inputStream, charset);
        StringBuilder stringBuilder = new StringBuilder();

        int c = reader.read();

        while(c != -1)
        {
            stringBuilder.append((char)c);
            c = reader.read();

        }

        return stringBuilder.toString();
    }
}
