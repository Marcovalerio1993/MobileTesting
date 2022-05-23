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

Mobile.startExistingApplication('com.amazon.mShop.android.shopping')

driver = MobileDriverFactory.getDriver()

Mobile.tap(findTestObject('Object Repository/AZ - Amazon/AZ - Search Home Page'), 5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/AZ - Amazon/AZ - Searchbar after click in home'), 5, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Object Repository/AZ - Amazon/AZ - Searchbar after click in home'), 'Boardgame', 5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/AZ - Amazon/AZ - First Result Search'), 5, FailureHandling.STOP_ON_FAILURE)

Mobile.scrollToText('Doom il gioco')

Mobile.tap(findTestObject('Object Repository/AZ - Amazon/AZ - Doom Board Game Image'), 5, FailureHandling.STOP_ON_FAILURE)

Mobile.scrollToText('Aggiungi al carrello')

Mobile.tap(findTestObject('Object Repository/AZ - Amazon/AZ - Aggiungi al carrello'), 5, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Object Repository/AZ - Amazon/AZ - Verifica aggiunto carello'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/AZ - Amazon/AZ - FATTO img'), 5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/AZ - Amazon/AZ - Immagine Carrello'), 5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/AZ - Amazon/AZ - Rimuovi oggetto singolo'), 5, FailureHandling.STOP_ON_FAILURE)

if(Mobile.verifyElementExist(findTestObject('Object Repository/AZ - Amazon/AZ -  stato rimosso da Carrello'), 0, FailureHandling.STOP_ON_FAILURE)){
	
		KeywordUtil.markPassed('Oggetto rimosso con successo!')
}

driver.resetApp()