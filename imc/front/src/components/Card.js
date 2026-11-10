function Card({ title, children }) {
  return (
    <section className="card shadow-sm">
      <h1 className="card-header h3">{title}</h1>
      <div className="card-body">{children}</div>
    </section>
  );
}

export default Card;
