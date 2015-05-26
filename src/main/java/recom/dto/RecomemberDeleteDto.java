package recom.dto;

import java.util.ArrayList;
import java.util.List;

public class RecomemberDeleteDto {

	public RecomemberDeleteDto() {}

	public List<RecomemberDeleteDto> recomemberDeleteDtos = new ArrayList<>();

	 public String talkStatus;

	public Integer recomemberId;

	public String memberName;

    public String phoneNumber;

    public String birthYear;

    public String birthMonth;

    public String birthDay;

    public String note;

    public String favoriteFood;

    public RecomemberDeleteDto(String memberName, String phoneNumber, String birthYear, String birthMonth, String birthDay, String note, Integer recomemberId, String favoriteFood){
    	this.memberName = memberName;
    	this.phoneNumber = phoneNumber;
    	this.birthYear = birthYear;
    	this.birthMonth = birthMonth;
    	this.birthDay = birthDay;
    	this.note = note;
    	this.recomemberId =recomemberId;
    	this.favoriteFood = favoriteFood;
    }

}