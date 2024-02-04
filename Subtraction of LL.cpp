class Solution {
private:
    int reverse(Node * &head){
        while(head->next && head->data==0) head=head->next;
        int cnt = 0;
        Node * prev = NULL;
        Node * curr = head;
        Node * next = NULL;
        while(curr){
            next = curr->next;
            curr->next = prev;
            prev = curr;
            curr = next;
            cnt++;
        }
        head = prev;
        return cnt;
    }
    Node * sub(Node * head1,Node* head2){
        Node * prev = NULL;
        int borrow = 0;
        
        while(head1 && head2){
            Node * temp = new Node (0);
            int x = head1->data + borrow;
            borrow = 0;
            if((x-head2->data)<0){
                x += 10;
                borrow = -1;
            }
            
            temp->data = x-head2->data;
            temp->next = prev;
            prev = temp;
            head1 = head1->next;
            head2 = head2->next;
        }
        
        while(head1){
            Node * temp = new Node (0);
            temp->data = head1->data + borrow;
            borrow = 0;
            if(temp->data < 0){
                temp->data += 10;
                borrow = -1;
            }
            
            temp->next = prev;
            prev = temp;
            head1 = head1->next;
        }
        
        return prev;
    }
public:
    Node* subLinkedList(Node* head1, Node* head2) {
        
        int n1 = 0,n2 = 0;
        n1 = reverse(head1);
        n2 = reverse(head2);
        
        if(n2 > n1){
            swap(head1,head2);
        }
        else if(n1==n2){
            int cnt1 = 0,cnt2 = 0;
            Node*a = head1;
            Node*b = head2;
            
            while(a){
                if(a->data > b->data){
                    cnt1 = 1;
                    cnt2 = 0;
                }else if(a->data < b->data){
                    cnt1 = 0;
                    cnt2 = 1;
                }
                a = a->next;
                b = b->next;
            }
            if(cnt2 > cnt1) swap(head1,head2);
        }
        
        Node * ans = sub(head1,head2);
        
        while(ans->next && ans->data == 0) ans = ans->next;
        
        return ans;

    }
};
