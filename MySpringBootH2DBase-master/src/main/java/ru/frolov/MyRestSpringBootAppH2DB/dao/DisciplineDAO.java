package ru.frolov.MyRestSpringBootAppH2DB.dao;

import org.springframework.stereotype.Repository;
import ru.frolov.MyRestSpringBootAppH2DB.entity.Discipline;

import java.util.List;

@Repository
public interface DisciplineDAO {
    List<Discipline> getAllDisciplines();
    Discipline saveDiscipline(Discipline discipline);
    Discipline getDiscipline(int disid);
    void deleteDiscipline(int disid);
}
