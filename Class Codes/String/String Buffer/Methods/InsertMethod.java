/*
Insert:

method: public StrigBuffer insert(int offset , String str);

parameter: Integer , String

return type: StringBuffer
*/

class InsertDemo{
	public static  void main(String [] args){

		StringBuffer sb = new StringBuffer("AtharvCore2Web");
		System.out.println(sb);
		sb.insert(6, "Bibave");
		System.out.println(sb);

	}
}

