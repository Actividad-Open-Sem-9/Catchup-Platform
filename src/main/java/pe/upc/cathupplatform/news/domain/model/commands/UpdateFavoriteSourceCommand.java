package pe.upc.cathupplatform.news.domain.model.commands;

public record UpdateFavoriteSourceCommand(Long id) {
    public UpdateFavoriteSourceCommand {
        if (id == null) {
            throw new IllegalArgumentException("id is required");
        }
    }
}
