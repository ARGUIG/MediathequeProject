package mediatheque;

import java.util.ArrayList;
import java.util.List;

public class Client {
    private static int id;
    private String username;
    private String password;
    private String CNE;
    
    private List<Document> favorites = new ArrayList<>();
    private List<Document> kindles =new ArrayList<>();
    
    
    public Client(String username, String password, String CNE) {
        this.username = username;
        this.password = password;
        this.CNE = CNE;
    }
    
    @Override
    public String toString() {
        return "Client{" + "username=" + username + ", password=" + password + ", CNE=" + CNE + '}';
    }
    
    public void addFavoris(Document document) {
        favorites.add(document);
    }
    public void removeFavoris(Document document) {
        favorites.remove(document);
    }
    public void addKindle(Document document) {
        kindles.add(document);
    }
    public void removeKindle(Document document) {
        kindles.remove(document);
    }
    
    public static int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getCNE() {
        return CNE;
    }

    public static void setId(int id) {
        Client.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setCNE(String CNE) {
        this.CNE = CNE;
    }

    public List<Document> getFavorites() {
        return favorites;
    }

    public List<Document> getKindles() {
        return kindles;
    }
    
}
