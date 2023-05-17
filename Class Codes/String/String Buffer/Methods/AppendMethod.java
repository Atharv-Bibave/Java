/*
Append:

method: public synchronized StringBuffer append(String str);

description: 
	append the <code> string </code>. If str is null, the string "null" append

return type: StringBuffer
*/

class AppendDemo{
	public static void main(String [] args){

		StringBuffer sb = new StringBuffer("java");
		sb.append("Core2Web");
		System.out.println(sb);
	}
}
