package org.it.web.util.requestpython;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Templer{
    public static String sendcomment(String msg,int port){
        Connecter con= new Connecter(port);
        PrintStream javaout = con.getJavaout();
        javaout.print(msg);
        javaout.print("over");
        // 获取服务进程的输入流
        Socket socket = con.getSocket();
        InputStream is = null;
        try {
            is = socket.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is,"utf-8"));
            String tmp = null;
            StringBuilder st = new StringBuilder();
            // 读取内容
            while((tmp=br.readLine())!=null)
                st.append(tmp).append('\n');
            if(socket!=null)
            {socket.close();}
            return st.toString();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if(socket!=null)
                {socket.close();}
            } catch (Exception e) {}
            System.out.println("远程接口调用结束.端口:"+port);
        }
        return null;
    }
}
