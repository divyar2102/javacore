package LinkedList;
import java.util.Comparator;
import java.util.PriorityQueue;

class PriorityQueueEx{
	String name;
	int grade;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this .grade = grade;
	}
	public PriorityQueueEx(String name,int grade) {
		this.name=name;
		this.grade=grade;
	}
}

class GradeComparator implements Comparator<PriorityQueueEx>{
	public int compare(PriorityQueueEx s1,PriorityQueueEx s2) {
		if(s1.grade<s2.grade) {
			return 1;
		}
		else if(s1.grade>s2.grade) {
			return -1;
		}else {
			return 0;
		}
	}
	
}



public class PriorityQueueEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<PriorityQueueEx> pr=new PriorityQueue<PriorityQueueEx>(3,new GradeComparator());
        PriorityQueueEx s=new PriorityQueueEx("divya",7);
        PriorityQueueEx s1=new PriorityQueueEx("pragati",8);
        PriorityQueueEx s2=new PriorityQueueEx("hetal",9);
        pr.add(s);
        pr.add(s1);
        pr.add(s2);
        while(!pr.isEmpty()) {
        	System.out.println(pr.poll().getName());
        }
	}

}