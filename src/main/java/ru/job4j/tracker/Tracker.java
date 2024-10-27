package ru.job4j.tracker;

import java.util.Arrays;

@SuppressWarnings("checkstyle:EmptyLineSeparator")
public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    private int indexOf(int id) {
        int result = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                result = index;
                break;
            }
        }
        return result;
    }

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }

    public Item[] findAll() {
        Item[] result = new Item[items.length];
        int resultSize = 0;

        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item != null) {
                result[resultSize] = item;
                resultSize++;
            }
        }
        return Arrays.copyOf(result, resultSize);
    }

    public Item[] findByName(String key) {
        Item[] result = new Item[items.length];
        int resultSize = 0;

        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getName().equals(key)) {
                result[resultSize] = item;
                resultSize++;
            }
        }
        return Arrays.copyOf(result, resultSize);
    }

    public boolean replace(int id, Item item) {
        Item existingItem = findById(id);
        if (existingItem != null) {
            item.setId(id);
            int index = indexOf(id);
            items[index] = item;
            return true;
        }
        return false;
    }
}