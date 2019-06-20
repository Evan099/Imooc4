package com.imooc.hello11;

public class SetDemo2Cat {
	private String name;
	private int month;
	private String species;
	
	//���幹�췽��
	public SetDemo2Cat(String name, int month, String species) {
		super();
		this.name = name;
		this.month = month;
		this.species = species;
	}
	//��װ
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}
	
	@Override
	public String toString() {
		return "����=" + name + ", �·�=" + month + ", Ʒ��=" + species + ":";
	}
	//��߲�ѯ�ٶ�
	@Override
	public int hashCode() {//�ж�Ԫ�����ĸ�Ͱ��
		final int prime = 31;
		int result = 1;
		result = prime * result + month;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((species == null) ? 0 : species.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {//�ж�Ԫ����Ͱ���ĸ�λ��
		if (this == obj)//�ж϶����Ƿ����
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())//�ж��Ƿ��Ǳ������
			return false;
		SetDemo2Cat other = (SetDemo2Cat) obj;
		if (month != other.month)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (species == null) {
			if (other.species != null)
				return false;
		} else if (!species.equals(other.species))
			return false;
		return true;
	}
	
	

	
	
	

}
