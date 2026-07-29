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

public sealed class InlineAgentsTasksGetResponse200JsonAllOf1ArtifactsItemDataX91329754DecodingException(
  message: String,
) : SerializationException(message)

public class InlineAgentsTasksGetResponse200JsonAllOf1ArtifactsItemDataX91329754NoMatchException(
  message: String,
) : InlineAgentsTasksGetResponse200JsonAllOf1ArtifactsItemDataX91329754DecodingException(message)

public class InlineAgentsTasksGetResponse200JsonAllOf1ArtifactsItemDataX91329754AmbiguityException(
  message: String,
) : InlineAgentsTasksGetResponse200JsonAllOf1ArtifactsItemDataX91329754DecodingException(message)

public class InlineAgentsTasksGetResponse200JsonAllOf1ArtifactsItemDataX91329754BranchValidationException(
  message: String,
) : InlineAgentsTasksGetResponse200JsonAllOf1ArtifactsItemDataX91329754DecodingException(message)

/**
 * Resource data (shape depends on type)
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1agents~1tasks~1{task_id}/get/responses/200/content/application~1json/schema/all
 * Of/0/properties/artifacts/items/properties/data
 */
@Serializable(with = InlineAgentsTasksGetResponse200JsonAllOf1ArtifactsItemDataX91329754.Serializer::class)
public sealed interface InlineAgentsTasksGetResponse200JsonAllOf1ArtifactsItemDataX91329754 {
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonObject

  public class InlineAgentsTasksGetResponse200JsonAllOf1ArtifactsItemDataOneOf1Xff08b099 internal constructor(
    public val id: Long,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineAgentsTasksGetResponse200JsonAllOf1ArtifactsItemDataX91329754 {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(id: Long): InlineAgentsTasksGetResponse200JsonAllOf1ArtifactsItemDataOneOf1Xff08b099 {
        val raw = buildJsonObject {
          put("id", SdkJson.encodeToJsonElement(id))
        }
        val inspection = inspectInlineAgentsTasksGetResponse200JsonAllOf1ArtifactsItemDataX91329754(raw)
        if (inspection.size == 0) {
          throw InlineAgentsTasksGetResponse200JsonAllOf1ArtifactsItemDataX91329754NoMatchException("InlineAgentsTasksGetResponse200JsonAllOf1ArtifactsItemDataX91329754 matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.inlineAgentsTasksGetResponse200JsonAllOf1ArtifactsItemDataOneOf1Xff08b099Matches) {
          throw InlineAgentsTasksGetResponse200JsonAllOf1ArtifactsItemDataX91329754BranchValidationException("InlineAgentsTasksGetResponse200JsonAllOf1ArtifactsItemDataOneOf1Xff08b099 factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw InlineAgentsTasksGetResponse200JsonAllOf1ArtifactsItemDataX91329754AmbiguityException("InlineAgentsTasksGetResponse200JsonAllOf1ArtifactsItemDataX91329754 matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return InlineAgentsTasksGetResponse200JsonAllOf1ArtifactsItemDataOneOf1Xff08b099(
          id = id,
          raw = raw,
        )
      }
    }
  }

  public class InlineAgentsTasksGetResponse200JsonAllOf1ArtifactsItemDataOneOf2X3fa0195f internal constructor(
    public val baseRef: String,
    public val headRef: String,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineAgentsTasksGetResponse200JsonAllOf1ArtifactsItemDataX91329754 {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(baseRef: String, headRef: String): InlineAgentsTasksGetResponse200JsonAllOf1ArtifactsItemDataOneOf2X3fa0195f {
        val raw = buildJsonObject {
          put("base_ref", baseRef)
          put("head_ref", headRef)
        }
        val inspection = inspectInlineAgentsTasksGetResponse200JsonAllOf1ArtifactsItemDataX91329754(raw)
        if (inspection.size == 0) {
          throw InlineAgentsTasksGetResponse200JsonAllOf1ArtifactsItemDataX91329754NoMatchException("InlineAgentsTasksGetResponse200JsonAllOf1ArtifactsItemDataX91329754 matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.inlineAgentsTasksGetResponse200JsonAllOf1ArtifactsItemDataOneOf2X3fa0195fMatches) {
          throw InlineAgentsTasksGetResponse200JsonAllOf1ArtifactsItemDataX91329754BranchValidationException("InlineAgentsTasksGetResponse200JsonAllOf1ArtifactsItemDataOneOf2X3fa0195f factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw InlineAgentsTasksGetResponse200JsonAllOf1ArtifactsItemDataX91329754AmbiguityException("InlineAgentsTasksGetResponse200JsonAllOf1ArtifactsItemDataX91329754 matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return InlineAgentsTasksGetResponse200JsonAllOf1ArtifactsItemDataOneOf2X3fa0195f(
          baseRef = baseRef,
          headRef = headRef,
          raw = raw,
        )
      }
    }
  }

  public object Serializer : KSerializer<InlineAgentsTasksGetResponse200JsonAllOf1ArtifactsItemDataX91329754> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineAgentsTasksGetResponse200JsonAllOf1ArtifactsItemDataX91329754 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineAgentsTasksGetResponse200JsonAllOf1ArtifactsItemDataX91329754")
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw InlineAgentsTasksGetResponse200JsonAllOf1ArtifactsItemDataX91329754NoMatchException("InlineAgentsTasksGetResponse200JsonAllOf1ArtifactsItemDataX91329754 matched 0 branches: expected JSON object")
      val matches = inspectInlineAgentsTasksGetResponse200JsonAllOf1ArtifactsItemDataX91329754(rawObject)
      if (matches.size == 0) {
        throw InlineAgentsTasksGetResponse200JsonAllOf1ArtifactsItemDataX91329754NoMatchException("InlineAgentsTasksGetResponse200JsonAllOf1ArtifactsItemDataX91329754 matched 0 branches: " + matches.failures.joinToString("; "))
      }
      if (matches.size > 1) {
        throw InlineAgentsTasksGetResponse200JsonAllOf1ArtifactsItemDataX91329754AmbiguityException("InlineAgentsTasksGetResponse200JsonAllOf1ArtifactsItemDataX91329754 matched " + matches.size + " branches; expected exactly 1: " + matches.names.joinToString())
      }
      return when {
        matches.inlineAgentsTasksGetResponse200JsonAllOf1ArtifactsItemDataOneOf1Xff08b099Matches -> InlineAgentsTasksGetResponse200JsonAllOf1ArtifactsItemDataOneOf1Xff08b099(id = requireNotNull(matches.id), raw = rawObject)
        matches.inlineAgentsTasksGetResponse200JsonAllOf1ArtifactsItemDataOneOf2X3fa0195fMatches -> InlineAgentsTasksGetResponse200JsonAllOf1ArtifactsItemDataOneOf2X3fa0195f(baseRef = requireNotNull(matches.baseRef), headRef = requireNotNull(matches.headRef), raw = rawObject)
        else -> error("unreachable")
      }
    }

    override fun serialize(encoder: Encoder, `value`: InlineAgentsTasksGetResponse200JsonAllOf1ArtifactsItemDataX91329754) {
      encoder.requireJsonEncoder("InlineAgentsTasksGetResponse200JsonAllOf1ArtifactsItemDataX91329754").encodeJsonElement(value.raw)
    }
  }
}

internal data class InlineAgentsTasksGetResponse200JsonAllOf1ArtifactsItemDataX91329754Inspection(
  public val id: Long?,
  public val idDecoded: Boolean,
  public val baseRef: String?,
  public val baseRefDecoded: Boolean,
  public val headRef: String?,
  public val headRefDecoded: Boolean,
  public val inlineAgentsTasksGetResponse200JsonAllOf1ArtifactsItemDataOneOf1Xff08b099Matches:
      Boolean,
  public val inlineAgentsTasksGetResponse200JsonAllOf1ArtifactsItemDataOneOf2X3fa0195fMatches:
      Boolean,
  public val rawEmpty: Boolean,
  public val failures: List<String>,
) {
  public val names: List<String>
    get() = buildList {
      if (inlineAgentsTasksGetResponse200JsonAllOf1ArtifactsItemDataOneOf1Xff08b099Matches) add("InlineAgentsTasksGetResponse200JsonAllOf1ArtifactsItemDataOneOf1Xff08b099")
      if (inlineAgentsTasksGetResponse200JsonAllOf1ArtifactsItemDataOneOf2X3fa0195fMatches) add("InlineAgentsTasksGetResponse200JsonAllOf1ArtifactsItemDataOneOf2X3fa0195f")
    }

  public val size: Int
    get() = names.size
}

private fun inspectInlineAgentsTasksGetResponse200JsonAllOf1ArtifactsItemDataX91329754(rawObject: JsonObject): InlineAgentsTasksGetResponse200JsonAllOf1ArtifactsItemDataX91329754Inspection {
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
  val inlineAgentsTasksGetResponse200JsonAllOf1ArtifactsItemDataOneOf1Xff08b099Matches = idDecoded
  val inlineAgentsTasksGetResponse200JsonAllOf1ArtifactsItemDataOneOf2X3fa0195fMatches = baseRefDecoded && headRefDecoded
  return InlineAgentsTasksGetResponse200JsonAllOf1ArtifactsItemDataX91329754Inspection(
    id = id,
    idDecoded = idDecoded,
    baseRef = baseRef,
    baseRefDecoded = baseRefDecoded,
    headRef = headRef,
    headRefDecoded = headRefDecoded,
    inlineAgentsTasksGetResponse200JsonAllOf1ArtifactsItemDataOneOf1Xff08b099Matches = inlineAgentsTasksGetResponse200JsonAllOf1ArtifactsItemDataOneOf1Xff08b099Matches,
    inlineAgentsTasksGetResponse200JsonAllOf1ArtifactsItemDataOneOf2X3fa0195fMatches = inlineAgentsTasksGetResponse200JsonAllOf1ArtifactsItemDataOneOf2X3fa0195fMatches,
    rawEmpty = rawEmpty,
    failures = buildList {
      if (!inlineAgentsTasksGetResponse200JsonAllOf1ArtifactsItemDataOneOf1Xff08b099Matches) add("InlineAgentsTasksGetResponse200JsonAllOf1ArtifactsItemDataOneOf1Xff08b099: branch predicate did not match properties 'id'")
      if (!inlineAgentsTasksGetResponse200JsonAllOf1ArtifactsItemDataOneOf2X3fa0195fMatches) add("InlineAgentsTasksGetResponse200JsonAllOf1ArtifactsItemDataOneOf2X3fa0195f: branch predicate did not match properties 'base_ref' and 'head_ref'")
    },
  )
}

private fun JsonObject.stringValue(name: String): String? {
  val primitive = this[name] as? JsonPrimitive ?: return null
  return primitive.takeIf { it.isString }?.content
}
