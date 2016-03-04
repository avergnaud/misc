package util;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class BeanExemple {
	
	private String name;
	private int weight;

	public BeanExemple(String name, int weight) {
		super();
		this.name = name;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this,
				ToStringStyle.SHORT_PREFIX_STYLE);
	}
	
	@Override
	public boolean equals(Object o) {
		return EqualsBuilder.reflectionEquals(this, o);
	}
	
	@Override
	public int hashCode() {
		return name.hashCode();
	}

	public static void main(String... args) {
		BeanExemple hippo = new BeanExemple("Harry", 1000);
		BeanExemple hippo2 = new BeanExemple("Harry", 1000);
		System.out.println(hippo.equals(hippo2));
		System.out.println(hippo.hashCode() == hippo2.hashCode());
		System.out.println(hippo);
	}
	
}
