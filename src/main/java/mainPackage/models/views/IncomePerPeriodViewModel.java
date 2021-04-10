package mainPackage.models.views;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class IncomePerPeriodViewModel {
    private LocalDateTime leaveDate;
    private BigDecimal totalSparePartsPrice;
    private BigDecimal totalRepairPrice;
    private String leaveDateString;

    public IncomePerPeriodViewModel() {
    }

    public IncomePerPeriodViewModel(LocalDateTime leaveDate, BigDecimal totalSparePartsPrice, BigDecimal totalRepairPrice,  String leaveDateString) {
        this.leaveDate = leaveDate;
        this.totalSparePartsPrice = totalSparePartsPrice;
        this.totalRepairPrice = totalRepairPrice;
        this.leaveDateString=leaveDateString;
    }

    public LocalDateTime getLeaveDate() {
        return leaveDate;
    }

    public void setLeaveDate(LocalDateTime leaveDate) {
        this.leaveDate = leaveDate;
    }

    public BigDecimal getTotalSparePartsPrice() {
        return totalSparePartsPrice;
    }

    public void setTotalSparePartsPrice(BigDecimal totalSparePartsPrice) {
        this.totalSparePartsPrice = totalSparePartsPrice;
    }

    public BigDecimal getTotalRepairPrice() {
        return totalRepairPrice;
    }

    public void setTotalRepairPrice(BigDecimal totalRepairPrice) {
        this.totalRepairPrice = totalRepairPrice;
    }

    public String getLeaveDateString() {
        return leaveDateString;
    }

    public void setLeaveDateString(String leaveDateString) {
        this.leaveDateString = leaveDateString;
    }
}
