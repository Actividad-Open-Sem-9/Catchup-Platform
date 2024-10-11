package pe.upc.cathupplatform.news.domain.services;

import pe.upc.cathupplatform.news.domain.model.aggregates.FavoriteSource;
import pe.upc.cathupplatform.news.domain.model.commands.CreateFavoriteSourceCommand;

import java.util.Optional;

public interface FavoriteSourceCommandService {
    Optional<FavoriteSource> handle (CreateFavoriteSourceCommand command);
}
