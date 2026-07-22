package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

public sealed class InlineAgentsReposTasksGetResponse200JsonAllOf1ArtifactsItemDataX6b250fd6DecodingException(
  message: String,
) : SerializationException(message)

public class InlineAgentsReposTasksGetResponse200JsonAllOf1ArtifactsItemDataX6b250fd6NoMatchException(
  message: String,
) : InlineAgentsReposTasksGetResponse200JsonAllOf1ArtifactsItemDataX6b250fd6DecodingException(message)

public class InlineAgentsReposTasksGetResponse200JsonAllOf1ArtifactsItemDataX6b250fd6AmbiguityException(
  message: String,
) : InlineAgentsReposTasksGetResponse200JsonAllOf1ArtifactsItemDataX6b250fd6DecodingException(message)

public class InlineAgentsReposTasksGetResponse200JsonAllOf1ArtifactsItemDataX6b250fd6BranchValidationException(
  message: String,
) : InlineAgentsReposTasksGetResponse200JsonAllOf1ArtifactsItemDataX6b250fd6DecodingException(message)

/**
 * Resource data (shape depends on type)
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1agents~1repos~1{owner}~1{repo}~1tasks~1{task_id}/get/responses/200/content/appl
 * ication~1json/schema/allOf/0/properties/artifacts/items/properties/data
 */
@Serializable(with = InlineAgentsReposTasksGetResponse200JsonAllOf1ArtifactsItemDataX6b250fd6.Serializer::class)
public sealed interface InlineAgentsReposTasksGetResponse200JsonAllOf1ArtifactsItemDataX6b250fd6 {
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonObject

  public class InlineAgentsReposTasksGetResponse200JsonAllOf1ArtifactsItemDataOneOf1X4eee8a6d internal constructor(
    public val id: Long,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineAgentsReposTasksGetResponse200JsonAllOf1ArtifactsItemDataX6b250fd6 {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(id: Long): InlineAgentsReposTasksGetResponse200JsonAllOf1ArtifactsItemDataOneOf1X4eee8a6d {
        val raw = buildJsonObject {
              put("id", SdkJson.encodeToJsonElement(id))
            }
        val inspection = inspectInlineAgentsReposTasksGetResponse200JsonAllOf1ArtifactsItemDataX6b250fd6(raw)
        if (inspection.size == 0) {
          throw InlineAgentsReposTasksGetResponse200JsonAllOf1ArtifactsItemDataX6b250fd6NoMatchException("InlineAgentsReposTasksGetResponse200JsonAllOf1ArtifactsItemDataX6b250fd6 matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.InlineAgentsReposTasksGetResponse200JsonAllOf1ArtifactsItemDataOneOf1X4eee8a6dMatches) {
          throw InlineAgentsReposTasksGetResponse200JsonAllOf1ArtifactsItemDataX6b250fd6BranchValidationException("InlineAgentsReposTasksGetResponse200JsonAllOf1ArtifactsItemDataOneOf1X4eee8a6d factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw InlineAgentsReposTasksGetResponse200JsonAllOf1ArtifactsItemDataX6b250fd6AmbiguityException("InlineAgentsReposTasksGetResponse200JsonAllOf1ArtifactsItemDataX6b250fd6 matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return InlineAgentsReposTasksGetResponse200JsonAllOf1ArtifactsItemDataOneOf1X4eee8a6d(
          id = id,
          raw = raw,
        )
      }
    }
  }

  public class InlineAgentsReposTasksGetResponse200JsonAllOf1ArtifactsItemDataOneOf2Xc45720de internal constructor(
    public val baseRef: String,
    public val headRef: String,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineAgentsReposTasksGetResponse200JsonAllOf1ArtifactsItemDataX6b250fd6 {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(baseRef: String, headRef: String): InlineAgentsReposTasksGetResponse200JsonAllOf1ArtifactsItemDataOneOf2Xc45720de {
        val raw = buildJsonObject {
              put("base_ref", baseRef)
              put("head_ref", headRef)
            }
        val inspection = inspectInlineAgentsReposTasksGetResponse200JsonAllOf1ArtifactsItemDataX6b250fd6(raw)
        if (inspection.size == 0) {
          throw InlineAgentsReposTasksGetResponse200JsonAllOf1ArtifactsItemDataX6b250fd6NoMatchException("InlineAgentsReposTasksGetResponse200JsonAllOf1ArtifactsItemDataX6b250fd6 matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.InlineAgentsReposTasksGetResponse200JsonAllOf1ArtifactsItemDataOneOf2Xc45720deMatches) {
          throw InlineAgentsReposTasksGetResponse200JsonAllOf1ArtifactsItemDataX6b250fd6BranchValidationException("InlineAgentsReposTasksGetResponse200JsonAllOf1ArtifactsItemDataOneOf2Xc45720de factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw InlineAgentsReposTasksGetResponse200JsonAllOf1ArtifactsItemDataX6b250fd6AmbiguityException("InlineAgentsReposTasksGetResponse200JsonAllOf1ArtifactsItemDataX6b250fd6 matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return InlineAgentsReposTasksGetResponse200JsonAllOf1ArtifactsItemDataOneOf2Xc45720de(
          baseRef = baseRef,
          headRef = headRef,
          raw = raw,
        )
      }
    }
  }

  public object Serializer : KSerializer<InlineAgentsReposTasksGetResponse200JsonAllOf1ArtifactsItemDataX6b250fd6> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineAgentsReposTasksGetResponse200JsonAllOf1ArtifactsItemDataX6b250fd6 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineAgentsReposTasksGetResponse200JsonAllOf1ArtifactsItemDataX6b250fd6")
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw InlineAgentsReposTasksGetResponse200JsonAllOf1ArtifactsItemDataX6b250fd6NoMatchException("InlineAgentsReposTasksGetResponse200JsonAllOf1ArtifactsItemDataX6b250fd6 matched 0 branches: expected JSON object")
      val matches = inspectInlineAgentsReposTasksGetResponse200JsonAllOf1ArtifactsItemDataX6b250fd6(rawObject)
      if (matches.size == 0) {
        throw InlineAgentsReposTasksGetResponse200JsonAllOf1ArtifactsItemDataX6b250fd6NoMatchException("InlineAgentsReposTasksGetResponse200JsonAllOf1ArtifactsItemDataX6b250fd6 matched 0 branches: " + matches.failures.joinToString("; "))
      }
      if (matches.size > 1) {
        throw InlineAgentsReposTasksGetResponse200JsonAllOf1ArtifactsItemDataX6b250fd6AmbiguityException("InlineAgentsReposTasksGetResponse200JsonAllOf1ArtifactsItemDataX6b250fd6 matched " + matches.size + " branches; expected exactly 1: " + matches.names.joinToString())
      }
      return when {
        matches.InlineAgentsReposTasksGetResponse200JsonAllOf1ArtifactsItemDataOneOf1X4eee8a6dMatches -> InlineAgentsReposTasksGetResponse200JsonAllOf1ArtifactsItemDataOneOf1X4eee8a6d(id = requireNotNull(matches.id), raw = rawObject)
        matches.InlineAgentsReposTasksGetResponse200JsonAllOf1ArtifactsItemDataOneOf2Xc45720deMatches -> InlineAgentsReposTasksGetResponse200JsonAllOf1ArtifactsItemDataOneOf2Xc45720de(baseRef = requireNotNull(matches.baseRef), headRef = requireNotNull(matches.headRef), raw = rawObject)
        else -> error("unreachable")
      }
    }

    override fun serialize(encoder: Encoder, `value`: InlineAgentsReposTasksGetResponse200JsonAllOf1ArtifactsItemDataX6b250fd6) {
      encoder.requireJsonEncoder("InlineAgentsReposTasksGetResponse200JsonAllOf1ArtifactsItemDataX6b250fd6").encodeJsonElement(value.raw)
    }
  }
}

internal data class InlineAgentsReposTasksGetResponse200JsonAllOf1ArtifactsItemDataX6b250fd6Inspection(
  public val id: Long?,
  public val idDecoded: Boolean,
  public val baseRef: String?,
  public val baseRefDecoded: Boolean,
  public val headRef: String?,
  public val headRefDecoded: Boolean,
  public val InlineAgentsReposTasksGetResponse200JsonAllOf1ArtifactsItemDataOneOf1X4eee8a6dMatches:
      Boolean,
  public val InlineAgentsReposTasksGetResponse200JsonAllOf1ArtifactsItemDataOneOf2Xc45720deMatches:
      Boolean,
  public val rawEmpty: Boolean,
  public val failures: List<String>,
) {
  public val names: List<String>
    get() = buildList {
      if (InlineAgentsReposTasksGetResponse200JsonAllOf1ArtifactsItemDataOneOf1X4eee8a6dMatches) add("InlineAgentsReposTasksGetResponse200JsonAllOf1ArtifactsItemDataOneOf1X4eee8a6d")
      if (InlineAgentsReposTasksGetResponse200JsonAllOf1ArtifactsItemDataOneOf2Xc45720deMatches) add("InlineAgentsReposTasksGetResponse200JsonAllOf1ArtifactsItemDataOneOf2Xc45720de")
    }

  public val size: Int
    get() = names.size
}

private fun inspectInlineAgentsReposTasksGetResponse200JsonAllOf1ArtifactsItemDataX6b250fd6(rawObject: JsonObject): InlineAgentsReposTasksGetResponse200JsonAllOf1ArtifactsItemDataX6b250fd6Inspection {
  val idResult = rawObject["id"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<Long>(element) } }
  val id = idResult?.getOrNull()
  val idDecoded = idResult?.isSuccess == true
  val baseRefResult = rawObject["base_ref"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val baseRef = baseRefResult?.getOrNull()
  val baseRefDecoded = baseRefResult?.isSuccess == true
  val headRefResult = rawObject["head_ref"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val headRef = headRefResult?.getOrNull()
  val headRefDecoded = headRefResult?.isSuccess == true
  val rawEmpty = rawObject.isEmpty()
  val InlineAgentsReposTasksGetResponse200JsonAllOf1ArtifactsItemDataOneOf1X4eee8a6dMatches = idDecoded
  val InlineAgentsReposTasksGetResponse200JsonAllOf1ArtifactsItemDataOneOf2Xc45720deMatches = baseRefDecoded && headRefDecoded
  return InlineAgentsReposTasksGetResponse200JsonAllOf1ArtifactsItemDataX6b250fd6Inspection(
    id = id,
    idDecoded = idDecoded,
    baseRef = baseRef,
    baseRefDecoded = baseRefDecoded,
    headRef = headRef,
    headRefDecoded = headRefDecoded,
    InlineAgentsReposTasksGetResponse200JsonAllOf1ArtifactsItemDataOneOf1X4eee8a6dMatches = InlineAgentsReposTasksGetResponse200JsonAllOf1ArtifactsItemDataOneOf1X4eee8a6dMatches,
    InlineAgentsReposTasksGetResponse200JsonAllOf1ArtifactsItemDataOneOf2Xc45720deMatches = InlineAgentsReposTasksGetResponse200JsonAllOf1ArtifactsItemDataOneOf2Xc45720deMatches,
    rawEmpty = rawEmpty,
    failures = buildList {
      if (!InlineAgentsReposTasksGetResponse200JsonAllOf1ArtifactsItemDataOneOf1X4eee8a6dMatches) add("InlineAgentsReposTasksGetResponse200JsonAllOf1ArtifactsItemDataOneOf1X4eee8a6d: branch predicate did not match properties 'id'")
      if (!InlineAgentsReposTasksGetResponse200JsonAllOf1ArtifactsItemDataOneOf2Xc45720deMatches) add("InlineAgentsReposTasksGetResponse200JsonAllOf1ArtifactsItemDataOneOf2Xc45720de: branch predicate did not match properties 'base_ref' and 'head_ref'")
    },
  )
}

private fun JsonObject.stringValue(name: String): String? {
  val primitive = this[name] as? JsonPrimitive ?: return null
  return primitive.takeIf { it.isString }?.content
}
