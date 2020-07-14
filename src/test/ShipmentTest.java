package test;

import main.com.java.collections.Shipment;
import org.junit.Test;

import static main.com.java.collections.ProductFixtures.*;
import static org.hamcrest.Matchers.contains;
import static org.junit.Assert.assertThat;

public class ShipmentTest {

    private Shipment shipment = new Shipment();

    @Test
    public void shouldAddItems() throws Exception {
        shipment.add(door);
        shipment.add(window);

        assertThat(shipment, contains(door,window));
    }

    @Test
    public void shouldReplaceItems() throws Exception {
        shipment.add(door);
        shipment.add(window);

        shipment.replace(door, floorPanel);
        assertThat(shipment, contains(floorPanel, window));
    }

    
}
