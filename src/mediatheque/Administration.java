package mediatheque;


public interface Administration {
    void addBook(Book book);
    void removeBook(Book book);
    void addMagazine(Magazine magazine);
    void removeMagazine(Magazine magazine);
    void addDictionary(Dictionary dictionary);
    void removeDictionary(Dictionary dictionary);
    void addClient(Client client);
    void removeClient(Client client);
    void addEmprunt(Client client,Document document);
    void removeEmprunt(Client client,Document document);
}
