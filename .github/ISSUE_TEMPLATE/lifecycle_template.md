---
name: Specification Review Issue
about: Start a request for a specification creation/plan/release... lifecycle review
title: ''
labels: creation,plan,progress,release
assignees: ''
---

## Specification issue template
When creating a specification project lifecycle review, create issues in the  with the content defined as follows.

- [ ] Specification name and version
- [ ] Add a label from one of: creation, plan, progress, release
- [ ] A link to a directory under https://download.eclipse.org/microprofile/staging in the form orgeclipsemicroprofile-NNN where
NNN is the staging repository id assigned to the staged with the following: (Does not apply to creation/plan review lifecycle events.)
(micropfile-config, microprofile-health, ...) and x.y is the release major.minor version, and the directory contains the following.
   - [ ] Specification PDF in the form of microprofile-_project_-spec.pdf where
_project_ is the microprofile specification short project name (config, health, ...)
   - [ ] Specification HTML in the form of microprofile-_project_-spec.html
   - [ ] An apidocs directory containing the javadoc associated with the API jar.
   - [ ] A copy of the staged api jar, and TCK artifact

- [ ] For a [Release Review](https://www.eclipse.org/projects/handbook/#6_3_3_Release_Review):
   - [ ] Updated release record
   - [ ] Generated IP Log (For the microprofile platform release)
   - [ ] Email to PMC
   - [ ] Start release review by emailing EMO
   - [ ] Summary that a Compatible Implementation is complete, passes the TCK, and that the TCK includes sufficient coverage of the specification.
- [ ] For a [Progress Review](https://www.eclipse.org/projects/handbook/#6_3_5_Progress_Review), that sufficient progress has been made on a Compatible Implementation and TCK, to ensure that the spec is implementable and testable.

Note: If any item does not apply, check it and mark N/A below it.
