package Pekan7_2511532017;

public class akun_2511532017 {

	//variabel global
		private int pin;
		private String username,password,email;
		
		//membuat mutator (setter)
		public void setUsername (String username) {
			this.username=username;
			
		}
		public void setPassword (String password) {
			this.password=password;
			validatePassword();
		}
		public void setEmail (String email) {
			this.email=email;
			validateEmail();
		}
		public void setPIN (int pin) {
			this.pin=pin;
			
		}
		 // Helper method cek valid email
		private boolean isValidEmail (String email) {
			return email.contains("@") && email.contains(".");
		}
		// untuk ngecek apakah email mengandung @ dan . 
		// jika tidak mengandung @ dan. program akan berhenti 
		public void validateEmail () {
			if (!isValidEmail(this.email)) {
				System.out.println();
				System.out.println("--- REGISTRASI GAGAL ---");
				System.out.println("email  anda "+ email +"  tidak valid (harus mengandung '@' dan '.' )");
				System.out.println("silahkan coba lagi");
				 System.exit(1);
			}
		}
		
		 // Helper method cek valid password
		private boolean isValidPassword (String password) {
			return password.length() >= 8;
		}
		// untuk ngecek apakah password lebih dari 8 karakter
		
		public void validatePassword () {
			if (!isValidPassword(this.password)) {
				System.out.println();
				System.out.println("--- REGISTRASI GAGAL ---");
				System.out.println("password harus 8 atau lebih karakter");
				System.out.println("silahkan coba lagi");
				 System.exit(1);
			}
		}
		
		
		//membuat accesor (getter)
		public String getUsername() {
			return username;
			
		}
		public String getPassword () {
		return password;	
		
		}
		public String getEmail () {
			return email;
			
		}
		public int getPIN () {
			return pin;
		}
		
		//metode lain
		public void Cetak () {
			System.out.println();
			System.out.println("--- REGISTER BERHASIL ---");
			System.out.println("Akun untuk "+ username + " telah berhasil dibuat");
			
		}
}