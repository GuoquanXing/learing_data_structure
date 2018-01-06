package stringoperation;

public class StringOperation {
	
	/**
	 * reverse string str.(Binary Reverse)
	 * If given string is 'abc', the return is 'cba'.
	 * @param str
	 * @return
	 */
	public static String strReverseWithBinary(String str) {
		if(str == null || str.length() <= 0){
			return str;
		}

		boolean flag = true;
		char[] char_array = str.toCharArray();

		int left = 0;
		int right = str.length();

		while (flag) {
			if (left < right) {
				char tmp_c = char_array[left];
				char_array[left] = char_array[right - 1];
				char_array[right - 1] = tmp_c;
			} else {
				flag = false;
			}
			left++;
			right--;

		}
		return String.valueOf(char_array);
	}
	
	public static String strReverseWithRecursive(String string){
        if(string==null||string.length()==0)return string;
        int length = string.length();
        if(length==1){
            return string;
        }else{
        	return  strReverseWithRecursive(string.substring(1));
//            return  strReverseWithRecursive(string.substring(1))+string.charAt(0);
        }
    }

}
