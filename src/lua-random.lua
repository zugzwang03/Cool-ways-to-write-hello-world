local function split(input, sep)
    local t = {};
    for c in string.gmatch(input, ".") do
        table.insert(t, c);
    end;
    return t;
end;

local function randomPrint(output)
    local str = split(output, "%s");
    local res = "";

    local count = 0
    local start = os.clock()

    repeat
        count = count + 1
        res = ""
        for i = 1, #str do
            res = string.char(math.random(1, 128))
        end
    until res == output

    local time = os.clock() - start;

    print(string.format("Time: %sms | Attempts: %s", time, count));
    print(output);
end;

-- 1/1.93e+25 chance of printing every attempt
randomPrint("Hello World!"); 
