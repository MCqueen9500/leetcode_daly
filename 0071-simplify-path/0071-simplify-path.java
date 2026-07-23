class Solution {
    public String simplifyPath(String path) {
        int arraySize = 0;
        for(int i = 0;i<path.length();i++){
            if(path.charAt(i)=='/'){
                arraySize++;
            }
        }

        String array[] = new String[arraySize];

        StringBuilder str = new StringBuilder();
        int index = 0;

        for(int i = 1;i<path.length();i++){
            char ch = path.charAt(i);
            if(ch == '/' && str.length()>0){
                array[index] = str.toString();
                index++;
                str.setLength(0);
            }
            else if(ch == '/' && str.length()==0){
                continue;
            }
            else{
                str.append(ch);
            }
        }

        if(str.length()>0){
            array[index] = str.toString();
            index++;
        }
        String array2[] = new String[index];
        int j = 0;

        for(int i = 0;i<index;i++){
            if(array[i].equals("..")){
                if(j>0){
                    j--;
                }
            }
            else if(array[i].equals(".")){
                continue;
            }
            else{
                array2[j] = array[i];
                j++;
            }
        }

        str.setLength(0);
        
        for(int i = 0;i<j;i++){
            str.append('/');
            str.append(array2[i]);
        }

        if(str.length() == 0){
    return "/";
}
return str.toString();
 
    }
}