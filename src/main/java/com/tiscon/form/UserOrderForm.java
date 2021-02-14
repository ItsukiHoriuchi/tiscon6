package com.tiscon.form;

import com.tiscon.validator.Numeric;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * 顧客が入力する見積もり情報を保持するクラス。
 *
 * @author Oikawa Yumi
 */
public class UserOrderForm {

    @NotBlank(message="氏名が空欄です")
    private String customerName;

    @NotBlank(message="連絡先TELが空欄です")
    @Numeric(message="連絡先TELには半角数字を入力してください(ハイフンは不要)")
    private String tel;

    @Email
    @NotBlank(message="連絡先メールアドレスが空欄です")
    private String email;

    @NotBlank(message="転居元住所（都道府県）が空欄です")
    private String oldPrefectureId;

    @NotBlank(message="転居元住所（市区町村以下）が空欄です")
    private String oldAddress;

    @NotBlank(message="転居先住所（都道府県）が空欄です")
    private String newPrefectureId;

    @NotBlank(message="転居先住所（市区町村以下）が空欄です")
    private String newAddress;

    @Numeric(message="段ボールの個数には半角数字を入力してください")
    @NotBlank(message="段ボールの個数が空欄です")
    private String box;

    @Numeric(message="ベッドの個数には半角数字を入力してください")
    @NotBlank(message="ベッドの個数が空欄です")
    private String bed;

    @Numeric(message="自転車の個数には半角数字を入力してください")
    @NotBlank(message="自転車の個数が空欄です")
    private String bicycle;

    @Numeric(message="洗濯機の個数には半角数字を入力してください")
    @NotBlank(message="洗濯機の個数が空欄です")
    private String washingMachine;

    @NotNull(message="洗濯機の設置工事申し込みが空欄です")
    private boolean washingMachineInstallation;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOldPrefectureId() {
        return oldPrefectureId;
    }

    public void setOldPrefectureId(String oldPrefectureId) {
        this.oldPrefectureId = oldPrefectureId;
    }

    public String getOldAddress() {
        return oldAddress;
    }

    public void setOldAddress(String oldAddress) {
        this.oldAddress = oldAddress;
    }

    public String getNewPrefectureId() {
        return newPrefectureId;
    }

    public void setNewPrefectureId(String newPrefectureId) {
        this.newPrefectureId = newPrefectureId;
    }

    public String getNewAddress() {
        return newAddress;
    }

    public void setNewAddress(String newAddress) {
        this.newAddress = newAddress;
    }

    public String getBox() {
        return box;
    }

    public void setBox(String box) {
        this.box = box;
    }

    public String getBed() {
        return bed;
    }

    public void setBed(String bed) {
        this.bed = bed;
    }

    public String getBicycle() {
        return bicycle;
    }

    public void setBicycle(String bicycle) {
        this.bicycle = bicycle;
    }

    public String getWashingMachine() {
        return washingMachine;
    }

    public void setWashingMachine(String washingMachine) {
        this.washingMachine = washingMachine;
    }

    public boolean getWashingMachineInstallation() {
        return washingMachineInstallation;
    }

    public void setWashingMachineInstallation(boolean washingMachineInstallation) {
        this.washingMachineInstallation = washingMachineInstallation;
    }
}
