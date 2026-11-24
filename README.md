# Overview

<div style="text-align: center">

[![Java CI with Gradle](https://github.com/astrapi69/jobj-merge/actions/workflows/gradle.yml/badge.svg)](https://github.com/astrapi69/jobj-merge/actions/workflows/gradle.yml)
[![Coverage Status](https://codecov.io/gh/astrapi69/jobj-merge/branch/develop/graph/badge.svg)](https://codecov.io/gh/astrapi69/jobj-merge)
[![Open Issues](https://img.shields.io/github/issues/astrapi69/jobj-merge.svg?style=flat)](https://github.com/astrapi69/jobj-merge/issues)
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/io.github.astrapi69/jobj-merge/badge.svg)](https://maven-badges.herokuapp.com/maven-central/io.github.astrapi69/jobj-merge)
[![Javadocs](http://www.javadoc.io/badge/io.github.astrapi69/jobj-merge.svg)](http://www.javadoc.io/doc/io.github.astrapi69/jobj-merge)
[![MIT license](http://img.shields.io/badge/license-MIT-brightgreen.svg?style=flat)](http://opensource.org/licenses/MIT)
[![Donate](https://img.shields.io/badge/donate-❤-ff2244.svg)](https://www.paypal.com/cgi-bin/webscr?cmd=_s-xclick&hosted_button_id=MJ7V43GU2H386)
[![Hits Of Code](https://hitsofcode.com/github/astrapi69/jobj-merge?branch=develop)](https://hitsofcode.com/github/astrapi69/jobj-merge/view?branch=develop)
[![Lines Of Code](https://tokei.rs/b1/github/astrapi69/jobj-merge)](https://github.com/astrapi69/jobj-merge)

</div>

Utility library that holds merge functions to make your life easier

> Please support this project by simply putting a Github <!-- Place this tag where you want the button to render. -->
<a class="github-button" href="https://github.com/astrapi69/jobj-merge" data-icon="octicon-star" aria-label="Star astrapi69/jobj-merge on GitHub">Star ⭐</a>
>
> Share this library with friends on Twitter and everywhere else you can
>
> If you love this project [![donation](https://img.shields.io/badge/donate-❤-ff2244.svg)](https://www.paypal.com/cgi-bin/webscr?cmd=_s-xclick&hosted_button_id=MJ7V43GU2H386)

## License

The source code comes under the liberal MIT License, making jobj-merge great for all types of applications.

## Maven dependency

Maven dependency is now on sonatype. Check
out [sonatype repository](https://oss.sonatype.org/index.html#nexus-search;gav~io.github.astrapi69~jobj-merge~~~)
for latest snapshots and releases.

Add the following maven dependency to your project `pom.xml` if you want to import the core functionality of jobj-merge:

Than you can add the dependency to your dependencies:

    <properties>
            ...
        <!-- JOBJ-MERGE version -->
        <jobj-merge.version>3.3</jobj-merge.version>
            ...
    </properties>
            ...
        <dependencies>
            ...
            <!-- JOBJ-MERGE DEPENDENCY -->
            <dependency>
                <groupId>io.github.astrapi69</groupId>
                <artifactId>jobj-merge</artifactId>
                <version>${jobj-merge.version}</version>
            </dependency>
            ...
        </dependencies>

## gradle dependency

You can first define the version in the ext section and add than the following gradle dependency to your
project `build.gradle` if you want to import the core functionality of jobj-merge:

define version in file gradle.properties

```

jobjMergeVersion=3.3
```

or in build.gradle ext area

```
ext {
            ...
    jobjMergeVersion = "3.3"
            ...
}
```

and then add the dependency to the dependencies area

```
dependencies {
            ...
  implementation("io.github.astrapi69:jobj-merge:$jobjMergeVersion")
            ...
}
```

If you develop above jdk 11 you can use jobj-merge version 2.x and above.

## Support this project

If jobj-merge is useful to you, a star on [GitHub](https://github.com/astrapi69/jobj-merge) helps others find it.
Sharing it or reporting a bug helps just as much.

If you would like to contribute financially, the channels are on the repository's Sponsor button, which
reads [.github/FUNDING.yml](.github/FUNDING.yml): GitHub Sponsors, Liberapay, Ko-fi and PayPal.

## Semantic Versioning

The versions of jobj-merge are maintained with the Simplified Semantic Versioning guidelines.

Release version numbers will be incremented in the following format:

`<major>.<minor>.<patch>`

For detailed information on versioning for this project you can visit
this [wiki page](https://github.com/lightblueseas/mvn-parent-projects/wiki/Simplified-Semantic-Versioning)
.

## Want to Help and improve it? ###

The source code for jobj-merge are on GitHub. Please feel free to fork and send pull requests!

Create your own fork of [astrapi69/jobj-merge/fork](https://github.com/astrapi69/jobj-merge/fork)

To share your changes, [submit a pull request](https://github.com/astrapi69/jobj-merge/pull/new/develop).

Don't forget to add new units tests on your changes.

## Contacting the Developers

Do not hesitate to contact the jobj-merge developers with your questions, concerns, comments, bug reports, or feature
requests.

- Feature requests, questions and bug reports can be reported at
  the [issues page](https://github.com/astrapi69/jobj-merge/issues).

## Credits

|**Nexus Sonatype repositories**|
|     :---:      |
|[![sonatype repository](https://img.shields.io/nexus/r/https/oss.sonatype.org/io.github.astrapi69/jobj-merge.svg?style=for-the-badge)](https://oss.sonatype.org/index.html#nexus-search;gav~io.github.astrapi69~jobj-merge~~~)|
|Special thanks to [sonatype repository](https://www.sonatype.com) for providing a free maven repository service for open source projects|
|     <img width=1000/>     |

|**codecov.io**|
|     :---:      |
|[![Coverage Status](https://codecov.io/gh/astrapi69/jobj-merge/branch/develop/graph/badge.svg)](https://codecov.io/gh/astrapi69/jobj-merge)|
|Special thanks to [codecov.io](https://codecov.io) for providing a free code coverage for open source projects|
|     <img width=1000/>     |

|**javadoc.io**|
|     :---:      |
|[![Javadocs](http://www.javadoc.io/badge/io.github.astrapi69/jobj-merge.svg)](http://www.javadoc.io/doc/io.github.astrapi69/jobj-merge)|
|Special thanks to [javadoc.io](http://www.javadoc.io) for providing a free javadoc documentation for open source projects|
|     <img width=1000/>     |
