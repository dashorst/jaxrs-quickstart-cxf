cxf-quickstart
===================

This is a base project to quickly test concepts for JAX-RS using
Apache CXF and Jetty.

It contains a Start class that configures jetty correctly.
Unfortunately CXF does not provide automatic scanning of resources.
You have to add your root resources manually to the CXF config in
the Start class.

Another thing of note, while this uses Jetty as a container, CXF is
in the lead for creating and starting the jetty server (as opposed to
letting the developer have control over that)

Getting started
---------------

Perform a git clone of the repository and remove the git bits:

    git clone https://github.com/dashorst/jaxrs-quickstart-cxf.git
    cd jaxrs-quickstart-cxf
    rm -rf .git

Now you can import the project into your favorite IDE, use the Maven
integration to import the POM file.

To run the project use the `Start` class located in the `src/test/java`
folder. This will start the embedded Jetty container and make the REST
resources available at port 8080 of localhost.
