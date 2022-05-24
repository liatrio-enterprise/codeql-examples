const express = require('express')
const app = express()
const port = 3000;

const db = require('../db');

app.get('/', (req, res) => {
  res.send('Hello World!')
})

app.get("/students", (request, response) => {
  const query = 'SELECT * FROM Students WHERE student_id = ?'
  db.query(query, [2], (err, rows) => {
    if(err) throw err;
    response.json({data:rows});
  });
});

app.listen(port, () => {
  console.log(`Example app listening on port ${port}`)
})
