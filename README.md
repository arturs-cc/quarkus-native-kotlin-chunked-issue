# Build and Deploy

build lambda in native mode

`mvn clean install -Pnative -DskipTests`

then trigger the lambda

`./invoke.sh` 

An exception will be thrown

`Failed to start application (with profile test): java.lang.IllegalStateException: @NotNull method kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns.getBuiltInClassByFqName must not return null`

If you remove `generateSequence { 0 to 100 }.asSequence().chunked(2)` from MyLambda.kt the exception will disappear
Exception occurs if you invoke `chunked(..)`