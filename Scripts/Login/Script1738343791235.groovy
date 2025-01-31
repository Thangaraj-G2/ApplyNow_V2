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

WebUI.openBrowser('https://apply-now-web-test.azurewebsites.net/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('APV2_Login/Page_Home - ApplyNow - ApplyNow/Sign In or Join Now'))

WebUI.delay(2)

WebUI.setText(findTestObject('APV2_Login/Page_Sign up or sign in/Username'), 'cg_demo102@yopmail.com')

WebUI.setText(findTestObject('APV2_Login/Page_Sign up or sign in/Password'), 'India@123')

WebUI.delay(2)

WebUI.click(findTestObject('APV2_Login/Page_Sign up or sign in/Sign in'))

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('APV2_Login/Page_Organizations - ApplyNow/User Profile'), 0)

