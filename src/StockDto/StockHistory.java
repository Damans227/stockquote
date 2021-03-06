package StockDto;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



public class StockHistory {
	private String symbol;
	private String date;
	private BigDecimal high;
	private BigDecimal low;
	private BigDecimal close;
	
	
	
	public StockHistory() {
		super();
	}

	public StockHistory(String symbol, String date, BigDecimal high, BigDecimal low, BigDecimal close) {
		super();
		this.symbol = symbol;
		this.date = date;
		this.high = high;
		this.low = low;
		this.close = close;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public BigDecimal getHigh() {
		return high;
	}

	public void setHigh(BigDecimal high) {
		this.high = high;
	}

	public BigDecimal getLow() {
		return low;
	}

	public void setLow(BigDecimal low) {
		this.low = low;
	}

	public BigDecimal getClose() {
		return close;
	}

	public void setClose(BigDecimal close) {
		this.close = close;
	}
	
	
}