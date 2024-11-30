package OOPInterface;

public class FriendsSchool implements GovtEducatinDept,Medical {


	public void library() {

		System.out.println("implemented library from interface");

	}

	public void techclassrom() {
		System.out.println("implemented techclassrommc from interface");
	}


	public void lab() {
		System.out.println("implemented lab from interface");
	}


	public void sports() {
		System.out.println("own specification sports");
	}

	public void musicRoom() {
		System.out.println("own specification musicRoom");
	}

	@Override
	public void counselling() {
		System.out.println("implemmented counselling from Medical interfae");
		
	}

	@Override
	public void nutrition() {
		System.out.println("implemmented counselling from nutrition interfae");
		
	}
}
