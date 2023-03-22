package _U14;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        String[] answer={"峰顶海拔8844.43米", "48个", "青海省"};
        ServerSocket server=null;
        Socket client=null;
        DataOutputStream out=null;
        DataInputStream in=null;
        try {
            server=new ServerSocket(2022);

        } catch (IOException e) {
            System.out.println("端口号被占用："+e.getMessage());
        }
        try {
            System.out.println("等待客户端呼叫");
            client=server.accept();
            System.out.println("客户的地址："+client.getInetAddress());
            System.out.println("客户的端口："+client.getPort());
            out=new DataOutputStream(client.getOutputStream());
            in=new DataInputStream(client.getInputStream());
            for (int i = 0; i < answer.length; i++) {
                String s=in.readUTF();
                System.out.println("服务器收到客户端的提问："+s);
                out.writeUTF(answer[i]);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println("客户端已断开");
        } finally {
            try {
                if (in!=null) in.close();
                if (out!=null) out.close();
                if (client!=null) client.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
