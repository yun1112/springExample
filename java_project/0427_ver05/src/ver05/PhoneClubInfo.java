package ver05;

public class PhoneClubInfo extends PhoneInfo implements PhoneInfoImpl {
	String cafeName;
	String nickName;

	PhoneClubInfo(String name, String phoneNumber, String addr, String email, String cafeName, String nickName) {
		super(name, phoneNumber, addr, email);
		this.cafeName = cafeName;
		this.nickName = nickName;
	}

	@Override
	public void showBasicInfo() {
		super.showBasicInfo();
		System.out.println("동호회 이름:" + this.cafeName);
		System.out.println("닉네임:" + this.nickName);
	}

	@Override
	public void showAllInfo() {
		super.showBasicInfo();
	}
}