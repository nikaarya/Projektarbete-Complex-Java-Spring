package com.example.projectarbetecomplexjavaspring.service;

import com.example.projectarbetecomplexjavaspring.entity.AdminEntity;
import com.example.projectarbetecomplexjavaspring.repository.AdminRepository;
import com.example.projectarbetecomplexjavaspring.repository.StudentRepository;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;

@Service
public class AdminService {

    private final AdminRepository adminRepository;

    public AdminService(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }

    public AdminEntity createAdmin(AdminEntity adminEntity) {
        return adminRepository.save(adminEntity);
    }

    public void deleteAdmin(Long id) {
        AdminEntity foundAdmin = adminRepository.findById(id).orElseThrow(EntityNotFoundException::new);
        adminRepository.deleteById(foundAdmin.getId());
    }



}
