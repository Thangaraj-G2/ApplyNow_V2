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

WebUI.callTestCase(findTestCase('Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('APV2_Login/Page_Organizations - ApplyNow/Page_Organizations - ApplyNow/Page_Organizations - ApplyNow/New Organization'))

WebUI.setText(findTestObject('APV2_Login/Page_Organizations - ApplyNow/Page_Organizations - ApplyNow/Page_Organizations - ApplyNow/Display Name'), 
    'Kat_Org1')

WebUI.setText(findTestObject('APV2_Login/Page_Organizations - ApplyNow/Page_Organizations - ApplyNow/Page_Organizations - ApplyNow/Description'), 
    'desc')

WebUI.click(findTestObject('APV2_Login/Page_Organizations - ApplyNow/Page_Organizations - ApplyNow/Page_Organizations - ApplyNow/Next'))

WebUI.setText(findTestObject('APV2_Login/Page_Organizations - ApplyNow/Page_Organizations - ApplyNow/Page_Organizations - ApplyNow/Address'), 
    'Downtown 4th')

WebUI.setText(findTestObject('APV2_Login/Page_Organizations - ApplyNow/Page_Organizations - ApplyNow/Page_Organizations - ApplyNow/Page_Organizations - ApplyNow/City'), 
    'Torento')

WebUI.setText(findTestObject('APV2_Login/Page_Organizations - ApplyNow/Page_Organizations - ApplyNow/Page_Organizations - ApplyNow/Province State'), 
    'Ontario')

WebUI.setText(findTestObject('APV2_Login/Page_Organizations - ApplyNow/Page_Organizations - ApplyNow/Page_Organizations - ApplyNow/ZipPostal Code'), 
    '261525')

WebUI.setText(findTestObject('APV2_Login/Page_Organizations - ApplyNow/Page_Organizations - ApplyNow/Page_Organizations - ApplyNow/Country'), 
    'Canada')

WebUI.setText(findTestObject('APV2_Login/Page_Organizations - ApplyNow/Page_Organizations - ApplyNow/Page_Organizations - ApplyNow/Email ID'), 
    'testuser@testmaill.com')

WebUI.setText(findTestObject('APV2_Login/Page_Organizations - ApplyNow/Page_Organizations - ApplyNow/Page_Organizations - ApplyNow/Phone Number'), 
    '6504059055')

WebUI.delay(1)

WebUI.click(findTestObject('APV2_Login/Page_Organizations - ApplyNow/Page_Organizations - ApplyNow/Page_Organizations - ApplyNow/Create Organization'))

WebUI.delay(1)

WebUI.setText(findTestObject('APV2_Login/Page_Organizations - ApplyNow/Page_Organizations - ApplyNow/Page_Organizations - ApplyNow/Search Organization'), 
    'Kat_Org1')

WebUI.verifyElementPresent(findTestObject('APV2_Login/Page_Organizations - ApplyNow/Page_Organizations - ApplyNow/Page_Organizations - ApplyNow/Mark_Kat_Org1'), 
    0)

WebUI.mouseOver(findTestObject('APV2_Login/Page_Organizations - ApplyNow/Page_Organizations - ApplyNow/Page_Organizations - ApplyNow/Mark_Kat_Org1'))

WebUI.verifyElementPresent(findTestObject('APV2_Login/Page_Organizations - ApplyNow/Page_Organizations - ApplyNow/Page_Organizations - ApplyNow/Search Delete'), 
    0)

WebUI.verifyElementPresent(findTestObject('APV2_Login/Page_Organizations - ApplyNow/Page_Organizations - ApplyNow/Page_Organizations - ApplyNow/Search Tenants'), 
    0)

WebUI.verifyElementPresent(findTestObject('APV2_Login/Page_Organizations - ApplyNow/Page_Organizations - ApplyNow/Page_Organizations - ApplyNow/Modify'), 
    0)

WebUI.callTestCase(findTestCase('Logout'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.acceptAlert()

