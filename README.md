# Vert.x Cookbook

This is a collaborative cookbook effort that aims to garther a set of how-to about Vert.x and its ecosystem.

- [Asciidoctor](asciidoc/cookbook.adoc)

## Building the Cookbook

```
> mvn package
> open target/vertx-cookbook/cookbook.html
```

## Project structure

- [Asciidoc sources](src/main/asciidoc/): these contain references to the [Java code](src/main/java/)
- [Java code](src/main/java/): the various code examples included in the Asciidoc sources

The book uses the [Vert.x Docgen](https://github.com/vert-x3/vertx-docgen) project to render Java code
in the Asciidoc files, allowing real source code to be included in the project with Javadoc `{@link}` tags.

## Contributing

I welcome anyone wanting to contribute an how-to to this cookbook. There is no predefined list of chapters, anyone
 is free to contribute content, given that it provides solutions about Vert.x that can be shared
 freely with the community.

Contributions is made via pull requests.
