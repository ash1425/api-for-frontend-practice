Load data (this should be button, clicking this loads the below table)

| Product Code | SKU  | Colour | Size | Price | Delivery Date | Stock |
|--------------|------|--------|------|-------|---------------|-------|
| 123456       | ABC1 | Blue   | M    | 19.99 | 2023-05-01    | 50    |
|              | ABC2 | Blue   | L    | 19.99 | 2023-05-01    | 30    |
|              | ABC3 | Blue   | XL   | 19.99 | 2023-05-01    | 20    |
| 654321       | DEF1 | Red    | S    | 29.99 | 2023-04-30    | 10    |
|              | DEF2 | Red    | M    | 29.99 | 2023-04-30    | 10    |
|              | DEF3 | Red    | L    | 29.99 | 2023-04-30    | 5     |
| 789012       | GHI1 | Green  | M    | 14.99 | 2023-05-02    | 5     |
|              | GHI2 | Green  | L    | 14.99 | 2023-05-02    | 3     |


Notes:

Initially show empty table with only column names
On click of "Load data", make a call to this API from angular frontend app
Show loader while data is being fetched
Show table at that place once data is loaded.

UI should look nice. Use proper layout