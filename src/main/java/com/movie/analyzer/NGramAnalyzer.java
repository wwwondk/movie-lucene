package com.movie.analyzer;


import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.Tokenizer;
import org.apache.lucene.analysis.ngram.NGramTokenFilter;
import org.apache.lucene.analysis.ngram.NGramTokenizer;

public class NGramAnalyzer extends Analyzer {

    @Override
    protected TokenStreamComponents createComponents(String fieldName) {
        Tokenizer tokenizer = new NGramTokenizer(2, 2);
        NGramTokenFilter nGramTokenFilter = new NGramTokenFilter(tokenizer);
        return new TokenStreamComponents(tokenizer, nGramTokenFilter);
    }
}
