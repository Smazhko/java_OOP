package TradeAutomaton;

import java.util.List;

interface ITradeAutomaton {

	void addProduct(Product newProduct);

	void addProductList(List<? extends Product> newList);

	void printProducts();

	void buy(int productID);

	String toString();

}

