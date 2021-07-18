/**
 * @author giuliano ranauro
 * Date: 18/07/2021 18:41
 * Ide: Intellij
 * JDK: 1.8
 * @version 1.0
 */
package com.ranauro;

public class NameRepository implements Container{
    private String[] names = {"peppe","antonello","luigino","ferdinando"};

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    public class NameIterator implements Iterator{
        int index;

        @Override
        public boolean hasNext() {
            if (index < names.length)
                return true;
            return false;
        }

        @Override
        public Object next() {
            if (this.hasNext())
                return names[index++];
            return null;
        }
    }
}
