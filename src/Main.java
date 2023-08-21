// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
    LinkList linkList = new LinkList();
    linkList.insert(10);
    linkList.insert(20);
    linkList.insert(30);
        linkList.display();

        linkList.delete(20);
        linkList.display();

        linkList.insert(25);
        linkList.display();
    }
}