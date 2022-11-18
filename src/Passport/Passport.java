package Passport;


    public class Passport {
        private int numberID;
        private String name;
        private String surname;
        private String lastName;
        private int dateBirth;

        public Passport(int numberID, String name, String surname, String lastName, int dateBirth) {
            this.numberID = numberID;
            setName(name);
            setSurname(surname);
            setLastName(lastName);
            this.dateBirth = dateBirth;
        }

        public int getNumberID() {
            return numberID;
        }

        public String getName() {
            return name;
        }

        public String getSurname() {
            return surname;
        }

        public String getLastName() {
            return lastName;
        }

        public int getDateBirth() {
            return dateBirth;
        }

        public void setNumberID(int numberID) {
            this.numberID = numberID;
        }

        public void setName(String name) {
            if (name == null || name.isBlank()) {
                throw new IllegalArgumentException("Указаны не все данные!");
            }
            this.name = name;
        }

        public void setSurname(String surname) {
            if (surname == null || surname.isBlank()) {
                throw new IllegalArgumentException("Указаны не все данные!");
            }
            this.surname = surname;
        }

        public void setLastName(String lastName) {
            if (lastName == null || lastName.isBlank()) {
                throw new IllegalArgumentException("Указаны не все данные!");
            }
            this.lastName = lastName;
        }

        public void setDateBirth(int dateBirth) {
            this.dateBirth = dateBirth;
        }
    }

