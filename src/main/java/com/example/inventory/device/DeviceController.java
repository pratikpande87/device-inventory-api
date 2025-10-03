package com.example.inventory.device;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/devices")
public class DeviceController {

    private final DeviceService service;

    public DeviceController(DeviceService service) {
        this.service = service;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Device create(@Valid @RequestBody DeviceRequest req) {
        return service.create(req);
    }

    @GetMapping
    public List<Device> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public Device get(@PathVariable long id) {
        return service.get(id);
    }

    @PutMapping("/{id}")
    public Device update(@PathVariable long id, @Valid @RequestBody DeviceRequest req) {
        return service.update(id, req);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable long id) {
        service.delete(id);
    }
}
