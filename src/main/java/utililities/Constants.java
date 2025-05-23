package utililities;

import lombok.Getter;

public class Constants {

    /*  --------------------------------------config properties------------------------------------- */
    public static final String CONFIG_WEB_PROPERTIES = "configWeb.properties";
    public static final String CONFIG_DB_PROPERTIES = "configDatabase.properties";
    public static final String CONFIG_SERVICE_PROPERTIES = "configService.properties";
    public static final String CONFIG_TOKEN_PROPERTIES = "configTokenService.properties";


    /*  -------------------------------------- TOKEN ------------------------------------- */
    public static final String TOKEN_IBANK_BO = "token_ibank_BO";
    public static final String TOKEN_IBANK_FO_UTILITIES_MOBILE = "token_ibank_FO_utilities_mobile";
    public static final String TOKEN_CIMBACK_MAKER = "token_cimback_maker";
    public static final String TOKEN_CIMBACK_CHECKER = "token_cimback_checker";
    /*  -------------------------------------- Tham so  ------------------------------------- */
    public static final String API_UPDATE_CAYSP = "update_caySP";
    public static final String API_APPROVE_CAYSP = "approve_caySP";
    public static final String API_GET_CATEGORY = "get_list_category";

    /*  --------------------------------------ONBOARD ------------------------------------- */
    public static final String API_COMMON_ONBOARD_CIF_PKG_LIST = "get_common_onboard_cif_pkg_list";
    public static final String CREATE_MO_HINH_PHE_DUYET_WORKFLOWS = "create_mo_hinh_phe_duyet_workflow";
    public static final String API_GET_WORKFLOW_ROLE_LIST = "get_workflow_role_list";
    public static final String API_GET_DANH_SACH_VAI_TRO = "get_danh_sach_vai_tro";
    public static final String API_CREATE_SAVE_PHAN_QUYEN = "create_save_phan_quyen";
    public static final String API_GET_DETAIL_WORKFLOW_CUS = "get_detail_workflow_cus";


    public static final String API_GET_PRODUCT_LIST = "get_product_list";
    public static final String API_CHI_TIET_DICH_VU = "get_chi_tiet_dich_vu";
    public static final String API_CHI_TIET_PHAN_QUYEN = "get_chi_tiet_phan_quyen";
    public static final String API_GET_LIMIT_PROCESS_CUS_DETAIL = "get_limit_process_cus_detail";
    public static final String API_GET_AUTH_USER_INQUIRY = "get_auth_user_inquiry";

    public static final String API_SAVE_CHI_TIET_HAN_MUC_USER = "save_chi_tiet_han_muc_user";
    public static final String API_SAVE_PTXT_NGUOI_DUNG = "save_ptxt_nguoi_dung";
    public static final String API_GET_REGISTER_BY_CIF = "get_register_by_cif";
    public static final String API_CREATE_CIMBACK_ONBOARD = "create_cimback_onboard";
    public static final String API_GET_GENERAL_INFO_USER_INQUIRY = "get_general_info_user_inquiry";
    public static final String API_GET_GENERAL_INFO_USER_INQUIRY_DETAIL = "get_general_info_user_inquiry_detail";
    public static final String API_GENERATE_USERNAME = "get_generate_username";
    public static final String API_SAVE_GENERAL_INFO_USER = "save_general_info_user";
    public static final String API_GET_REGISTER_PENDING_APPROVE_LIST = "get_register_pending_approve_list";
    public static final String API_SUBMIT_ONBOARD_PENDING = "submit_onboard_pending";
    public static final String API_APPROVAL_ONBOARD = "approve_onboard";
    public static final String API_GET_USER_PERMISSION_INQUIRY = "get_user_permission_inquiry";

    public static final String API_GET_GENERAL_INFO_CUSTOMER_INQUIRY = "get_general_info_customer_inquiry";
    public static final String API_SAVE_GENERAL_INFO_CUS = "save_general_info_cus";

    public static final String API_GET_GENERAL_PRODUCT_PACKAGE_CUSTOMER_INQUIRY = "get_general_product_parkage_customer_inquiry";
    public static final String API_SAVE_PRODUCT_PACKAGE_CUS = "save_product_package_cus";


    public static final String API_GET_GENERAL_ACCOUNT_CUSTOMER_INQUIRY = "get_general_account_customer_inquiry";
    public static final String API_SAVE_ACCOUNT_CUS = "save_account_cus";

    public static final String API_GET_GENERAL_PAYMENT_INQUIRY = "get_general_account_payment_inquiry";
    public static final String API_GET_GENERAL_BAL_ALERT_INQUIRY = "get_general_bal_alert_inquiry";
    public static final String API_GET_GENERAL_STMT_INQUIRY = "get_general_stmt_customer_inquiry";
    public static final String API_SAVE_INIT_SERVICE_CIF = "save_init_service_cif";
    public static final String API_GET_USER_ACCOUNT_INQUIRY = "get_user_account_inquiry";
    public static final String API_SAVE_ACCOUNT_USER = "save_account_user";
    public static final String API_GET_ACCOUNT_LIST = "get_account_list";
    public static final String API_GET_ERP_ICN_CLIENT_GROUP_LIST = "get_erp_icn_client_group_list";
    public static final String API_GET_INIT_SERVICE_CIF_DETAIL = "get_init_service_cif_detail";
    public static final String API_GET_LIMIT_INQUIRY_USER = "get_limit_inquiry_user";
    public static final String API_SAVE_CHI_TIET_HAN_MUC_CUSTOMER = "save_chi_tiet_han_muc_cus";
    public static final String API_GET_LIST_ACCOUNT_STATMENT_CUS = "get_list_account_statment_cus";
    public static final String API_GET_WORKFLOW_INQUIRY_CUS = "get_workflow_inquiry_cus";
    public static final String API_GET_LIST_NATIONAL = "get_list_national";
    public static final String API_CREATE_SAVE_VAI_TRO_NHOM_QUYEN_USER = "create_save_phan_quyen";
    public static final String API_GET_LIMIT_INQUIRY_CUS = "get_limit_inquiry_cus";
    public static final String API_GET_INQUIRY_CIF_CUS = "get_inquiry_cif_cus";
    public static final String API_GET_EDIT_INFO_CUSTOMER = "get_edit_info_customer";
    public static final String API_SUBMIT_ONBOARD_RETURN = "submit_onboard_return";
    public static final String API_GET_ONBOARD_ACCOUNT_LIST = "onboard_account_list";
    public static final String API_GET_PAR_CURRENCY_LIST = "get_par_currency_list";

    /*  --------------------------------------QUAN LY PHI------------------------------------- */
    public static final String API_GET_FEE_CODE_DETAIL = "get-fee-code-detail";
    public static final String API_GET_FEE_CODE_LIST = "get_fee_code_list";
    public static final String API_GET_PRODUCT_LIST_FEE = "get-list-product-fee";
    public static final String API_GET_SUB_PRODUCT_LIST = "get-list-sub-product";
    public static final String API_APPROVAL_FEE_PACKAGE = "approval-fee-package";
    public static final String API_REJECT_FEE_PACKAGE = "reject-fee-package";
    public static final String API_QUERY_DETAILS_FEE_PACKAGE = "query-details-fee-package";
    public static final String API_GET_LIST_BRANCH = "get_active_list_branch";
    public static final String API_GET_COND_INFO_FEE_PACKAGE = "get_condition_info_of_fee_package";
    public static final String API_DETAIL_FEE_PACKAGE = "get_detail_fee_package";
    public static final String SAVE_DRAFT_FEE_PACKAGE = "save_draft_fee_package";
    public static final String QUERY_INFORMATION_FEE_PACKAGE = "query_info_fee_packages";
    public static final String API_GET_LIST_CODE_FEE_PACKAGE = "list_code_fee_package";
    public static final String RETURN_FEE_PACKAGE = "return_fee_package";
    public static final String API_STABLE_DETAIL_FEE_PACKAGE = "get_stable_detail_fee_package";
    public static final String DELETE_FEE_PACKAGE = "delete_fee_package";
    public static final String STATUS_FILTER_FEE_PACKAGE = "status_filter_fee_package";
    public static final String FEE_PACKAGE_SEARCH = "fee-package-search";
    public static final String INQUIRY_FEE_PACKAGE_CODE = "inquiry-fee-package-code";
    public static final String API_LIST_FEE_METHOD = "list-fee-method";
    public static final String API_FEE_METHOD_DOWNLOAD = "fee-method-download";
    public static final String API_LIST_INQUIRY_PROCESS = "inquiry-process-fee-method";
    public static final String API_INQUIRY_FEE_PKG_STABLE_DETAIL = "inquiry-fee-pkg-stable-detail";
    public static final String API_INQUIRY_CUSTOMER_FIND_BY_CIF = "inquiry-customer-find-by-cif";
    public static final String API_GET_BY_CIF_PKG_CODE_TO_SUB = "get-by-cif-pkgcode-to-sub";
    public static final String API_GET_BY_CIF_LIST_PKG_CODE_TO_SUB = "get-by-cif-list-pkgcode-to-sub";
    public static final String API_GET_BY_CIF_PKG_CODE_TO_CANCEL = "get-by-cif-pkgcode-to-cancel";
    public static final String API_GET_BY_CIF_LIST_PKG_CODE_TO_CANCEL = "get-by-cif-list-pkgcode-to-cancel";
    public static final String API_SAVE_PROCESS_ADD_PKG_CUSTOMER = "save-process-add-pkg-customer";
    public static final String API_CANCEL_PROCESS_ADD_PKG_CUSTOMER = "cancel-process-add-pkg-customer";
    public static final String API_PUSH_APPROVAL_ADD_PKG_CUSTOMER = "push-approval-pkg-customer";
    public static final String API_REJECT_ADD_PKG_CUSTOMER = "reject-pkg-customer";
    public static final String API_RETURN_ADD_PKG_CUSTOMER = "return-pkg-customer";
    public static final String API_APPROVAL_ADD_PKG_CUSTOMER = "approval-pkg-customer";
    public static final String API_DELETE_ADD_PKG_CUSTOMER = "delete-pkg-customer";
    public static final String API_INQUIRY_PKG_CUSTOMER = "inquiry-pkg-customer";
    public static final String API_INQUIRY_PKG_LIST_PROCESS = "inquiry-list-process";
    public static final String API_INQUIRY_PKG_CUSTOMER_DETAIL = "inquiry-detail-process";
    public static final String API_GET_BY_CIF_NO = "get-by-cif-no";
    public static final String API_SAVE_PROCESS_FEE_METHOD = "save-process-fee-method";
    public static final String API_REJECT_APPROVAL_FEE_METHOD = "reject-approval-fee-method";
    public static final String API_RETURN_APPROVAL_FEE_METHOD = "return-approval-fee-method";
    public static final String API_ACCEPT_APPROVAL_FEE_METHOD = "accept-approval-fee-method";
    public static final String API_QUERY_DETAIL_PROCESSING_FEE_PACKAGE = "query-detail-processing-fee-package";
    /*  --------------------------------------internal------------------------------------- */
    public static final String DATA_EXCEL = "data_excel";
    public static final String SHEET_DATA = "Data";

    //errorCode, errorDesc, others
    public static final String STATUS = "status";
    public static final String ERROR_CODE = "code";
    public static final String ERROR_DESC = "message";

    /*  --------------------------------------enum params------------------------------------- */
    @Getter
    public enum TypeAccount {
        IBANK_FO("AC_IBANK_FO"),
        IBANK_FO_CHECKER("AC_IBANK_FO_CHECKER");
        private final String value;

        TypeAccount(String value) {
            this.value = value;
        }

    }

    @Getter
    public enum AccountTypeIBankBO {
        AC_IBANK_FO("login_ibank_bo"),
        AC_IBANK_FO_CHECKER("login_ibank_bo_maker");
        private final String value;

        AccountTypeIBankBO(String value) {
            this.value = value;
        }

    }

    @Getter
    public enum AccountTypeIBankFO {
        AC_GDV("login_b2b_gdv"),
        AC_KSV("login_b2b_ksv");
        private final String value;

        AccountTypeIBankFO(String value) {
            this.value = value;
        }

    }

    @Getter
    public enum ParamsBodyValue {
        REMOVE("remove"),
        BLANK("blank"),
        NULL("null");
        private final String value;

        ParamsBodyValue(String value) {
            this.value = value;
        }
    }

    @Getter
    public enum TypeProduct {
        PRODUCT("PRODUCT"),
        SUBPRODUCT("SUB-PRODUCT"),
        FUNCTION("FUNCTION");
        private final String value;

        TypeProduct(String value) {
            this.value = value;
        }
    }

    @Getter
    public enum StatusProduct {
        ACTIVE("ACTIVE"),
        INACTIVE("INACTIVE"),
        PENDING("PENDING");
        private final String value;

        StatusProduct(String value) {
            this.value = value;
        }
    }

    @Getter
    public enum ServiceType {
        DICHVUPHITAICHINH("Dịch vụ phi tài chính"),
        DICHVUTAICHINH("Dịch vụ tài chính");
        private final String value;

        ServiceType(String value) {
            this.value = value;
        }
    }

    @Getter
    public enum FinancialType {
        TKTHANHTOAN("Thanh toán"),
        TKTIENGUICOKYHAN("Tiền gửi có kỳ hạn");
        private final String value;

        FinancialType(String value) {
            this.value = value;
        }
    }

    @Getter
    public enum NonFinancialType {
        TKTHANHTOAN("Thanh toán"),
        TKTIENGUICOKYHAN("Tiền gửi có kỳ hạn"),
        TKTIENVAY("Tiền vay"),
        TKBAOLANH("Bảo lãnh");
        private final String value;

        NonFinancialType(String value) {
            this.value = value;
        }
    }

    @Getter
    public enum DetailGroupCode {
        PMT_SPEC("Chi tiết Payment"),
        STMT_SPEC("Chi tiết sao kê"),
        BALALERT_SPEC("Chi tiết dịch vụ biến động số dư"),
        ERP_SPEC("Chi tiết nhóm kết nối ERP");
        private final String value;

        DetailGroupCode(String value) {
            this.value = value;
        }
    }

    @Getter
    public enum UserType {
        UN("Người dùng thông thường"),
        US("Người dùng H2H"),
        UE("Người dùng ERP");
        private final String value;

        UserType(String value) {
            this.value = value;
        }
    }

    @Getter
    public enum StatusCustomerProcess {
        ACTIVE("Hoạt động"),
        BLOCK("Khóa"),
        EDIT("Chỉnh sửa"),
        INACTIVE("Không hoạt động"),
        NEW("Thêm mới"),
        DRAFT("Nháp"),
        PENDING_BLOCK("Chờ duyệt khóa"),
        PENDING_DELETE("Chờ duyệt xóa"),
        PENDING_EDIT("Chờ duyệt sửa"),
        PENDING_NEW("Chờ duyệt thêm mới"),
        PENDING_UNLOCK("Chờ duyệt mở khóa"),
        RETURN_EDIT("KSV trả lại sửa"),
        RETURN_NEW("KSV trả lại thêm mới"),
        PENDING_RESET_PW("Chờ duyệt cấp lại mật khẩu"),
        PENDING_UNLOCK_PW("Chờ duyệt mở khóa và cấp lại mật khẩu"),
        PENDING_RESET_SEC_QN("Chờ duyệt cấp lại câu hỏi bảo mật");
        private final String value;

        StatusCustomerProcess(String value) {
            this.value = value;
        }
    }

    @Getter
    public enum StatusStepOnboard {
        STEP_CUS_INFO("Step thông tin chung khách hàng"),
        STEP_CUS_PRODUCT("Step gói dịch vụ khách hàng"),
        STEP_CUS_ACCOUNT("Step tài khoản khách hàng"),
        STEP_CUS_SPEC("Step chi tiết dịch vụ khách hàng"),
        STEP_CUS_SPEC_PMT_SPEC("Step chi tiết tài khoản thanh toán"),
        STEP_CUS_SPEC_BALALERT_SPEC("Step chi tiết biến động số dư"),
        STEP_CUS_SPEC_STMT_SPEC("Step Chi tiết tài khoản"),
        STEP_CUS_SPEC_ERP_SPEC("Step chi tiết erp"),
        STEP_CUS_LIMIT("Step hạn mức khách hàng"),
        STEP_CUS_WORKFLOW("Step mô hình phê duyệt khách hàng"),
        PENDING_UNLOCK("Chờ duyệt mở khóa"),
        RETURN_EDIT("KSV trả lại sửa"),
        RETURN_NEW("KSV trả lại thêm mới"),
        PENDING_RESET_PW("Chờ duyệt cấp lại mật khẩu"),
        PENDING_UNLOCK_PW("Chờ duyệt mở khóa và cấp lại mật khẩu"),
        PENDING_RESET_SEC_QN("Chờ duyệt cấp lại câu hỏi bảo mật");
        private final String value;

        StatusStepOnboard(String value) {
            this.value = value;
        }
    }

}
