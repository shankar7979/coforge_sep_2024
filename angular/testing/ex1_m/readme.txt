npm init -y
npm install typescript jest ts-jest @types/jest --save-dev

1.Create a tsconfig.json file to configure TypeScript. You can use the tsc --init command or create it manually. Here's a basic example:
	{
	  "compilerOptions": {
		"target": "ES6",
		"module": "CommonJS",
		"outDir": "./dist",
		"rootDir": "./src"
	  }
	}

2. Create a src directory for your TypeScript source files and a tests directory for your test files.

math.ts inside src

	export function add(a: number, b: number): number {
	  return a + b;
	}

	Create corresponding TypeScript test files in the tests directory. Name them with a .test.ts or .spec.ts extension. For example, math.test.ts:

    	import { add } from "../src/math";

    	describe("Math functions", () => {
    	  it("should add two numbers correctly", () => {
    		expect(add(1, 2)).toEqual(3);
    	  });
    	});

    Step 4: Configure Jest

    	Create a jest.config.js configuration file in your project's root directory:
    	module.exports = {
    	  preset: "ts-jest",
    	  testEnvironment: "node",
    	};

    Step 5: Run Your Tests

    	Add a script to your package.json to run the tests:
    	"scripts": {
    	  "test": "jest"
    	}
    2. Run your tests using:

    npm test
  run single file 
    npm test -- path/to/your/testfile.test.js

npm i protractor