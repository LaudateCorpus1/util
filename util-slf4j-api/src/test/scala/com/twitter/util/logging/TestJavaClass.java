package com.twitter.util.logging;

class TestJavaClass {
    private static final Logger LOG = Logger.getLogger(TestJavaClass.class);

    public TestJavaClass() {
        LOG.info("Creating new TestJavaClass instance.");
    }
}
