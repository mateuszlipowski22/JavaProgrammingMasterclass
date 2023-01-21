package section11.abstract_class_challenge_jm;

public class Main {

    public static void main(String[] args) {

        MyLinkedList linkedList = new MyLinkedList(null);
        linkedList.traverse(linkedList.getRoot());

        String stringData ="Darwin Brisbane Perth Melbourne Canberra Adelaide Sydney Canberra";

        String[] data = stringData.split(" ");
        for (String s: data) {
            linkedList.addItem(new Node(s));
        }

        linkedList.traverse(linkedList.getRoot());

    }

}
