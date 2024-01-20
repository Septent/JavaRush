package Lvl10.Lecture5;

/*
 * Пришло время познакомиться с двусвязным списком. Решая эту задачу ты поймешь, как работает двусвязный список и сможешь добавлять
 * в него элементы. У тебя есть класс StringLinkedList, в котором есть поля first и last, указывающие на первый и последний элемент
 * соответственно.
 * Тебе нужно реализовать логику метода add, который будет добавлять элементы в список.
 */

public class StringLinkedList {
    public static void main(String[] args) {
        NewLinkedList newLinkedList = new NewLinkedList();
        newLinkedList.add("1");
        newLinkedList.add("2");
        newLinkedList.add("3");
        newLinkedList.add("4");
        newLinkedList.add("5");
        newLinkedList.add("6");
        newLinkedList.add("7");
        newLinkedList.add("8");
        newLinkedList.add("9");
        newLinkedList.printAll();
    }
}

class NewLinkedList {
    private Node first = new Node();
    private Node last = new Node();
    private static int count = 0;

    public void printAll() {
        Node currentElement = first.next;
        while ((currentElement) != null) {
            System.out.println(currentElement.value);
            currentElement = currentElement.next;
        }
    }

    public void add(String value) {
        if (count == 0) {
            Node newNode = new Node();
            first.next = newNode;
            last.prev = newNode;
            newNode.value = value;
            newNode.prev = null;
            newNode.next = null;
        } else {
            Node newNode = new Node();
            newNode.value = value;
            newNode.next = null;
            newNode.prev = last.prev;
            

            last.prev = newNode;
        }
        count++;
    }

    public static class Node {
        private Node prev;
        private String value;
        private Node next;
    }
}