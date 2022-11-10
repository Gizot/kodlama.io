package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class HibernateProductDao implements ProductDao {
	public void add(Product product) {
		 //bu katman sadece ve sadece db erişim kodları buraya yazılır. SQL
		 System.out.println("Hibernate ile veri tabanına eklendi");
}
}
