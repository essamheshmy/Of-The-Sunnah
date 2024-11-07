package com.heshmy.domain.models

data class HadithItem(
    var arabicURN:Any,//= 100010
    var collection:String,//="bukhari"
    var volumeNumber:Int,//=1
    var bookNumber:Int,//=1
    var babNumber:Double,//=1.00
    var hadithNumber: Int,//=1
    var bookName:String,//= "كتاب بدء الوحى"
    var babName:String,//= "باب كَيْفَ كَانَ بَدْءُ الْوَحْىِ إِلَى رَسُولِ اللَّهِ صلى الله عليه وسلم"
    var hadithText:String,//=  "<span class=\"arabic_sanad\">حَدَّثَنَا<a href=\"/narrator/4698\" title=\"عبد الله بن الزبير بن عيسى بن عبيد الله بن أسامة بن عبد الله بن حميد بن زهير بن الحارث بن أسد بن عبد العزى\" rel=\"nofollow\"> الْحُمَيْدِيُّ عَبْدُ اللَّهِ بْنُ الزُّبَيْرِ  </a>، قَالَ : حَدَّثَنَا<a href=\"/narrator/3443\" title=\"سفيان بن عيينة بن ميمون\" rel=\"nofollow\"> سُفْيَانُ  </a>، قَالَ : حَدَّثَنَا<a href=\"/narrator/8272\" title=\"يحيى بن سعيد بن قيس بن عمرو بن سهل بن ثعلبة بن الحارث بن زيد بن ثعلبة بن غنم بن مالك بن النجار\" rel=\"nofollow\"> يَحْيَى بْنُ سَعِيدٍ الْأَنْصَارِيُّ  </a>، قَالَ : أَخْبَرَنِي<a href=\"/narrator/6796\" title=\"محمد بن إبراهيم بن الحارث بن خالد بن صخر بن عامر بن كعب بن سعد بن تيم بن مرة\" rel=\"nofollow\"> مُحَمَّدُ بْنُ إِبْرَاهِيمَ التَّيْمِيُّ  </a>، أَنَّهُ سَمِعَ<a href=\"/narrator/5719\" title=\"علقمة بن وقاص بن محصن بن كلدة بن عبد ياليل\" rel=\"nofollow\"> عَلْقَمَةَ بْنَ وَقَّاصٍ اللَّيْثِيَّ  </a>، يَقُولُ : سَمِعْتُ<a href=\"/narrator/5913\" title=\"عمر بن الخطاب بن نفيل بن عبد العزى بن رياح بن عبد الله بن قرط بن رزاح بن عدي بن كعب\" rel=\"nofollow\"> عُمَرَ بْنَ الْخَطَّابِ  </a> رَضِيَ اللَّهُ عَنْهُ عَلَى الْمِنْبَرِ، قَالَ : سَمِعْتُ رَسُولَ اللَّهِ صَلَّى اللَّهُ عَلَيْهِ وَسَلَّمَ، يَقُولُ : \"</span>\r\n<span class=\"arabic_text_details\">إِنَّمَا الْأَعْمَالُ بِالنِّيَّاتِ، وَإِنَّمَا لِكُلِّ امْرِئٍ مَا نَوَى، فَمَنْ كَانَتْ هِجْرَتُهُ إِلَى دُنْيَا يُصِيبُهَا أَوْ إِلَى امْرَأَةٍ يَنْكِحُهَا، فَهِجْرَتُهُ إِلَى مَا هَاجَرَ إِلَيْهِ \"</span>",
    var annotations:Int,//=NULL
    var bookID: Double,//=1.0
    var grade1 :Int,
    var ourHadithNumber:Int,
    var matchingEnglishURN: Double,
    var last_updated:String


)