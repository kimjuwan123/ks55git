package ksmybatis.admin.common.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ksmybatis.admin.common.domain.CommonCode;

@Mapper
public interface CommonMapper {
	public List<CommonCode> getCommonCodeListByGroupCode(String groupCode);
}
