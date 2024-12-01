const mongoose = require("mongoose");
mongoose.set("strictQuery", true);
const atlat =
  "mongodb+srv://root:ducthang2005@dblab2.yldjs.mongodb.net/?retryWrites=true&w=majority&appName=DBLab2";
const connect = async () => {
  try {
    await mongoose.connect(atlat, {
      useNewUrlParser: true,
      useUnifiedTopology: true,
    });
    console.log("Connect success !");
  } catch (error) {
    console.log("Connect fail !");
    console.log(error);
  }
};
module.exports = { connect };
