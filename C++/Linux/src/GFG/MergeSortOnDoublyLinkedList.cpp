//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;

struct Node
{
    int data;
    struct Node *next, *prev;

    Node(int x)
    {
        data = x;
        next = NULL;
        prev = NULL;
    }
};

// } Driver Code Ends

/* Structure of the node of the list is as
struct Node
{
    int data;
    struct Node *next, *prev;
    Node (int x){
        data = x;
        next = prev = NULL;
    }
};
*/

class Solution
{
public:
    // Function to sort the given doubly linked list using Merge Sort.
    Node *merge(Node *first, Node *second)
    {
        if (!first)
            return second;
        if (!second)
            return first;

        Node *dummy = new Node(-1);
        Node *runner = dummy;
        while (first && second)
        {
            if (first->data < second->data)
            {
                runner->next = first;
                first->prev = runner;
                runner = runner->next;
                first = first->next;
            }
            else
            {
                runner->next = second;
                second->prev = runner;
                runner = runner->next;
                second = second->next;
            }
        }
        if (first)
        {
            runner->next = first;
            first->prev = runner;
        }
        else
        {
            runner->next = second;
            second->prev = runner;
        }
        dummy->next->prev = nullptr;
        return dummy->next;
    }

    struct Node *sortDoubly(struct Node *head)
    {
        // Your code here

        // the base case
        if (!head || !head->next)
            return head;

        // Lets find the middle node
        Node *slow = head, *fast = head->next;

        // ** To handle edge case we want first middle node  for the even length list so start fast from one step forward

        while (fast && fast->next)
        {
            slow = slow->next;
            fast = fast->next->next;
        }
        // The middle node
        Node *mid = slow;

        // The left part of the linked list
        Node *first = head;
        // The second part of the linked list starts after the middle node
        Node *second = mid->next;

        // Break the linked list into two parts
        mid->next = nullptr;
        second->prev = nullptr;

        // sort the both parts of the linked list
        first = sortDoubly(first);
        second = sortDoubly(second);

        // now merge both the sorted linked list

        Node *mergedSortedList = merge(first, second);
        return mergedSortedList;
    }
};

//{ Driver Code Starts.

void insert(struct Node **head, int data)
{
    struct Node *temp = new Node(data);
    if (!(*head))
        (*head) = temp;
    else
    {
        temp->next = *head;
        (*head)->prev = temp;
        (*head) = temp;
    }
}

void print(struct Node *head)
{
    struct Node *temp = head;
    while (head)
    {
        cout << head->data << ' ';
        temp = head;
        head = head->next;
    }
    cout << endl;
    while (temp)
    {
        cout << temp->data << ' ';
        temp = temp->prev;
    }
    cout << endl;
}

// Utility function to swap two integers
void swap(int *A, int *B)
{
    int temp = *A;
    *A = *B;
    *B = temp;
}

// Driver program
int main(void)
{
    long test;
    cin >> test;
    while (test--)
    {
        int n, tmp;
        struct Node *head = NULL;
        cin >> n;
        while (n--)
        {
            cin >> tmp;
            insert(&head, tmp);
        }
        Solution ob;
        head = ob.sortDoubly(head);
        print(head);
    }
    return 0;
}

// } Driver Code Ends