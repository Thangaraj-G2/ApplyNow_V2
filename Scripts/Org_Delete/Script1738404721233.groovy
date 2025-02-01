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

WebUI.callTestCase(findTestCase('Org_Search'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('APV2_Login/Page_Organizations - ApplyNow/Page_Organizations - ApplyNow/Page_Organizations - ApplyNow/Mark_Kat_Org1'))

WebUI.click(findTestObject('APV2_Login/Page_Organizations - ApplyNow/Page_Organizations - ApplyNow/Page_Organizations - ApplyNow/Search Delete'), 
    FailureHandling.STOP_ON_FAILURE)

String Delete_Code = WebUI.getText(findTestObject('APV2_Login/Page_Organizations - ApplyNow/Page_Organizations - ApplyNow/Page_Organizations - ApplyNow/Delete Code'))

WebUI.setText(findTestObject('APV2_Login/Page_Organizations - ApplyNow/Page_Organizations - ApplyNow/Page_Organizations - ApplyNow/Enter Delete Code'), 
    Delete_Code)

WebUI.takeScreenshot()

WebUI.click(findTestObject('APV2_Login/Page_Organizations - ApplyNow/Page_Organizations - ApplyNow/Page_Organizations - ApplyNow/Page_Organizations - ApplyNow/Click_Delete'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('APV2_Login/Page_Organizations - ApplyNow/Page_Organizations - ApplyNow/Page_Organizations - ApplyNow/Search Organization'), 
    'Kat_Org1')

WebUI.verifyElementNotPresent(findTestObject('APV2_Login/Page_Organizations - ApplyNow/Page_Organizations - ApplyNow/Page_Organizations - ApplyNow/Mark_Kat_Org1'), 
    0)

WebUI.takeScreenshot()

