package ru.mybatistmpl.db.persistence;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import ru.mybatistmpl.template.Generation;
import ru.mybatistmpl.template.Masking;

import java.util.List;

@Mapper
@Repository
public interface TemplateMapper {
    List<Generation> getAllFromGeneration();
    List<Masking> getAllFromMasking();
}
