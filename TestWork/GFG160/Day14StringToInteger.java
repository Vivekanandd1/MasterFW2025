package GFG160;

public class Day14StringToInteger {

	public static void main(String[] args) {
		String s = "  -0118g4";
		System.out.println(StringToInteger(s));
	}

	private static int StringToInteger(String s) {
        int res=0;
        int idx = 0;
        int sign = 1;
        
        while(idx<s.length() && s.charAt(idx) == ' ') {
        	
        	idx++;
        }
        
        if(idx<s.length() &&( s.charAt(idx)=='-' || s.charAt(idx)=='+')) {
        	if( s.charAt(idx++)=='-' ) {
        		sign = -1;
        	}
        }
        
        while(idx<s.length() &&s.charAt(idx)>='0' && s.charAt(idx)<='9') {
        	if(res>Integer.MAX_VALUE/10 || (res==Integer.MAX_VALUE/10 && s.charAt(idx)-'0'>7)) {
        		return sign == 1?Integer.MAX_VALUE:Integer.MIN_VALUE;
        	}
        	
        	res = 10*res+(s.charAt(idx++)-'0');
        	
        }
        
		return res*sign;
	}

}
