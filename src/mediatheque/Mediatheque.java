package mediatheque;

import java.util.ArrayList;
import java.util.List;


public class Mediatheque implements Administration{
    private List<Client> clients = new ArrayList<>();
    private List<Document> documents = new ArrayList<>();
    private List<Book> books = new ArrayList<>();
    private List<Dictionary> dictionaries = new ArrayList<>();
    private List<Magazine> magazines = new ArrayList<>();
    
    
    @Override
    public void addDoc(Document doc) {
       
    }

    @Override
    public void removeDoc(Document doc) {
    
    }

    @Override
    public void addClient(Client client) {
    
    }

    @Override
    public void removeClient(Client client) {
    
    }

    @Override
    public void addEmprunt(Client client, Document document) {
    
    }

    @Override
    public void removeEmprunt(Client client, Document document) {
    
    }
    
    
    public static void main(String[] args) {
        
    }

    
    
}
