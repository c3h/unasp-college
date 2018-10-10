import java.net.*;
import java.io.*;
public class TCPServer {
	public static void main (String args[]) {
		try{
			int serverPort = 7896; // the server port
			ServerSocket listenSocket = new ServerSocket(serverPort);
			while(true) {
				Socket clientSocket = listenSocket.accept();
				Connection c = new Connection(clientSocket);
			}
		} catch(IOException e) {
			System.out.println("Listen socket:"+e.getMessage());
			}
	}
}
class Connection extends Thread {
	DataInputStream in;
	DataOutputStream out;
	Socket clientSocket;
	public Connection (Socket aClientSocket) {
		try {
			clientSocket = aClientSocket;
			in = new DataInputStream( clientSocket.getInputStream());
			out =new DataOutputStream( clientSocket.getOutputStream());
			this.start();
		} catch(IOException e) {
			System.out.println("Connection:"+e.getMessage());
			}
	}
	public void run(){
		try {
			ContaBancaria conta = new ContaBancaria();
			String data = in.readUTF();
			if(data.contains("-")) {
				out.writeUTF("simbolo saque é:" + data);
			}else if(data.contains("+")){
				out.writeUTF("simbolo deposito é:" + data);
			}else if (data.contains("s")) {
				out.writeUTF("saber saldo é:" + data);
			}else if (data.contains("e")) {
				out.writeUTF("simbolo erro:" + data);
			}else if (data.contains("nc0001")) {
				out.writeUTF(conta.Daniel(data));
			}else if (data.contains("nc0002")) {
				out.writeUTF(conta.Isaac(data));
			}else if (data.contains("nc0003")) {
				out.writeUTF(conta.Gilson(data));
			}else if (data.contains("nc0004")) {
				out.writeUTF(conta.Mateus(data));
			}
			//out.writeUTF("linux é " + data);
		}catch (EOFException e){
			System.out.println("EOF:"+e.getMessage());
		} catch(IOException e) {
			System.out.println("readline:"+e.getMessage());
		} finally{ 
			try {
				clientSocket.close();
				}catch (IOException e){
					/*close failed*/
				}
		}
	}
}