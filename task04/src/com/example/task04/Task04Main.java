package com.example.task04;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;
import java.util.Locale;

public class Task04Main {
    public static void main(String[] args) throws IOException {
        // чтобы протестировать свое решение, вам нужно:
        // - направить файл input.test в стандартный ввод программы (в настройках запуска программы в IDE или в консоли)
        // - запустить программу
        // - проверить, что получилось 351.731900

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        double sum = 0.0;

        while (scanner.hasNext()) {
            if (scanner.hasNextDouble()) {
                sum += scanner.nextDouble();
            } else {
                scanner.next();
            }
        }

        System.out.printf(Locale.US,"%.6f", sum);
    }
}
