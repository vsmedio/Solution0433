/*
Гадание на долларовый счет
Вывести на экран квадрат из 10х10 букв S используя цикл while.
Буквы в каждой строке не разделять.

Пример вывода на экран:
SSSSSSSSSS
SSSSSSSSSS
SSSSSSSSSS
SSSSSSSSSS
SSSSSSSSSS
SSSSSSSSSS
SSSSSSSSSS
SSSSSSSSSS
SSSSSSSSSS
SSSSSSSSSS


Требования:
1. Программа не должна считывать текст c клавиатуры.
2. Программа должна выводить текст на экран.
3. Программа должна выводить квадрат из 10х10 букв S
4. В программе должен использоваться цикл while.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        int i = 10;
        while (i-- > 0) {
            System.out.println("SSSSSSSSSS");
        }

    }
}
