const mysql = require('mysql2/promise');

let pool;

const createPool = () => mysql.createPool({
    host: "localhost",
    user: process.env.DB_USERNAME,
    password: "root",
    database: "sample-app",
});

const getDb = () => {
    if (!pool) {
        pool = createPool();
    }

    return pool;
};

module.exports = {
    query,
    getDb,
};
