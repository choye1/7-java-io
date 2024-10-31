package com.example.task02;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        // чтобы протестировать свое решение, вам нужно:
        // - направить файл input.test в стандартный ввод программы (в настройках запуска программы в IDE или в консоли)
        // - направить стандартный вывод программы в файл output.test
        // - запустить программу
        // - и сравнить получившийся файл output.test с expected.test
        int cur = System.in.read();;
        int next;

        while (cur != -1) {
            next = System.in.read();

            if (cur == 13 && next == 10) {
                cur = next;
                continue;
            }

            System.out.write(cur);

            cur = next;
        }

        System.out.flush();
    }
}
