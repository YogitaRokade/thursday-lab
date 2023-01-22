package thursdaylab;

import java.util.ArrayList;
import java.util.Collections;

public class AccountArrayList {
	public static void main(String[] args) {
		ArrayList<AccountLab> acc = new ArrayList<AccountLab>();
		acc.add(new AccountLab(1, 2408, "Swastika Mishra"));
		acc.add(new AccountLab(2, 2569, "Monika Mishra"));
		Collections.sort(acc);
		
		for (AccountLab a : acc)
		{
			System.out.println(a);
		}
	}
}
