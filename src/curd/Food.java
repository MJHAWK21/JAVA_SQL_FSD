package curd;

public class Food {
private String foodname;
private int foodprice;
private int id;

Food(String foodname, int foodprice,int id) {

	this.foodname = foodname;
	this.foodprice = foodprice;
	this.id=id;
}

public String getFoodname() {
	return foodname;
}

public void setFoodname(String foodname) {
	this.foodname = foodname;
}

public int getFoodprice() {
	return foodprice;
}

public void setFoodprice(int foodprice) {
	this.foodprice = foodprice;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id=id;
}

@Override
public String toString() {
	return "food [foodname=" + foodname + ", foodprice=" + foodprice + ", id=" + id + "]";
}

}


