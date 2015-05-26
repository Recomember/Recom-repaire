package recom.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.seasar.framework.container.annotation.tiger.Component;
import org.seasar.framework.container.annotation.tiger.InstanceType;

@Component(instance = InstanceType.SESSION)
public class RecomemberInfoDto implements Serializable {

	private static final long serialVersionUID = 1L;

    public List<RecomemberInfoDto> recomemberInfoDtos = new ArrayList<>();

    public Integer recomemberId;

    public String talkStatus;

    public String memberName;

    public String phoneNumber;

    public String birthYear;

    public String birthMonth;

    public String birthDay;

    public String note;

    public String favoriteFood;



    public RecomemberInfoDto(){}

    public RecomemberInfoDto(Integer recomemberId, String memberName, String phoneNumber, String birthYear, String birthMonth, String birthDay, String note, String favoriteFood){

    	this.memberName = memberName;
    	this.phoneNumber = phoneNumber;
    	this.birthYear = birthYear;
    	this.birthMonth = birthMonth;
    	this.birthDay = birthDay;
    	this.note = note;
    	this.recomemberId = recomemberId;
    	this.favoriteFood = favoriteFood;


    }
}