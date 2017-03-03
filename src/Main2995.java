import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main2995 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int size = sc.nextInt();
		int count = 0;
		
		Set<DAO> set = new HashSet<DAO>;
		for(int i=0; i<n; i++){
			DAO dao = new DAO(sc.nextInt(), sc.nextInt());
			set.add(dao);
		}
		
		sc.close();
		
		for(DAO dao : set){
			System.out.println(dao.toString());
		}
		
		// 학년별로 오른차순 -> 성별로 오른차순
		
		// (3,4) (5,6) , 성에 맞추어서
		
		// 2학년 미만은 자동분류
	}
}

class DAO{
	int sex;
	int year;
	public DAO() {
	}
	public DAO(int sex, int year) {
		super();
		this.sex = sex;
		this.year = year;
	}
	@Override
	public String toString() {
		return "DAO [sex=" + sex + ", year=" + year + "]";
	}
}