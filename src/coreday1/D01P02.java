package coreday1;

import com.core.java.day1.MedicineInfo;
import com.core.java.day1.Ointment;
import com.core.java.day1.Syrup;
import com.core.java.day1.Tablet;

interface MedicineInfo {
	 void displayLabel();
	}

	//Classes implementing the MedicineInfo interface
	class Tablet implements MedicineInfo {
	 @Override
	 public void displayLabel() {
	     System.out.println("Store Tablets in a cool dry place.");
	 }
	}

	class Syrup implements MedicineInfo {
	 @Override
	 public void displayLabel() {
	     System.out.println("Syrup is consumable only on prescription.");
	 }
	}

	class Ointment implements MedicineInfo {
	 @Override
	 public void displayLabel() {
	     System.out.println("Ointment is for external use only.");
	 }
	}

public class D01P02 {

	public static void main(String[] args) {
        // Declare instances of Medicine
        MedicineInfo tablet = new Tablet();
        MedicineInfo syrup = new Syrup();
        MedicineInfo ointment = new Ointment();

        // Check polymorphic behavior of displayLabel() method
        tablet.displayLabel();
        syrup.displayLabel();
        ointment.displayLabel();;}


	}


