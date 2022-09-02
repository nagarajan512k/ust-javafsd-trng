package com.ust;

public class Switch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=44;
		String size;
		
		//switch statement to check size
		switch(number) {
		case 29:
			size="small";
			break;
			
		case 42:
			size="Medium";
			break;
			
		case 44:
			size="Large";
			break;
			
		case 48:
			size="Extra Large";
			break;
			
			default:
				size="unknown";
				break;
				
		}
		System.out.println("Size:"+size);
	}

}
