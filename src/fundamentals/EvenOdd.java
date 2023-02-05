package fundamentals;
public class Solution {

    public static LinkedListNode<Integer> mergeInBetween(LinkedListNode<Integer> list1, int a, int b, LinkedListNode<Integer> list2) {
        LinkedListNode<Integer> left = list1;
        for (int i = 1; i < a; i++)
            left = left.next;
        
        LinkedListNode<Integer> middle = left;
        for (int i = a; i <= b; i++)
            middle = middle.next;
        
        left.next = list2;
        while (list2.next != null)
            list2 = list2.next;
        
        list2.next = middle.next;
        return list1;
    }

}