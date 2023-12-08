Algorithm: Reverse Linked List

Input: Head of the original linked list

Output: Head of the reversed linked list

1. Initialize three pointers:
    - current (initialized to the head of the original list)
    - prev (initialized to null)
    - next (initialized to null)

2. Traverse the linked list:\
a. While the current pointer is not null:
   * i.   Set next pointer to the next node of the current node.
   * ii.  Update the next of the current node to point to the previous node (reverse the link).
   * iii. Move the prev pointer to the current node.
   * iv.  Move the current pointer to the next node (using the next pointer).

3. After the traversal, the prev pointer will be pointing to the new head of the reversed linked list.

4. Return the prev pointer as the new head of the reversed linked list.

