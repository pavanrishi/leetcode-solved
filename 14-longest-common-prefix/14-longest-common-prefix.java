class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
		for (int j = 0; j < strs[0].length(); j++) {
			String first = strs[0];
			for (int i = 1; i < strs.length; i++) {
				if (j == strs[i].length() || first.charAt(j) != strs[i].charAt(j)) {
					return sb.length() == 0? "" : sb.toString();
				}
			}
			sb.append(first.charAt(j));		
		}
		return strs[0];
    }
}