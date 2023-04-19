package com.vib.card.service.cardx.common.enums;

public enum Messages {

	// Base error message
	SUCCESS("000000", "Thành Công"),
    BAD_REQUEST("000001", "Yêu cầu không hợp lệ"),
    ACCESS_DENIED_SERVER_ERROR("000002", "Bạn không có quyền thực hiện chức năng này."),
    WHITELIST_DENIED_ERROR("000005", "Bạn không có quyền thực hiện chức năng này."),
    NOT_FOUND("000003", "Không tìm thấy thông tin"),
    UNAUTHORIZED("000004", "Chưa xác thực."),
    
    INTERNAL_SERVER_ERROR("999999", "Internal server error"),
    //excel prefix 5
    EXCEL_REQUIRED("500001", "Thông tin bắt buộc nhập."),
    EXCEL_INVALID("500002", "Thông tin không hợp lệ."),
    EXCEL_LIMITED("500003", "Dữ liệu được giới hạn 200 dòng."),
    
    JOB_EXIST("600001", "Cấu hình đã tồn tại."),
    JOB_NOT_FOUND("600002", "Cấu hình không tồn tại."),
    //user prefix 1
    USER_LEAK_INFO("100007", "Thông tin không hợp lệ."),
    USER_LOCKED("10000", "Người dùng đang bị khóa"),
    USER_EXIST("100001", "Người dùng đã tồn tại."),
    USER_INVALID_OR_STATUS_INACTIVE("100002", "Người dùng chưa kích hoạt."),
    PASSWORD_EXPIRED("100003", "Mật khẩu hết hạn."),
    PASSWORD_FAIL("100004", "Mật khẩu không đúng."),
    PASSWORD_INVALID("100007", "Mật khẩu không hợp lệ."),
    PASSWORD_NOTMATCH("100008", "Xác nhận mật khẩu không đúng."),
    PASSWORD_NOTFOUND("100009", "Mật khẩu cũ không hợp lệ."),
    USER_NOT_FOUND("100005", "Người dùng không tồn tại."),
    USER_BAD_CREDENTIAL("100006", "Người dùng hoặc mật khẩu không đúng."),
    //permission prefix 2
    ROLE_EXIST("200000", "Role exist."),
    ROLE_INVALID("200001", "Role Invalid."),
    PARENT_FUNCTION_INVALID("200002", "Parent function invalid."),
    DELETE_ROLE_HAD_PERMISSION("200003", "Had permission with role."),
    FUNCTION_CONTAIN_PERMISSION("200004", "Had error function contain permission."),
    FUNCTION_EXIST("200005", "Function exist."),
    VENDOR_EXIST("200006", "Vendor exist."),
    VENDOR_INVALID ("200007", "Vendor Invalid."),
    RESOURCE_EXIST("200008", "Resource exist."),
    //installment prefix 4
    INSTALLMENT_EXIST("400000", "Trả góp đã tòn tại."),
    INSTALLMENT_NOT_FOUND("400001", "Trả góp không tồn tại."),
    INSTALLMENT_INVALID("400005", "Trả góp không hợp lệ."),
    INSTALLMENT_MODIFY_INVALID("400006", "Thay đổi thông tin trả góp không hợp lệ."),
    INSTALLMENT_STATUS_INVALID("400002", "Trạng thái trả góp không hợp lệ."),
    INSTALLMENT_TRANSDATE_INVALID("400007", "Ngày giao dịch phải <= ngày hiện tại."),
    INSTALLMENT_TRANSDATE_EXPIRED("400008", "Ngày giao dịch chỉ được chọn trong vòng 60 ngày."),
    INSTALLMENT_TRANSDATE_NULL("400009", "Vui lòng chọn ngày giao dịch."),
    INSTALLMENT_REJECT_INVALID("400010", "Chỉ được hủy giao dịch trong ngày."),
    AMOUNT_INVALID("400003", "Số tiền không hợp lệ."),
    PERIOD_INVALID("400004", "Kì hạn không hợp lệ."),
    //
    INSTALLMENT_PERMISSION_DENIED("400005", "Bạn không có quyền tạo trả góp."),
    INSTALLMENT_PERMISSION_NOTMATCH("400006", "Bạn không được phép thực hiện chức năng này."),
    //category prefix 3
    MERCHANT_NOT_FOUND("300000", "Đối tác không tồn tại."),
    MERCHANT_INVALID("300000", "Đối tác không còn hiệu lực."),
    MERCHANT_EXIST("300001", "Đối tác đã tồn tại."),
    PROGRAM_EXIST("300002", "Chương trình đã tồn tại."),
    PROGRAM_NOT_FOUND("300003", "Chương trình không tồn tại."),
    PROGRAM_INVALID("300004", "Chương trình không hợp lệ."),
    POLICY_NOT_FOUND("300005", "Chính sách không tồn tại."),
    POLICY_EXIST("300006", "Chính sách đã tồn tại."),
    PROGRAM_MINAMOUNT("300007", "Số tiền tối thiểu phải > 0."),
    PROGRAM_VAT("300008", "VAT phải > 0."),
    MID_NOT_FOUND("300000", "MID không tồn tại."),
    ;

	private final String code;
	private final String description;

	private Messages(String code, String description) {
		this.code = code;
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public String getCode() {
		return code;
	}

	@Override
	public String toString() {
		return description;
	}
}
