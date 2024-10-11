package pe.upc.cathupplatform.news.domain.services;

import pe.upc.cathupplatform.news.domain.model.aggregates.FavoriteSource;
import pe.upc.cathupplatform.news.domain.model.commands.CreateFavoriteSourceCommand;
import pe.upc.cathupplatform.news.domain.model.commands.DeleteFavoriteSourceCommand;
import pe.upc.cathupplatform.news.domain.model.commands.UpdateFavoriteSourceCommand;


import javax.swing.text.html.Option;
import java.util.Optional;

public interface FavoriteSourceCommandService {
    Optional<FavoriteSource> handle (CreateFavoriteSourceCommand command);
    Optional<FavoriteSource> handle (UpdateFavoriteSourceCommand command);
    Optional<FavoriteSource> handle (DeleteFavoriteSourceCommand command);
}
