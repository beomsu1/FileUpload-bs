package org.bs.x2.service;

import org.bs.x2.dto.PageRequestDTO;
import org.bs.x2.dto.PageResponseDTO;
import org.bs.x2.dto.ProductDTO;
import org.bs.x2.dto.ProductListDTO;

import jakarta.transaction.Transactional;

@Transactional
public interface ProductService {
    
    // 목록
    PageResponseDTO<ProductListDTO> list (PageRequestDTO requestDTO);

    // 등록
    Long register(ProductDTO productDTO);

    // 조회
    ProductDTO readOne (Long pno);
}
