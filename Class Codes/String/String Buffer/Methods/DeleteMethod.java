/*
Delete:

method: public StringBuffer delete(int start, int end);

parameter: integer(start 1st char to delete) integer(end index after the last character to delete)

return type: StringBuffer
*/

class DeleteDemo{
	public static void main(String [] args){

		StringBuffer sb = new StringBuffer("core2Web");
		sb.delete(2,7);
		System.out.println(sb);
	}
}
