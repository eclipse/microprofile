## Specification PR template
When creating a specification project release review, create PRs with the content defined as follows.

Include the following in the PR:
- [ ] A directory in the form <project-name>/x.y where <project-name> is the specificaiton project name
(micropfile-config, microprofile-health, ...) and x.y is the release major.minor version, and the directory contains the following.
- [ ] Specification PDF in the form of microprofile-project-spec-x.y.pdf where
_project_ is the microprofile specification short project name (config, health, ...)
- [ ] Specification HTML in the form of microprofile-project-spec-x.y.html
- [ ] A specification page named index.fmt in a TBD format.
- [ ] For a Progress Review, that sufficient progress has been made on a Compatible Implementation and TCK, to ensure that the spec is implementable and testable.
- [ ] For a [Release Review](https://www.eclipse.org/projects/handbook/#release-review), a summary that a Compatible Implementation is complete, passes the TCK, and that the TCK includes sufficient coverage of the specification. The TCK users guide MUST include the instructions to run the compatible implementations used to validate the release.
Instructions MAY be by reference.
   - [ ] Updated release record
   - [ ] Generated IP Log
   - [ ] Email to PMC
   - [ ] Start release review by emailing EMO 
- [ ] The URL of the OSSRH staging repository for the api, javadoc:
      <add URL here>
- [ ] The URL of the staging directory on downloads.eclipse.org for the proposed EFTL TCK binary:
      <add URL here>
- [ ] The URL of the compatibility certification request issue:
      <add URL here>
- [ ] Specification JavaDoc in the <project-name>/x.y/apidocs directory. 
If desired, an optional second PR can be created to contain just the JavaDoc in the `apidocs` directory.

Note: If any item does not apply, check it and mark N/A below it.
