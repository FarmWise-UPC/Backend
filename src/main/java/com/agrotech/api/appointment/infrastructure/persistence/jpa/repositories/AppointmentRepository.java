package com.agrotech.api.appointment.infrastructure.persistence.jpa.repositories;

import com.agrotech.api.appointment.domain.model.aggregates.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
    List<Appointment> findByAvailableDate_Advisor_Id(Long advisorId);
    List<Appointment> findByFarmer_Id(Long farmerId);
    List<Appointment> findByAvailableDate_Advisor_IdAndFarmer_Id(Long advisorId, Long farmerId);
}
