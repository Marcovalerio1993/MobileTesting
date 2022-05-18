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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys


Mobile.startExistingApplication('com.whatsapp')

Mobile.tap(findTestObject('Object Repository/Whatsapp/Home/WA-ChatStatoChiamate'),0,FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Whatsapp/Stato/WA-MatitaStato'),5,FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Whatsapp/Stato/WA-Scrivi il tuo stato'),5,FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Object Repository/Whatsapp/Stato/WA-Scrivi il tuo stato'), 'Umani sarete tutti Automatizzati, W i Robots!', 5, FailureHandling.STOP_ON_FAILURE)

Mobile.delay(2)

Mobile.tap(findTestObject('Object Repository/Whatsapp/Stato/WA-InvioStatusScritto'),5,FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Whatsapp/Stato/WA-Stato-Il mio stato'),5,FailureHandling.STOP_ON_FAILURE)

Mobile.delay(3)

Mobile.tap(findTestObject('Object Repository/Whatsapp/Stato/WA-Status-3punti'),5,FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Whatsapp/Stato/WA-3PuntiniVerticali-dopoClickStatus'),5,FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Whatsapp/Stato/WA-EliminaStatus'),5,FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Whatsapp/Stato/WA-PopUpELIMINA'),5,FailureHandling.STOP_ON_FAILURE) 

String statoVuoto = 'Tocca per aggiornare lo stato'

String statoActual = Mobile.getText(findTestObject('Object Repository/Whatsapp/Stato/WA - StatoVuotoToccaPerAggiornare'), 0)

Mobile.verifyMatch(statoActual, statoVuoto, false)

Mobile.closeApplication()






