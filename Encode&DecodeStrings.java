class Solution {
    public String encode(List<String> strs) {
        String encoded_string = "";

        for(String s : strs){
            encoded_string += s.length() + "#" + s;
        }
        return encoded_string;
    }

    public List<String> decode(String str) {
        List<String> decoded_string = new ArrayList<>();
        int i = 0;

        while(i < str.length()){
            int j = i;
            while(str.charAt(j) != '#')
                j++;
            int length = Integer.parseInt(str.substring(i, j));
            String s = str.substring(j + 1, j + 1 + length);
            decoded_string.add(s);
            i = j + 1 + length;
        }

        return decoded_string;
    }
}
