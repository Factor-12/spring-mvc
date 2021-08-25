package web.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Repository;
import web.model.Car;

@Repository
public class CarDaoImpl implements CarDao{
    private List<Car> cars;

    {
        cars = new ArrayList<>();

        cars.add(new Car("Renault", "Yellow", 2007));
        cars.add(new Car("BMW", "Gold", 2015));
        cars.add(new Car("Mercedes-Benz", "Black", 2019));
        cars.add(new Car("Porsche", "White", 2017));
        cars.add(new Car("Mitsubishi", "Blue", 2008));
    }

    @Override
    public List<Car> getCars(int count) {
        if (count == 0) {
            return null;
        }
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
