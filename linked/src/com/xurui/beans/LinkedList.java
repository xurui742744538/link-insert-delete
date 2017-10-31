package com.xurui.beans;

public class LinkedList implements IList {

	 Node head; //ͷָ��
	 Node current;//��ǰ������
	 int size;//������
	  
	  //��ʼ��һ��������
	 public LinkedList()
	 {
	     //��ʼ��ͷ��㣬��ͷָ��ָ��ͷ��㡣�����õ�ǰ���������ͷ��㡣
	 this.head = current = new Node(null);
	 this.size =0;//����������ʼ����Ϊ�㡣
	 }
	
	 //��λ������ʵ�ֵ�ǰ���������ǰһ����㣬Ҳ�����õ�ǰ������λ��Ҫ��������ǰһ����㡣
	 //��������Ҫ��a2����ڵ�֮ǰ���в���������Ǿ���Ҫ�ѵ�ǰ�ڵ����λ��a1����ڵ㣬Ȼ���޸�a1�ڵ��ָ����
	 public void index(int index) throws Exception
	 {
	     if(index <-1 || index > size -1)
	     {
	       throw new Exception("��������");    
	     }
		 //˵����ͷ���֮�������
		 if(index==-1)    //��Ϊ��һ������Ԫ�ؽ����±���0����ôͷ�����±���Ȼ����-1�ˡ�
		    return;
		 current = head.next;
		 int j=0;//ѭ������
	     while(current != null && j<index)
	     {
	         current = current.next;
	         j++;
	     }
		     
	 }    
	
	 @Override
	 public void delete(int index) throws Exception {
		// TODO Auto-generated method stub
		 //�ж������Ƿ�Ϊ��
		 if(isEmpty())
		 {
		     throw new Exception("����Ϊ�գ��޷�ɾ����");
		 }
		 if(index <0 ||index >size)
		 {
		     throw new Exception("��������");
		 }
		 index(index-1);//��λ��Ҫ��������ǰһ��������
		         current.setNext(current.next.next);
		         size--;
	 }
	 
	 @Override
	 public Object get(int index) throws Exception {
		 if(index <-1 || index >size-1)
		 {
		     throw new Exception("�����Ƿ���");
		 }
		 index(index);
		 
		 return current.getElement();
	 }
	 
	@Override
	 public void insert(int index, Object obj) throws Exception {
		 if(index <0 ||index >size)
		 {
		     throw new Exception("��������");
		 }
		 index(index-1);//��λ��Ҫ��������ǰһ��������
		     current.setNext(new Node(obj,current.next));
		     size++;
	 }
	
	 @Override
	 public boolean isEmpty() {
	     // TODO Auto-generated method stub
	         return size==0;
	     }
	 
     @Override
     public int size() {
         // TODO Auto-generated method stub
    	 return this.size;
	 }

}
