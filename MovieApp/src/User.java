import java.util.Scanner;

public class User extends Account{
	protected User user;
	protected String Username;
	protected String Password;
	protected Ticket[] Tickets;
	public Ticket[] getTickets() {
		return Tickets;
	}
	public void setTickets(Ticket[] tickets) {
		Tickets = tickets;
	}

	public User(){
		user = new User;
		user.Username = "User";
		user.Password = "Default";
	}

	public void createAccount(){
		user.Username = this.Username;
		user.Password = this.Password;
	}
	
}
