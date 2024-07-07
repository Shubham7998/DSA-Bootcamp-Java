public class Main {
    public static void main(String[] args) {
        LL listNode = new LL();

        listNode.insertFirst(10);
        listNode.insertFirst(30);
        listNode.insertFirst(20);
        listNode.insertFirst(40);
        listNode.insertFirst(50);

        listNode.display();
        
        System.out.println(listNode.find(50));
        listNode.display();
    }
}
