public class Cities {
    private String[] cities;

    public Cities(String[] cities) {
        this.cities = cities;
    }
    
    public Cities filter(char c){
        String[] array = new String[cities.length];
        int index=0;
        for (int i = 0; i < array.length; i++) {
            if(cities[i].charAt(0)==c){
                array[index++]=cities[i];
            }
        }
        Cities nc = new Cities(array);
        return nc;
    }

    public String cities(){
        String str = "";
        for (String string : cities) {
            if(string!=null)
                str+=string+", ";
        }
        return str.substring(0,str.length()-2);
    }
    
    public static void main(String[] args) {
        String[] array = {"Kraków","Zawadka","Zadziele"};
        Cities c = new Cities(array);
        System.out.print(c.filter('Z').cities());
    }
}