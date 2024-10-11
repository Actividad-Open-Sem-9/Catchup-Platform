package pe.upc.cathupplatform.news.domain.model.commands;

public record PutFavoriteSourceCommand(Long id) {
    public PutFavoriteSourceCommand{
        if (id == null) {
            throw new IllegalArgumentException("id is required");
        }
    }
}
