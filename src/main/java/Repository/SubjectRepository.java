package Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Entity.Subject;

public interface SubjectRepository extends JpaRepository<Subject, String>{

}
