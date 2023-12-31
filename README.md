# Руководство для `ExerciseRunner`

`ExerciseRunner` – это класс, который позволяет проверять работу пользовательской реализации ArrayList или LinkedList в Java. Он использует серию тестов для проверки различных аспектов реализации, включая добавление и удаление элементов, получение значений по индексу, определение размера списка и его очистку. Результаты тестирования представлены в удобной для чтения форме, в которой отмечены успешные и неудачные испытания.

## Как использовать

Нужно реализовать методы листов в классах `ArrayCustomList` и `LinkedCustomList`

## Аргументы метода `checkTask()`

`checkTask()` принимает три аргумента:

1. `customListForCheck`: Это список, который вы хотите проверить. Он должен быть экземпляром класса, который реализует `CustomList<T>`.
2. `testValue`: Это значение, которое будет использоваться в тестах.
3. `secondValue`: Второе значение, которое будет использовано в тестах.

## Какие методы тестируются

Следующие операции и методы вашего списка проверяются:

- `add(T item)`: Добавление элемента в список.
- `add(T item, int index)`: Добавление элемента в определенной позиции списка.
- `addAll(CustomList<T> newCustomList)`: Добавление элемента в определенной позиции списка.
- `get(int index)`: Получение элемента по его индексу в списке.
- `remove(int index)`: Удаление элемента по его индексу из списка.
- `removeAll()`: Очистка списка.
- `size()`: Определение размера списка.

## Результаты тестирования

ExerciseRunner выведет сообщения о прохождении или провале каждого теста, а также общий результат проведения всех тестов. Если тест провален, может быть выброшено исключение NullPointerException, что указывает на то, что некоторый метод `CustomList` не был реализован корректно.

## Поддержка и помощь

Если у вас есть вопросы или проблемы, связанные с использованием `ExerciseRunner`, пожалуйста, смело задавайте их в любое время. Мы здесь, чтобы помочь вам!