package com.wg.offerAlgorithm;
/*
 * google�������⣺�ҳ�1-n֮���������1�ĸ�����
 * 1�ĸ���=��λ��1�ĸ���+ʮλ��1�ĸ���+��λ��1�ĸ�������
 */
public class CountOne {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println(countNumOf1(100));
	}
	 public static int countNumOf1(int n) {
	        if (n <= 0) {
	            return 0;
	        }
	        int count = 0;
	        int factor = 1;
	        int i=0;
	        while(n / factor != 0) {
	      
	        	int lowerNum = n - n / factor * factor;  //��λ��
	            int currentNum = (n / factor) % 10;   //
	            int highNum = n / (factor * 10);
	            
	            if (currentNum == 0) {
	                // ���Ϊ0,����1�Ĵ����ɸ�λ����
	                count += highNum * factor;
	            } else if (currentNum == 1) {
	                // ���Ϊ1,����1�Ĵ����ɸ�λ�͵�λ����
	                count += highNum * factor + lowerNum + 1;
	            } else {
	                // �������1,����1�Ĵ����ɸ�λ���� 
	                count += (highNum + 1) * factor;
	            }
	            factor *= 10;
	            i++;
	        }
	        return count;
	    }
}
