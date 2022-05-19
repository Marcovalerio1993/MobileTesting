import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils

Mobile.startExistingApplication('com.google.android.apps.maps')

driver = MobileDriverFactory.getDriver()

Mobile.tap(findTestObject('Object Repository/GM-GoogleMaps/GM-FirstSearch'),3,FailureHandling.STOP_ON_FAILURE)

String randomName = RandomStringUtils.randomAlphabetic(7)

Mobile.setText(findTestObject('Object Repository/GM-GoogleMaps/GM-SearcheHere'), randomName, 5, FailureHandling.STOP_ON_FAILURE)

for(i=1;i<=10;i++) {

	//se ci sta il primo risultato di ricerca
	if(Mobile.tap(findTestObject('Object Repository/GM-GoogleMaps/GM-FirstLineResultSearch'),3, FailureHandling.OPTIONAL)) {
	
	break
	
	} else {
	
	//altrimenti se non esiste
	Mobile.tap(findTestObject('Object Repository/GM-GoogleMaps/GM - SearchRandomString'),5,FailureHandling.STOP_ON_FAILURE)
	
	}

	Mobile.delay(3)
		
	String noResults = Mobile.getText(findTestObject('Object Repository/GM-GoogleMaps/GM-NoResultFound'), 3, FailureHandling.OPTIONAL)
	
	//se non trova alcun luogo
	if (Mobile.verifyMatch(noResults, 'Nessun risultato su Google Maps', false, FailureHandling.OPTIONAL)) {
	
		Mobile.tap(findTestObject('Object Repository/GM-GoogleMaps/GM-(X)button'),3,FailureHandling.STOP_ON_FAILURE)
	
		randomName = RandomStringUtils.randomAlphabetic(7)
	
		Mobile.setText(findTestObject('Object Repository/GM-GoogleMaps/GM-SearcheHere'), randomName, 5, FailureHandling.STOP_ON_FAILURE)
	
//		if(Mobile.tap(findTestObject('Object Repository/GM-GoogleMaps/GM-FirstLineResultSearch'),3, FailureHandling.OPTIONAL)) {
//		
//			Mobile.delay(3)
//		
//			break
	
	    //se invece non rilascia il messaggio che non ha trovato nulla
//		} 
//		else {
//	
//			Mobile.tap(findTestObject('Object Repository/GM-GoogleMaps/GM-BackButton'),5,FailureHandling.STOP_ON_FAILURE)
//			Mobile.delay(2)
//			randomName = RandomStringUtils.randomAlphabetic(5)
//			Mobile.setText(findTestObject('Object Repository/GM-GoogleMaps/GM-SecondEditSearch'), randomName, 5, FailureHandling.STOP_ON_FAILURE)
//			Mobile.delay(3)
//			
//			//se ci sta il primo risultato di ricerca
//			if(Mobile.tap(findTestObject('Object Repository/GM-GoogleMaps/GM-FirstLineResultSearch'),3, FailureHandling.OPTIONAL)) {	
//			Mobile.delay(3)
//			break
//			} 
//			
//			//Mobile.tap(findTestObject('Object Repository/GM-GoogleMaps/GM - SearchRandomString'),5,FailureHandling.STOP_ON_FAILURE)	
//	
//		}

	//se trova alla prima botta
	} else {
	
		break
	}


//try {
//	
//	Mobile.tap(findTestObject('Object Repository/GM-GoogleMaps/GM-BackButton'),5,FailureHandling.STOP_ON_FAILURE)
//	
//} catch (Exception e) {
//	//there was an exception
//}


//parentesi del for
}

//parte finale
Mobile.delay(5)

if(Mobile.tap(findTestObject('Object Repository/GM-GoogleMaps/GM-IndicationsGeneric'),10)) {
	
	KeywordUtil.markPassed('App did\'t find a single place but more locations')	
	
}else {
	
	KeywordUtil.markPassed('App found a single place to go, have a good journey!')
}

driver.resetApp()
