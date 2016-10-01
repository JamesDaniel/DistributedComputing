

import java.net.*;
import java.io.*;

/**
 * This example illustrates the basic method calls for connectionless
 * datagram socket.
 * @author M. L. Liu
 */
public class Example1Sender {

// An application which sends a message using connectionless
// datagram socket.
// Three command line arguments are expected, in order:
//    <domain name or IP address of the receiver>
//    <port number of the receiver's socket>
//    <message, a string, to send>

    public static void main(String[] args) {
        if (args.length != 3)
            System.out.println
                    ("This program requires three command line arguments");
        else {
            try {
                InetAddress receiverHost = InetAddress.getByName(args[0]);
                int receiverPort = Integer.parseInt(args[1]);

                MyDatagramSocket mySocket = new MyDatagramSocket(2001);
                mySocket.sendMessage(receiverHost, receiverPort, args[2]);
                mySocket.close();
            } // end try
            catch (Exception ex) {
                ex.printStackTrace( );
            }
        } // end else
    } // end main
} // end class
