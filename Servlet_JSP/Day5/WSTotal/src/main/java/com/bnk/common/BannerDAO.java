package com.bnk.common;

import java.sql.SQLException;
import java.util.List;

public interface BannerDAO {
	List<String> listBanner()throws SQLException ;
}
