package mvn1.business;

import br.gov.frameworkdemoiselle.stereotype.BusinessController;
import br.gov.frameworkdemoiselle.template.DelegateCrud;
import mvn1.domain.Category;
import mvn1.persistence.CategoryDAO;

@BusinessController
public class CategoryBC extends DelegateCrud<Category, Long, CategoryDAO> {

	private static final long serialVersionUID = 1L;

}
