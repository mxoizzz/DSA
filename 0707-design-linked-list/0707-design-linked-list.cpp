struct Node{
    int val;
    Node* next;
    Node(int x){
        val = x;
    }
};
class MyLinkedList {
    Node* head;
    int size;
public:
    MyLinkedList() {
        head = new Node(0);
        size = 0;
    }
    
    int get(int index) {
        if(index<0){
            return -1;
        }

        if(index>=size){
            return -1;
        }
        Node* temp = head->next;
        for(int i = 0;i<index;i++){
            temp = temp->next;
        }
        return temp->val;
    }
    
    void addAtHead(int val) {
        addAtIndex(0,val);
    }
    
    void addAtTail(int val) {
        addAtIndex(size,val);
    }
    
    void addAtIndex(int index, int val) {
        if(index<0){
            return;
        }
        if(index>size){
            return;
        }
        Node* temp = head;
        for(int i = 0;i<index;i++){
            temp = temp->next;
        }
        Node* newNode = new Node(val);
        newNode->next = temp->next;
        temp->next = newNode;
        size++;
    }
    
    void deleteAtIndex(int index) {
        if(index<0){
            return;
        }
        if(index>=size){
            return;
        }
        Node* temp = head;
        for(int i = 0;i<index;i++){
            temp = temp->next;
        }
        Node* deleteNode = temp->next;
        temp->next = deleteNode->next;
        delete deleteNode;
        size--;
    }
};

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList* obj = new MyLinkedList();
 * int param_1 = obj->get(index);
 * obj->addAtHead(val);
 * obj->addAtTail(val);
 * obj->addAtIndex(index,val);
 * obj->deleteAtIndex(index);
 */