package net.javaguides.employee_service.dto;

public class DepartmentDto {
    private Long id;
    private String departmentName;
    private String departmentDescription;
    private String departmentCode;

    public DepartmentDto() {
    }

    public DepartmentDto(Long id, String departmentName, String departmentCode, String departmentDescription) {
        this.id = id;
        this.departmentName = departmentName;
        this.departmentCode = departmentCode;
        this.departmentDescription = departmentDescription;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDepartmentDescription() {
        return departmentDescription;
    }

    public void setDepartmentDescription(String departmentDescription) {
        this.departmentDescription = departmentDescription;
    }

    public String getDepartmentCode() {
        return departmentCode;
    }

    public void setDepartmentCode(String departmentCode) {
        this.departmentCode = departmentCode;
    }
}
