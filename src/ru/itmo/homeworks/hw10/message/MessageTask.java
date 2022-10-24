package ru.itmo.homeworks.hw10.message;

import java.util.*;

public class MessageTask {
    public static void countEachPriority(List<Message> messageList) {
        int lowPriorityMessagesCount = 0;
        int mediumPriorityMessagesCount = 0;
        int highPriorityMessagesCount = 0;
        int urgentPriorityMessagesCount = 0;
        for (Message message : messageList) {
            switch (message.getPriority()) {
                case LOW -> lowPriorityMessagesCount++;
                case MEDIUM -> mediumPriorityMessagesCount++;
                case HIGH -> highPriorityMessagesCount++;
                case URGENT -> urgentPriorityMessagesCount++;
            }
        }
        System.out.println("Low priority messages: " + lowPriorityMessagesCount);
        System.out.println("Medium priority messages: " + mediumPriorityMessagesCount);
        System.out.println("High priority messages: " + highPriorityMessagesCount);
        System.out.println("Urgent priority messages: " + urgentPriorityMessagesCount);
    }

    public static void countEachCode(List<Message> messageList) {
        int[] codes = new int[10];
        for (Message message : messageList) {
            codes[message.getCode()]++;
        }
        for (int i = 0; i < codes.length; i++) {
            if (codes[i] != 0) {
                System.out.println("Messages with code " + i + ": " + codes[i]);
            }
        }
    }

    public static void uniqueMessageCount(List<Message> messageList) {
        Set<Message> messageSet = new HashSet<>(messageList);
        System.out.println("Unique messages: " + messageSet.size());
    }

    public static List<Message> uniqueMessagesInOriginalOrder(List<Message> messageList) {
        List<Message> uniqueMessages = new ArrayList<>();
        for (Message message : messageList) {
            if (!uniqueMessages.contains(message)) {
                uniqueMessages.add(message);
            }
        }
        return new ArrayList<Message>(uniqueMessages);
    }

    public static void removeEach(List<Message> messageList, MessagePriority priority) {
        Iterator<Message> iterator = messageList.iterator();
        System.out.println(messageList);
        while (iterator.hasNext()) {
            if (iterator.next().getPriority() == priority) {
                iterator.remove();
            }
        }
        System.out.println(messageList);
    }

    public static void removeOther(List<Message> messageList, MessagePriority priority) {
        Iterator<Message> iterator = messageList.iterator();
        System.out.println(messageList);
        while (iterator.hasNext()) {
            if (iterator.next().getPriority() != priority) {
                iterator.remove();
            }
        }
        System.out.println(messageList);
    }

    public static void main(String[] args) {
        List<Message> messages = Message.generate(34);
        System.out.println(messages);
        System.out.println();
        countEachPriority(messages);
        System.out.println();
        countEachCode(messages);
        System.out.println();
        uniqueMessageCount(messages);
        System.out.println();
        System.out.println("Unique messages: " + uniqueMessagesInOriginalOrder(messages));
        System.out.println();
        removeEach(messages, MessagePriority.LOW);
        System.out.println();
        removeOther(messages, MessagePriority.URGENT);
    }
}
