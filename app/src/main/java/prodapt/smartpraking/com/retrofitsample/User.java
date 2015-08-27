package prodapt.smartpraking.com.retrofitsample;


import com.google.gson.annotations.SerializedName;

import org.json.JSONObject;

/**
 * Created by prodapt on 06/08/15.
 */

public class User {

    @SerializedName("uniqueId")
    private String uniqueId;

    @SerializedName("userId")
    private String userId;

    @SerializedName("userName")
    private String userName;

    @SerializedName("operatingSystem")
    private String operatingSystem;

    @SerializedName("gcmToken")
    private String gcmToken;

    @SerializedName("mobileNumber")
    private String mobileNumber;

    @SerializedName("oauthId")
    private String oauthId;

    @SerializedName("status")
    private String status;

    @SerializedName("customerModule")
    private String customerModule;

    @SerializedName("header")
    private JSONObject header;

    @SerializedName("platformrModule")
    private String platformrModule;

    public JSONObject getHeader() {
        return header;
    }

    public void setHeader(JSONObject header) {
        this.header = header;
    }

    public String getCustomerModule() {
        return customerModule;
    }

    public void setCustomerModule(String customerModule) {
        this.customerModule = customerModule;
    }

    public String getStatus() {
        return status;
    }

    public String getPlatformrModule() {
        return platformrModule;
    }

    public void setPlatformrModule(String platformrModule) {
        this.platformrModule = platformrModule;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getOauthId() {
        return oauthId;
    }

    public void setOauthId(String oauthId) {
        this.oauthId = oauthId;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public String getGcmToken() {
        return gcmToken;
    }

    public void setGcmToken(String gcmToken) {
        this.gcmToken = gcmToken;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }
}
