# The project app

`docker buildx build -t the_project .`

`k3d image import the_project`

`kubectl create deployment the-project-dep --image=the_project`

`kubectl edit deployment the-project-dep` (set imagePullPolicy)
