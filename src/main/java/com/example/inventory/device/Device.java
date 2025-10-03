package com.example.inventory.device;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
public class Device {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Column(nullable = false)
    private String name;

    @NotBlank
    @Column(nullable = false, unique = true)
    private String serialNumber;

    @NotBlank
    private String type; // e.g., router, switch, server

    @Pattern(regexp = "ONLINE|OFFLINE|MAINTENANCE", message = "status must be ONLINE, OFFLINE, or MAINTENANCE")
    private String status = "OFFLINE";

    @Pattern(regexp = "^$|^(?:[0-9]{1,3}\.){3}[0-9]{1,3}$", message = "ipAddress must be a valid IPv4 address")
    private String ipAddress;

    // Getters and setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getSerialNumber() { return serialNumber; }
    public void setSerialNumber(String serialNumber) { this.serialNumber = serialNumber; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public String getIpAddress() { return ipAddress; }
    public void setIpAddress(String ipAddress) { this.ipAddress = ipAddress; }
}
