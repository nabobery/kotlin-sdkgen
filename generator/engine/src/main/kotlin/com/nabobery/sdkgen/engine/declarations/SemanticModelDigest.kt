package com.nabobery.sdkgen.engine.declarations

import com.nabobery.sdkgen.model.AdditionalPropertiesModel
import com.nabobery.sdkgen.model.CompositionModel
import com.nabobery.sdkgen.model.DiscriminatorModel
import com.nabobery.sdkgen.model.EncodingModel
import com.nabobery.sdkgen.model.EnumModel
import com.nabobery.sdkgen.model.HeaderModel
import com.nabobery.sdkgen.model.JsonValue
import com.nabobery.sdkgen.model.MediaTypeModel
import com.nabobery.sdkgen.model.NullabilityOrigin
import com.nabobery.sdkgen.model.OperationModel
import com.nabobery.sdkgen.model.ParameterModel
import com.nabobery.sdkgen.model.PropertyModel
import com.nabobery.sdkgen.model.PropertyOwnership
import com.nabobery.sdkgen.model.RequestBodyModel
import com.nabobery.sdkgen.model.ResponseModel
import com.nabobery.sdkgen.model.SchemaId
import com.nabobery.sdkgen.model.SchemaModel
import com.nabobery.sdkgen.model.SchemaRef
import com.nabobery.sdkgen.model.SecurityRequirementModel
import com.nabobery.sdkgen.model.SecuritySchemeModel
import com.nabobery.sdkgen.model.SemanticDocument

/**
 * Computes a SHA-256 digest over a normalized text projection of the effective [SemanticDocument]: the
 * schema, operation, and security surface adaptation produced, independent of both the raw input bytes
 * ([SemanticModelCompatibilityClassifier]'s sibling `sourceContract` layer covers those) and the emitted
 * Kotlin declarations ([KotlinDeclarationModel.digest] / `kotlinApiProjectionDigest` cover those). Per ADR
 * 0013 ("Manifest transition and bounded input" / `semanticModelSha256`).
 *
 * [com.nabobery.sdkgen.model.SourcePointer] provenance (document URI, JSON Pointer, line/column) is
 * deliberately excluded: it identifies *where* a semantic fact came from, not the fact itself, and
 * including it would make this digest move on pure source reformatting the same way `kotlinApiSha256` must
 * not move on pure Kotlin reformatting. Every `Map`-typed field is hashed via a key-sorted traversal (see
 * each `canonicalText()` below) so JVM map-iteration order can never affect the digest.
 */
internal fun SemanticDocument.semanticModelDigest(): String =
    sha256Hex(semanticModelCanonicalText().encodeToByteArray())

private fun SemanticDocument.semanticModelCanonicalText(): String =
    buildString {
        append("document|title=").append(title.orEmpty())
        append("|version=").append(version.orEmpty())
        append("|extensions:").append(extensions.canonicalText())
        append("|security:")
        securityAlternatives.forEach { requirement -> append(requirement.canonicalText()).append(';') }
        append("|schemes:")
        securitySchemes.toSortedMap().forEach { (id, scheme) ->
            append(id).append('=').append(scheme.canonicalText()).append(';')
        }
        append("|schemas:")
        schemas.entries.sortedBy { entry -> entry.key.value }.forEach { (id, schema) ->
            append(id.value).append('=').append(schema.canonicalText()).append(';')
        }
        append("|operations:")
        operations
            .sortedWith(compareBy(OperationModel::method, OperationModel::path, OperationModel::operationId))
            .forEach { operation -> append(operation.canonicalText()).append(';') }
    }

private fun SchemaRef.canonicalText(): String = "ref:${schemaId.value}"

private fun SchemaModel.canonicalText(): String =
    buildString {
        append("id=").append(id.value)
        append(":kind=").append(identityKind)
        append(":target=").append(referenceTarget?.value.orEmpty())
        append(":types=").append(types.joinToString(","))
        append(":format=").append(format.orEmpty())
        append(":nullable=").append(nullability)
        append(":origins=").append(nullabilityOrigins.joinToString(",") { origin -> origin.canonicalText() })
        append(":deprecated=").append(deprecated)
        append(":readOnly=").append(readOnly)
        append(":writeOnly=").append(writeOnly)
        append(":acceptsOnlyNull=").append(acceptsOnlyNull)
        append(":contentEncoding=").append(contentEncoding.orEmpty())
        append(":contentMediaType=").append(contentMediaType.orEmpty())
        append(":required=").append(requiredPropertyNames.sorted().joinToString(","))
        append(":constraints=").append(constraints.canonicalText())
        append(":default=").append(defaultValue?.canonicalText().orEmpty())
        append(":examples=").append(examples.joinToString(",") { example -> example.canonicalText() })
        append(":enum=").append(enum?.canonicalText().orEmpty())
        append(":items=").append(items?.canonicalText().orEmpty())
        append(":additionalProperties=").append(additionalProperties?.canonicalText().orEmpty())
        append(":compositions=").append(compositions.joinToString(",") { composition -> composition.canonicalText() })
        append(
            ":allOfOwnership=",
        ).append(allOfPropertyOwnership.joinToString(",") { ownership -> ownership.canonicalText() })
        append(":extensions=").append(extensions.canonicalText())
        append(":properties=")
        properties.forEach { property -> append(property.canonicalText()).append(',') }
    }

private fun NullabilityOrigin.canonicalText(): String = "origin:$surface"

private fun EnumModel.canonicalText(): String =
    "enum:$openness:${values.joinToString(",") { value -> value.canonicalText() }}"

private fun DiscriminatorModel.canonicalText(): String =
    buildString {
        append("discriminator:").append(propertyName)
        append(":mapping=")
        mapping.toSortedMap().forEach { (key, target) -> append(key).append('=').append(target.value).append(',') }
        append(":unmapped=").append(unmappedBranches.map(SchemaId::value).sorted().joinToString(","))
        append(":extensions=").append(extensions.canonicalText())
    }

private fun CompositionModel.canonicalText(): String =
    buildString {
        append("composition:").append(kind)
        append(":branches=").append(branches.joinToString(",") { branch -> branch.canonicalText() })
        append(":discriminator=").append(discriminator?.canonicalText().orEmpty())
    }

private fun PropertyOwnership.canonicalText(): String =
    "ownership:$propertyName:${ownerSchemaId.value}:${constraints.canonicalText()}"

private fun PropertyModel.canonicalText(): String =
    buildString {
        append("property:").append(name)
        append(":schema=").append(schema.canonicalText())
        append(":required=").append(requiredness)
        append(":nullable=").append(nullability)
        append(":presence=").append(presenceStates.joinToString(","))
        append(":readOnly=").append(readOnly)
        append(":writeOnly=").append(writeOnly)
        append(":deprecated=").append(deprecated)
        append(":default=").append(defaultValue?.canonicalText().orEmpty())
        append(":examples=").append(examples.joinToString(",") { example -> example.canonicalText() })
        append(":extensions=").append(extensions.canonicalText())
    }

private fun AdditionalPropertiesModel.canonicalText(): String =
    when (this) {
        is AdditionalPropertiesModel.Closed -> "closed"
        is AdditionalPropertiesModel.FreeForm -> "free-form"
        is AdditionalPropertiesModel.Typed -> "typed:${valueSchema.canonicalText()}"
    }

private fun SecurityRequirementModel.canonicalText(): String =
    buildString {
        append("security:anonymous=").append(anonymous)
        append(":schemes=")
        schemes.toSortedMap().forEach { (id, scopes) ->
            append(id).append('[').append(scopes.sorted().joinToString(",")).append(']')
        }
    }

private fun SecuritySchemeModel.canonicalText(): String =
    buildString {
        append("scheme:").append(kind)
        append(":parameterName=").append(parameterName.orEmpty())
        append(":location=").append(location)
        append(":scheme=").append(scheme.orEmpty())
        append(":bearerFormat=").append(bearerFormat.orEmpty())
        append(":openIdConnectUrl=").append(openIdConnectUrl.orEmpty())
    }

private fun MediaTypeModel.canonicalText(): String =
    buildString {
        append("media:").append(mediaType)
        append(":schema=").append(schema?.canonicalText().orEmpty())
        append(":streaming=").append(streaming)
        append(":encoding=").append(encoding.joinToString(",") { entry -> entry.canonicalText() })
        append(":example=").append(example?.canonicalText().orEmpty())
        append(":examples=")
        examples.toSortedMap().forEach { (key, value) ->
            append(key).append('=').append(value.canonicalText()).append(',')
        }
        append(":extensions=").append(extensions.canonicalText())
    }

private fun EncodingModel.canonicalText(): String =
    buildString {
        append("encoding:").append(partName)
        append(":contentType=").append(contentType.orEmpty())
        append(":style=").append(style.orEmpty())
        append(":explode=").append(explode)
        append(":allowReserved=").append(allowReserved)
        append(":headers=").append(headers.canonicalText())
        append(":extensions=").append(extensions.canonicalText())
    }

private fun HeaderModel.canonicalText(): String =
    buildString {
        append("header:").append(name)
        append(":required=").append(requiredness)
        append(":schema=").append(schema?.canonicalText().orEmpty())
        append(":deprecated=").append(deprecated)
        append(":extensions=").append(extensions.canonicalText())
    }

private fun ParameterModel.canonicalText(): String =
    buildString {
        append("parameter:").append(name)
        append(":location=").append(location)
        append(":required=").append(requiredness)
        append(":style=").append(style.orEmpty())
        append(":explode=").append(explode)
        append(":schema=").append(schema?.canonicalText().orEmpty())
        append(":content=").append(content.joinToString(",") { mediaType -> mediaType.canonicalText() })
        append(":deprecated=").append(deprecated)
        append(":examples=")
        examples.toSortedMap().forEach { (key, value) ->
            append(key).append('=').append(value.canonicalText()).append(',')
        }
        append(":extensions=").append(extensions.canonicalText())
    }

private fun RequestBodyModel.canonicalText(): String =
    buildString {
        append("request-body:required=").append(requiredness)
        append(":content=").append(content.joinToString(",") { mediaType -> mediaType.canonicalText() })
        append(":extensions=").append(extensions.canonicalText())
    }

private fun ResponseModel.canonicalText(): String =
    buildString {
        append("response:").append(selector)
        append(":kind=").append(selectorKind)
        append(":content=").append(content.joinToString(",") { mediaType -> mediaType.canonicalText() })
        append(":headers=").append(headers.joinToString(",") { header -> header.canonicalText() })
        append(":links=")
        links.toSortedMap().forEach { (key, value) ->
            append(key).append('=').append(value.canonicalText()).append(',')
        }
        append(":extensions=").append(extensions.canonicalText())
    }

private fun OperationModel.canonicalText(): String =
    buildString {
        append("operation:").append(operationId)
        append(":method=").append(method)
        append(":path=").append(path)
        append(":deprecated=").append(deprecated)
        append(":tags=").append(tags.joinToString(","))
        append(":parameters=").append(parameters.joinToString(",") { parameter -> parameter.canonicalText() })
        append(":requestBody=").append(requestBody?.canonicalText().orEmpty())
        append(":responses=").append(responses.joinToString(",") { response -> response.canonicalText() })
        append(
            ":security=",
        ).append(securityAlternatives.joinToString(",") { requirement -> requirement.canonicalText() })
        append(":pagination=").append(pagination)
        append(":streaming=").append(streaming)
        append(":idempotency=").append(idempotency)
        append(":extensions=").append(extensions.canonicalText())
    }

private fun Map<String, JsonValue>.canonicalText(): String =
    toSortedMap().entries.joinToString(",") { (key, value) -> "$key=${value.canonicalText()}" }
