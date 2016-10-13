package test;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServer extends Thread{
	private static final int SOCKET_TIME_OUT = 1000000;
	private Socket socket;
	private ServerSocket serverSocket;
	public SocketServer(int port) {
		try {
			//实例化socket对象 并调用accept  进行监听socket
			serverSocket = new ServerSocket(port);
			serverSocket.setSoTimeout(SOCKET_TIME_OUT);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void run() {
		try {
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("Waiting for client on port  ");
		stringBuffer.append(serverSocket.getLocalPort());
		stringBuffer.append("   ...");
		System.out.println(stringBuffer);
		//接收客户端socket
			Socket socket = serverSocket.accept();
			System.out.println(socket.toString());
			String socketAddress = String.valueOf(socket.getRemoteSocketAddress());
			System.out.println("connect to address "+socketAddress);
			//获取socket输入的数据
			DataInputStream inputStream = new DataInputStream(socket.getInputStream());
			System.out.println(inputStream.readUTF());
			DataOutputStream outputStream = new DataOutputStream(socket.getOutputStream());
			outputStream.writeUTF("thank for connect to socket "+ socket.getLocalSocketAddress() + "bye.");
			socket.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//返回一个socket
	}
	public static void main(String[] args) {
		new Thread( new SocketServer(6666)).start();
	}
}
