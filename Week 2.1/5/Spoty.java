public class Spoty {

    /** Used debe de crear un clon simple de Spotify, para ello debe de crear una clase llamada Spoty, 
         * el constructor de esta clase debe de recibir un String con el siguiente formato: 
         * “nombreCancion1: nombreCancion2: nombreCancion3”, estas canciones se deben de agregar a 
         * la “base de datos” de su programa, debe de existir un método que inicie la reproducción de las 
         * canciones, y otros métodos para poder cambiar de canción en reproducción. Al inicio, ninguna 
         * canción se esta reproduciendo.  */

    private String [] songList;
    private int nowPlaying = -1;
    private int size;

    public Spoty(String songList)
    {
        this.songList = songList.split(":");
        this.size = this.songList.length;
    }
    
    public String getActualSong() 
    {
        /**Devuelve el nombre de la canción que actualmente está reproduciéndose */
        return "";
    }

    public void next()
    {
        /**No devuelve nada, pero la siguiente canción en cola se comienza a reproducir, 
         * en caso de que se este reproduciendo la ultima canción se pasa a reproducir la primera. */

    }

    public void prev()
    {
        /**No devuelve nada, pero la canción anterior se comienza a reproducir, 
         * en caso se este reproduciendo la primera canción, se pasa a reproducir la última canción */

    }

    public void random()
    {
        /** No devuelve nada, pero selecciona una canción a reproducir, de forma aleatoria.  */

    }

    public void playThisSong(int index)
    {
        /** No devuelve nada, pero pone en reproducción la canción que corresponda con el índice indicado. */
        if (0<index && index<size)
            this.nowPlaying = index-1;
    }

    public String toString()
    {
        /** Debe de mostrar la lista de reproducción , mostrando que canción se está reproduciendo actualmente, 
         * en el siguiente ejemplo la canción con nombre: nombreCancion3 esta siendo reproducida.  */
        String result ="";
        for(int i=0; i<size; i++)
        {
            result+=(i+1)+". ";
            if (this.nowPlaying == i)
                result+= "[[ ";
            result+=this.songList[i];
            if (this.nowPlaying == i)
                result+= " ]]";
            result+= "\n";
        }
        return result;
    }
}
