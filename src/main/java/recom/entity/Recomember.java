package recom.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "recomember")
public class Recomember {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "recomember_id", precision = 10, nullable = false, unique = true)
    public Integer recomemberId;

    @Column(name = "recomember_name", nullable = false)
    public String recomemberName;

    @Column(name = "phone_number", nullable = true)
    public String phoneNumber;

    @Column(name = "birth_year", nullable = true)
    public String birthYear;

    @Column(name = "birth_month", nullable = true)
    public String birthMonth;

    @Column(name = "birth_day", nullable = true)
    public String birthDay;

    @Column(name = "favorite_food", nullable = true)
    public String favoriteFood;

    @Column(name = "info_note", nullable = true)
    public String note;

    @Column(name = "talk_status", nullable = true)
    public Integer talkStatus;

    @Column(name = "delete_status", nullable = true)
    public Integer deleteStatus;

    @Column(name = "register_day", nullable = true)
    @Temporal(TemporalType.TIMESTAMP)
    public Timestamp registerDay;

    @Column(name = "update_day", nullable = true)
    @Temporal(TemporalType.TIMESTAMP)
    public Timestamp updateDay;
}
