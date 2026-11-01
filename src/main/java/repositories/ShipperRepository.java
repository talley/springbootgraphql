package repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import models.Shipper;

public interface ShipperRepository extends JpaRepository<Shipper, Short> {}
