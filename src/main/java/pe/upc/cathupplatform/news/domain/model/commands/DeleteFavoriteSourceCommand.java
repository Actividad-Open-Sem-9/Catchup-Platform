package pe.upc.cathupplatform.news.domain.model.commands;

public record DeleteFavoriteSourceCommand (Long id) {
    public DeleteFavoriteSourceCommand {
        if (id == null) {
            throw new IllegalArgumentException("id is required");
        }
    }
}