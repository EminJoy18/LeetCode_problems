/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.math.BigInteger;
class Solution 
{
    // static long reverse(long num, int len)
    // {
    //     String s = Long.toString(num);
    //     long n = 0;

    //     for(int i = s.length()-1 ; i>=0 ; i--)
    //     {
    //         n = n * 10 + (s.charAt(i) - 48);
    //     }
    //     System.out.println("Number = "+n);
    //     System.out.println("Length = "+(Long.toString(n)).length());
    //     System.out.println("Actual length = "+len);

    //     if(len != (Long.toString(n)).length())
    //     {
    //         //to adjust for leading zeros
    //         for(int i=1 ; i<=(len - (Long.toString(n)).length()) ; i++)
    //         {
    //             n  = n * 10;
    //         }
    //     }
        
    //     return n;
    // }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) 
    {
        ListNode head1 = l1;
        ListNode head2 = l2;

        ArrayList<Integer> one = new ArrayList<Integer>();
        ArrayList<Integer> two = new ArrayList<Integer>();

        BigInteger num1 = new BigInteger("0");
        BigInteger num2 = new BigInteger("0");

        //finding the number from the linkedlist
        while(head1 != null)
        {
            // num1 = num1 * 10 + head1.val;
            one.add(head1.val);
            head1 = head1.next;
        }
        while(head2 != null)
        {
            // num2 = num2 * 10 + head2.val;
            two.add(head2.val);
            head2 = head2.next;
        }
        // int len1 = (Long.toString(num1)).length();
        // int len2 = (Long.toString(num2)).length();

        // System.out.println(one+"\n"+two);

        Collections.reverse(one); Collections.reverse(two);

        System.out.println(one+"\n"+two);

        // num1 = reverse(num1, len1) + reverse(num2, len2);
        BigInteger ten = new BigInteger("10");

        for(int i:one)
        {
            BigInteger m = new BigInteger(Integer.toString(i));
            num1 = (num1.multiply(ten)).add(m);
        }
        for(int i:two)
        {
            BigInteger m = new BigInteger(Integer.toString(i));
            num2 = (num2.multiply(ten)).add(m);
        }
        // System.out.println(num1);
        // System.out.println(num2);
        num1 = num1.add(num2);

        String s = num1.toString();
        int k = s.length()-1;
        ListNode head = new ListNode();
        head.val = s.charAt(k--) - 48;
        head.next = null;

        ListNode start = head;

        for(int i = k ; i>=0 ; i--)
        {
            ListNode n = new ListNode();
            n.val = (int)(s.charAt(i) - 48);
            n.next = null;
            start.next = n;
            start = n;
        }
        return head;
    }
}
