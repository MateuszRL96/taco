package tacos.data;

import tacos.Taco;

public interface OrderRepository {
    Taco save(Taco design);
}
