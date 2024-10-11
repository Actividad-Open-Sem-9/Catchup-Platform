package pe.upc.cathupplatform.news.domain.services;

import pe.upc.cathupplatform.news.domain.model.aggregates.FavoriteSource;
import pe.upc.cathupplatform.news.domain.model.queries.GetAllFavoriteSourceQuery;
import pe.upc.cathupplatform.news.domain.model.queries.GetFavoriteSourceByIdQuery;

import javax.swing.text.html.Option;
import java.util.Optional;

public interface FavoriteSourceQueryService {
    Optional<FavoriteSource> handle(GetFavoriteSourceByIdQuery query);
    Optional<FavoriteSource> handle(GetAllFavoriteSourceQuery query);
}
