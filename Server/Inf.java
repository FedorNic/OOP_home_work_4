package Home_Tasks.HT_10.Server;

import java.io.*;

public class Inf {
    private PrintWriter writer;

    private String www;

    public Inf(PrintWriter writer, String www) {
        this.writer = writer;
        this.www = www;
    }

    public void getTotal(String serv) {
        serv = this.www + serv;
        try {
            File file = new File(new File(serv).getAbsolutePath());
            if (file.exists() && file.isFile()) {
                BufferedReader bufReader = new BufferedReader(new FileReader(file));
                String str = null;
                try {
                    this.writer.println("HTTP/1.1 200 OK");
                    this.writer.println("Content-Type: text/html; charset=utf-8");
                    this.writer.println();
                    while ((str = bufReader.readLine()) != null) {
                        this.writer.println(str);
                    }
                    this.writer.flush();
                } catch (Exception e) {
                    System.out.println(e.getLocalizedMessage());
                } finally {
                    bufReader.close();
                }
            } else {
                writer.println("HTTP/1.1 404 Not Found");
                writer.println("Content-Type: text/html; charset=utf-8");
                writer.println();
                writer.flush();
            }
        } catch (IOException e) {
            System.out.println(e.getLocalizedMessage());
        }
    }
}
