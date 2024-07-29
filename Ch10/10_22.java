public class Demo {
    public static void main(String[] args)
    {
        
    }
}

class MyString1
{
    private char[] chars;

    public MyString1() {}

    public MyString1(char[] chars){
        this.chars = chars;
        System.arraycopy(chars,0,this.chars,0,chars.length);
    }

    public char charAt(int index){
        return chars[index];
    }

    public int length(){
        return chars.length;
    }

    public MyString1 substring(int begin, int end)
    {
        char[] temp = new char[end-begin+1];

        int j = 0 ;
        for(int i = begin ; i < end ; ++i)
        {
            temp[j] = chars[i];
            ++j;
        }

        return new MyString1(temp);
    }

    public boolean equals(MyString1 s)
    {
        if(this.length() != s.length())
            return false;

        for(int i = 0 ; i < s.length() ; ++i)
        {
            if(this.charAt(i) != s.charAt(i))
                return false;
        }

        return true;
    }
}
