const express = require('express')
const app = express()
const port = 3000;

app.get('/', (req, res) => {
  res.send('Hello World!')
})

app.post("/students", (request, response) => {
  const data = request.body;
  const query = `SELECT * FROM Students WHERE student_age = (${data.student_age})`;
  connection.query(query, (err, rows) => {
    if(err) throw err;
    response.json({data:rows});
  });
});

app.listen(port, () => {
  console.log(`Example app listening on port ${port}`)
})
