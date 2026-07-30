class Solution {

    public String removeDuplicates(String s) {

        StringBuilder str = new StringBuilder();

        if(s.length() == 0){

            return "";

        }

        str.append(s.charAt(0));

        char ch = s.charAt(0);

        int j = 1;

        for(int i = 1;i<s.length();i++){

            if(ch == s.charAt(i)){

                str.setLength(j - 1);

                j-=1;

                if(j == 0 ){
                    if(i+1 < s.length()){
                        ch = s.charAt(i+1);
                        str.append(ch);
                        j++;
                    i++;
                    }
                    else 
                    {
                        ch = '.';
                    }
                }

                else{

                    ch = str.charAt(j-1);

                }

                

            }

            else{

                ch = s.charAt(i);

                str.append(ch);

                j++;

            }



        }

        String ans = str.toString();

        return ans;

    }

}