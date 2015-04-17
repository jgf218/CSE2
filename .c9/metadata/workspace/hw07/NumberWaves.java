{"changed":true,"filter":false,"title":"NumberWaves.java","tooltip":"/hw07/NumberWaves.java","value":"//Joe Freeman\n// 3/6/15\n//HW 07 Number Waves\n\n\n// Program will take an inputted number between 1 and 30 and create a wave out of it\nimport java.util.Scanner;\npublic class NumberWaves {\n                  // main method required for every Java program\n                 public static void main(String[] args) {\n Scanner myScanner;\nmyScanner = new Scanner( System.in );\nSystem.out.print(\"Please enter an integer between 1 and 30: \");\n\nwhile(i<2){\ni++;\n    if (myScanner.hasNextInt()){\n        int number= myScanner.nextInt();\n        if (number>=1 && number<=30){\n            System.out.print(\"FOR LOOP:\");\n            for( int forCount = 1; forCount<=number; forCount++ ) {\n                if(forCount%2==0){\n                    for( int forRepeat = 1; forRepeat<=forCount; forRepeat++ ) {\n                        for( int forLine = 1; forLine<=forRepeat; forLine++ ) {\n                        System.out.print(forCount);\n                        } \n                    System.out.println(\" \");    \n                    }    \n                } \n                else{\n                    for( int forRepeat = 1; forRepeat<=forCount; forRepeat++ ) {\n                        for( int forLine = forCount; forLine>=forRepeat; forLine-- ) {\n                        System.out.print(forCount);\n                        } \n                    System.out.println(\" \");    \n                    }       \n                }\n            } \n        }\n    }    \n}\n}}\n \n","undoManager":{"mark":84,"position":100,"stack":[[{"group":"doc","deltas":[{"start":{"row":22,"column":58},"end":{"row":22,"column":59},"action":"remove","lines":["t"]}]}],[{"group":"doc","deltas":[{"start":{"row":22,"column":57},"end":{"row":22,"column":58},"action":"remove","lines":["n"]}]}],[{"group":"doc","deltas":[{"start":{"row":22,"column":56},"end":{"row":22,"column":57},"action":"remove","lines":["u"]}]}],[{"group":"doc","deltas":[{"start":{"row":22,"column":55},"end":{"row":22,"column":56},"action":"remove","lines":["o"]}]}],[{"group":"doc","deltas":[{"start":{"row":22,"column":54},"end":{"row":22,"column":55},"action":"remove","lines":["C"]}]}],[{"group":"doc","deltas":[{"start":{"row":22,"column":54},"end":{"row":22,"column":55},"action":"insert","lines":["R"]}]}],[{"group":"doc","deltas":[{"start":{"row":22,"column":55},"end":{"row":22,"column":56},"action":"insert","lines":["e"]}]}],[{"group":"doc","deltas":[{"start":{"row":22,"column":51},"end":{"row":22,"column":56},"action":"remove","lines":["forRe"]},{"start":{"row":22,"column":51},"end":{"row":22,"column":60},"action":"insert","lines":["forRepeat"]}]}],[{"group":"doc","deltas":[{"start":{"row":20,"column":67},"end":{"row":21,"column":0},"action":"insert","lines":["",""]},{"start":{"row":21,"column":0},"end":{"row":21,"column":16},"action":"insert","lines":["                "]}]}],[{"group":"doc","deltas":[{"start":{"row":21,"column":16},"end":{"row":21,"column":17},"action":"insert","lines":["i"]}]}],[{"group":"doc","deltas":[{"start":{"row":21,"column":17},"end":{"row":21,"column":18},"action":"insert","lines":["f"]}]}],[{"group":"doc","deltas":[{"start":{"row":21,"column":17},"end":{"row":21,"column":18},"action":"remove","lines":["f"]}]}],[{"group":"doc","deltas":[{"start":{"row":21,"column":16},"end":{"row":21,"column":17},"action":"remove","lines":["i"]}]}],[{"group":"doc","deltas":[{"start":{"row":22,"column":12},"end":{"row":22,"column":16},"action":"insert","lines":["    "]}]}],[{"group":"doc","deltas":[{"start":{"row":23,"column":20},"end":{"row":23,"column":24},"action":"insert","lines":["    "]}]}],[{"group":"doc","deltas":[{"start":{"row":24,"column":24},"end":{"row":24,"column":28},"action":"insert","lines":["    "]}]}],[{"group":"doc","deltas":[{"start":{"row":24,"column":24},"end":{"row":24,"column":28},"action":"remove","lines":["    "]}]}],[{"group":"doc","deltas":[{"start":{"row":24,"column":23},"end":{"row":24,"column":24},"action":"insert","lines":[" "]}]}],[{"group":"doc","deltas":[{"start":{"row":25,"column":20},"end":{"row":25,"column":24},"action":"insert","lines":["    "]}]}],[{"group":"doc","deltas":[{"start":{"row":26,"column":16},"end":{"row":26,"column":20},"action":"insert","lines":["    "]}]}],[{"group":"doc","deltas":[{"start":{"row":27,"column":16},"end":{"row":27,"column":20},"action":"insert","lines":["    "]}]}],[{"group":"doc","deltas":[{"start":{"row":21,"column":16},"end":{"row":21,"column":17},"action":"insert","lines":["i"]}]}],[{"group":"doc","deltas":[{"start":{"row":21,"column":17},"end":{"row":21,"column":18},"action":"insert","lines":["f"]}]}],[{"group":"doc","deltas":[{"start":{"row":21,"column":18},"end":{"row":21,"column":20},"action":"insert","lines":["()"]}]}],[{"group":"doc","deltas":[{"start":{"row":21,"column":19},"end":{"row":21,"column":20},"action":"insert","lines":["f"]}]}],[{"group":"doc","deltas":[{"start":{"row":21,"column":20},"end":{"row":21,"column":21},"action":"insert","lines":["o"]}]}],[{"group":"doc","deltas":[{"start":{"row":21,"column":21},"end":{"row":21,"column":22},"action":"insert","lines":["r"]}]}],[{"group":"doc","deltas":[{"start":{"row":21,"column":22},"end":{"row":21,"column":23},"action":"insert","lines":["c"]}]}],[{"group":"doc","deltas":[{"start":{"row":21,"column":23},"end":{"row":21,"column":24},"action":"insert","lines":["o"]}]}],[{"group":"doc","deltas":[{"start":{"row":21,"column":24},"end":{"row":21,"column":25},"action":"insert","lines":["u"]}]}],[{"group":"doc","deltas":[{"start":{"row":21,"column":25},"end":{"row":21,"column":26},"action":"insert","lines":["n"]}]}],[{"group":"doc","deltas":[{"start":{"row":21,"column":26},"end":{"row":21,"column":27},"action":"insert","lines":["t"]}]}],[{"group":"doc","deltas":[{"start":{"row":21,"column":26},"end":{"row":21,"column":27},"action":"remove","lines":["t"]}]}],[{"group":"doc","deltas":[{"start":{"row":21,"column":25},"end":{"row":21,"column":26},"action":"remove","lines":["n"]}]}],[{"group":"doc","deltas":[{"start":{"row":21,"column":24},"end":{"row":21,"column":25},"action":"remove","lines":["u"]}]}],[{"group":"doc","deltas":[{"start":{"row":21,"column":23},"end":{"row":21,"column":24},"action":"remove","lines":["o"]}]}],[{"group":"doc","deltas":[{"start":{"row":21,"column":22},"end":{"row":21,"column":23},"action":"remove","lines":["c"]}]}],[{"group":"doc","deltas":[{"start":{"row":21,"column":22},"end":{"row":21,"column":23},"action":"insert","lines":["D"]}]}],[{"group":"doc","deltas":[{"start":{"row":21,"column":22},"end":{"row":21,"column":23},"action":"remove","lines":["D"]}]}],[{"group":"doc","deltas":[{"start":{"row":21,"column":22},"end":{"row":21,"column":23},"action":"insert","lines":["C"]}]}],[{"group":"doc","deltas":[{"start":{"row":21,"column":19},"end":{"row":21,"column":23},"action":"remove","lines":["forC"]},{"start":{"row":21,"column":19},"end":{"row":21,"column":27},"action":"insert","lines":["forCount"]}]}],[{"group":"doc","deltas":[{"start":{"row":21,"column":27},"end":{"row":21,"column":28},"action":"insert","lines":["%"]}]}],[{"group":"doc","deltas":[{"start":{"row":21,"column":28},"end":{"row":21,"column":29},"action":"insert","lines":["2"]}]}],[{"group":"doc","deltas":[{"start":{"row":21,"column":29},"end":{"row":21,"column":30},"action":"insert","lines":["="]}]}],[{"group":"doc","deltas":[{"start":{"row":21,"column":30},"end":{"row":21,"column":31},"action":"insert","lines":["0"]}]}],[{"group":"doc","deltas":[{"start":{"row":21,"column":30},"end":{"row":21,"column":31},"action":"remove","lines":["0"]}]}],[{"group":"doc","deltas":[{"start":{"row":21,"column":30},"end":{"row":21,"column":31},"action":"insert","lines":["1"]}]}],[{"group":"doc","deltas":[{"start":{"row":27,"column":25},"end":{"row":28,"column":0},"action":"insert","lines":["",""]},{"start":{"row":28,"column":0},"end":{"row":28,"column":20},"action":"insert","lines":["                    "]}]}],[{"group":"doc","deltas":[{"start":{"row":28,"column":16},"end":{"row":28,"column":17},"action":"insert","lines":["}"]},{"start":{"row":28,"column":0},"end":{"row":28,"column":16},"action":"remove","lines":["                "]},{"start":{"row":28,"column":0},"end":{"row":28,"column":12},"action":"insert","lines":["            "]}]}],[{"group":"doc","deltas":[{"start":{"row":21,"column":32},"end":{"row":21,"column":33},"action":"insert","lines":["{"]}]}],[{"group":"doc","deltas":[{"start":{"row":28,"column":12},"end":{"row":28,"column":16},"action":"insert","lines":["    "]}]}],[{"group":"doc","deltas":[{"start":{"row":21,"column":29},"end":{"row":21,"column":30},"action":"insert","lines":["="]}]}],[{"group":"doc","deltas":[{"start":{"row":28,"column":18},"end":{"row":28,"column":21},"action":"remove","lines":["   "]},{"start":{"row":28,"column":18},"end":{"row":29,"column":0},"action":"insert","lines":["",""]},{"start":{"row":29,"column":0},"end":{"row":29,"column":16},"action":"insert","lines":["                "]}]}],[{"group":"doc","deltas":[{"start":{"row":29,"column":16},"end":{"row":29,"column":17},"action":"insert","lines":["e"]}]}],[{"group":"doc","deltas":[{"start":{"row":29,"column":17},"end":{"row":29,"column":18},"action":"insert","lines":["s"]}]}],[{"group":"doc","deltas":[{"start":{"row":29,"column":18},"end":{"row":29,"column":19},"action":"insert","lines":["l"]}]}],[{"group":"doc","deltas":[{"start":{"row":29,"column":19},"end":{"row":29,"column":20},"action":"insert","lines":["e"]}]}],[{"group":"doc","deltas":[{"start":{"row":29,"column":19},"end":{"row":29,"column":20},"action":"remove","lines":["e"]}]}],[{"group":"doc","deltas":[{"start":{"row":29,"column":18},"end":{"row":29,"column":19},"action":"remove","lines":["l"]}]}],[{"group":"doc","deltas":[{"start":{"row":29,"column":17},"end":{"row":29,"column":18},"action":"remove","lines":["s"]}]}],[{"group":"doc","deltas":[{"start":{"row":29,"column":17},"end":{"row":29,"column":18},"action":"insert","lines":[";"]}]}],[{"group":"doc","deltas":[{"start":{"row":29,"column":17},"end":{"row":29,"column":18},"action":"remove","lines":[";"]}]}],[{"group":"doc","deltas":[{"start":{"row":29,"column":17},"end":{"row":29,"column":18},"action":"insert","lines":["l"]}]}],[{"group":"doc","deltas":[{"start":{"row":29,"column":18},"end":{"row":29,"column":19},"action":"insert","lines":["s"]}]}],[{"group":"doc","deltas":[{"start":{"row":29,"column":19},"end":{"row":29,"column":20},"action":"insert","lines":["e"]}]}],[{"group":"doc","deltas":[{"start":{"row":29,"column":20},"end":{"row":29,"column":21},"action":"insert","lines":["{"]}]}],[{"group":"doc","deltas":[{"start":{"row":29,"column":21},"end":{"row":31,"column":17},"action":"insert","lines":["","                    ","                }"]}]}],[{"group":"doc","deltas":[{"start":{"row":30,"column":16},"end":{"row":30,"column":20},"action":"insert","lines":["    "]}]}],[{"group":"doc","deltas":[{"start":{"row":30,"column":18},"end":{"row":35,"column":22},"action":"insert","lines":["  for( int forRepeat = 1; forRepeat<=forCount; forRepeat++ ) {","                        for( int forLine = 1; forLine<=forRepeat; forLine++ ) {","                        System.out.print(forCount);","                        } ","                    System.out.println(\" \");    ","                    } "]}]}],[{"group":"doc","deltas":[{"start":{"row":31,"column":43},"end":{"row":31,"column":44},"action":"remove","lines":["1"]},{"start":{"row":31,"column":43},"end":{"row":31,"column":44},"action":"insert","lines":["f"]}]}],[{"group":"doc","deltas":[{"start":{"row":31,"column":44},"end":{"row":31,"column":45},"action":"insert","lines":["o"]}]}],[{"group":"doc","deltas":[{"start":{"row":31,"column":45},"end":{"row":31,"column":46},"action":"insert","lines":["r"]}]}],[{"group":"doc","deltas":[{"start":{"row":31,"column":46},"end":{"row":31,"column":47},"action":"insert","lines":["C"]}]}],[{"group":"doc","deltas":[{"start":{"row":31,"column":43},"end":{"row":31,"column":47},"action":"remove","lines":["forC"]},{"start":{"row":31,"column":43},"end":{"row":31,"column":51},"action":"insert","lines":["forCount"]}]}],[{"group":"doc","deltas":[{"start":{"row":31,"column":80},"end":{"row":31,"column":82},"action":"remove","lines":["++"]},{"start":{"row":31,"column":80},"end":{"row":31,"column":81},"action":"insert","lines":["-"]}]}],[{"group":"doc","deltas":[{"start":{"row":31,"column":81},"end":{"row":31,"column":82},"action":"insert","lines":["-"]}]}],[{"group":"doc","deltas":[{"start":{"row":31,"column":60},"end":{"row":31,"column":61},"action":"remove","lines":["<"]},{"start":{"row":31,"column":60},"end":{"row":31,"column":61},"action":"insert","lines":[">"]}]}],[{"group":"doc","deltas":[{"start":{"row":12,"column":17},"end":{"row":12,"column":18},"action":"remove","lines":["n"]}]}],[{"group":"doc","deltas":[{"start":{"row":12,"column":16},"end":{"row":12,"column":17},"action":"remove","lines":["l"]}]}],[{"group":"doc","deltas":[{"start":{"row":21,"column":31},"end":{"row":21,"column":32},"action":"remove","lines":["1"]},{"start":{"row":21,"column":31},"end":{"row":21,"column":32},"action":"insert","lines":["0"]}]}],[{"group":"doc","deltas":[{"start":{"row":12,"column":58},"end":{"row":12,"column":59},"action":"insert","lines":[":"]}]}],[{"group":"doc","deltas":[{"start":{"row":12,"column":59},"end":{"row":12,"column":60},"action":"insert","lines":[" "]}]}],[{"group":"doc","deltas":[{"start":{"row":13,"column":0},"end":{"row":14,"column":8},"action":"remove","lines":["int w=1;","int i =1"]}]}],[{"group":"doc","deltas":[{"start":{"row":13,"column":0},"end":{"row":13,"column":1},"action":"remove","lines":[";"]}]}],[{"group":"doc","deltas":[{"start":{"row":18,"column":37},"end":{"row":19,"column":0},"action":"insert","lines":["",""]},{"start":{"row":19,"column":0},"end":{"row":19,"column":12},"action":"insert","lines":["            "]}]}],[{"group":"doc","deltas":[{"start":{"row":19,"column":12},"end":{"row":19,"column":75},"action":"insert","lines":["System.out.print(\"Please enter an integer between 1 and 30: \");"]}]}],[{"group":"doc","deltas":[{"start":{"row":19,"column":33},"end":{"row":19,"column":72},"action":"remove","lines":["ase enter an integer between 1 and 30: "]}]}],[{"group":"doc","deltas":[{"start":{"row":19,"column":32},"end":{"row":19,"column":33},"action":"remove","lines":["e"]}]}],[{"group":"doc","deltas":[{"start":{"row":19,"column":31},"end":{"row":19,"column":32},"action":"remove","lines":["l"]}]}],[{"group":"doc","deltas":[{"start":{"row":19,"column":30},"end":{"row":19,"column":31},"action":"remove","lines":["P"]}]}],[{"group":"doc","deltas":[{"start":{"row":19,"column":30},"end":{"row":19,"column":31},"action":"insert","lines":["F"]}]}],[{"group":"doc","deltas":[{"start":{"row":19,"column":31},"end":{"row":19,"column":32},"action":"insert","lines":["O"]}]}],[{"group":"doc","deltas":[{"start":{"row":19,"column":32},"end":{"row":19,"column":33},"action":"insert","lines":["R"]}]}],[{"group":"doc","deltas":[{"start":{"row":19,"column":33},"end":{"row":19,"column":34},"action":"insert","lines":[" "]}]}],[{"group":"doc","deltas":[{"start":{"row":19,"column":34},"end":{"row":19,"column":35},"action":"insert","lines":["L"]}]}],[{"group":"doc","deltas":[{"start":{"row":19,"column":35},"end":{"row":19,"column":36},"action":"insert","lines":["O"]}]}],[{"group":"doc","deltas":[{"start":{"row":19,"column":36},"end":{"row":19,"column":37},"action":"insert","lines":["O"]}]}],[{"group":"doc","deltas":[{"start":{"row":19,"column":37},"end":{"row":19,"column":38},"action":"insert","lines":["P"]}]}],[{"group":"doc","deltas":[{"start":{"row":19,"column":38},"end":{"row":19,"column":39},"action":"insert","lines":[":"]}]}],[{"group":"doc","deltas":[{"start":{"row":19,"column":39},"end":{"row":19,"column":40},"action":"insert","lines":[" "]}]}],[{"group":"doc","deltas":[{"start":{"row":19,"column":39},"end":{"row":19,"column":40},"action":"remove","lines":[" "]}]}]]},"ace":{"folds":[],"scrolltop":0,"scrollleft":0,"selection":{"start":{"row":19,"column":39},"end":{"row":19,"column":39},"isBackwards":false},"options":{"guessTabSize":true,"useWrapMode":false,"wrapToView":true},"firstLineState":0},"timestamp":1426567227048}