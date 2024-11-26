package com.example.admission.admissionswebsite.Dto;

import com.example.admission.admissionswebsite.Model.University;
import com.example.admission.admissionswebsite.Model.Users;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UniversityDto {
    private int id; // ID của trường đại học
    private String nameSchool; // Tên trường
    private String address; // Địa chỉ
    private String description; // Mô tả về trường
    private String universityLogo; // URL hoặc đường dẫn của logo trường
    private Integer userId; // ID của người dùng liên kết

    // Constructor từ `University` entity sang `UniversityDto`
    public UniversityDto(University university) {
        this.id = university.getId();
        this.nameSchool = university.getNameSchool();
        this.address = university.getAddress();
        this.description = university.getDescription();
        this.universityLogo = university.getUniversityLogo();
        this.userId = university.getUsers() != null ? Math.toIntExact(university.getUsers().getId()) : null;
    }

    // Constructor mặc định
    public UniversityDto() {}
}