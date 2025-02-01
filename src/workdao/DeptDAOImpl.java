package workdao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DeptDAOImpl implements DeptDAO {

	// 連結資料庫資訊
	public static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	public static final String URL = "jdbc:mysql://localhost:3306/jdbcsample?serverTimezone=Asia/Taipei";
	public static final String USER = "root";
	public static final String PASSWORD = "123456";

	// SQL指令
	public static final String INSERT_STMT = "insert into department values (?, ?, ?)";
	public static final String FIND_BY_PK = "select * from department where deptno = ?";
	public static final String GET_ALL = "select * from department order by deptno desc";
	public static final String UPDATE_STMT = "UPDATE department SET dname = ?, loc = ? WHERE deptno = ?";
	public static final String DELETE_STMT = "DELETE FROM department WHERE deptno = ?";
	
	
	static {
		// step 1: 載入驅動
		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

	//新增的方法
	@Override
	public void save(Dept dept) {
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			
			con = DriverManager.getConnection(URL, USER, PASSWORD);
			pstmt = con.prepareStatement(INSERT_STMT);
			
			pstmt.setInt(1, dept.getDeptno());
			pstmt.setString(2, dept.getDname());
			pstmt.setString(3, dept.getLoc());
			
			pstmt.executeUpdate();
			
		}catch(SQLException se) {
			se.printStackTrace();
		}finally {
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

	}

	//更新
	@Override
	public void update(Dept dept) {
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = DriverManager.getConnection(URL, USER, PASSWORD);
			pstmt = con.prepareStatement(UPDATE_STMT);
			
			pstmt.setString(1, dept.getDname());
			pstmt.setString(2, dept.getLoc());
			pstmt.setInt(3, dept.getDeptno());
			
			
			pstmt.executeUpdate();
			
		}catch(SQLException e){
			e.printStackTrace();
		}finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO 自動產生的 catch 區塊
					e.printStackTrace();
				}
			}

		}
		

	}
	
	//刪除
	@Override
	public void delete(Integer deptno) {
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = DriverManager.getConnection(URL, USER, PASSWORD);
			pstmt = con.prepareStatement(DELETE_STMT);
			

			pstmt.setInt(1, deptno);
			
			
			pstmt.executeUpdate();
			
		}catch(SQLException e){
			e.printStackTrace();
		}finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO 自動產生的 catch 區塊
					e.printStackTrace();
				}
			}

		}

	}
	
	//單筆查詢
	@Override
	public Dept findByPK(Integer deptno) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Dept dept = null;
		
		try {
			
			con = DriverManager.getConnection(URL, USER, PASSWORD);
			pstmt = con.prepareStatement(FIND_BY_PK);
			pstmt.setInt(1, deptno);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				String name = rs.getString("dname");
				String location = rs.getString("loc");
				//使用Dept Bean 包裝查詢出來的資料
				dept = new Dept(deptno, name, location);
				
			}
			
		}catch(SQLException se) {
			se.printStackTrace();
		}finally {
			
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

		}
		
		
		return dept;
	}

	
	//多筆查詢
	@Override
	public List<Dept> getAll() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<Dept> deptList = new ArrayList<>();
		
		try {
			
			con = DriverManager.getConnection(URL, USER, PASSWORD);
			pstmt = con.prepareStatement(GET_ALL);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				int no = rs.getInt("deptno");
				String name = rs.getString("dname");
				String location = rs.getString("loc");
				//使用Dept Bean 包裝查詢出來的資料
				Dept dept = new Dept(no, name, location);
				//將包裝好的 dept Bean, 用集合收集起來
				deptList.add(dept);
			}
			
		}catch(SQLException se) {
			se.printStackTrace();
		}finally {
			
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

		}
		
		return deptList;
		
	}

}
