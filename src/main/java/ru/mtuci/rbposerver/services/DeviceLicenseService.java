package ru.mtuci.rbposerver.services;

import org.springframework.stereotype.Service;
import ru.mtuci.rbposerver.entities.DeviceLicense;
import ru.mtuci.rbposerver.entities.License;
import ru.mtuci.rbposerver.repositories.DeviceLicenseRepository;

import java.util.List;

@Service
public class DeviceLicenseService {

    private final DeviceLicenseRepository deviceLicenseRepository;

    public DeviceLicenseService(DeviceLicenseRepository deviceLicenseRepository) {
        this.deviceLicenseRepository = deviceLicenseRepository;
    }

    public List<DeviceLicense> getDeviceLicensesByLicense(License license) {
        return deviceLicenseRepository.getDeviceLicensesByLicense(license);
    }

    public void save(DeviceLicense deviceLicense) {
        deviceLicenseRepository.save(deviceLicense);
    }

    public DeviceLicense getDeviceLicenseByDeviceIdAndLicenseId(Long deviceId, Long licenseId) {
        return deviceLicenseRepository.getDeviceLicenseByDeviceIdAndLicenseId(deviceId, licenseId);
    }
}
