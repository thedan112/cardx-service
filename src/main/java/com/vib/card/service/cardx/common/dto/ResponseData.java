package com.vib.card.service.cardx.common.dto;

import java.io.Serializable;

import com.vib.card.service.cardx.common.enums.Messages;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ResponseData<TData> implements Serializable {

	private static final long serialVersionUID = -3146895735776774462L;
	
    private String code;
    private String message;
    private TData data;
	
	 public ResponseData<TData> success (TData data) {

	        ResponseData<TData> res = new ResponseData<>();
	        res.setCode(Messages.SUCCESS.getCode());
	        res.setMessage(Messages.SUCCESS.getDescription());
	        res.setData(data);
	        return res;
	    }

	    public ResponseData<TData> error(Messages message){
	        ResponseData<TData> res = new ResponseData<>();
	        res.setCode(message.getCode());
	        res.setMessage(message.getDescription());
	        return res;
	    }

	    public boolean hadError(){
	        return !Messages.SUCCESS.getCode().equals(this.code);
	    }
	    public ResponseData<TData> error(String message){
	        ResponseData<TData> res = new ResponseData<>();
	        res.setCode(Messages.UNAUTHORIZED.getCode());
	        res.setMessage(message);
	        return res;
	    }
	    public ResponseData<TData> expired(TData data) {
	        ResponseData<TData> res = new ResponseData<>();
	        res.setCode(Messages.PASSWORD_EXPIRED.getCode());
	        res.setMessage(Messages.PASSWORD_EXPIRED.getDescription());
	        res.setData(data);
	        return res;
	    }

	
}
