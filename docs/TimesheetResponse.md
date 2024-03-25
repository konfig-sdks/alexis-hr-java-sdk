

# TimesheetResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  |
|**status** | [**StatusEnum**](#StatusEnum) |  |  |
|**startDate** | **OffsetDateTime** |  |  |
|**endDate** | **OffsetDateTime** |  |  |
|**localCutOffDate** | **OffsetDateTime** |  |  |
|**utcCutOffDate** | **OffsetDateTime** |  |  |
|**approvalDeadlineDate** | **OffsetDateTime** |  |  |
|**interval** | [**IntervalEnum**](#IntervalEnum) |  |  |
|**note** | **String** |  |  [optional] |
|**approverEmployeeId** | **String** |  |  |
|**employeeId** | **String** |  |  |
|**submitDate** | **OffsetDateTime** |  |  |
|**approvalDate** | **OffsetDateTime** |  |  |
|**rejectedDate** | **OffsetDateTime** |  |  |
|**updated** | **OffsetDateTime** |  |  [optional] |
|**timezone** | **String** |  |  |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PENDING | &quot;PENDING&quot; |
| SUBMITTED | &quot;SUBMITTED&quot; |
| APPROVED | &quot;APPROVED&quot; |
| REJECTED | &quot;REJECTED&quot; |



## Enum: IntervalEnum

| Name | Value |
|---- | -----|
| WEEKLY | &quot;WEEKLY&quot; |
| MONTHLY | &quot;MONTHLY&quot; |



