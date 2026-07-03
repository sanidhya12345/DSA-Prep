# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def swapPairs(self, head: Optional[ListNode]) -> Optional[ListNode]:
        # 1. Initialize a dummy node to act as the "previous" node for the first pair
        dummy = ListNode(0)
        dummy.next = head
        
        # 2. Set up our pointers
        prev = dummy
        curr = head
        
        # 3. Traverse and swap as long as we have a pair of nodes
        while curr and curr.next:
            # Identify the two nodes to swap
            p1 = curr        # First node of the pair
            p2 = curr.next   # Second node of the pair
            
            # Perform the swap
            prev.next = p2   # Previous pair points to the new start of this pair
            p1.next = p2.next # First node points to the start of the next pair
            p2.next = p1     # Second node points back to the first node
            
            # Move pointers forward for the next iteration
            prev = p1        # The old first node is now the "prev" for the next pair
            curr = p1.next   # Move curr to the start of the next pair
            
        # 4. dummy.next always points to the true head of the new list
        return dummy.next