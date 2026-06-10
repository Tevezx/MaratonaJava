package academy.devdojo.maratonajava.DesignPatterns.dominio;

import java.util.StringJoiner;

public class Pessoa {
    private String firstName;
    private String lastName;
    private String userName;
    private String email;

    // construtor privado


    private Pessoa(String firstName, String lastName, String userName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.email = email;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Pessoa.class.getSimpleName() + "[", "]")
                .add("firstName='" + firstName + "'")
                .add("lastName='" + lastName + "'")
                .add("userName='" + userName + "'")
                .add("email='" + email + "'")
                .toString();
    }


    public static final class PessoaBuilder {
        private String firstName;
        private String lastName;
        private String userName;
        private String email;

        private PessoaBuilder() {
        }

        public static PessoaBuilder builder() {
            return new PessoaBuilder();
        }

        public PessoaBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public PessoaBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public PessoaBuilder userName(String userName) {
            this.userName = userName;
            return this;
        }

        public PessoaBuilder email(String email) {
            this.email = email;
            return this;
        }

        public Pessoa build() {
            return new Pessoa(firstName, lastName, userName, email);
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmail() {
        return email;
    }
}
