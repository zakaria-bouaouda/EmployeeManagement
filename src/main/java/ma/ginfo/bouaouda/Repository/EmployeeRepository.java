package ma.ginfo.bouaouda.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.ginfo.bouaouda.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long>{

}
