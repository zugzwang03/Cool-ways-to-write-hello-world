// Running on: https://www.typescriptlang.org/play
class TSPrinter {
    private _text: String = "Hello World!";
    private _standardOut: StandardOut = StandardOut.ALERT;

    public get standardOut(): StandardOut {
        return this._standardOut;
    }

    public set standardOut(standardOut: StandardOut) {
        this._standardOut = standardOut;
    }

    public get text(): String {
        return this._text;
    }

    public set text(text: String) {
        this._text = text;
    }

    public printText(): void {
        switch (this.standardOut) {
            case StandardOut.ALERT:
                window.alert(this.text);
                break;
            case StandardOut.CONSOLE:
                console.log(this.text);
                break;
            default:
                throw new Error(`Unexpected standard output: ${this.standardOut}!`);
        }
    }
}

enum StandardOut {
    CONSOLE,
    ALERT,
    UNKNOWN, // for provoking an error
}

const printer = new TSPrinter();
printer.standardOut = StandardOut.CONSOLE;
try {
    printer.printText();
} catch (e) {
    console.error(`${Date.now().toLocaleString()}: Error while printing: '${printer.text}'. ${e}`);
}
