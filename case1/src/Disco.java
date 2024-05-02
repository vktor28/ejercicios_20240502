public class Disco {

    //Artista, título, año, duración (pueden ser otros).
    private String artist;
    private String album;
    private int year;
    private double minutos;

    public Disco(String artist, String album, int year, double minutos) {
        this.artist = artist;
        this.album = album;
        this.year = year;
        this.minutos = minutos;
    }


    public String getArtist() {
        return this.artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getAlbum() {
        return this.album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getMinutos() {
        return this.minutos;
    }

    public void setMinutos(double minutos) {
        this.minutos = minutos;
    }

    @Override
    public String toString() {
        return "{" +
            " artist='" + getArtist() + "'" +
            ", album='" + getAlbum() + "'" +
            ", year='" + getYear() + "'" +
            ", minutos='" + getMinutos() + "'" +
            "}";
    }



}
