package io.github.nabobery.sdkgen.github.generated

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

public sealed class InlineAgentsTasksGetResponse200JsonTasksItemArtifactsItemDataX94dfa0c7DecodingException(
  message: String,
) : SerializationException(message)

public class InlineAgentsTasksGetResponse200JsonTasksItemArtifactsItemDataX94dfa0c7NoMatchException(
  message: String,
) : InlineAgentsTasksGetResponse200JsonTasksItemArtifactsItemDataX94dfa0c7DecodingException(message)

public class InlineAgentsTasksGetResponse200JsonTasksItemArtifactsItemDataX94dfa0c7AmbiguityException(
  message: String,
) : InlineAgentsTasksGetResponse200JsonTasksItemArtifactsItemDataX94dfa0c7DecodingException(message)

public class InlineAgentsTasksGetResponse200JsonTasksItemArtifactsItemDataX94dfa0c7BranchValidationException(
  message: String,
) : InlineAgentsTasksGetResponse200JsonTasksItemArtifactsItemDataX94dfa0c7DecodingException(message)

/**
 * Resource data (shape depends on type)
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1agents~1tasks/get/responses/200/content/application~1json/schema/properties/tas
 * ks/items/properties/artifacts/items/properties/data
 */
@Serializable(with = InlineAgentsTasksGetResponse200JsonTasksItemArtifactsItemDataX94dfa0c7Serializer::class)
public sealed interface InlineAgentsTasksGetResponse200JsonTasksItemArtifactsItemDataX94dfa0c7 {
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonObject

  public class InlineAgentsTasksGetResponse200JsonTasksItemArtifactsItemDataOneOf1Xef04c46d internal constructor(
    public val id: Long,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineAgentsTasksGetResponse200JsonTasksItemArtifactsItemDataX94dfa0c7 {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(id: Long): InlineAgentsTasksGetResponse200JsonTasksItemArtifactsItemDataOneOf1Xef04c46d {
        val raw = buildJsonObject {
          put("id", SdkJson.encodeToJsonElement(id))
        }
        val inspection = inspectInlineAgentsTasksGetResponse200JsonTasksItemArtifactsItemDataX94dfa0c7(raw)
        if (inspection.size == 0) {
          throw InlineAgentsTasksGetResponse200JsonTasksItemArtifactsItemDataX94dfa0c7NoMatchException("InlineAgentsTasksGetResponse200JsonTasksItemArtifactsItemDataX94dfa0c7 matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.inlineAgentsTasksGetResponse200JsonTasksItemArtifactsItemDataOneOf1Xef04c46dMatches) {
          throw InlineAgentsTasksGetResponse200JsonTasksItemArtifactsItemDataX94dfa0c7BranchValidationException("InlineAgentsTasksGetResponse200JsonTasksItemArtifactsItemDataOneOf1Xef04c46d factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw InlineAgentsTasksGetResponse200JsonTasksItemArtifactsItemDataX94dfa0c7AmbiguityException("InlineAgentsTasksGetResponse200JsonTasksItemArtifactsItemDataX94dfa0c7 matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return InlineAgentsTasksGetResponse200JsonTasksItemArtifactsItemDataOneOf1Xef04c46d(
          id = id,
          raw = raw,
        )
      }
    }
  }

  public class InlineAgentsTasksGetResponse200JsonTasksItemArtifactsItemDataOneOf2Xebbdb0fd internal constructor(
    public val baseRef: String,
    public val headRef: String,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineAgentsTasksGetResponse200JsonTasksItemArtifactsItemDataX94dfa0c7 {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(baseRef: String, headRef: String): InlineAgentsTasksGetResponse200JsonTasksItemArtifactsItemDataOneOf2Xebbdb0fd {
        val raw = buildJsonObject {
          put("base_ref", baseRef)
          put("head_ref", headRef)
        }
        val inspection = inspectInlineAgentsTasksGetResponse200JsonTasksItemArtifactsItemDataX94dfa0c7(raw)
        if (inspection.size == 0) {
          throw InlineAgentsTasksGetResponse200JsonTasksItemArtifactsItemDataX94dfa0c7NoMatchException("InlineAgentsTasksGetResponse200JsonTasksItemArtifactsItemDataX94dfa0c7 matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.inlineAgentsTasksGetResponse200JsonTasksItemArtifactsItemDataOneOf2Xebbdb0fdMatches) {
          throw InlineAgentsTasksGetResponse200JsonTasksItemArtifactsItemDataX94dfa0c7BranchValidationException("InlineAgentsTasksGetResponse200JsonTasksItemArtifactsItemDataOneOf2Xebbdb0fd factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw InlineAgentsTasksGetResponse200JsonTasksItemArtifactsItemDataX94dfa0c7AmbiguityException("InlineAgentsTasksGetResponse200JsonTasksItemArtifactsItemDataX94dfa0c7 matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return InlineAgentsTasksGetResponse200JsonTasksItemArtifactsItemDataOneOf2Xebbdb0fd(
          baseRef = baseRef,
          headRef = headRef,
          raw = raw,
        )
      }
    }
  }
}

internal object InlineAgentsTasksGetResponse200JsonTasksItemArtifactsItemDataX94dfa0c7Serializer : KSerializer<InlineAgentsTasksGetResponse200JsonTasksItemArtifactsItemDataX94dfa0c7> {
  override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

  override fun deserialize(decoder: Decoder): InlineAgentsTasksGetResponse200JsonTasksItemArtifactsItemDataX94dfa0c7 {
    val jsonDecoder = decoder.requireJsonDecoder("InlineAgentsTasksGetResponse200JsonTasksItemArtifactsItemDataX94dfa0c7")
    val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw InlineAgentsTasksGetResponse200JsonTasksItemArtifactsItemDataX94dfa0c7NoMatchException("InlineAgentsTasksGetResponse200JsonTasksItemArtifactsItemDataX94dfa0c7 matched 0 branches: expected JSON object")
    val matches = inspectInlineAgentsTasksGetResponse200JsonTasksItemArtifactsItemDataX94dfa0c7(rawObject)
    if (matches.size == 0) {
      throw InlineAgentsTasksGetResponse200JsonTasksItemArtifactsItemDataX94dfa0c7NoMatchException("InlineAgentsTasksGetResponse200JsonTasksItemArtifactsItemDataX94dfa0c7 matched 0 branches: " + matches.failures.joinToString("; "))
    }
    if (matches.size > 1) {
      throw InlineAgentsTasksGetResponse200JsonTasksItemArtifactsItemDataX94dfa0c7AmbiguityException("InlineAgentsTasksGetResponse200JsonTasksItemArtifactsItemDataX94dfa0c7 matched " + matches.size + " branches; expected exactly 1: " + matches.names.joinToString())
    }
    return when {
      matches.inlineAgentsTasksGetResponse200JsonTasksItemArtifactsItemDataOneOf1Xef04c46dMatches -> InlineAgentsTasksGetResponse200JsonTasksItemArtifactsItemDataX94dfa0c7.InlineAgentsTasksGetResponse200JsonTasksItemArtifactsItemDataOneOf1Xef04c46d(id = requireNotNull(matches.id), raw = rawObject)
      matches.inlineAgentsTasksGetResponse200JsonTasksItemArtifactsItemDataOneOf2Xebbdb0fdMatches -> InlineAgentsTasksGetResponse200JsonTasksItemArtifactsItemDataX94dfa0c7.InlineAgentsTasksGetResponse200JsonTasksItemArtifactsItemDataOneOf2Xebbdb0fd(baseRef = requireNotNull(matches.baseRef), headRef = requireNotNull(matches.headRef), raw = rawObject)
      else -> error("unreachable")
    }
  }

  override fun serialize(encoder: Encoder, `value`: InlineAgentsTasksGetResponse200JsonTasksItemArtifactsItemDataX94dfa0c7) {
    encoder.requireJsonEncoder("InlineAgentsTasksGetResponse200JsonTasksItemArtifactsItemDataX94dfa0c7").encodeJsonElement(value.raw)
  }
}

internal data class InlineAgentsTasksGetResponse200JsonTasksItemArtifactsItemDataX94dfa0c7Inspection(
  public val id: Long?,
  public val idDecoded: Boolean,
  public val baseRef: String?,
  public val baseRefDecoded: Boolean,
  public val headRef: String?,
  public val headRefDecoded: Boolean,
  public val inlineAgentsTasksGetResponse200JsonTasksItemArtifactsItemDataOneOf1Xef04c46dMatches:
      Boolean,
  public val inlineAgentsTasksGetResponse200JsonTasksItemArtifactsItemDataOneOf2Xebbdb0fdMatches:
      Boolean,
  public val rawEmpty: Boolean,
  public val failures: List<String>,
) {
  public val names: List<String>
    get() = buildList {
      if (inlineAgentsTasksGetResponse200JsonTasksItemArtifactsItemDataOneOf1Xef04c46dMatches) add("InlineAgentsTasksGetResponse200JsonTasksItemArtifactsItemDataOneOf1Xef04c46d")
      if (inlineAgentsTasksGetResponse200JsonTasksItemArtifactsItemDataOneOf2Xebbdb0fdMatches) add("InlineAgentsTasksGetResponse200JsonTasksItemArtifactsItemDataOneOf2Xebbdb0fd")
    }

  public val size: Int
    get() = names.size
}

private fun inspectInlineAgentsTasksGetResponse200JsonTasksItemArtifactsItemDataX94dfa0c7(rawObject: JsonObject): InlineAgentsTasksGetResponse200JsonTasksItemArtifactsItemDataX94dfa0c7Inspection {
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
  val inlineAgentsTasksGetResponse200JsonTasksItemArtifactsItemDataOneOf1Xef04c46dMatches = idDecoded
  val inlineAgentsTasksGetResponse200JsonTasksItemArtifactsItemDataOneOf2Xebbdb0fdMatches = baseRefDecoded && headRefDecoded
  return InlineAgentsTasksGetResponse200JsonTasksItemArtifactsItemDataX94dfa0c7Inspection(
    id = id,
    idDecoded = idDecoded,
    baseRef = baseRef,
    baseRefDecoded = baseRefDecoded,
    headRef = headRef,
    headRefDecoded = headRefDecoded,
    inlineAgentsTasksGetResponse200JsonTasksItemArtifactsItemDataOneOf1Xef04c46dMatches = inlineAgentsTasksGetResponse200JsonTasksItemArtifactsItemDataOneOf1Xef04c46dMatches,
    inlineAgentsTasksGetResponse200JsonTasksItemArtifactsItemDataOneOf2Xebbdb0fdMatches = inlineAgentsTasksGetResponse200JsonTasksItemArtifactsItemDataOneOf2Xebbdb0fdMatches,
    rawEmpty = rawEmpty,
    failures = buildList {
      if (!inlineAgentsTasksGetResponse200JsonTasksItemArtifactsItemDataOneOf1Xef04c46dMatches) add("InlineAgentsTasksGetResponse200JsonTasksItemArtifactsItemDataOneOf1Xef04c46d: branch predicate did not match properties 'id'")
      if (!inlineAgentsTasksGetResponse200JsonTasksItemArtifactsItemDataOneOf2Xebbdb0fdMatches) add("InlineAgentsTasksGetResponse200JsonTasksItemArtifactsItemDataOneOf2Xebbdb0fd: branch predicate did not match properties 'base_ref' and 'head_ref'")
    },
  )
}

private fun JsonObject.stringValue(name: String): String? {
  val primitive = this[name] as? JsonPrimitive ?: return null
  return primitive.takeIf { it.isString }?.content
}
