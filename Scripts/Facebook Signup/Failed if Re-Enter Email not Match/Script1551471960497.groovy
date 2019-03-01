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

WebUI.setText(findTestObject('Facebook/Nama Depan'), 'ibnu')

WebUI.setText(findTestObject('Facebook/Nama Belakang'), 'hasan')

WebUI.setText(findTestObject('Facebook/Selular or email'), 'hasanibnu@ymail.com')

WebUI.waitForElementPresent(findTestObject('Facebook/Email ulang'), 2)

WebUI.setText(findTestObject('Facebook/Email ulang'), 'ibnuhsan@gmail.com')

WebUI.verifyElementPresent(findTestObject('Facebook/X Email ulang'), 2)

