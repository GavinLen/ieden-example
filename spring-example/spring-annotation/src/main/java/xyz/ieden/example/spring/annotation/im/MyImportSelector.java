package xyz.ieden.example.spring.annotation.im;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * MyImportSalector
 *
 * @author gavin
 * @version 1.0
 * @date 2019/11/11 23:49
 */
public class MyImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[0];
    }
}
