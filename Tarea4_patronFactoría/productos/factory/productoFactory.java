package productos.factory;

import productos.Libro;
import productos.Revista;
import productos.Periodico;

public class productoFactory {
    public static Producto getProducto(int id){
        switch(id){
            case Producto.lib_100ideas:
                return new Libro(978607077, "100 ideas de negocios para arrancar hoy", "En marzo de 2020, a punto de que el mundo colapsara por una pandemia global, Carlos Master Muñoz sólo pensaba en una idea: «¿Cómo puedo hacerle frente a esta crisis y salir ganando?» La respuesta sigue siendo la misma: innovando. Como resultado, en lugar de perder dinero, Muñoz vivió el mejor año de su vida en términos financieros. La innovación salvó su vida y sus negocios en aquel año que para muchos fue nefasto.Y si tú entiendes esto, algo parecido te sucederá a ti. Para eso ha escrito este libro. ", "Carlos ''Master'' Muñóz", 500, 220);

            case Producto.lib_Sapiens:
                return new Libro(514893497, "Sapiens: De animales a dioses", "Sapiens. Una historia gráfica. Los pilares de la civilización explica cómo la especie Homo sapiens pasó de ser nómada a sedentaria y empezó a trabajar más duro sin por ello mejorar su calidad de vida. Revela cómo el trigo se apoderó del mundo; cómo un improbable matrimonio entre un dios y un burócrata dio lugar a los primeros imperios; cómo la guerra, el hambre, las enfermedades y la desigualdad se convirtieron en parte esencial de la condición humana, y por qué solo nosotros somos responsables de ello ", "Yuval Noah Harari", 340, 500);

            case Producto.lib_Teseo:
                return new Libro(548325976, "Teseo y el Minotauro. Libro ilustrado", "Libro que narra los principales episodios de la aventurera vida de Teseo, el héroe griego que mató al Minotauro. El libro cuenta con bloques de juegos y de información sobre diversos aspectos de la cultura griega.", "Desconocido ", 50, 15);

            case Producto.rev_national:
                return new Revista(59318527, "National Geographic", 2, "mensual", 85);

            case Producto.rev_vogue:
                return new Revista(297284381, "Vogue", 1, "mensual", 90);

            case Producto.rev_tu:
                return new Revista(158921774, "Tú", 7, "mensual", 70);

            case Producto.per_elsol:
                return new Periodico(518972684, "El Sol de México", "14/06/2010", 10);

            case Producto.per_marca:
                return new Periodico(18249378, "Marca", "08/01/2015", 10);

            case Producto.per_reforma:
                return new Periodico(954172813, "Reforma", "26/09/2019", 20);
        }

        return null;
    }

}