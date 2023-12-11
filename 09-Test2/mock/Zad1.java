public class Zad1{
    int[] lista = new int[5];

    public Zad1(int a, int b, int c, int d, int e) {
        lista[0]=a;
        lista[1]=b;
        lista[2]=c;
        lista[3]=d;
        lista[4]=e;
    }

    public boolean different(){
        for (int i = 0; i < lista.length-1; i++) {
            for(int j=i+1; j<lista.length; j++){
                if(lista[i]==lista[j])
                    return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        Zad1 z = new Zad1(1, 2, 3, 6, 1);
        System.out.print(z.different());

    }
}