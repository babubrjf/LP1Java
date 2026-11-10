function FormGroup({ label, htmlFor, children }) {
  return (
    <div>
      <label className="form-label" htmlFor={htmlFor}>{label}</label>
      {children}
    </div>
  );
}

export default FormGroup;
