package models;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


@Table(name = "daily_report_system")

@NamedQueries({
    @NamedQuery(
            name = "getAllEmployees",
            query = "SELECT e FROM Employee AS e ORDER BY e.id DESC"
    ),
    @NamedQuery(
            name = "getEmployeeCount",
            query = "SELECT COUNT(e) FROM Employee AS e"
    ),
    @NamedQuery(
            name = "checkRegisterCode",
            query = "SELECT COUNT(e) FROM Employee AS e WHERE e.code = :code"
    ),
    @NamedQuery(
            name = "checkLoginCodeAndPassword",
            query = "SELECT e FROM Employee AS e WHERE e.delete_flag = 0 AND e.code = :code AND e.password = :pass"
    )
})

@Entity

public class Employee {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "code", nullable = false, unique = true)
    private String code;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "password", length = 64, nullable = false)
    private String password;

    @Column(name = "admin_flag", nullable = false)
    private int admin_flag;

    @Column(name = "create_time", nullable = false)
    private Timestamp create_time;

    @Column(name = "update_time", nullable = false)
    private Timestamp update_time;

    @Column(name = "delete_flag", nullable = false)
    private int delete_flag;




    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAdmin_flag() {
        return admin_flag;
    }

    public void setAdmin_flag(int admin_flag) {
        this.admin_flag = admin_flag;
    }

    public Timestamp getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Timestamp create_time) {
        this.create_time = create_time;
    }

    public Timestamp getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(Timestamp update_time) {
        this.update_time = update_time;
    }

    public int getDelete_flag() {
        return delete_flag;
    }

    public void setDelete_flag(int delete_flag) {
        this.delete_flag = delete_flag;
    }





}
