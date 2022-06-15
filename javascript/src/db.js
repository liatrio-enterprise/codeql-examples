const mysql = require('mysql2/promise');

let pool;

const query = async (...args) => {
    if (!pool) {
        pool = mysql.createPool({
            host: "localhost",
            user: "root",
            password: "root",
            database: "sample-app",
        });
    }

    return pool.query(...args);
};

module.exports = {
    query
};
