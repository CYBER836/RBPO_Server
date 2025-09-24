package ru.mtuci.rbposerver.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.mtuci.rbposerver.entities.DeviceLicense;
import ru.mtuci.rbposerver.entities.License;

import java.util.List;

@Repository
public interface DeviceLicenseRepository extends JpaRepository<DeviceLicense, Long> {
    DeviceLicense getDeviceLicenseByDeviceIdAndLicenseId(Long deviceId, Long licenseId);
    List<DeviceLicense> getDeviceLicensesByLicense(License license);

}
