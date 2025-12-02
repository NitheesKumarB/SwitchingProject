import com.microsoft.playwright.*;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Webtable_Clss {


    public static void main(String[] args) {
        try (Playwright playwright = Playwright.create()) {
            Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(500));
            Page page = browser.newPage();
            page.waitForTimeout(20000);
            page.navigate("https://cosmocode.io/automation-practice-webtable/",
                    new Page.NavigateOptions().setTimeout(60000));

            page.waitForTimeout(20000);
            Locator headerRow = page.locator("#countries > tbody > tr").first();
            Locator headers = headerRow.locator("td");

            List<String> headerList = new ArrayList<>();
            for (int i = 0; i < headers.count(); i++) {
                String headerText = headers.nth(i).textContent().trim();
                headerList.add(headerText.isEmpty() ? "Column" + (i + 1) : headerText);
            }
;;;jk

            Locator dataRows = page.locator("#countries > tbody > tr").nth(1).locator("xpath=following-sibling::tr");
            int rowCount = dataRows.count();

            List<Map<String, String>> tableData = new ArrayList<>();

            for (int i = 0; i < rowCount; i++) {
                Locator row = dataRows.nth(i);
                Locator cells = row.locator("td");

                Map<String, String> rowData = new LinkedHashMap<>();
                for (int j = 0; j < cells.count(); j++) {
                    String key = headerList.get(j);
                    String value = cells.nth(j).textContent().trim();
                    rowData.put(key, value);
                }
                tableData.add(rowData);
            }

            // Print results
            for (Map<String, String> row : tableData) {
                System.out.println(row);
            }

            browser.close();
        }
    }



}
