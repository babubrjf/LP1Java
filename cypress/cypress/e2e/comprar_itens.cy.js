describe('template spec', () => {
  it('passes', () => {
    cy.visit('https://www.saucedemo.com')
    cy.get('[data-test="username"]').click();
    cy.get('[data-test="username"]').type('standard_user');
    cy.get('[data-test="password"]').click();
    cy.get('[data-test="password"]').type('secret_sauce');
    cy.get('[data-test="login-button"]').click();
    cy.get('[data-test="add-to-cart-test.allthethings()-t-shirt-(red)"]').click();
    cy.get('[data-test="add-to-cart-sauce-labs-fleece-jacket"]').click();
    cy.get('[data-test="shopping-cart-link"]').click();
    cy.get('div:nth-child(3) [data-test="item-quantity"]').click();
    cy.get('[data-test="checkout"]').click();
    cy.get('[data-test="firstName"]').click();
    cy.get('[data-test="firstName"]').type('Pablo');
    cy.get('[data-test="lastName"]').type('Rodrigues');
    cy.get('[data-test="postalCode"]').type('123456-78');
    cy.get('[data-test="continue"]').click();
    cy.get('[data-test="finish"]').click();
    cy.get('[data-test="generate-pdf-order"]').click();
    cy.get('[data-test="back-to-products"]').click();
  })
})