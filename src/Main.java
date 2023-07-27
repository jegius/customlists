import list.CustomList;
import list.ExerciseRunner;
import list.task.ArrayCustomList;
import list.task.LinkedCustomList;

public class Main {
    public static void main(String[] args) {
        ExerciseRunner exerciseRunner = new ExerciseRunner();

        System.out.println("Testing of LinkedList");
        CustomList<Integer> testLinkedList = new LinkedCustomList<>();
        exerciseRunner.checkTask(testLinkedList, 2, 5);

        System.out.println("Testing of ArrayList");

        CustomList<Integer> testArrayList = new ArrayCustomList<>();
        exerciseRunner.checkTask(testArrayList, 2, 5);
 // ebaniy rot etogo kazino

    }
}