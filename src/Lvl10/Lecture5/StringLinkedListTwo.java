package Lvl10.Lecture5;

/*
 * Решая эту задачу, ты научишься извлекать элемент из двусвязного списка.
 * Мы реализовали метод add, который добавляет элементы в конец списка. Тебе нужно реализовать метод get(int), который вернет строку
 * под индексом, переданным в метод. Если строки с таким индексом нет, нужно вернуть null.
 * Помни, что first и last не имеют значений, а ссылаются только на первый и последний элемент соответственно.
 */

public class StringLinkedListTwo {
    public static void main(String[] args) {
        NewLinkedListenerTwo newLinkedListenerTwo = new NewLinkedListenerTwo();
        newLinkedListenerTwo.add("1");
        newLinkedListenerTwo.add("2");
        newLinkedListenerTwo.add("3");
        newLinkedListenerTwo.add("4");
        newLinkedListenerTwo.add("5");
        newLinkedListenerTwo.add("6");
        newLinkedListenerTwo.add("7");
        newLinkedListenerTwo.add("8");
        newLinkedListenerTwo.add("9");
        System.out.println(newLinkedListenerTwo.get(4)); // 5
    }
}

class NewLinkedListenerTwo {
    private Node first = new Node();
    private Node last = new Node();

    public void add(String value) {
        if (first.next == null) {
            Node node = new Node();
            node.value = value;
            first.next = node;
        }
        if (last.prev == null) {
            last.prev = first.next;
            return;
        }

        Node node = new Node();
        node.value = value;

        Node lastNode = last.prev;
        lastNode.next = node;
        node.prev = lastNode;
        last.prev = node;
    }

    public String get(int index) {
        Node currentElement = first.next;

        for(int i = 0; i <= index; i++) {
            if(currentElement == null) {
                return null;
            } else if (i == index) {
                return currentElement.value;
            }
            currentElement = currentElement.next;
        }
        return null;
    }

    public static class Node {
        private Node prev;
        private String value;
        private Node next;
    }
}