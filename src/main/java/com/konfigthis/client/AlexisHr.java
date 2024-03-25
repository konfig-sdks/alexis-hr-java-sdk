package com.konfigthis.client;

import com.konfigthis.client.api.ChildApi;
import com.konfigthis.client.api.CompanyApi;
import com.konfigthis.client.api.CompensationApi;
import com.konfigthis.client.api.CostCenterApi;
import com.konfigthis.client.api.DepartmentApi;
import com.konfigthis.client.api.EmployeeApi;
import com.konfigthis.client.api.EmployeeTeamReferenceApi;
import com.konfigthis.client.api.EmploymentApi;
import com.konfigthis.client.api.EmploymentTypeApi;
import com.konfigthis.client.api.LeaveApi;
import com.konfigthis.client.api.LeaveTransactionApi;
import com.konfigthis.client.api.LeaveTypeApi;
import com.konfigthis.client.api.OfficeApi;
import com.konfigthis.client.api.TeamApi;
import com.konfigthis.client.api.TimesheetApi;
import com.konfigthis.client.api.TimesheetEntryApi;
import com.konfigthis.client.api.TimesheetEntryTypeApi;
import com.konfigthis.client.api.WorkWeekApi;

public class AlexisHr {
    private ApiClient apiClient;
    public final ChildApi child;
    public final CompanyApi company;
    public final CompensationApi compensation;
    public final CostCenterApi costCenter;
    public final DepartmentApi department;
    public final EmployeeApi employee;
    public final EmployeeTeamReferenceApi employeeTeamReference;
    public final EmploymentApi employment;
    public final EmploymentTypeApi employmentType;
    public final LeaveApi leave;
    public final LeaveTransactionApi leaveTransaction;
    public final LeaveTypeApi leaveType;
    public final OfficeApi office;
    public final TeamApi team;
    public final TimesheetApi timesheet;
    public final TimesheetEntryApi timesheetEntry;
    public final TimesheetEntryTypeApi timesheetEntryType;
    public final WorkWeekApi workWeek;

    public AlexisHr() {
        this(null);
    }

    public AlexisHr(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.child = new ChildApi(this.apiClient);
        this.company = new CompanyApi(this.apiClient);
        this.compensation = new CompensationApi(this.apiClient);
        this.costCenter = new CostCenterApi(this.apiClient);
        this.department = new DepartmentApi(this.apiClient);
        this.employee = new EmployeeApi(this.apiClient);
        this.employeeTeamReference = new EmployeeTeamReferenceApi(this.apiClient);
        this.employment = new EmploymentApi(this.apiClient);
        this.employmentType = new EmploymentTypeApi(this.apiClient);
        this.leave = new LeaveApi(this.apiClient);
        this.leaveTransaction = new LeaveTransactionApi(this.apiClient);
        this.leaveType = new LeaveTypeApi(this.apiClient);
        this.office = new OfficeApi(this.apiClient);
        this.team = new TeamApi(this.apiClient);
        this.timesheet = new TimesheetApi(this.apiClient);
        this.timesheetEntry = new TimesheetEntryApi(this.apiClient);
        this.timesheetEntryType = new TimesheetEntryTypeApi(this.apiClient);
        this.workWeek = new WorkWeekApi(this.apiClient);
    }

}
