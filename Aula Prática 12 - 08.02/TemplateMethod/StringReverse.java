public class StringReverse extends TransformaString {

    @Override
    public String modificarString(String s){
        //return new StringBuilder(s).reverse().toString();

        StringBuilder sb;
        sb = new StringBuilder(s);
        String x = sb.reverse().toString();
        return x;
    }

}
