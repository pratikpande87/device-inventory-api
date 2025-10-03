package com.example.inventory.device;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class DeviceService {
    private final DeviceRepository repo;

    public DeviceService(DeviceRepository repo) {
        this.repo = repo;
    }

    public Device create(DeviceRequest req) {
        Device d = new Device();
        d.setName(req.name());
        d.setSerialNumber(req.serialNumber());
        d.setType(req.type());
        d.setStatus(req.status() == null ? "OFFLINE" : req.status());
        d.setIpAddress(req.ipAddress());
        return repo.save(d);
    }

    public List<Device> list() {
        return repo.findAll();
    }

    public Device get(long id) {
        return repo.findById(id).orElseThrow(() -> new IllegalArgumentException("Device not found: " + id));
    }

    public Device update(long id, DeviceRequest req) {
        Device d = get(id);
        d.setName(req.name());
        d.setSerialNumber(req.serialNumber());
        d.setType(req.type());
        d.setStatus(req.status() == null ? d.getStatus() : req.status());
        d.setIpAddress(req.ipAddress());
        return repo.save(d);
    }

    public void delete(long id) {
        repo.deleteById(id);
    }
}
