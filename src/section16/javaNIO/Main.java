package section16.javaNIO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;

public class Main {

    public static void main(String[] args) {

        try (FileOutputStream binFile = new FileOutputStream("data.dat");
            FileChannel binChannel = binFile.getChannel()) {

            ByteBuffer buffer = ByteBuffer.allocate(100);

//            byte[] outputByte = "Hello World".getBytes(StandardCharsets.UTF_8);
//            byte[] outputByte2 = "Nice to meet you".getBytes(StandardCharsets.UTF_8);
//            buffer.put(outputByte).putInt(1).putInt(212).put(outputByte2).putInt(2122132);
//            buffer.flip();

            byte[] outputByte = "Hello World".getBytes(StandardCharsets.UTF_8);
            buffer.put(outputByte);
            long int1Pos = outputByte.length;
            buffer.putInt(1);
            long int2Pos = int1Pos+Integer.BYTES;
            buffer.putInt(212);
            byte[] outputByte2 = "Nice to meet you".getBytes(StandardCharsets.UTF_8);
            buffer.put(outputByte2);
            long int3Pos = int2Pos+Integer.BYTES+outputByte2.length;
            buffer.putInt(2122132);
            buffer.flip();

            binChannel.write(buffer);

            RandomAccessFile ra = new RandomAccessFile("data.dat","rwd");
            FileChannel channel = ra.getChannel();
            ByteBuffer readChannel = ByteBuffer.allocate(100);
            channel.read(readChannel);
            readChannel.flip();
            byte[] inputString = new byte[outputByte.length];
            readChannel.get(inputString);
            System.out.println("inputString ="+new String(inputString));
            System.out.println("int1 = "+readChannel.getInt());
            System.out.println("int2 = "+readChannel.getInt());
            byte[] inputString2 = new byte[outputByte2.length];
            readChannel.get(inputString2);
            System.out.println("inputString2 ="+new String(inputString2));
            System.out.println("int3 = "+readChannel.getInt());



//            ByteBuffer buffer = ByteBuffer.allocate(outputByte.length);
//            buffer.put(outputByte);
//
//            buffer.flip();
//            int numBytes = binChannel.write(buffer);
//            System.out.println("numBytes written was: " + numBytes);
//
//            ByteBuffer intBuffer = ByteBuffer.allocate(Integer.BYTES);
//            intBuffer.putInt(245);
//            intBuffer.flip();
//            numBytes = binChannel.write(intBuffer);
//            System.out.println("numBytes written was: " + numBytes);
//
//            intBuffer.flip();
//            intBuffer.putInt(-232245);
//            intBuffer.flip();
//            numBytes = binChannel.write(intBuffer);
//            System.out.println("numBytes written was: " + numBytes);
//
////            FileInputStream file = new FileInputStream("data.txt");
////            FileChannel channel = file.getChannel();
//
////            Path dataPath = FileSystems.getDefault().getPath("data.txt");
////            Files.write(dataPath,"\nLine 5".getBytes(StandardCharsets.UTF_8), StandardOpenOption.APPEND);
////            List<String> lines = Files.readAllLines(dataPath);
////            for(String line : lines){
////                System.out.println(line);
////            }
//
//
//            RandomAccessFile ra = new RandomAccessFile("data.dat", "rwd");
//            FileChannel channel = ra.getChannel();
//            outputByte[0] = 'a';
//            outputByte[1] = 'b';
//            buffer.flip();
//            long numBytesRead = channel.read(buffer);
//            if(buffer.hasArray()){
//                System.out.println("byte buffer = " + new String(buffer.array()));
////                System.out.println("byte buffer = " + new String(outputByte));
//            }
//
//            // Absolute read
//                        intBuffer.flip();
//                        numBytesRead = channel.read(intBuffer);
//                        System.out.println(intBuffer.getInt(0));
//                        intBuffer.flip();
//                        numBytesRead = channel.read(intBuffer);
//                        System.out.println(intBuffer.getInt(0));
//                        System.out.println(intBuffer.getInt());
//
//
//            // Relative read
//            //            intBuffer.flip();
//            //            numBytesRead = channel.read(intBuffer);
//            //            intBuffer.flip();
//            //            System.out.println(intBuffer.getInt());
//            //            intBuffer.flip();
//            //            numBytesRead = channel.read(intBuffer);
//            //            intBuffer.flip();
//            //            System.out.println(intBuffer.getInt());
//
//            channel.close();
//            ra.close();
////           System.out.println("Output bytes = "+ new String(outputByte));
//
////            RandomAccessFile ra = new RandomAccessFile("data.dat", "rwd");
////            byte[] b = new byte[outputByte.length];
////            ra.read(b);
////            System.out.println(new String(b));
////
////            long int1 = ra.readInt();
////            long int2 = ra.readInt();
////
////            System.out.println(int1);
////            System.out.println(int2);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
