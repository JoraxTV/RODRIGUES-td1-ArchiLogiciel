package RENDUS.Java;

class Socket {
    private String state = "initial";

    public void listen(){
        if (state.equals("initial")){
            state = "écoute";
        }
        else{
            System.out.println("Erreur, veuillez d'abord être dans l'état initial");
        }
    }

    public void read(){
        if (state.equals("connectée")){
            System.out.println("HEY ! LISTEN !");;
        }
        else{
            System.out.println("Erreur, veuillez d'abord être connectée");
        }
    }

    public void close(){
        if (state.equalsIgnoreCase("connectée") || state.equalsIgnoreCase("écoute")){
            state = "fermée";
        }
        else{
            System.out.println("Erreur, veuillez d'abord être connectée ou écouter");
        }
    }

    public void connect(){
        if (state.equals("initial")) {
            state = "connectée";
        }
        else{
            System.out.println("Erreur, veuillez d'abord être dans l'état initial");
        }
    }

    public void accept(){
        if (state.equalsIgnoreCase("écoute")){
            state = "connectée";
        }
        else{
            System.out.println("Erreur, veuillez d'abord être dans l'état écoute");
        }
    }

    public static void main(String[] args) {
        Socket s = new Socket();
        s.listen();
        s.accept();
        s.read();
        s.close();
    }
}