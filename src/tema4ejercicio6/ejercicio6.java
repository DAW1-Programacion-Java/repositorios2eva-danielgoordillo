package tema4ejercicio6;

public class ejercicio6 {



        private int numeroExpediente;
        private String nombre;
        private String apellidos;
        private String fechaNacimiento;
        private String curso;
        private double nota1;
        private double nota2;


        public ejercicio6(int numeroExpediente, String nombre, String apellidos, String fechaNacimiento, String curso, double nota1, double nota2) {
            this.numeroExpediente = numeroExpediente;
            this.nombre = nombre;
            this.apellidos = apellidos;
            this.fechaNacimiento = fechaNacimiento;
            this.curso = curso;
            this.nota1 = nota1;
            this.nota2 = nota2;
        }

        public int getNumeroExpediente() {
            return numeroExpediente;
        }

        public void setNumeroExpediente(int numeroExpediente) {
            this.numeroExpediente = numeroExpediente;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getApellidos() {
            return apellidos;
        }

        public void setApellidos(String apellidos) {
            this.apellidos = apellidos;
        }

        public String getFechaNacimiento() {
            return fechaNacimiento;
        }

        public void setFechaNacimiento(String fechaNacimiento) {
            this.fechaNacimiento = fechaNacimiento;
        }

        public String getCurso() {
            return curso;
        }

        public void setCurso(String curso) {
            this.curso = curso;
        }

        public double getNota1() {
            return nota1;
        }

        public void setNota1(double nota1) {
            this.nota1 = nota1;
        }

        public double getNota2() {
            return nota2;
        }

        public void setNota2(double nota2) {
            this.nota2 = nota2;
        }

        public double calcularMedia() {
            return (nota1 + nota2) / 2;
        }

        public String obtenerResumen() {
            return "Expediente: " + numeroExpediente + ", Nombre: " + nombre + ", Nota media: " + calcularMedia();
        }

        @Override
        public String toString() {
            return "Alumno{" +
                    "numeroExpediente=" + numeroExpediente +
                    ", nombre='" + nombre + '\'' +
                    ", apellidos='" + apellidos + '\'' +
                    ", fechaNacimiento='" + fechaNacimiento + '\'' +
                    ", curso='" + curso + '\'' +
                    ", nota1=" + nota1 +
                    ", nota2=" + nota2 +
                    '}';
        }
    }

class GestionAlumnos {

    // Atributo: Array de 10 alumnos
    private ejercicio6[] alumnos;

    public GestionAlumnos() {
        alumnos = new ejercicio6[10];
    }


    public void llenarArray() {
        alumnos[0] = new ejercicio6(12345, "pepe", "Pérez", "15/03/2000", "2º de Bachillerato", 7.5, 8.0);
        alumnos[1] = new ejercicio6(23456, "Ana", "García", "22/07/1999", "1º de Grado", 6.5, 7.0);
        alumnos[2] = new ejercicio6(34567, "Carlos", "Lopez", "10/12/2001", "2º de Bachillerato", 9.0, 8.5);
        alumnos[3] = new ejercicio6(45678, "Lucía", "Martínez", "01/04/2000", "1º de Grado", 5.5, 6.0);
        alumnos[4] = new ejercicio6(56789, "Pedro", "Sánchez", "25/11/1998", "2º de Grado", 8.5, 9.0);
        alumnos[5] = new ejercicio6(67890, "Maria", "Hernández", "14/02/2000", "3º de Bachillerato", 7.0, 7.5);
        alumnos[6] = new ejercicio6(78901, "Raúl", "gordillo", "30/06/1999", "2º de Grado", 9.5, 9.0);
        alumnos[7] = new ejercicio6(89012, "daniel", "Fernández", "12/05/2001", "1º de Bachillerato", 6.0, 6.5);
        alumnos[8] = new ejercicio6(90123, "Sergio", "gutierrez", "22/08/1999", "1º de Grado", 8.0, 7.0);
        alumnos[9] = new ejercicio6(10234, "antonio", "Díaz", "03/03/2000", "2º de Bachillerato", 7.0, 6.5);
    }


    public void mostrarAlumnos() {
        for (ejercicio6 alumno : alumnos) {
            if (alumno != null) {
                System.out.println(alumno);
                System.out.println("Nota media: " + alumno.calcularMedia() + "\n");
            }
        }
    }


    public void mostrarNotas() {
        for (ejercicio6 alumno : alumnos) {
            if (alumno != null) {
                System.out.println("Expediente: " + alumno.getNumeroExpediente() + ", Nombre: " + alumno.getNombre() +
                        ", Nota media: " + alumno.calcularMedia());
            }
        }
    }


    public ejercicio6 buscarAlumnoPorNumeroExpediente(int numeroExpediente) {
        for (ejercicio6 alumno : alumnos) {
            if (alumno != null && alumno.getNumeroExpediente() == numeroExpediente) {
                return alumno;
            }
        }
        return null;
    }
}

