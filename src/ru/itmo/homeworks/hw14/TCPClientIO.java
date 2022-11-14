package ru.itmo.homeworks.hw14;

import ru.itmo.homeworks.hw14.common.Connection;
import ru.itmo.homeworks.hw14.common.Message;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.Properties;
import java.util.Scanner;

public class TCPClientIO {
    private final String ip; // адрес сервера
    private final int port; // порт серверной программы
    private final String help = """
            /help - вывод списка команд
            /count - количество сообщений, полученных сервером от всех пользователей
            /ping - время отклика сервера
            """;


    public TCPClientIO(String ip, int port) {
        this.ip = ip;
        this.port = port;
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите имя");
        String name = scanner.nextLine();

        while (true) {
            System.out.println("Введите сообщение");
            String text = scanner.nextLine();

            if (text.equalsIgnoreCase("/exit")) {
                break;
            }

            if (text.equalsIgnoreCase("/help")) {
                System.out.println(help);
                continue;
            }

            Message message = new Message(name, text);

            try (Connection<Message> connection = new Connection<>(new Socket(ip, port))) {
                connection.sendMessage(message);
                Message fromServer = connection.readMessage();
                System.out.println("Сообщение от сервера: " + fromServer);
            } catch (IOException | ClassNotFoundException e) {
                System.out.println("Обработка IOException | ClassNotFoundException");
            } catch (Exception e) {
                System.out.println("Обработка Exception");
            }
        }
    }

    public static void main(String[] args) {
        Properties properties = new Properties();
        try (InputStream iS = TCPClientIO.class
                .getClassLoader()
                .getResourceAsStream("config.properties")) {
            properties.load(iS);
        } catch (IOException e) {
            System.out.println("Проблемы с чтением config.properties");
        }
        String ip = properties.getProperty("ip").trim();
        String[] ipParts = ip.split(".");
        for (String s : ipParts) {
            int ipPart = Integer.parseInt(s);
            if (ipPart < 0 || ipPart > 255) {
                throw new IllegalArgumentException("Invalid ip");
            }
        }
        int port = Integer.parseInt(properties.getProperty("port").trim());
        if (port < 1 || port > 65535) {
            throw new IllegalArgumentException("Invalid port");
        }
        new TCPClientIO(ip, port).run();
    }
}
