# judo-techniques
Projeto para demonstração de grupo de golpes de Judô padronizados pelo Go Kyo No Waza

## Diagrama de classes
```mermaid
classDiagram
    class JudoThrow {
        +id: Long
        +name: String
        +videoUrl: String
        +imageUrl: String
        +description: String
        --
        +getId(): Long
        +setId(id: Long): void
        +getName(): String
        +setName(name: String): void
        +getVideoUrl(): String
        +setVideoUrl(videoUrl: String): void
        +getImageUrl(): String
        +setImageUrl(imageUrl: String): void
        +getDescription(): String
        +setDescription(description: String): void
    }
```
