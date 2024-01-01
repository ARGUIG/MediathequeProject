package mediatheque;

import java.util.ArrayList;
import java.util.List;


public class Mediatheque implements Administration{
    private List<Client> clients = new ArrayList<>();
    private List<Book> books = new ArrayList<>();
    private List<Dictionary> dictionaries = new ArrayList<>();
    private List<Magazine> magazines = new ArrayList<>();
    
    

    @Override
    public void addBook(Book book) {
        books.add(book);
    }

    @Override
    public void removeBook(Book book) {
        books.remove(book);
    }

    @Override
    public void addMagazine(Magazine magazine) {
        magazines.add(magazine);
    }

    @Override
    public void removeMagazine(Magazine magazine) {
        magazines.remove(magazine);
    }

    @Override
    public void addDictionary(Dictionary dictionary) {
        dictionaries.add(dictionary);
    }

    @Override
    public void removeDictionary(Dictionary dictionary) {
        dictionaries.remove(dictionary);
    }

    @Override
    public void addClient(Client client) {
        clients.add(client);
    }

    @Override
    public void removeClient(Client client) {
        clients.remove(client);
    }

    @Override
    public void addEmprunt(Client client, Document document) {
        for (Document doc : client.getKindles() ){
            if (! (document.isbn).equals(doc.isbn) ){
                client.getKindles().add(document);
            }
        }
    }

    @Override
    public void removeEmprunt(Client client, Document document) {
        for (Document doc : client.getKindles() ){
            if ( (document.isbn).equals(doc.isbn) ){
                client.getKindles().remove(document);
            }
        }
    }

    public static void main(String[] args) {
        
    }
    
    
}
