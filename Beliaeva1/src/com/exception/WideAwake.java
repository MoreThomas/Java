package com.exception;

public class WideAwake {
	
	public static String getMinString(String[] arr) {
		int min = 0;
		String minStr = null;
		
		try {
			if(arr == null)
				throw new StringArrayException("String Array doesn't EXIST!");			
				
			if(arr.length == 0)
				throw new StringArrayException("String Array is EMPTY!");
				
			for (int i = 1; i < arr.length; i++) {
				min = arr[i-1].length();
				if(min > arr[i].length()) {
					min = arr[i].length();
					minStr = arr[i];
				}
			}
		} catch (StringArrayException e) {			
			e.printStackTrace();
		}
		
		return minStr;
	}
	

	public static void main(String[] args) {
		String[] arr1 = {
				"������� ��������.", "�������� �������, ��� ������ �� �������� ����� ����� �� ������� ������� ������������ � ���.", 
				"���� ����� ������ ��� �� ����, ������� �� ��������������� ��� ��,", 
				"��� � ������� � ��� ������� ������� �������� ������� ������ ��� �����������."
		};
				
		String[] arr2 = {};
		String[] arr3 = null;
		
		System.out.println(getMinString(arr1));
		System.out.println(getMinString(arr2));
		System.out.println(getMinString(arr3));
		
	}
	
	static class StringArrayException extends Exception {
		private static final long serialVersionUID = 1L;

		public StringArrayException(String message) {
			super(message);
		}
	}
	
}

