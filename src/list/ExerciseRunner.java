package list;

public class ExerciseRunner {
    private int taskCounter;

    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_GREEN = "\u001B[32m";


    public <T> void checkTask(CustomList<T> customListForCheck, T testValue, T secondValue) {
        int baseCounter = 9;
        taskCounter = baseCounter;
        System.out.println("=======================================");

        checkAddMethod(customListForCheck, testValue)
                .checkSize(customListForCheck, testValue)
                .checkRemoveAll(customListForCheck, testValue)
                .checkAddMethodForMultiplyItems(customListForCheck, testValue)
                .checkAddByIndex(customListForCheck, testValue, secondValue)
                .checkRemove(customListForCheck, testValue, secondValue)
                .checkGet(customListForCheck, testValue, secondValue)
                .checkAddAll(customListForCheck, testValue)
                .showResult(baseCounter);

        System.out.println("=======================================");
    }

    private void showResult(int baseCounter) {

        if (taskCounter == 0) {
            System.out.printf("""
                    %sAll task completed!%s""", ANSI_GREEN, ANSI_RESET);
        } else {
            System.out.printf("""
                    %sCompleted only %s tasks!%s""", ANSI_RED, baseCounter - taskCounter, ANSI_RESET);
        }
        System.out.println();

    }

    private void checkResult(boolean isCorrect) {
        if (isCorrect) {
            taskCounter--;
            System.out.printf("""
                    %sTask completed!%s""", ANSI_GREEN, ANSI_RESET);
        } else {
            System.out.printf("""
                    %sTask failed %s""", ANSI_RED, ANSI_RESET);
        }
        System.out.println();
    }

    private <T> ExerciseRunner checkGet(CustomList<T> customListForCheck, T item, T secondItem) {
        try {
            T itemForCheck = customListForCheck
                    .add(item)
                    .add(secondItem)
                    .get(1);

            boolean isItWorks = itemForCheck == secondItem && itemForCheck != item;
            checkResult(isItWorks);

        } catch (Exception exception) {
            System.out.println("Null pointer exception!");
        }

        return this.removeAll(customListForCheck);
    }

    private <T> ExerciseRunner checkAddAll(CustomList<T> customListForCheck, T item) {
        try {
            int size = customListForCheck
                    .add(item)
                    .add(item)
                    .add(item)
                    .addAll(customListForCheck)
                    .size();
            checkResult(size == 6);
        } catch (Exception exception) {
            System.out.println("Null pointer exception!");
        }

        return this.removeAll(customListForCheck);
    }

    private <T> ExerciseRunner checkRemove(CustomList<T> customListForCheck, T item, T secondItem) {
        try {
            T itemForCheck = customListForCheck
                    .add(item)
                    .add(item)
                    .add(item)
                    .add(secondItem, 1)
                    .remove(1)
                    .get(1);

            boolean isItWorks = itemForCheck != secondItem;
            checkResult(isItWorks);

        } catch (Exception exception) {
            System.out.println("Null pointer exception!");
        }


        return this.removeAll(customListForCheck);
    }

    private <T> ExerciseRunner checkSize(CustomList<T> customListForCheck, T item) {
        try {
            int size = customListForCheck
                    .add(item)
                    .add(item)
                    .add(item)
                    .size();
            checkResult(size == 3);

        } catch (Exception exception) {
            System.out.println("Null pointer exception!");
        }

        return this.removeAll(customListForCheck);
    }

    private <T> ExerciseRunner checkRemoveAll(CustomList<T> customListForCheck, T item) {
        boolean isItWorks = true;

        try {
            int size = customListForCheck
                    .add(item)
                    .add(item)
                    .add(item)
                    .size();

            customListForCheck
                    .removeAll();
            int newSize = customListForCheck.size();

            if (newSize != 0 || size == newSize) {
                throw new Exception();
            }

        } catch (Exception exception) {
            isItWorks = false;
        }

        checkResult(isItWorks);

        return this;
    }

    private <T> ExerciseRunner removeAll(CustomList<T> customListForCheck) {
        try {
            customListForCheck.removeAll();
        } catch (NullPointerException nullPointerException) {
            System.out.println("Method remove all is not implemented!");
        }

        return this;
    }

    private <T> ExerciseRunner checkAddMethod(CustomList<T> customListForCheck, T item) {
        customListForCheck.add(item);
        int listSize = customListForCheck.size();
        int EXPECTED_SIZE = 1;

        checkResult(listSize == EXPECTED_SIZE);

        return this.removeAll(customListForCheck);
    }

    private <T> ExerciseRunner checkAddMethodForMultiplyItems(CustomList<T> customListForCheck, T item) {

        try {
            customListForCheck
                    .add(item)
                    .add(item);
        } catch (NullPointerException nullPointerException) {
            System.out.println("Null pointer exception!");
        }

        int listSize = customListForCheck.size();
        int EXPECTED_SIZE = 2;

        checkResult(listSize == EXPECTED_SIZE);

        return this.removeAll(customListForCheck);
    }

    private <T> ExerciseRunner checkAddByIndex(CustomList<T> customListForCheck, T item, T newItem) {
        try {
            customListForCheck
                    .add(item)
                    .add(item)
                    .add(item);
            customListForCheck.add(newItem, 1);

            boolean isItWorks = customListForCheck.get(1) == newItem;

            checkResult(isItWorks);
        } catch (NullPointerException nullPointerException) {
            System.out.println("Null pointer exception!");
        }

        return this.removeAll(customListForCheck);
    }
}
