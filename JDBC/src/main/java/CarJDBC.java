import java.sql.Connection;

import com.training.myapp.model.Car;
import com.training.myapp.model.CarDao;
import com.training.myapp.util.DBUtil;

public class CarJDBC {

	public static void main(String[] args) {
		try (Connection connection = DBUtil.getConnection()) {
			if (connection != null)
				System.out.println("---connected-----");

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("--failed-----");
		}
//		CarDao bike = new CarDao();
//     if
//     (bike.addCar(new Car(101,"ferarri","Black",8000000))
//			System.out.println("New car added");
//		else
//			System.out.println("--unable to add---");
//		
//		
//		// TODO Auto-generated method stub
//
//	
       
		
		
	}
}
