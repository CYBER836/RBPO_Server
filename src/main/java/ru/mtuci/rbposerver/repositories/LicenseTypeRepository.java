package ru.mtuci.rbposerver.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.mtuci.rbposerver.entities.LicenseType;

@Repository
public interface LicenseTypeRepository extends JpaRepository<LicenseType, Long> {
    public LicenseType getLicenseTypeById(Long licenseTypeId);
    public LicenseType findLicenseTypeById(Long id);
}
