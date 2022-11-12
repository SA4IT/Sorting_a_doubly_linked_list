package list;
//2 вариант задания.
// Сортировка двусвязного списка путем исключения элемента с минимальным значением и включением его в начало списка

public class Runner {
    public static void main(String[] args) {
        List list = new List();

        //заполним список добавлением в конец произвольными целочисленными значениями
        list.addEnd(95618564);
        list.addEnd(43);
        list.addEnd(367255938);
        list.addEnd(6583652);
        list.addEnd(7);
        list.addEnd(89674);
        list.addEnd(945875);
        list.addEnd(876);
        list.addEnd(7694);


        System.out.println(" ");
        System.out.println("Неотсортированный список:");
        list.Print();
        System.out.println(" ");
        System.out.println("Отсортированный список:");
        int count = 9;//количество узлов в списке
        while (count !=0){
            list.Sort2();
            count --;
        }
        list.Print();
    }
}
