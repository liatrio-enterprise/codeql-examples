const express = require('express');
const app = express();
const port = 3000;

const {query} = require("./db");

app.get('/', (req, res) => {
    res.send('Hello World!');
});

app.get("/students", async (request, response) => {
    try {
        const [ results ] = await query("SELECT * FROM Students");

        response.json(results);
    } catch (error) {
        response.status(500).json(error);
    }
});

app.get("/students/:id", async (request, response) => {
    try {
        const [ results ] = await query("SELECT * FROM Students WHERE id = ?", [request.params.id]);

        console.log(results);

        if (results.length > 0) {
            response.json(results[0]);
        } else {
            response.status(404).send();
        }
    } catch (error) {
        response.status(500).json(error);
    }
});

app.listen(port, () => {
    console.log(`Example app listening on port ${port}`)
});
