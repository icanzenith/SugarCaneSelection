package sugarcaneselection.thaib.org.sugarcanselection.Item;

import android.util.Log;

/**
 *
 * Created by Jitpakorn on 2/11/15 AD.
 *
 */

public class CloneListData {

    private String CloneCode;
    private String PlaceTest;
    private int RowNumber;

    private String FamilyCode;
    private String UpperPicURL;
    private String UpperUUID;

    private String LowerPicURL;
    private String LowerUUID;

    private String FullPicURL;
    private String FullUUID;

    private String CollectingTime;

    private String WhiteFly;
    private int WhiteFlyScore;

    private String Borer;
    private float BorerScore;
    private String Aphid;
    private float AphidScore;
    private String IceryaMealbug;
    private float IceryaMealbugScore;
    private String Scale;
    private float ScaleScore;
    private String PokkahBoeng;
    private float PokkahBoengScore;
    private String YellowSpot;
    private float YellowSpotScore;
    private String BrownSpot;
    private float BrownSpotScore;
    private String RingSpot;
    private float RingSpotScore;
    private String Rust;
    private int RustScore;
    private String DownyMildew;
    private float DownyMildewScore;
    private String OtherDiseaseName;
    private String OtherDisease;
    private float OtherDiseaseScore;


    private String Flowering;
    private float FloweringScore;
    private float Brix;
    private float BrixScore;
    private float Height;
    private float HeightScore;
    private float OverAll;
    private float OverAllScore;
    private String LeafSheath;
    private int LeafSheathScore;
    private int StalkAmount;
    private float StalkAmountScore;
    private int InternodeAmount;
    private float InternodeAmountScore;

    private float StalkSize1;
    private float StalkSize2;
    private float StalkSize3;
    private float StalkSize4;
    private float StalkSize5;
    private float StalkSizeAverage;
    private float StalkSizeAverageScore;

    private float InternodeLength1;
    private float InternodeLength2;
    private float InternodeLength3;
    private float InternodeLength4;
    private float InternodeLength5;
    private float InternodeLengthAverage;
    private float InternodeLengthAverageScore;

    private String ClumpShape;
    private float ClumpShapeScore;
    private String ClumpCharacteristic;
    private float ClumpCharacteristicScore;
    private String InternalSymtom;
    private float InternalSymtomScore;
    private String InternalFirmness;
    private float InternalFirmnessScore;
    private String Stuff;
    private float StuffScore;

    private float TotalScore;

    private String SelectStatus;
    private String WhySelect;

    private Integer TrayAmount;
    private Integer NodeAmount;
    private Integer GrowingAmount;

    public Integer getTrayAmount() {
        return TrayAmount;
    }

    public void setTrayAmount(Integer trayAmount) {
        Log.d("Debug transfrom"," Set TrayAmount");
        TrayAmount = trayAmount;
    }

    public Integer getNodeAmount() {
        Log.d("Debug transfrom","Get getNodeAmount");
        return NodeAmount;
    }

    public void setNodeAmount(Integer nodeAmount) {
        Log.d("Debug transfrom"," Set setNodeAmount");
        NodeAmount = nodeAmount;
    }

    public Integer getGrowingAmount() {
        Log.d("Debug transfrom","Get getGrowingAmount");
        return GrowingAmount;
    }

    public void setGrowingAmount(Integer growingAmount) {
        Log.d("Debug transfrom"," Set setGrowingAmount");
        GrowingAmount = growingAmount;
    }

    public String getFamilyCode() {
        Log.d("Debug transfrom","Get getFamilyCode");
        return FamilyCode;
    }

    public void setFamilyCode(String familyCode) {
        Log.d("Debug transfrom"," Set setFamilyCode");
        FamilyCode = familyCode;
    }

    public String getInternalSymtom() {
        Log.d("Debug transfrom","Get getInternalSymtom");
        return InternalSymtom;
    }

    public void setInternalSymtom(String internalSymtom) {
        Log.d("Debug transfrom"," Set setInternalSymtom");
        InternalSymtom = internalSymtom;
    }

    public float getInternalSymtomScore() {
        Log.d("Debug transfrom","Get getInternalSymtomScore");
        return InternalSymtomScore;
    }

    public void setInternalSymtomScore(float internalSymtomScore) {
        Log.d("Debug transfrom"," Set setInternalSymtomScore");
        InternalSymtomScore = internalSymtomScore;
    }

    public String getCloneCode() {
        Log.d("Debug transfrom","Get getCloneCode");
        return CloneCode;
    }

    public void setCloneCode(String cloneCode) {
        Log.d("Debug transfrom"," Set setCloneCode");
        CloneCode = cloneCode;
    }

    public String getPlaceTest() {
        Log.d("Debug transfrom","Get getPlaceTest");
        return PlaceTest;
    }

    public void setPlaceTest(String placeTest) {
        Log.d("Debug transfrom"," Set setPlaceTest");
        PlaceTest = placeTest;
    }

    public int getRowNumber() {
        Log.d("Debug transfrom","Get getRowNumber");
        return RowNumber;
    }

    public void setRowNumber(int rowNumber) {
        Log.d("Debug transfrom"," Set setRowNumber");
        RowNumber = rowNumber;
    }

    public String getUpperPicURL() {
        Log.d("Debug transfrom","Get getUpperPicURL");
        return UpperPicURL;
    }

    public void setUpperPicURL(String upperPicURL) {
        Log.d("Debug transfrom"," Set setUpperPicURL");
        UpperPicURL = upperPicURL;
    }

    public String getUpperUUID() {
        Log.d("Debug transfrom","Get getUpperUUID");
        return UpperUUID;
    }

    public void setUpperUUID(String upperUUID) {
        Log.d("Debug transfrom"," Set setUpperUUID");
        UpperUUID = upperUUID;
    }

    public String getLowerPicURL() {
        Log.d("Debug transfrom","Get getLowerPicURL");
        return LowerPicURL;
    }

    public void setLowerPicURL(String lowerPicURL) {
        Log.d("Debug transfrom"," Set setLowerPicURL");
        LowerPicURL = lowerPicURL;
    }

    public String getLowerUUID() {
        Log.d("Debug transfrom","Get getLowerUUID");
        return LowerUUID;
    }

    public void setLowerUUID(String lowerUUID) {
        Log.d("Debug transfrom"," Set setLowerUUID");
        LowerUUID = lowerUUID;
    }

    public String getFullPicURL() {
        Log.d("Debug transfrom","Get getFullPicURL");
        return FullPicURL;
    }

    public void setFullPicURL(String fullPicURL) {
        Log.d("Debug transfrom"," Set setFullPicURL");
        FullPicURL = fullPicURL;
    }

    public String getFullUUID() {
        Log.d("Debug transfrom","Get getFullUUID");
        return FullUUID;
    }

    public void setFullUUID(String fullUUID) {
        Log.d("Debug transfrom"," Set setFullUUID");
        FullUUID = fullUUID;
    }

    public String getCollectingTime() {
        Log.d("Debug transfrom","Get getCollectingTime");
        return CollectingTime;
    }

    public void setCollectingTime(String collectingTime) {
        Log.d("Debug transfrom"," Set setCollectingTime");
        CollectingTime = collectingTime;
    }

    public String getWhiteFly() {
        Log.d("Debug transfrom","Get getWhiteFly");
        return WhiteFly;
    }

    public void setWhiteFly(String whiteFly) {
        Log.d("Debug transfrom"," Set setWhiteFly");
        WhiteFly = whiteFly;
    }

    public int getWhiteFlyScore() {
        Log.d("Debug transfrom","Get getWhiteFlyScore");
        return WhiteFlyScore;
    }

    public void setWhiteFlyScore(int whiteFlyScore) {
        Log.d("Debug transfrom"," Set setWhiteFlyScore");
        WhiteFlyScore = whiteFlyScore;
    }

    public String getBorer() {
        Log.d("Debug transfrom","Get getBorer");
        return Borer;
    }

    public void setBorer(String borer) {
        Log.d("Debug transfrom"," Set setBorer");
        Borer = borer;
    }

    public float getBorerScore() {
        Log.d("Debug transfrom","Get getBorerScore");
        return BorerScore;
    }

    public void setBorerScore(float borerScore) {
        Log.d("Debug transfrom"," Set setBorerScore");
        BorerScore = borerScore;
    }

    public String getAphid() {
        Log.d("Debug transfrom","Get getAphid");
        return Aphid;
    }

    public void setAphid(String aphid) {
        Log.d("Debug transfrom"," Set setAphid");
        Aphid = aphid;
    }

    public float getAphidScore() {
        Log.d("Debug transfrom","Get getAphidScore");
        return AphidScore;
    }

    public void setAphidScore(float aphidScore) {
        Log.d("Debug transfrom"," Set setAphidScore");
        AphidScore = aphidScore;
    }

    public String getIceryaMealbug() {
        Log.d("Debug transfrom","Get getIceryaMealbug");
        return IceryaMealbug;
    }

    public void setIceryaMealbug(String iceryaMealbug) {
        Log.d("Debug transfrom"," Set setIceryaMealbug");
        IceryaMealbug = iceryaMealbug;
    }

    public float getIceryaMealbugScore() {
        Log.d("Debug transfrom","Get getIceryaMealbugScore");
        return IceryaMealbugScore;
    }

    public void setIceryaMealbugScore(float iceryaMealbugScore) {
        Log.d("Debug transfrom"," Set setIceryaMealbugScore");
        IceryaMealbugScore = iceryaMealbugScore;
    }

    public String getScale() {
        Log.d("Debug transfrom","Get getScale");
        return Scale;
    }

    public void setScale(String scale) {
        Log.d("Debug transfrom"," Set setScale");
        Scale = scale;
    }

    public float getScaleScore() {
        Log.d("Debug transfrom","Get getScaleScore");
        return ScaleScore;
    }

    public void setScaleScore(float scaleScore) {
        Log.d("Debug transfrom"," Set setScaleScore");
        ScaleScore = scaleScore;
    }

    public String getPokkahBoeng() {
        Log.d("Debug transfrom","Get getPokkahBoeng");
        return PokkahBoeng;
    }

    public void setPokkahBoeng(String pokkahBoeng) {
        Log.d("Debug transfrom"," Set setPokkahBoeng");
        PokkahBoeng = pokkahBoeng;
    }

    public float getPokkahBoengScore() {
        Log.d("Debug transfrom","Get getPokkahBoengScore");
        return PokkahBoengScore;
    }

    public void setPokkahBoengScore(float pokkahBoengScore) {
        Log.d("Debug transfrom"," Set setPokkahBoengScore");
        PokkahBoengScore = pokkahBoengScore;
    }

    public String getYellowSpot() {
        Log.d("Debug transfrom","Get getYellowSpot");
        return YellowSpot;
    }

    public void setYellowSpot(String yellowSpot) {
        Log.d("Debug transfrom"," Set setYellowSpot");
        YellowSpot = yellowSpot;
    }

    public float getYellowSpotScore() {
        Log.d("Debug transfrom","Get getYellowSpotScore");
        return YellowSpotScore;
    }

    public void setYellowSpotScore(float yellowSpotScore) {
        Log.d("Debug transfrom"," Set setYellowSpotScore");
        YellowSpotScore = yellowSpotScore;
    }

    public String getBrownSpot() {
        Log.d("Debug transfrom","Get getBrownSpot");
        return BrownSpot;
    }

    public void setBrownSpot(String brownSpot) {
        Log.d("Debug transfrom"," Set setBrownSpot");
        BrownSpot = brownSpot;
    }

    public float getBrownSpotScore() {
        Log.d("Debug transfrom","Get getBrownSpotScore");
        return BrownSpotScore;
    }

    public void setBrownSpotScore(float brownSpotScore) {
        Log.d("Debug transfrom"," Set setBrownSpotScore");
        BrownSpotScore = brownSpotScore;
    }

    public String getRingSpot() {
        Log.d("Debug transfrom","Get getRingSpot");
        return RingSpot;
    }

    public void setRingSpot(String ringSpot) {
        Log.d("Debug transfrom"," Set setRingSpot");
        RingSpot = ringSpot;
    }

    public float getRingSpotScore() {
        Log.d("Debug transfrom","Get getRingSpotScore");
        return RingSpotScore;
    }

    public void setRingSpotScore(float ringSpotScore) {
        Log.d("Debug transfrom"," Set setRingSpotScore");
        RingSpotScore = ringSpotScore;
    }

    public String getRust() {
        Log.d("Debug transfrom","Get getRust");
        return Rust;
    }

    public void setRust(String rust) {
        Log.d("Debug transfrom"," Set setRust");
        Rust = rust;
    }

    public int getRustScore() {
        Log.d("Debug transfrom","Get getRustScore");
        return RustScore;
    }

    public void setRustScore(int rustScore) {
        Log.d("Debug transfrom"," Set setRustScore");
        RustScore = rustScore;
    }

    public String getDownyMildew() {
        Log.d("Debug transfrom","Get getDownyMildew");
        return DownyMildew;
    }

    public void setDownyMildew(String downyMildew) {
        Log.d("Debug transfrom"," Set setDownyMildew");
        DownyMildew = downyMildew;
    }

    public float getDownyMildewScore() {
        Log.d("Debug transfrom","Get getDownyMildewScore");
        return DownyMildewScore;
    }

    public void setDownyMildewScore(float downyMildewScore) {
        Log.d("Debug transfrom"," Set setDownyMildewScore");
        DownyMildewScore = downyMildewScore;
    }

    public String getOtherDiseaseName() {
        Log.d("Debug transfrom","Get getOtherDiseaseName");
        return OtherDiseaseName;
    }

    public void setOtherDiseaseName(String otherDiseaseName) {
        Log.d("Debug transfrom"," Set setOtherDiseaseName");
        OtherDiseaseName = otherDiseaseName;
    }

    public String getOtherDisease() {
        Log.d("Debug transfrom","Get getOtherDisease");
        return OtherDisease;
    }

    public void setOtherDisease(String otherDisease) {
        Log.d("Debug transfrom"," Set setOtherDisease");
        OtherDisease = otherDisease;
    }

    public float getOtherDiseaseScore() {
        Log.d("Debug transfrom","Get getOtherDiseaseScore");
        return OtherDiseaseScore;
    }

    public void setOtherDiseaseScore(float otherDiseaseScore) {
        Log.d("Debug transfrom"," Set setOtherDiseaseScore");
        OtherDiseaseScore = otherDiseaseScore;
    }

    public String getFlowering() {
        Log.d("Debug transfrom","Get getFlowering");
        return Flowering;
    }

    public void setFlowering(String flowering) {
        Log.d("Debug transfrom"," Set setFlowering");
        Flowering = flowering;
    }

    public float getFloweringScore() {
        Log.d("Debug transfrom","Get getFloweringScore");
        return FloweringScore;
    }

    public void setFloweringScore(float floweringScore) {
        Log.d("Debug transfrom"," Set setFloweringScore");
        FloweringScore = floweringScore;
    }

    public float getBrix() {
        Log.d("Debug transfrom","Get getBrix");
        return Brix;
    }

    public void setBrix(float brix) {
        Log.d("Debug transfrom"," Set setBrix");
        Brix = brix;
    }

    public float getBrixScore() {
        Log.d("Debug transfrom","Get getBrixScore");
        return BrixScore;
    }

    public void setBrixScore(float brixScore) {
        Log.d("Debug transfrom"," Set setBrixScore");
        BrixScore = brixScore;
    }

    public float getHeight() {
        Log.d("Debug transfrom","Get getHeight");
        return Height;
    }

    public void setHeight(float height) {
        Log.d("Debug transfrom"," Set setHeight");
        Height = height;
    }

    public float getHeightScore() {
        Log.d("Debug transfrom","Get getHeightScore");
        return HeightScore;
    }

    public void setHeightScore(float heightScore) {
        Log.d("Debug transfrom"," Set setHeightScore");
        HeightScore = heightScore;
    }

    public float getOverAll() {
        Log.d("Debug transfrom","Get getOverAll");
        return OverAll;
    }

    public void setOverAll(float overAll) {
        Log.d("Debug transfrom"," Set setOverAll");
        OverAll = overAll;
    }

    public float getOverAllScore() {
        Log.d("Debug transfrom","Get getOverAllScore");
        return OverAllScore;
    }

    public void setOverAllScore(float overAllScore) {
        Log.d("Debug transfrom"," Set setOverAllScore");
        OverAllScore = overAllScore;
    }

    public String getLeafSheath() {
        Log.d("Debug transfrom","Get getLeafSheath");
        return LeafSheath;
    }

    public void setLeafSheath(String leafSheath) {
        Log.d("Debug transfrom"," Set setLeafSheath");
        LeafSheath = leafSheath;
    }

    public int getLeafSheathScore() {
        Log.d("Debug transfrom","Get getLeafSheathScore");
        return LeafSheathScore;
    }

    public void setLeafSheathScore(int leafSheathScore) {
        Log.d("Debug transfrom"," Set setLeafSheathScore");
        LeafSheathScore = leafSheathScore;
    }

    public int getStalkAmount() {
        Log.d("Debug transfrom","Get getStalkAmount");
        return StalkAmount;
    }

    public void setStalkAmount(int stalkAmount) {
        Log.d("Debug transfrom"," Set setStalkAmount");
        StalkAmount = stalkAmount;
    }

    public float getStalkAmountScore() {
        Log.d("Debug transfrom","Get getStalkAmountScore");
        return StalkAmountScore;
    }

    public void setStalkAmountScore(float stalkAmountScore) {
        Log.d("Debug transfrom"," Set setStalkAmountScore");
        StalkAmountScore = stalkAmountScore;
    }

    public int getInternodeAmount() {
        Log.d("Debug transfrom","Get getInternodeAmount");
        return InternodeAmount;
    }

    public void setInternodeAmount(int internodeAmount) {
        Log.d("Debug transfrom"," Set setInternodeAmount");
        InternodeAmount = internodeAmount;
    }

    public float getInternodeAmountScore() {
        Log.d("Debug transfrom","Get getInternodeAmountScore");
        return InternodeAmountScore;
    }

    public void setInternodeAmountScore(float internodeAmountScore) {
        Log.d("Debug transfrom"," Set setInternodeAmountScore");
        InternodeAmountScore = internodeAmountScore;
    }

    public float getStalkSize1() {
        Log.d("Debug transfrom","Get getStalkSize1");
        return StalkSize1;
    }

    public void setStalkSize1(float stalkSize1) {
        Log.d("Debug transfrom"," Set setStalkSize1");
        StalkSize1 = stalkSize1;
    }

    public float getStalkSize2() {
        Log.d("Debug transfrom","Get getStalkSize2");
        return StalkSize2;
    }

    public void setStalkSize2(float stalkSize2) {
        Log.d("Debug transfrom"," Set setStalkSize2");
        StalkSize2 = stalkSize2;
    }

    public float getStalkSize3() {
        Log.d("Debug transfrom","Get getStalkSize3");
        return StalkSize3;
    }

    public void setStalkSize3(float stalkSize3) {
        Log.d("Debug transfrom"," Set setStalkSize3");
        StalkSize3 = stalkSize3;
    }

    public float getStalkSize4() {
        Log.d("Debug transfrom","Get getStalkSize4");
        return StalkSize4;
    }

    public void setStalkSize4(float stalkSize4) {
        Log.d("Debug transfrom"," Set setStalkSize4");
        StalkSize4 = stalkSize4;
    }

    public float getStalkSize5() {
        Log.d("Debug transfrom","Get getStalkSize5");
        return StalkSize5;
    }

    public void setStalkSize5(float stalkSize5) {
        Log.d("Debug transfrom"," Set setStalkSize5");
        StalkSize5 = stalkSize5;
    }

    public float getStalkSizeAverage() {
        Log.d("Debug transfrom","Get getStalkSizeAverage");
        return StalkSizeAverage;
    }

    public void setStalkSizeAverage(float stalkSizeAverage) {
        Log.d("Debug transfrom"," Set setStalkSizeAverage");
        StalkSizeAverage = stalkSizeAverage;
    }

    public float getStalkSizeAverageScore() {
        Log.d("Debug transfrom","Get getStalkSizeAverageScore");
        return StalkSizeAverageScore;
    }

    public void setStalkSizeAverageScore(float stalkSizeAverageScore) {
        Log.d("Debug transfrom"," Set setStalkSizeAverageScore");
        StalkSizeAverageScore = stalkSizeAverageScore;
    }

    public float getInternodeLength1() {
        Log.d("Debug transfrom","Get getInternodeLength1");
        return InternodeLength1;
    }

    public void setInternodeLength1(float internodeLength1) {
        Log.d("Debug transfrom"," Set setInternodeLength1");
        InternodeLength1 = internodeLength1;

    }

    public float getInternodeLength2() {
        Log.d("Debug transfrom","Get getInternodeLength2");
        return InternodeLength2;
    }

    public void setInternodeLength2(float internodeLength2) {
        Log.d("Debug transfrom"," Set setInternodeLength2");
        InternodeLength2 = internodeLength2;
    }

    public float getInternodeLength3() {
        Log.d("Debug transfrom","Get getInternodeLength3");
        return InternodeLength3;
    }

    public void setInternodeLength3(float internodeLength3) {
        Log.d("Debug transfrom"," Set setInternodeLength3");
        InternodeLength3 = internodeLength3;
    }

    public float getInternodeLength4() {
        Log.d("Debug transfrom","Get getInternodeLength4");
        return InternodeLength4;
    }

    public void setInternodeLength4(float internodeLength4) {
        Log.d("Debug transfrom"," Set setInternodeLength4");
        InternodeLength4 = internodeLength4;
    }

    public float getInternodeLength5() {
        Log.d("Debug transfrom","Get getInternodeLength5");
        return InternodeLength5;
    }

    public void setInternodeLength5(float internodeLength5) {
        Log.d("Debug transfrom"," Set setInternodeLength5");
        InternodeLength5 = internodeLength5;
    }

    public float getInternodeLengthAverage() {
        Log.d("Debug transfrom","Get getInternodeLengthAverage");
        return InternodeLengthAverage;
    }

    public void setInternodeLengthAverage(float internodeLengthAverage) {
        Log.d("Debug transfrom"," Set setInternodeLengthAverage");
        InternodeLengthAverage = internodeLengthAverage;
    }

    public float getInternodeLengthAverageScore() {
        Log.d("Debug transfrom","Get getInternodeLengthAverageScore");
        return InternodeLengthAverageScore;
    }

    public void setInternodeLengthAverageScore(float internodeLengthAverageScore) {
        Log.d("Debug transfrom"," Set setInternodeLengthAverageScore");
        InternodeLengthAverageScore = internodeLengthAverageScore;
    }

    public String getClumpShape() {
        Log.d("Debug transfrom","Get getClumpShape");
        return ClumpShape;
    }

    public void setClumpShape(String clumpShape) {
        Log.d("Debug transfrom"," Set setClumpShape");
        ClumpShape = clumpShape;
    }

    public float getClumpShapeScore() {
        Log.d("Debug transfrom","Get getClumpShapeScore");
        return ClumpShapeScore;
    }

    public void setClumpShapeScore(float clumpShapeScore) {
        Log.d("Debug transfrom"," Set setClumpShapeScore");
        ClumpShapeScore = clumpShapeScore;
    }

    public String getClumpCharacteristic() {
        Log.d("Debug transfrom","Get getClumpCharacteristic");
        return ClumpCharacteristic;
    }

    public void setClumpCharacteristic(String clumpCharacteristic) {
        Log.d("Debug transfrom"," Set setClumpCharacteristic");
        ClumpCharacteristic = clumpCharacteristic;
    }

    public float getClumpCharacteristicScore() {
        Log.d("Debug transfrom","Get getClumpCharacteristicScore");
        return ClumpCharacteristicScore;
    }

    public void setClumpCharacteristicScore(float clumpCharacteristicScore) {
        Log.d("Debug transfrom"," Set setClumpCharacteristicScore");
        ClumpCharacteristicScore = clumpCharacteristicScore;
    }



    public String getInternalFirmness() {
        Log.d("Debug transfrom","Get getInternalFirmness");
        return InternalFirmness;
    }

    public void setInternalFirmness(String internalFirmness) {
        Log.d("Debug transfrom"," Set setInternalFirmness");
        InternalFirmness = internalFirmness;
    }

    public float getInternalFirmnessScore() {
        Log.d("Debug transfrom","Get getInternalFirmnessScore");
        return InternalFirmnessScore;
    }

    public void setInternalFirmnessScore(float internalFirmnessScore) {
        Log.d("Debug transfrom"," Set setInternalFirmnessScore");
        InternalFirmnessScore = internalFirmnessScore;
    }

    public String getStuff() {
        Log.d("Debug transfrom","Get getStuff");
        return Stuff;
    }

    public void setStuff(String stuff) {
        Log.d("Debug transfrom"," Set setStuff");
        Stuff = stuff;
    }

    public float getStuffScore() {
        Log.d("Debug transfrom","Get getStuffScore");
        return StuffScore;
    }

    public void setStuffScore(float stuffScore) {
        Log.d("Debug transfrom"," Set setStuffScore");
        StuffScore = stuffScore;
    }

    public float getTotalScore() {
        Log.d("Debug transfrom","Get getTotalScore");
        return TotalScore;
    }

    public void setTotalScore(float totalScore) {
        Log.d("Debug transfrom"," Set setTotalScore");
        TotalScore = totalScore;
    }

    public String getSelectStatus() {
        Log.d("Debug transfrom","Get getSelectStatus");
        return SelectStatus;
    }

    public void setSelectStatus(String selectStatus) {
        Log.d("Debug transfrom"," Set setSelectStatus");
        SelectStatus = selectStatus;
    }

    public String getWhySelect() {
        Log.d("Debug transfrom","Get TrayAmount");
        return WhySelect;
    }

    public void setWhySelect(String whySelect) {
        Log.d("Debug transfrom"," Set TrayAmount");
        WhySelect = whySelect;
    }
}