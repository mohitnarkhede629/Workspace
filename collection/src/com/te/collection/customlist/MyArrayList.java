package com.te.collection.customlist;

import java.util.Iterator;

public class MyArrayList {

	private Object[] array;
	private int index;

	public MyArrayList() {
		array = new Object[10];
	}

	public int size() {
		return index;
	}

	public void add(Object obj) {

		if (index > array.length - 1) {

			increaseCapacity();

		}
	}

	private void increaseCapacity() {
		Object[] temp = new Object[((array.length * 3) / 2) + 1];
		for (int i = 0; i < array.length; i++) {
			temp[i] = array[i];

		}
		array = temp;
	}

	class MyItr implements Iterator<Object> {

		@Override
		public boolean hasNext() {
			if (array[index] != null) {
				return true;
			} else
				return false;
		}
		@Override
		public Object next() {
			Object object=new MyItr();

			return object;
		}
	}

	

	

	public Iterator<Object> iterator() {
		return new MyItr();

	}

	public void remove(Object obj) {
		for (int i = 0; i < index; i++) {
			if (array[i].equals(obj)) {
				for (int j = 0; j < index; j++) {

					array[j] = array[j + 1];
				}
				index--;
				return;

			}

		}

	}

}
