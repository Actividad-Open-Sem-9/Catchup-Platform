package pe.upc.cathupplatform.news.application;

import pe.upc.cathupplatform.news.domain.model.aggregates.FavoriteSource;
import pe.upc.cathupplatform.news.domain.model.queries.GetAllFavoriteSourceQuery;
import pe.upc.cathupplatform.news.domain.model.queries.GetFavoriteSourceByIdQuery;
import pe.upc.cathupplatform.news.domain.services.FavoriteSourceQueryService;

import java.util.Optional;

public class FavoriteSourceQueryServiceImpl implements FavoriteSourceQueryService  {
    @Override
    public Optional<FavoriteSource> handle(GetAllFavoriteSourceQuery query) {
        return Optional.empty();
    }

    @Override
    public Optional<FavoriteSource> handle(GetFavoriteSourceByIdQuery query) {
        return Optional.empty();
    }
}
