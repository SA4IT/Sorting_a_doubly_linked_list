package list;

public class List {
    public Node head;
    public Node tail;

    public int min_cur;//текущий минмальный узел


    List(){
        head = null;
        tail = null;
    }
    public boolean Empty(){//проверка на пустоту списка
        return head == null;
    }//проверка на пустоту списка

    public void addBegin(int data){//добавление узла в начало
        Node temp = new Node(data);
        if(Empty()){
            tail = temp;
        }
        else{
            head.prev = temp;
        }
        temp.next = head;
        head = temp;
    }

    public void addEnd(int data){//добавление узла в конец
        Node temp = new Node(data);
        if(Empty()){
            head = temp;
        }
        else{
            tail.next = temp;

        }
        temp.prev = tail;
        tail = temp;
    }

    public void Print(){//вывод списка на печать
        Node temp_head = head;
        while(temp_head!=null){
            System.out.println(temp_head.data);
            temp_head = temp_head.next;
        }

    }

    public void Sort2(){
        int min1 = 1000000000;
        Node temp_tail_1 = tail;
        Node temp_tail_2 = tail;

        while(temp_tail_1 != null){//нахождение минимального узла
            if(temp_tail_1.data < min1 && temp_tail_1.data > this.min_cur){//так, что он должен быть больше предыдущего (min.cur его помнит)
                min1 = temp_tail_1.data;
            }
            temp_tail_1 = temp_tail_1.prev;
        }
        this.min_cur = min1;//запоминание текущего, для савнения с поиском следующего узла
        while(temp_tail_2 != null){//поиск того самого найденного минимального узла по его данным
            if(temp_tail_2.data == min1){
                break;
            }
            temp_tail_2 = temp_tail_2.prev;
        }

        if(temp_tail_2 == tail){//если минимальный это хвост
            addBegin(temp_tail_2.data);
            tail.prev.next = null;
            tail = tail.prev;
        }
        else{
            addBegin(temp_tail_2.data);//если минмальный не хвост
            temp_tail_2.prev.next = temp_tail_2.next;
            temp_tail_2.next.prev = temp_tail_2.prev;
        }
    }
}

