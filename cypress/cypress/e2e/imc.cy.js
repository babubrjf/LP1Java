describe('template spec', () => {
  it('passes', () => {
    cy.visit('http://localhost:3000')
    cy.get('#peso').click();
    cy.get('#peso').type('106');
    cy.get('#altura').click();
    cy.get('#altura').type('1.85');
    cy.get('#sexo').select('M');
    cy.get('#root button.btn').click();
    cy.get('.result-label')
	cy.get('.result-label').should('have.text', 'acima do peso ideal')
  })
})