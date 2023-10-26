# judo-techniques
Projeto para demonstração de grupo de golpes de Judô padronizados pelo Go Kyo No Waza

## Diagrama de classes
```mermaid
classDiagram

class Gokyo {
    +techniques: List<Technique>
}

class Technique {
    +name: String
    +throws: List<JudoThrow>
}

class DaiIkkyo {
    +name: String
    +throws: List<JudoThrow>
}

class DaiNikyo {
    +name: String
    +throws: List<JudoThrow>
}

class DaiSankyo {
    +name: String
    +throws: List<JudoThrow>
}

class DaiYonkyo {
    +name: String
    +throws: List[JudoThrow]
}

class DaiGokyo {
    +name: String
    +throws: List<JudoThrow>
}

  class JudoThrow {
    +id: Long
    +name: String
    +description: String
    +video_url: String
    +image_url: String
    -group: Technique
  }

Gokyo "1" -- "*" Technique : contains
Technique "1" -- "*" JudoThrow : contains
DaiIkkyo "1" -- "*" JudoThrow : contains
DaiNikyo "1" -- "*" JudoThrow : contains
DaiSankyo "1" -- "*" JudoThrow : contains
DaiYonkyo "1" -- "*" JudoThrow : contains
DaiGokyo "1" -- "*" JudoThrow : contains
```
