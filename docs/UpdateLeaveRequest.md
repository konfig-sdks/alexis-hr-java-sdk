

# UpdateLeaveRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** |  |  [optional] |
|**childId** | **String** |  |  [optional] |
|**duration** | [**DurationEnum**](#DurationEnum) |  |  [optional] |
|**startDate** | **OffsetDateTime** |  |  [optional] |
|**endDate** | **OffsetDateTime** |  |  [optional] |
|**extent** | **Double** |  |  |
|**morning** | **Boolean** |  |  [optional] |
|**afternoon** | **Boolean** |  |  [optional] |
|**status** | **String** |  |  [optional] |
|**approvalNote** | **String** |  |  [optional] |



## Enum: DurationEnum

| Name | Value |
|---- | -----|
| MINUTES | &quot;minutes&quot; |
| HALF_DAY | &quot;half_day&quot; |
| ONE_DAY | &quot;one_day&quot; |
| LONGER | &quot;longer&quot; |



