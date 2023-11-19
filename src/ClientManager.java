import java.util.ArrayList;

public class ClientManager {
    static ArrayList<Client> clients = new ArrayList<>();
    static void addClient(Client user){
        clients.add(clients.size(), user);
        System.out.println("User "+user.username+" added");
    }
    static void removeClient(String username){
        for (int i = 0; i < clients.size(); i++) {
            if (clients.get(i).username == username){
                System.out.println("User "+ clients.get(i).username +" removed");
                clients.remove(clients.get(i));
                break;
            }
            else {
                System.out.println("No matching clients found. Please, input correct username");
            }
        }
    }
    static Client findClientByName(String username){
        Client foundClient = null;
        for (int i = 0; i < clients.size(); i++) {
            if (clients.get(i).username == username){
                System.out.println("User "+clients.get(i).username+" found");
                foundClient = clients.get(i);
                break;
            }
            else {
                System.out.println("CLient not found. Please, input correct username");
            }
        }
        return foundClient;
    }
}
