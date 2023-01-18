package section11.abstract_class_challenge;

public class MyLinkedList implements NodeList{

    protected ListItem root;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return root;
    }

    @Override
    public boolean addItem(ListItem listItem) {
        if (this.root == null) {
            this.root = listItem;
            return true;
        }

        ListItem currentItem = this.root;
        while (currentItem != null) {
            int comparison = (currentItem.compareTo(listItem));
            if (comparison < 0) {
                if (currentItem.next() != null) {
                    currentItem = currentItem.next();
                } else {
                    currentItem.setNext(listItem).setPrevious(currentItem);
                    return true;
                }
            } else if (comparison > 0) {
                if (currentItem.previous() != null) {
                    currentItem.previous().setNext(listItem).setPrevious(currentItem.previous());
                    listItem.setNext(currentItem).setPrevious(listItem);
                } else {
                    listItem.setNext(this.root).setPrevious(listItem);
                    this.root = listItem;
                }
                return true;
            } else {
                System.out.println(listItem.getValue() + " is already present, not added.");
                return false;
            }
        }
        return false;

    }

    @Override
    public boolean removeItem(ListItem listItem) {
            if (listItem != null) {
                System.out.println("Deleting item " + listItem.getValue());
            }
            ListItem currentItem = this.root;
            while (currentItem != null) {
                int comparison = currentItem.compareTo(listItem);
                if (comparison == 0) {
                    if (currentItem == this.root) {
                        this.root = currentItem.next();
                    } else {
                        currentItem.previous().setNext(currentItem.next());
                        if (currentItem.next() != null) {
                            currentItem.next().setPrevious(currentItem.previous());
                        }
                    }
                    return true;
                } else if (comparison < 0) {
                    currentItem = currentItem.next();
                } else { // comparison > 0
                    return false;
                }
            }
            return false;
    }

    @Override
    public void traverse(ListItem root) {
        if(root==null){
            System.out.println("The list is empty");
        }
    }
}
