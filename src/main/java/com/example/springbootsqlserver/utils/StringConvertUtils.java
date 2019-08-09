package com.example.springbootsqlserver.utils;

import com.example.springbootsqlserver.contant.CommonContant;
import com.example.springbootsqlserver.entity.bo.BasePage;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * 
 * @author kuikui.he
 * @date 2019年8月8日上午10:19:49
 * @Description:
 */
public class StringConvertUtils {

	/**
	 * 将集合字符串转成列表
	 *
	 * @param str 集合字符串
	 * @return 列表
	 */
	public static List<String> getListByStr(String str) {
		List<String> result = new ArrayList<>();
		if (!StringUtils.isEmpty(str)) {
			if (!str.contains(CommonContant.COMMA)) {
				result.add(str);
			} else {
				String[] arrStr = str.split(CommonContant.COMMA);
				Collections.addAll(result, arrStr);
			}
		}
		return result;
	}

	/**
	 * 将集合拼接成以逗号分隔的字符串
	 *
	 * @param collection 集合
	 * @return 字符串
	 */
	public static String getStrByCollection(Collection<String> collection) {
		StringBuilder result = new StringBuilder();
		if (collection == null || collection.size() == 0) {
			return result.toString();
		} else {
			for (String s : collection) {
				result.append(s).append(",");
			}
			String str = result.toString();
			str = str.substring(0, str.length() - 1);
			return str;
		}
	}

	public static BasePage transferBasePage(String pageIndex, String pageSize) {
		// 从第0页开始
		int iPageIndex = 0;
		int iPageSize = 20;
		try {
			iPageIndex = Integer.parseInt(pageIndex);
		} catch (Exception e) {
			// iPageIndex = 0;
		}
		try {
			iPageSize = Integer.parseInt(pageSize);
		} catch (Exception e) {
			// iPageSize = 20;
		}
		int pageStart = iPageIndex * iPageSize + 1;
		int pageEnd = pageStart + iPageSize - 1;

		BasePage basePage = new BasePage();
		basePage.setPageStart(pageStart);
		basePage.setPageEnd(pageEnd);

		return basePage;
	}

}
