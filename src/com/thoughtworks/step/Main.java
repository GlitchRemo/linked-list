package com.thoughtworks.step;

public class Main {
  public static <T> LinkedList<T> createLinkedList(T[] arr) {
    LinkedList<T> linkedList = LinkedList.create();
    for (T element : arr) linkedList.push(element);
    return linkedList;
  }

  public static void printLinkedList(LinkedList<?> linkedList) {
    System.out.println("Linked List: " + linkedList);
  }

  public static void main(String[] args) {
    LinkedList<Integer> integers = createLinkedList(new Integer[]{ 1 });
    printLinkedList(integers);

    integers.insert(0, 10);
    printLinkedList(integers);

    integers.insert(1, 20);
    printLinkedList(integers);

    integers.unshift(3);
    printLinkedList(integers);

    integers.remove();
    printLinkedList(integers);

    System.out.println(integers.size());

    LinkedList<String> strings = createLinkedList(new String[]{ "riya", "sauma", "milan" });
    printLinkedList(strings);
    strings.remove();
    printLinkedList(strings);
  }
}
