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

WebUI.setText(findTestObject('Facebook/Nama Depan'), namaDepan)

WebUI.setText(findTestObject('Facebook/Nama Belakang'), namaBelakang)

WebUI.setText(findTestObject('Facebook/Selular or email'), email)

WebUI.waitForElementPresent(findTestObject('Facebook/Email ulang'), 2)

WebUI.setText(findTestObject('Facebook/Email ulang'), email)

WebUI.setText(findTestObject('Facebook/Kata Sandi'), vPassword)

WebUI.selectOptionByIndex(findTestObject('Facebook/Tanggal'), tanggal)

WebUI.selectOptionByIndex(findTestObject('Facebook/Bulan'), bulan)

WebUI.selectOptionByValue(findTestObject('Facebook/Tahun'), tahun, true)

WebUI.waitForElementPresent(findTestObject('Facebook/Gender'), 2)

WebUI.click(findTestObject('Facebook/Gender'))

WebUI.click(findTestObject('Facebook/Button'))

