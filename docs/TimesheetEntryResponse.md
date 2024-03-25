

# TimesheetEntryResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  |
|**timesheetId** | **String** |  |  |
|**typeId** | **String** |  |  |
|**employeeId** | **String** |  |  |
|**date** | **OffsetDateTime** |  |  |
|**updated** | **OffsetDateTime** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  |
|**minutes** | **Double** |  |  |
|**note** | **String** |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PENDING | &quot;PENDING&quot; |
| SUBMITTED | &quot;SUBMITTED&quot; |
| APPROVED | &quot;APPROVED&quot; |
| REJECTED | &quot;REJECTED&quot; |



