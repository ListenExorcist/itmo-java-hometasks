package ru.itmo.homeworks.hw10.message;

import java.util.*;

public class MessageTask {
    public static void countEachPriority(List<Message> messageList) {
        int[] counts = new int[MessagePriority.values().length];
        for (Message message : messageList) {
            counts[message.getPriority().ordinal()]++;
        }
        for (MessagePriority priority : MessagePriority.values()) {
            System.out.println(priority + ": " + counts[priority.ordinal()]);
        }
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
        return new ArrayList<Message>(new LinkedHashSet<>(messageList));
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
