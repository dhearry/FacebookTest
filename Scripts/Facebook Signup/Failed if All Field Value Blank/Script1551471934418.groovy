import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://id-id.facebook.com/')

WebUI.waitForElementPresent(findTestObject('Facebook/Nama Depan'), 2)

WebUI.click(findTestObject('Facebook/Button'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Facebook/X Nama Depan'), 2)

WebUI.verifyElementPresent(findTestObject('Facebook/X Nama Belakang'), 2)

WebUI.verifyElementPresent(findTestObject('Facebook/X Selular or email'), 2)

WebUI.verifyElementPresent(findTestObject('Facebook/X Kata Sandi'), 2)

WebUI.verifyElementPresent(findTestObject('Facebook/X Gender'), 2)

