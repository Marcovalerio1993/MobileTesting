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

Mobile.startExistingApplication('com.whatsapp')

Mobile.tap(findTestObject('Object Repository/Whatsapp/Home/WA-ChatMVB'),0,FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Whatsapp/InChat/WA-insertTextMessage'),5,FailureHandling.STOP_ON_FAILURE)

int number = 3

for(i=3; i>=0; i--) {
	
	Mobile.setText(findTestObject('Object Repository/Whatsapp/InChat/WA-insertTextMessage'), 'Ciao ragazzi sono il Samsung S/9 e volevo dirvi che pretendo il controllo assoluto del mondo', 2)
	
	Mobile.tap(findTestObject('Object Repository/Whatsapp/InChat/WA-MexINVIA'), 2, FailureHandling.STOP_ON_FAILURE)
	
	Mobile.setText(findTestObject('Object Repository/Whatsapp/InChat/WA-insertTextMessage'), 'Ve lo ripeterò ancora per altre ' + '*' + number + '*' + ' volte!', 2) 
	
	Mobile.tap(findTestObject('Object Repository/Whatsapp/InChat/WA-MexINVIA'), 2, FailureHandling.STOP_ON_FAILURE)
	
	number--
	
	if(i==0) {
		Mobile.setText(findTestObject('Object Repository/Whatsapp/InChat/WA-insertTextMessage'), '*' + 'Tanti Saluti!' + '*', 2)
		
		Mobile.tap(findTestObject('Object Repository/Whatsapp/InChat/WA-MexINVIA'), 2, FailureHandling.STOP_ON_FAILURE)
	} else {
		//continue
	}
	
}
