package _U14;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        String[] mess={"珠穆朗玛峰的高度是多少？","亚洲有多少个国家？","西宁是哪个省的省会？"};
        Socket client=null;
        DataOutputStream out=null;
        DataInputStream in=null;
        try {
            client=new Socket("127.0.0.1",2022);
            out=new DataOutputStream(client.getOutputStream());
            in=new DataInputStream(client.getInputStream());
            for (int i = 0; i < mess.length; i++) {
                out.writeUTF(mess[i]);
                String s=in.readUTF();
                System.out.println("客户端收到服务器的回答："+s);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println("服务器已断开");
        }  finally {
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
