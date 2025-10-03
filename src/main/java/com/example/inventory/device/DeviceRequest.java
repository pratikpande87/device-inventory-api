package com.example.inventory.device;

import jakarta.validation.constraints.*;

public record DeviceRequest(
        @NotBlank String name,
        @NotBlank String serialNumber,
        @NotBlank String type,
        @Pattern(regexp = "ONLINE|OFFLINE|MAINTENANCE") String status,
        @Pattern(regexp = "^$|^(?:[0-9]{1,3}\.){3}[0-9]{1,3}$") String ipAddress
) {}
