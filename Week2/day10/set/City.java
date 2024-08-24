package com.learning.day10.set;

import java.util.Objects;

public class City {
	
		private String state;
		private long pincode;
		private String capitalCity;

		public City(String name, long pincode, String capitalCity) {
			 this.state = name;
			this.pincode = pincode;
			this.capitalCity = capitalCity;
		}

		public String getName() {
			return state;
		}

		public void setName(String name) {
			this.state = name;
		}

		public long getPincode() {
			return pincode;
		}

		public void setPincode(long pincode) {
			this.pincode = pincode;
		}

		public String getCapitalCity() {
			return capitalCity;
		}

		public void setCapitalCity(String capitalCity) {
			this.capitalCity = capitalCity;
		}

		@Override
		public String toString() {
			return "City [name = " + state + ", pincode = " + pincode + ", capitalCity = " + capitalCity + "]";
		}

		@Override
		public int hashCode() {
			return Objects.hash(capitalCity, pincode, state);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			City other = (City) obj;
			return Objects.equals(capitalCity, other.capitalCity) && pincode == other.pincode
					&& Objects.equals(state, other.state);
		}
		

	}


