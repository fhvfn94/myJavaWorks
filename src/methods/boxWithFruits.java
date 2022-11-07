package methods;

import java.util.Objects;

public class boxWithFruits {
    private int numberOfFruits; // Число фруктов
    private final String typeOfFruits; // Какие фрукты тут лежат. Это константа
    private String varietyOfFruits; // сорт фруктов
    private final int capacity; // Вместимость ящика. "final" так как это константа.

    public boxWithFruits(String typeOfFruits1, String varietyOfFruits1,  int capacity) {
        typeOfFruits = typeOfFruits1;
        varietyOfFruits = varietyOfFruits1;
        this.capacity = capacity; // если boxWithFruits(capacity) и private final int capacity имеют одинаковые названия то используем this
        numberOfFruits = 0;
    }

    // первый метод - добавляем фрукты
    public void addFruits(int numberOfFruitsToAdd) { // Добавляем фрукты в ящик в ящик с фруктами и поверяем вмещаются ли они в ящик
        if (numberOfFruits + numberOfFruitsToAdd > capacity) {
            numberOfFruits = capacity;
        } else {
            numberOfFruits += numberOfFruitsToAdd;
        }
    }

    // второй метод - забрать фрукты
    public void takeFruits(int numberOfFruitsToTake) {
        if (numberOfFruits < numberOfFruitsToTake) {
            numberOfFruits = 0;
        } else {
            numberOfFruits -= numberOfFruitsToTake;
        }
    }

    // третий способ - очищаем ящик
    public void clearBox() {
        numberOfFruits = 0; // просто обнуляем счетчик
    }

    //четвертый метод - заполняем ящик
    public void fillBox() {
        numberOfFruits = capacity;
    }

    public int getNumberOfFruits() {
        return numberOfFruits;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        boxWithFruits that = (boxWithFruits) o;
        return numberOfFruits == that.numberOfFruits && capacity == that.capacity && typeOfFruits.equals(that.typeOfFruits) && varietyOfFruits.equals(that.varietyOfFruits);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberOfFruits, typeOfFruits, varietyOfFruits, capacity);
    }
}