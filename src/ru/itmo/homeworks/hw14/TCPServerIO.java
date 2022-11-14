package ru.itmo.homeworks.hw14;

import ru.itmo.homeworks.hw14.common.Connection;
import ru.itmo.homeworks.hw14.common.Message;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalDateTime;

public class TCPServerIO {
    private int port;
    private int count = 0;

    public TCPServerIO(int port) {
        this.port = port;
    }

    public void run() {
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Сервер запущен");
            while (true) {
                Socket socket = serverSocket.accept();

                Connection<Message> connection = new Connection<>(socket);

                Message fromClient = connection.readMessage();
                System.out.println("От клиента: " + fromClient);
                Message message = new Message("Server", "сообщение получено");
                switch (fromClient.getText().trim().toLowerCase()) {
                    case "/count":
                        message.setText("сообщений получено: " + count);
                        connection.sendMessage(message);
                        break;
                    case "/ping":
                        message.setText("время отклика: " + (LocalDateTime.now().getNano() - fromClient.getDateTime().getNano()) + " нс");
                        connection.sendMessage(message);
                        break;
                    default:
                        connection.sendMessage(message);
                        count++;
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Обработка IOException | ClassNotFoundException");
        }
    }

    public static void main(String[] args) {
        int port = Integer.parseInt(args[0]);
        if (port < 1 || port > 65535) {
            throw new IllegalArgumentException("Invalid port");
        }
        new TCPServerIO(port).run();
    }
}
