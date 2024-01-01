package mediatheque;


public interface Administration {
    void addDoc(Document doc);
    void removeDoc(Document doc);
    void addClient(Client client);
    void removeClient(Client client);
    void addEmprunt(Client client,Document document);
    void removeEmprunt(Client client,Document document);
}
