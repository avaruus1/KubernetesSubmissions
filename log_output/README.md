# Log output app

`docker buildx build -t log_output .`

`k3d image import log_output`

`kubectl create deployment log-output-dep --image=log_output`

`kubectl edit deployment log-output-dep` (set imagePullPolicy)
