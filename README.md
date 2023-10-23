# judo-techniques
Projeto para demonstração de grupo de golpes de Judô padronizados pelo Go Kyo No Waza

## Diagrama de classes
```mermaid
classDiagram
  class JudoThrow {
    +name: String
    +description: String
    +video_url: String
    +image_url: String
  }

  class JudoKyo {
    +name: String
    -throws: List<JudoThrow>
  }

  JudoKyo "1" -- "*" JudoThrow : contains
```
