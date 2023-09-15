package Herencias.Ejercicios.DesafioExtra.entidades;

import java.util.List;

import static Herencias.Ejercicios.DesafioExtra.Actividad.Main.leer;

public class ResumenHospital {
    private List<Familia> familias;

    public ResumenHospital(List<Familia> familias) {
        this.familias = familias;
    }

    public int contarCantidadPersonas() {
        int cantidadPersonas = 0;
        for (Familia familia : familias) {
            cantidadPersonas += familia.getIntegrantes().size();
        }
        return cantidadPersonas;
    }

    // Implementa los métodos para calcular otros datos requeridos, como sexo, edad, problemas de salud, abordaje nutricional, etc.

    public void mostrarResumen() {
        System.out.println("Resumen del Hospital:");
        System.out.println("Cantidad de personas: " + contarCantidadPersonas());
        // Mostrar otros resúmenes aquí
    }

    public void mostrarMenu() {
        int opcion;

        do {
            System.out.println("Menú de Resumen Hospital");
            System.out.println("1. Ver cantidad de personas");
            System.out.println("2. Ver distribución por sexo");
            System.out.println("3. Ver resumen de problemas de salud");
            System.out.println("4. Ver resumen de abordaje nutricional");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Cantidad de personas: " + contarCantidadPersonas());
                    break;
                case 2:
                    int hombres = 0;
                    int mujeres = 0;

                    for (Familia familia : familias) {
                        for (Integrante integrante : familia.getIntegrantes()) {
                            if (integrante.getSexo().equalsIgnoreCase("masculino")) {
                                hombres++;
                            } else if (integrante.getSexo().equalsIgnoreCase("femenino")) {
                                mujeres++;
                            }
                        }
                    }

                    System.out.println("Distribución por sexo:");
                    System.out.println("Hombres: " + hombres);
                    System.out.println("Mujeres: " + mujeres);
                    break;
                case 3:
                    int personasConHTA = 0;
                    int personasConDBT = 0;

                    for (Familia familia : familias) {
                        for (Integrante integrante : familia.getIntegrantes()) {
                            for (ProblemaSalud problemaSalud : integrante.getProblemasSalud()) {
                                if (problemaSalud.isHTA()) {
                                    personasConHTA++;
                                }
                                if (problemaSalud.isDBT()) {
                                    personasConDBT++;
                                }
                            }
                        }
                    }

                    System.out.println("Resumen de problemas de salud:");
                    System.out.println("Personas con Hipertensión (HTA): " + personasConHTA);
                    System.out.println("Personas con Diabetes (DBT): " + personasConDBT);
                    break;
                case 4:
                    int personasEutroficas = 0;
                    int personasBajoPeso = 0;
                    int personasSobrePeso = 0;

                    for (Familia familia : familias) {
                        for (Integrante integrante : familia.getIntegrantes()) {
                            for (AbordajeNutricional abordajeNutricional : integrante.getAbordajesNutricionales()) {
                                if (abordajeNutricional.isEutrofico()) {
                                    personasEutroficas++;
                                }
                                if (abordajeNutricional.isBajoPeso()) {
                                    personasBajoPeso++;
                                }
                                if (abordajeNutricional.isSobrePeso()) {
                                    personasSobrePeso++;
                                }
                            }
                        }
                    }

                    System.out.println("Resumen de abordaje nutricional:");
                    System.out.println("Personas con peso normal (Eutroficos): " + personasEutroficas);
                    System.out.println("Personas con bajo peso: " + personasBajoPeso);
                    System.out.println("Personas con sobrepeso: " + personasSobrePeso);
                    break;
                case 5:
                    System.out.println("Saliendo del menú.");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 5);
    }
}
