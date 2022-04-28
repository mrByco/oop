package pack;

public interface Chargeable {
	boolean Charge() throws NotEnoughBalanceForChargeFeeException;

}
