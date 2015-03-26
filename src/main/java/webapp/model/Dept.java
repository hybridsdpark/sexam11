package webapp.model;

import java.lang.annotation.Target;
import java.util.List;

import javax.swing.text.StyledEditorKit.BoldAction;

public class Dept {

	Integer deptno;
	String dname;
	String loc;
	List<Emp> emps;
	
	public Dept() {

	
	}

	public Dept(Integer deptno,String dname,String loc) {
		this.deptno = deptno;
		this.dname =dname;
		this.loc =loc;
	
	}
	
	
	public Integer getDeptno() {
		return deptno;
	}
	public void setDeptno(Integer deptno) {
		this.deptno = deptno;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public List<Emp> getEmps() {
		return emps;
	}
	public void setEmps(List<Emp> emps) {
		this.emps = emps;
	}
	
	
	@Override
	public boolean equals(Object obj){
		if (obj ==null)
			return false;
		
		
		
		
		if(this.getClass() !=obj.getClass())
			return false;
			
		Dept taget = (Dept)obj;
		boolean rtn =true;
		
		
		if (this.deptno != taget.deptno) rtn =false;
		
		
		if (this.dname == null){
			if(this.dname != taget.dname) rtn =false;
		}else{
			if(!this.dname.equals(taget.dname)) rtn = false;
		}
		
		
		if(this.loc == null){
			if(this.loc != taget.loc) rtn =false;
		}else{
			if(!this.loc.equals(taget.loc)) rtn = false;
		}
		
		
		
		
		return rtn;
		
		
	}
	

}
