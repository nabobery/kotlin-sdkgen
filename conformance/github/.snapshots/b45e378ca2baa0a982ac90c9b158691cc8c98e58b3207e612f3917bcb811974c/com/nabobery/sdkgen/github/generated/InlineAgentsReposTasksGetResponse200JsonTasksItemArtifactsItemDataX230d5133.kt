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

public sealed class InlineAgentsReposTasksGetResponse200JsonTasksItemArtifactsItemDataX230d5133DecodingException(
  message: String,
) : SerializationException(message)

public class InlineAgentsReposTasksGetResponse200JsonTasksItemArtifactsItemDataX230d5133NoMatchException(
  message: String,
) : InlineAgentsReposTasksGetResponse200JsonTasksItemArtifactsItemDataX230d5133DecodingException(message)

public class InlineAgentsReposTasksGetResponse200JsonTasksItemArtifactsItemDataX230d5133AmbiguityException(
  message: String,
) : InlineAgentsReposTasksGetResponse200JsonTasksItemArtifactsItemDataX230d5133DecodingException(message)

public class InlineAgentsReposTasksGetResponse200JsonTasksItemArtifactsItemDataX230d5133BranchValidationException(
  message: String,
) : InlineAgentsReposTasksGetResponse200JsonTasksItemArtifactsItemDataX230d5133DecodingException(message)

/**
 * Resource data (shape depends on type)
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1agents~1repos~1{owner}~1{repo}~1tasks/get/responses/200/content/application~1js
 * on/schema/properties/tasks/items/properties/artifacts/items/properties/data
 */
@Serializable(with = InlineAgentsReposTasksGetResponse200JsonTasksItemArtifactsItemDataX230d5133Serializer::class)
public sealed interface InlineAgentsReposTasksGetResponse200JsonTasksItemArtifactsItemDataX230d5133 {
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonObject

  public class InlineAgentsReposTasksGetResponse200JsonTasksItemArtifactsItemOneOf1X7bd5b051 internal constructor(
    public val id: Long,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineAgentsReposTasksGetResponse200JsonTasksItemArtifactsItemDataX230d5133 {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(id: Long): InlineAgentsReposTasksGetResponse200JsonTasksItemArtifactsItemOneOf1X7bd5b051 {
        val raw = buildJsonObject {
          put("id", SdkJson.encodeToJsonElement(id))
        }
        val inspection = inspectInlineAgentsReposTasksGetResponse200JsonTasksItemArtifactsItemDataX230d5133(raw)
        if (inspection.size == 0) {
          throw InlineAgentsReposTasksGetResponse200JsonTasksItemArtifactsItemDataX230d5133NoMatchException("InlineAgentsReposTasksGetResponse200JsonTasksItemArtifactsItemDataX230d5133 matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.inlineAgentsReposTasksGetResponse200JsonTasksItemArtifactsItemOneOf1X7bd5b051Matches) {
          throw InlineAgentsReposTasksGetResponse200JsonTasksItemArtifactsItemDataX230d5133BranchValidationException("InlineAgentsReposTasksGetResponse200JsonTasksItemArtifactsItemOneOf1X7bd5b051 factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw InlineAgentsReposTasksGetResponse200JsonTasksItemArtifactsItemDataX230d5133AmbiguityException("InlineAgentsReposTasksGetResponse200JsonTasksItemArtifactsItemDataX230d5133 matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return InlineAgentsReposTasksGetResponse200JsonTasksItemArtifactsItemOneOf1X7bd5b051(
          id = id,
          raw = raw,
        )
      }
    }
  }

  public class InlineAgentsReposTasksGetResponse200JsonTasksItemArtifactsItemOneOf2X2ed18c4e internal constructor(
    public val baseRef: String,
    public val headRef: String,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineAgentsReposTasksGetResponse200JsonTasksItemArtifactsItemDataX230d5133 {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(baseRef: String, headRef: String): InlineAgentsReposTasksGetResponse200JsonTasksItemArtifactsItemOneOf2X2ed18c4e {
        val raw = buildJsonObject {
          put("base_ref", baseRef)
          put("head_ref", headRef)
        }
        val inspection = inspectInlineAgentsReposTasksGetResponse200JsonTasksItemArtifactsItemDataX230d5133(raw)
        if (inspection.size == 0) {
          throw InlineAgentsReposTasksGetResponse200JsonTasksItemArtifactsItemDataX230d5133NoMatchException("InlineAgentsReposTasksGetResponse200JsonTasksItemArtifactsItemDataX230d5133 matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.inlineAgentsReposTasksGetResponse200JsonTasksItemArtifactsItemOneOf2X2ed18c4eMatches) {
          throw InlineAgentsReposTasksGetResponse200JsonTasksItemArtifactsItemDataX230d5133BranchValidationException("InlineAgentsReposTasksGetResponse200JsonTasksItemArtifactsItemOneOf2X2ed18c4e factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw InlineAgentsReposTasksGetResponse200JsonTasksItemArtifactsItemDataX230d5133AmbiguityException("InlineAgentsReposTasksGetResponse200JsonTasksItemArtifactsItemDataX230d5133 matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return InlineAgentsReposTasksGetResponse200JsonTasksItemArtifactsItemOneOf2X2ed18c4e(
          baseRef = baseRef,
          headRef = headRef,
          raw = raw,
        )
      }
    }
  }
}

internal object InlineAgentsReposTasksGetResponse200JsonTasksItemArtifactsItemDataX230d5133Serializer : KSerializer<InlineAgentsReposTasksGetResponse200JsonTasksItemArtifactsItemDataX230d5133> {
  override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

  override fun deserialize(decoder: Decoder): InlineAgentsReposTasksGetResponse200JsonTasksItemArtifactsItemDataX230d5133 {
    val jsonDecoder = decoder.requireJsonDecoder("InlineAgentsReposTasksGetResponse200JsonTasksItemArtifactsItemDataX230d5133")
    val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw InlineAgentsReposTasksGetResponse200JsonTasksItemArtifactsItemDataX230d5133NoMatchException("InlineAgentsReposTasksGetResponse200JsonTasksItemArtifactsItemDataX230d5133 matched 0 branches: expected JSON object")
    val matches = inspectInlineAgentsReposTasksGetResponse200JsonTasksItemArtifactsItemDataX230d5133(rawObject)
    if (matches.size == 0) {
      throw InlineAgentsReposTasksGetResponse200JsonTasksItemArtifactsItemDataX230d5133NoMatchException("InlineAgentsReposTasksGetResponse200JsonTasksItemArtifactsItemDataX230d5133 matched 0 branches: " + matches.failures.joinToString("; "))
    }
    if (matches.size > 1) {
      throw InlineAgentsReposTasksGetResponse200JsonTasksItemArtifactsItemDataX230d5133AmbiguityException("InlineAgentsReposTasksGetResponse200JsonTasksItemArtifactsItemDataX230d5133 matched " + matches.size + " branches; expected exactly 1: " + matches.names.joinToString())
    }
    return when {
      matches.inlineAgentsReposTasksGetResponse200JsonTasksItemArtifactsItemOneOf1X7bd5b051Matches -> InlineAgentsReposTasksGetResponse200JsonTasksItemArtifactsItemDataX230d5133.InlineAgentsReposTasksGetResponse200JsonTasksItemArtifactsItemOneOf1X7bd5b051(id = requireNotNull(matches.id), raw = rawObject)
      matches.inlineAgentsReposTasksGetResponse200JsonTasksItemArtifactsItemOneOf2X2ed18c4eMatches -> InlineAgentsReposTasksGetResponse200JsonTasksItemArtifactsItemDataX230d5133.InlineAgentsReposTasksGetResponse200JsonTasksItemArtifactsItemOneOf2X2ed18c4e(baseRef = requireNotNull(matches.baseRef), headRef = requireNotNull(matches.headRef), raw = rawObject)
      else -> error("unreachable")
    }
  }

  override fun serialize(encoder: Encoder, `value`: InlineAgentsReposTasksGetResponse200JsonTasksItemArtifactsItemDataX230d5133) {
    encoder.requireJsonEncoder("InlineAgentsReposTasksGetResponse200JsonTasksItemArtifactsItemDataX230d5133").encodeJsonElement(value.raw)
  }
}

internal data class InlineAgentsReposTasksGetResponse200JsonTasksItemArtifactsItemDataX230d5133Inspection(
  public val id: Long?,
  public val idDecoded: Boolean,
  public val baseRef: String?,
  public val baseRefDecoded: Boolean,
  public val headRef: String?,
  public val headRefDecoded: Boolean,
  public val inlineAgentsReposTasksGetResponse200JsonTasksItemArtifactsItemOneOf1X7bd5b051Matches:
      Boolean,
  public val inlineAgentsReposTasksGetResponse200JsonTasksItemArtifactsItemOneOf2X2ed18c4eMatches:
      Boolean,
  public val rawEmpty: Boolean,
  public val failures: List<String>,
) {
  public val names: List<String>
    get() = buildList {
      if (inlineAgentsReposTasksGetResponse200JsonTasksItemArtifactsItemOneOf1X7bd5b051Matches) add("InlineAgentsReposTasksGetResponse200JsonTasksItemArtifactsItemOneOf1X7bd5b051")
      if (inlineAgentsReposTasksGetResponse200JsonTasksItemArtifactsItemOneOf2X2ed18c4eMatches) add("InlineAgentsReposTasksGetResponse200JsonTasksItemArtifactsItemOneOf2X2ed18c4e")
    }

  public val size: Int
    get() = names.size
}

private fun inspectInlineAgentsReposTasksGetResponse200JsonTasksItemArtifactsItemDataX230d5133(rawObject: JsonObject): InlineAgentsReposTasksGetResponse200JsonTasksItemArtifactsItemDataX230d5133Inspection {
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
  val inlineAgentsReposTasksGetResponse200JsonTasksItemArtifactsItemOneOf1X7bd5b051Matches = idDecoded
  val inlineAgentsReposTasksGetResponse200JsonTasksItemArtifactsItemOneOf2X2ed18c4eMatches = baseRefDecoded && headRefDecoded
  return InlineAgentsReposTasksGetResponse200JsonTasksItemArtifactsItemDataX230d5133Inspection(
    id = id,
    idDecoded = idDecoded,
    baseRef = baseRef,
    baseRefDecoded = baseRefDecoded,
    headRef = headRef,
    headRefDecoded = headRefDecoded,
    inlineAgentsReposTasksGetResponse200JsonTasksItemArtifactsItemOneOf1X7bd5b051Matches = inlineAgentsReposTasksGetResponse200JsonTasksItemArtifactsItemOneOf1X7bd5b051Matches,
    inlineAgentsReposTasksGetResponse200JsonTasksItemArtifactsItemOneOf2X2ed18c4eMatches = inlineAgentsReposTasksGetResponse200JsonTasksItemArtifactsItemOneOf2X2ed18c4eMatches,
    rawEmpty = rawEmpty,
    failures = buildList {
      if (!inlineAgentsReposTasksGetResponse200JsonTasksItemArtifactsItemOneOf1X7bd5b051Matches) add("InlineAgentsReposTasksGetResponse200JsonTasksItemArtifactsItemOneOf1X7bd5b051: branch predicate did not match properties 'id'")
      if (!inlineAgentsReposTasksGetResponse200JsonTasksItemArtifactsItemOneOf2X2ed18c4eMatches) add("InlineAgentsReposTasksGetResponse200JsonTasksItemArtifactsItemOneOf2X2ed18c4e: branch predicate did not match properties 'base_ref' and 'head_ref'")
    },
  )
}

private fun JsonObject.stringValue(name: String): String? {
  val primitive = this[name] as? JsonPrimitive ?: return null
  return primitive.takeIf { it.isString }?.content
}
