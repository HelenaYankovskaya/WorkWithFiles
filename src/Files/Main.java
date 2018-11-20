package Files;

import java.io.*;


public class Main {
                                          // Задание 30 стр 76 рабочая тетрадь
        public static void main(String[] args) throws IOException, NullPointerException {
            BufferedInputStream bufferedInputStream;
            try {
                bufferedInputStream = new BufferedInputStream(new FileInputStream("./test_file.txt"));
            } catch (FileNotFoundException e) {
                System.out.print("File not found");
                return;
            }
            bufferedInputStream.close();

            BufferedReader bufferedReader;
            try
            {
                bufferedReader =new BufferedReader(new FileReader("./test_file.txt"));
                String res=bufferedReader.readLine();
                String res2 = res;
                while (res2!=null)
                {
                    System.out.println(res2);
                    res2=bufferedReader.readLine();
                }
                bufferedReader.close();
                String str2 = res.trim();
                int n = 0;
                char symbol;
                for (int i = 0; i < str2.length(); i++) {
                    symbol = str2.charAt(i);
                    if (symbol == ',' || symbol == '!' || symbol == '?' || symbol == '.') {
                        n++;
                    }
                }    System.out.println("Знаков препинания:" +n);


                String[] words = str2.split("[\\s,.:!?-]+");
                System.out.println("Слов в файле: " + words.length);

            }
            catch (FileNotFoundException e)
            {
                System.out.print("File nod found");
            }
        }
        }







