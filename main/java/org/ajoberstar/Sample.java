package org.ajoberstar;

import org.apache.commons.lang3.ObjectUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Sample {
  private static final Logger logger = LoggerFactory.getLogger(Sample.class);

  public static void main(String[] args) {
    logger.info("Stuff: {}", args[0]);
    ObjectUtils.anyNotNull(null, null, "stuff");
  }
}
