package com.converter;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/*
*
* by github.com/Yazan-Abuawwad
*
* */
public class UtilityTOArabic {

    List<String> arabicOnes = new ArrayList<>();
    List<String> arabicFeminineOnes = new ArrayList<>();
    List<String> arabicTens = new ArrayList<>();
    List<String> arabicHundreds = new ArrayList<>();
    List<String> arabicTwos = new ArrayList<>();
    List<String> arabicAppendedTwos = new ArrayList<>();
    List<String> arabicGroup = new ArrayList<>();
    List<String> arabicAppendedGroup = new ArrayList<>();
    List<String> arabicPluralGroups = new ArrayList<>();

    List<String> arabicDinarGroups = new ArrayList<>();
    List<String> arabicFalsGroups = new ArrayList<>();

    int _decimalValue;
    BigInteger bigIntegerValue = BigInteger.ZERO;


    public boolean isFeminine = true;
    public String arabicPrefixText = "", arabicSuffixText = "";




    public void setArabicDinarGroups() {
        arabicDinarGroups.add("دينار");
        arabicDinarGroups.add("ديناران");
        arabicDinarGroups.add("دنانير");
    }

    public void setArabicFalsGroups() {
        arabicFalsGroups.add("فلس");
        arabicFalsGroups.add("فلسان");
        arabicFalsGroups.add("فلسات");
    }

    private void setArabicOnes() {
        arabicOnes.add("");
        arabicOnes.add("واحد");
        arabicOnes.add("اثنان");
        arabicOnes.add("ثلاثة");
        arabicOnes.add("أربعة");
        arabicOnes.add("خمسة");
        arabicOnes.add("ستة");
        arabicOnes.add("سبعة");
        arabicOnes.add("ثمانية");
        arabicOnes.add("تسعة");
        arabicOnes.add("عشرة");
        arabicOnes.add("أحد عشر");
        arabicOnes.add("اثنا عشر");
        arabicOnes.add("ثلاثة عشر");
        arabicOnes.add("أربعة عشر");
        arabicOnes.add("خمسة عشر");
        arabicOnes.add("ستة عشر");
        arabicOnes.add("سبعة عشر");
        arabicOnes.add("ثمانية عشر");
        arabicOnes.add("تسعة عشر");
    }

    private void setArabicFeminineOnes() {
        arabicFeminineOnes.add("");
        arabicFeminineOnes.add("إحدى");
        arabicFeminineOnes.add("اثنتان");
        arabicFeminineOnes.add("ثلاث");
        arabicFeminineOnes.add("أربع");
        arabicFeminineOnes.add("خمس");
        arabicFeminineOnes.add("ست");
        arabicFeminineOnes.add("سبع");
        arabicFeminineOnes.add("ثمان");
        arabicFeminineOnes.add("تسع");
        arabicFeminineOnes.add("عشر");
        arabicFeminineOnes.add("إحدى عشرة");
        arabicFeminineOnes.add("اثنتا عشرة");
        arabicFeminineOnes.add("ثلاث عشرة");
        arabicFeminineOnes.add("أربع عشرة");
        arabicFeminineOnes.add("خمس عشرة");
        arabicFeminineOnes.add("ست عشرة");
        arabicFeminineOnes.add("سبع عشرة");
        arabicFeminineOnes.add("ثماني عشرة");
        arabicFeminineOnes.add("تسع عشرة");
    }

    private void setArabicTens() {
        arabicTens.add("عشرون");
        arabicTens.add("ثلاثون");
        arabicTens.add("أربعون");
        arabicTens.add("خمسون");
        arabicTens.add("ستون");
        arabicTens.add("سبعون");
        arabicTens.add("ثمانون");
        arabicTens.add("تسعون");
    }

    private void setArabicHundreds() {
        arabicHundreds.add("");
        arabicHundreds.add("مائة");
        arabicHundreds.add("مئتان");
        arabicHundreds.add("ثلاثمائة");
        arabicHundreds.add("أربعمائة");
        arabicHundreds.add("خمسمائة");
        arabicHundreds.add("ستمائة");
        arabicHundreds.add("سبعمائة");
        arabicHundreds.add("ثمانمائة");
        arabicHundreds.add("تسعمائة");
    }

    private void setArabicTwos() {

        arabicTwos.add("مئتان");
        arabicTwos.add("ألفان");
        arabicTwos.add("مليونان");
        arabicTwos.add("ملياران");
        arabicTwos.add("تريليونان");
        arabicTwos.add("كوادريليونان");
        arabicTwos.add("كوينتليونان");
        arabicTwos.add("سكستيليونان");
    }

    private void setArabicAppendedTwos() {
        arabicAppendedTwos.add("مئتا");
        arabicAppendedTwos.add("ألفا");
        arabicAppendedTwos.add("مليونا");
        arabicAppendedTwos.add("مليارا");
        arabicAppendedTwos.add("تريليونا");
        arabicAppendedTwos.add("كوادريليونا");
        arabicAppendedTwos.add("كوينتليونا");
        arabicAppendedTwos.add("سكستيليونا");

    }

    private void setArabicGroup() {
        arabicGroup.add("مائة");
        arabicGroup.add("ألف");
        arabicGroup.add("مليون");
        arabicGroup.add("مليار");
        arabicGroup.add("تريليون");
        arabicGroup.add("كوادريليون");
        arabicGroup.add("كوينتليون");
        arabicGroup.add("سكستيليون");
    }

    private void setArabicAppendedGroup() {
        arabicAppendedGroup.add("");
        arabicAppendedGroup.add("ألفاً");
        arabicAppendedGroup.add("مليوناً");
        arabicAppendedGroup.add("ملياراً");
        arabicAppendedGroup.add("تريليوناً");
        arabicAppendedGroup.add("كوادريليوناً");
        arabicAppendedGroup.add("كوينتليوناً");
        arabicAppendedGroup.add("سكستيليوناً");
    }

    private void setArabicPluralGroups() {
        arabicPluralGroups.add("");
        arabicPluralGroups.add("آلاف");
        arabicPluralGroups.add("ملايين");
        arabicPluralGroups.add("مليارات");
        arabicPluralGroups.add("تريليونات");
        arabicPluralGroups.add("كوادريليونات");
        arabicPluralGroups.add("كوينتليونات");
        arabicPluralGroups.add("سكستيليونات");
    }



    private void initialize() {
        setArabicOnes();
        setArabicFeminineOnes();
        setArabicTens();
        setArabicHundreds();
        setArabicTwos();
        setArabicAppendedTwos();
        setArabicGroup();
        setArabicAppendedGroup();
        setArabicPluralGroups();
        setArabicDinarGroups();
        setArabicFalsGroups();
    }


    public UtilityTOArabic() {
        initialize();
    }









    public String numberToArabicWords(String doubleNumber ) {

       if (!doubleNumber.contains(".")){

           return convertNumberWithoutDot(doubleNumber);
       }
        int indexOfDecimal = doubleNumber.indexOf(".");

        String dinar = doubleNumber.substring(0, indexOfDecimal);
        String textDinar ;


        if (dinar.equals("1")|| dinar.equals("2")){
            textDinar= arabicDinarGroups.get( Integer.valueOf(dinar)-1 ) + convertToArabic(dinar).trim() ;
        }
        else if( Integer.valueOf(dinar)>2 && Integer.valueOf(dinar)<11 ){
            textDinar= convertToArabic(dinar).trim() + " دنانير ";
        }
        else{
            textDinar= convertToArabic(dinar).trim() + " دينار ";
        }





        String fals = String.valueOf((int) (Double.valueOf(doubleNumber.substring(indexOfDecimal))*1000));
        String textFals ;
        if (fals.equals("1" )||fals.equals("2" )){
            textFals= arabicFalsGroups.get( Integer.valueOf(fals)-1 ) + convertToArabic(fals).trim() ;
        }
        else if( Integer.valueOf(fals)>2&& Integer.valueOf(fals)<11){
            textFals= convertToArabic(fals).trim() + " فلسات ";
            //    return +" ديناران و "+convertToArabic(fals).trim()+" فلس ";
        }

        else{
            textFals= convertToArabic(fals).trim() + " فلس ";}

        return textDinar +" و "+textFals;
    }

    private String convertNumberWithoutDot(String s) {
        return convertToArabic(s).trim()+" دينار ";
    }


    public Map<String, String> printNumberToArabicWords(Double doubleNumber) {

        String doubleAsString = String.valueOf(doubleNumber);
        int indexOfDecimal = doubleAsString.indexOf(".");

        String dinar = doubleAsString.substring(0, indexOfDecimal);
        String fals = String.valueOf((int) (Double.valueOf(doubleAsString.substring(indexOfDecimal))*1000));

        Map<String, String> map = new HashMap<>();
        map.put("dinar" , convertToArabic(dinar)+" دينار ");
        map.put("fals" , convertToArabic(fals)+" فلس ");

        return map;

    }
    public List<String> numberToArabicWordsWithOutCurrency(Double doubleNumber) {

        String doubleAsString = String.valueOf(doubleNumber);
        int indexOfDecimal = doubleAsString.indexOf(".");

        String dinar = doubleAsString.substring(0, indexOfDecimal);
        String fals = String.valueOf((int) (Double.valueOf(doubleAsString.substring(indexOfDecimal))*1000));

        List<String> stringList=new ArrayList<>();
        stringList.add(convertToArabic(dinar).trim());
        stringList.add(convertToArabic(fals).trim());

        return  stringList;
    }









    private String convertToArabic(String number_bi) {


        BigInteger number = new BigInteger(number_bi);
        if (number.equals(BigInteger.ZERO)) {
            return "صفر";
        }
        BigDecimal tempNumber = new BigDecimal(number);

        //   System.out.println(tempNumber.compareTo(BigDecimal.ONE) + "  teest");
        String decimalString = ProcessArabicGroup(_decimalValue, -1, 0);

        String retVal = "";
        short group = 0;

        while (tempNumber.compareTo(BigDecimal.ONE) >= 0)
        {

            // separate number into groups
            BigDecimal bi_thousand = new BigDecimal("1000");
            BigDecimal numberToProcess = tempNumber.remainder(bi_thousand);

            tempNumber = tempNumber.divide(new BigDecimal("1000"));

            // convert group into its text


            String groupDescription = ProcessArabicGroup(
                    numberToProcess.intValue(),
                    group,
                    tempNumber.setScale(0,
                            BigDecimal.ROUND_FLOOR).intValue());

            if (!groupDescription.isEmpty())
            { // here we add the new converted group to the previous concatenated text
                if (group > 0)
                {
                    if (!retVal.isEmpty())
                        retVal = "و" + " " + retVal;

                    // 2.232



//
                    if (numberToProcess.compareTo(new BigDecimal(2)) != 0)
                    {
                        if (numberToProcess.remainder(new BigDecimal("100")).compareTo(BigDecimal.ONE) != 0)
                        {
                            if (numberToProcess.compareTo(new BigDecimal("3")) >=0 && numberToProcess.compareTo(new BigDecimal("10")) <= 0) // for numbers between 3 and 9 we use plural name
                                retVal = arabicPluralGroups.get(group) + " " + retVal;
                            else
                            {
//                                if (!retVal.isEmpty()) // use appending case
//                                    retVal = arabicAppendedGroup.get(group) + " " + retVal;
//                                else
                                //      retVal = arabicGroup.get(group) + " " + retVal; // use normal case
                            }
                        }
                    }
                }
                retVal = groupDescription + " " + retVal;
            }

            group++;
        }

        String formattedNumber = "";
        formattedNumber += (!arabicPrefixText.isEmpty()) ? arabicPrefixText + " " : "";
        formattedNumber += (!retVal.isEmpty()) ? retVal : "";
//        if (!bigIntegerValue.equals(BigInteger.ZERO))
//        { // here we add currency name depending on bigIntegerValue : 1 ,2 , 3--->10 , 11--->99
//            int remaining100 = (Integer.valueOf(bigIntegerValue.toString()) % 100);
//
//            if (remaining100 == 0)
//                formattedNumber += Currency.Arabic1CurrencyName;
//            else
//            if (remaining100 == 1)
//                formattedNumber += Currency.Arabic1CurrencyName;
//            else
//            if (remaining100 == 2)
//            {
//                if (bigIntegerValue == 2)
//                    formattedNumber += Currency.Arabic2CurrencyName;
//                else
//                    formattedNumber += Currency.Arabic1CurrencyName;
//            }
//            else
//                /*    if( number > 100) formattedNumber += Currency.Arabic1CurrencyName;
//                    else*/ if (remaining100 >= 3 && remaining100 <= 10)
//                formattedNumber += Currency.Arabic310CurrencyName;
//            else
//            if (remaining100 >= 11 && remaining100 <= 99)
//                formattedNumber += Currency.Arabic1199CurrencyName;
//        }
        formattedNumber += (_decimalValue != 0) ? " و " : "";
        formattedNumber += (_decimalValue != 0) ? decimalString : "";
//        if (_decimalValue != 0)
//        { // here we add currency part name depending on bigIntegerValue : 1 ,2 , 3--->10 , 11--->99
//            formattedNumber += " ";
//
//            int remaining100 = (int)(_decimalValue % 100);
//
//            if (remaining100 == 0)
//                formattedNumber += Currency.Arabic1CurrencyPartName;
//            else
//            if (remaining100 == 1)
//                formattedNumber += Currency.Arabic1CurrencyPartName;
//            else
//            if (remaining100 == 2)
//                formattedNumber += Currency.Arabic2CurrencyPartName;
//            else
//            if (remaining100 >= 3 && remaining100 <= 10)
//                formattedNumber += Currency.Arabic310CurrencyPartName;
//            else
//            if (remaining100 >= 11 && remaining100 <= 99)
//                formattedNumber += Currency.Arabic1199CurrencyPartName;
//        }
        formattedNumber += (!arabicSuffixText.isEmpty()) ?arabicSuffixText : "";

        return formattedNumber;
    }

    //-1
    String ProcessArabicGroup(int groupNumber, int groupLevel, int remainingNumber) {
        int tens = groupNumber % 100;

        int hundreds = groupNumber / 100;

        String retVal = "";

        if (hundreds > 0) {
            if (tens == 0 && hundreds == 2) {
                // حالة المضاف
                if (groupLevel == 0) {
                    retVal = arabicHundreds.get(hundreds);
                }
                else {
                    retVal = arabicAppendedTwos.get(0);
                }
            } else {
                //  الحالة العادية
                retVal = arabicHundreds.get(hundreds);
            }
        }

        if (tens > 0) {
            if (tens < 20) { // if we are processing under 20 numbers
                if (tens == 2 && hundreds == 0 && groupLevel > 0) { // This is special case for number 2 when it comes alone in the group
                    if (bigIntegerValue.equals(BigInteger.valueOf(2000))
                            || bigIntegerValue.equals(BigInteger.valueOf(2000000))
                            || bigIntegerValue.equals(BigInteger.valueOf(2000000000))
                            || bigIntegerValue.equals(new BigInteger("2000000000000"))
                            || bigIntegerValue.equals(new BigInteger("2000000000000000"))
                            || bigIntegerValue.equals(new BigInteger("2000000000000000000")))
                        retVal = arabicAppendedTwos.get(groupLevel); // في حالة الاضافة
                    else
                        retVal = arabicTwos.get(groupLevel);//  في حالة الافراد
                } else { // General case
                    if (!retVal.isEmpty())
                        retVal += " و ";

                    if (tens == 1 && groupLevel > 0)
                        retVal += arabicGroup.get(groupLevel);
                    else if ((tens == 1 )
                            && (groupLevel == 0 || groupLevel == -1)
                            && hundreds == 0
                            && remainingNumber == 0)
                        retVal += ""; // Special case for 1 and 2 numbers like:
                    else if (( tens == 2)
                            && (groupLevel == 0 || groupLevel == -1)
                            && hundreds == 0
                            && remainingNumber == 0)
                        retVal += "";
                    else
                        retVal += GetDigitFeminineStatus(tens, groupLevel, isFeminine);// Get Feminine status for this digit
                }
            } else {
                int ones = tens % 10;
                tens = (tens / 10) - 2; // 20's offset

                if (ones > 0) {
                    if (!retVal.isEmpty())
                        retVal += " و ";

                    // Get Feminine status for this digit
                    retVal += GetDigitFeminineStatus(ones, groupLevel, isFeminine);
                }

                if (!retVal.isEmpty())
                    retVal += " و ";

                // Get Tens text
                retVal += arabicTens.get(tens);
            }
        }

        return retVal;
    }

    String GetDigitFeminineStatus(int digit, int groupLevel, boolean isFeminine) {
        if (groupLevel == -1) { // if it is in the decimal part
            if (isFeminine)
                return arabicFeminineOnes.get(digit); // use feminine field
            else
                return arabicOnes.get(digit);
        } else if (groupLevel == 0) {
            if (isFeminine)
                return arabicFeminineOnes.get(digit);// use feminine field
            else
                return arabicOnes.get(digit);
        } else
            return arabicOnes.get(digit);

    }


}













