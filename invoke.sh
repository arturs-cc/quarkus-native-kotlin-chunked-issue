#!/bin/bash

sam local invoke "QuarkusNativeChunkedIssue" -e event.json -t sam.native.yaml --docker-network host