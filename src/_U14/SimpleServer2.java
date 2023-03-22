package _U14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleServer2 {
    public static final int SERVERPORT=9999;
    public static void main(String[] args) {
        try {
            ServerSocket s = new ServerSocket(SERVERPORT);
            System.out.println("Server started!");
            int number = 1;
            while (true) {
                Socket incoming = s.accept();
                System.out.println("Connection" + number + " accepted");
                new EchoThread(incoming, number).run();
                number++;
            }
        } catch (IOException e) {
            System.out.println("IOException");
        }
    }
}
class EchoThread extends Thread {
    private Socket s;
    private int counter;

    public EchoThread(Socket s, int counter) {
        this.s = s;
        this.counter = counter;
    }

    public void run() {
        try {
            BufferedReader in=new BufferedReader(
                    new InputStreamReader(s.getInputStream())
            );
            PrintWriter out=new PrintWriter(s.getOutputStream(),true);
            out.println("hello! Enter BYE to exit.");
            while (true) {
                String line=in.readLine();
                if(line.trim().equals("")) continue;
                if(line.trim().equalsIgnoreCase("BYE")) break;
                else {
                    System.out.println("Echo"+counter+": "+line);
                    out.println("Receive: "+line);
                }
            }

            in.close();
            out.close();
            s.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
