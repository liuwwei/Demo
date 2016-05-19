package com.zbrx.yt.model;

public class Emp_yt {
    @Override
	public String toString() {
		return "Emp_yt [empId=" + empId + ", empno=" + empno + ", ename="
				+ ename + ", depno=" + depno + ", depname=" + depname
				+ ", job=" + job + ", sal=" + sal + "]";
	}

	private Integer empId;

    private Integer empno;

    private String ename;

    private String depno;

    private String depname;

    private String job;

    private Integer sal;

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public Integer getEmpno() {
        return empno;
    }

    public void setEmpno(Integer empno) {
        this.empno = empno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename == null ? null : ename.trim();
    }

    public String getDepno() {
        return depno;
    }

    public void setDepno(String depno) {
        this.depno = depno == null ? null : depno.trim();
    }

    public String getDepname() {
        return depname;
    }

    public void setDepname(String depname) {
        this.depname = depname == null ? null : depname.trim();
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job == null ? null : job.trim();
    }

    public Integer getSal() {
        return sal;
    }

    public void setSal(Integer sal) {
        this.sal = sal;
    }
}