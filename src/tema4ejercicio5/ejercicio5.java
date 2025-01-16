package tema4ejercicio5;

public class ejercicio5 {


        private int numeroExpediente;
        private String nombre;
        private String apellidos;
        private String fechaNacimiento;
        private String curso;
        private double nota1;
        private double nota2;


        public ejercicio5(int numeroExpediente, String nombre, String apellidos, String fechaNacimiento, String curso, double nota1, double nota2) {
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


