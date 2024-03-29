package section23.udp_server;

import java.io.IOException;
import java.net.*;
import java.nio.charset.StandardCharsets;

public class Main {

    public static void main(String[] args) {

        try {

            DatagramSocket socket = new DatagramSocket(5000);

            while(true){
                byte[] buffer = new byte[50];
                DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
                socket.receive(packet);
                System.out.println("Text recived is: "+new String(buffer,0,packet.getLength()));

                String returnString = "echo : "+new String(buffer,0,packet.getLength());
                byte[] buffer2 = returnString.getBytes(StandardCharsets.UTF_8);
                InetAddress address = packet.getAddress();
                int port = packet.getPort();
                packet= new DatagramPacket(buffer2, buffer2.length, address, port);
                socket.send(packet);

            }

        }catch (SocketException e){
            System.out.println("Socket exception "+e.getMessage());
        }catch (IOException e){
            System.out.println("IO Exception "+e.getMessage());
        }

    }
}
