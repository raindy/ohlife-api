package com.fantasi.raindy.ohlife.data;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(collectionResourceRel = "acq_bbs_board", path = "boards")
public interface AcqBbsBoardRepository extends PagingAndSortingRepository<AcqBbsBoard, Long> {

}
