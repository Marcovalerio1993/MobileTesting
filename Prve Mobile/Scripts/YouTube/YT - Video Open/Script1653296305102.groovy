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


Mobile.startExistingApplication('com.google.android.youtube')

driver = MobileDriverFactory.getDriver()

Mobile.tap(findTestObject('Object Repository/YT-YouTube/YT - CloseYouTubePremium'), 5, FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Object Repository/YT-YouTube/YT-TurnOnAccessibility-IGNORA'), 5, FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Object Repository/YT-YouTube/YT-SearchHome'), 5, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Object Repository/YT-YouTube/YT-SearchBar'), 'Rage gamers reaction', 5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/YT-YouTube/YT-FirstSearchResult'), 5, FailureHandling.STOP_ON_FAILURE)

if(Mobile.verifyElementExist(findTestObject('Object Repository/YT-YouTube/YT - WidgetScrollBar'), 5, FailureHandling.OPTIONAL)){
	
		Mobile.tap(findTestObject('Object Repository/YT-YouTube/YT - FirstElementWidgetList'), 5, FailureHandling.STOP_ON_FAILURE)
}

driver.resetApp()

