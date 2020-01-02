package pw.backend.lab.backlab.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pw.backend.lab.backlab.model.Parking;

public interface ParkingRepository extends JpaRepository<Parking, Long> {
}
