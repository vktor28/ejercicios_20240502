import java.util.ArrayList;
import java.util.Scanner;

public class App {
/*
 * Crear un arraylist con al menos 5 discos, con los datos: Artista, título, año, duración (pueden ser otros).
- Mostrar todos los discos, con todos los datos
- Mostrar uno determinado: por ejemplo el año del tercer disco (esto lo podría pedir el cliente, o no)
- Cambiar ese mismo año (esto lo podría pedir el cliente, o no) y mostrar ese cambio. A ver si lo encontráis!
- Etc hacer pruebas
------EXTRA: buscador con contains() o con equals(). Que el usuario escriba nombre de artista y me diga si está, y en qué posición está.
------NIVEL 2
Que todos estos datos los entre el cliente: usuario entra Artista, título, año y duración (no hace falta hacer un CRUD entero).
 */


    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿cuántos discos quieres introducir?");
        int numDiscos = teclado.nextInt();
        teclado.nextLine();
        ArrayList<Disco> discos = new ArrayList<>();
        for(int i=0; i<numDiscos; i++){
            int indice = i+1;
            System.out.println("Introduce el artista del disco " + indice);
            String singleArtist = teclado.nextLine();
            System.out.println("Introduce su album");
            String singleAlbum = teclado.nextLine();
            System.out.println("Introduce su año");
            int singleYear = teclado.nextInt();
            teclado.nextLine();
            System.out.println("Introduce su duración");
            double singleDuration = teclado.nextDouble();
            teclado.nextLine();
            discos.add(new Disco(singleArtist, singleAlbum, singleYear, singleDuration));
        }
        espaciador();
        System.out.println("1. Listado todos los discos:\n" + discos);

        System.out.println("\n");
        verDiscos(discos);

        espaciador();

        System.out.println("¿De que album quieres saber su año?");
        String albumSearch=teclado.nextLine();
        for(int i=0; i<discos.size(); i++){
            if(discos.get(i).getAlbum().equalsIgnoreCase(albumSearch)){
                System.out.println("Este album es del año " + discos.get(i).getYear());
            }
        }

        
        System.out.println("¿Es incorrecto y quieres modificarlo?(SI/NO)");
        if (teclado.nextLine().equalsIgnoreCase("SI")) {
            for(int i=0; i<discos.size(); i++){
                if(discos.get(i).getAlbum().equalsIgnoreCase(albumSearch)){
                    System.out.println("indica el año correcto ");
                    discos.get(i).setYear(teclado.nextInt());
                    teclado.nextLine();
                    espaciador();
                    System.out.println("Actualizado:");
                    verDiscos(discos);
                }
            }
        }else {
            System.out.println("Perfecto, entonces es correcto!!");
        }

        espaciador();
        //Encontrar poscición DB
        System.out.println("Indica el artista y te diré la poscición que ocupa");
        boolean encontrado=false;
        int indiceArtirsta=0;
        String artistSearch=teclado.nextLine();
        for(Disco x:discos){
            if(x.getArtist().equalsIgnoreCase(artistSearch)){
                encontrado=true;
            }
            else {indiceArtirsta=indiceArtirsta+1;}
        }

         
        for(int i=0; i<discos.size(); i++){
            if(discos.get(i).getArtist().equalsIgnoreCase(artistSearch)){
                
                System.out.println("Está en la lista y ocupa la posición "+indiceArtirsta);
            }
        }

 

    }

    public static void verDiscos(ArrayList<Disco> discos){
        for(Disco x: discos){
            System.out.println("El album "+ x.getAlbum() + " de " + x.getArtist() + " de " + x.getYear() + " dura " + x.getMinutos() + "minutos.");
        }

    }
    public static void espaciador(){
        System.out.println("\n-----\n");
    }
}
