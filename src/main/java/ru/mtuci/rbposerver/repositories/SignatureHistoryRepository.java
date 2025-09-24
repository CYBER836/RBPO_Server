package ru.mtuci.rbposerver.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.mtuci.rbposerver.entities.SignatureHistory;

import java.util.UUID;

@Repository
public interface SignatureHistoryRepository extends JpaRepository<SignatureHistory, UUID> {
}
