# Discussion

> What is the purpose of this project?

This project is for digitalizing small businesses which still use paper for saving their data.
It is supposed that the app will be suitable for different types of resale businesses.

> Could you shortly explain how the business process flows?

There are different types of goods, which are ordered from various countries. The ways of delivery are also different. Usually, several types of goods come in one bundle. Sales occur in two ways: wholesale and retail.
Goods also may have sizes (which could be different goods) and colors. The price of the good forms regarding
currency, delivery type, and taxes. It should be possible to set the price manually. It is important to know the quantity
of the remained goods. What is more? We should realize statistics of the sales. What is more, each retail should be
noted.

> How we can structure our work?

I've created a project roadmap [here](roadmap.md). It stands as a start point for "what to do".

> Could you describe each product properties(size, color, country, etc.)?

Product:

| Field Name | Description                                               | Type       | Examples | Required |
|----|-----------------------------------------------------------|------------|----------|----------|
| Retail Price | selling price of the product                              | BigDecimal | 15.50    | true     |
| Origin | information about the place from where product is obtained | Object     | Origin   | true     |
| Size | size of the product if it exists                          | String     | xxl      | false    |
| Color | Color of the current product                              | String     | "Red"    | false    |
| Available colors | ?                                                         | ?          | ?        | ?        |  [comment]: <> (I suppose this information we will get in differrent way)
| Place | place in the shop                                         | String     | "4B"     | false    |



| Field Name       | Description           | Type   | Examples | Required |
|------------------|-----------------------|--------|----------|----------|
| Country          | Country of the origin | String | "Qatar"  | true     |
| City             | City of the origin    | String | "Doha"   | true     |
| Shop Id          | id of the shop        | String | "26eg4"  | false    |