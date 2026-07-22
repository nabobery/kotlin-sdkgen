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

public sealed class InlineAgentsReposTasksPostResponse201JsonArtifactsItemDataX3b7ce014DecodingException(
  message: String,
) : SerializationException(message)

public class InlineAgentsReposTasksPostResponse201JsonArtifactsItemDataX3b7ce014NoMatchException(
  message: String,
) : InlineAgentsReposTasksPostResponse201JsonArtifactsItemDataX3b7ce014DecodingException(message)

public class InlineAgentsReposTasksPostResponse201JsonArtifactsItemDataX3b7ce014AmbiguityException(
  message: String,
) : InlineAgentsReposTasksPostResponse201JsonArtifactsItemDataX3b7ce014DecodingException(message)

public class InlineAgentsReposTasksPostResponse201JsonArtifactsItemDataX3b7ce014BranchValidationException(
  message: String,
) : InlineAgentsReposTasksPostResponse201JsonArtifactsItemDataX3b7ce014DecodingException(message)

/**
 * Resource data (shape depends on type)
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1agents~1repos~1{owner}~1{repo}~1tasks/post/responses/201/content/application~1j
 * son/schema/properties/artifacts/items/properties/data
 */
@Serializable(with = InlineAgentsReposTasksPostResponse201JsonArtifactsItemDataX3b7ce014.Serializer::class)
public sealed interface InlineAgentsReposTasksPostResponse201JsonArtifactsItemDataX3b7ce014 {
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonObject

  public class InlineAgentsReposTasksPostResponse201JsonArtifactsItemDataOneOf1X4727faa8 internal constructor(
    public val id: Long,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineAgentsReposTasksPostResponse201JsonArtifactsItemDataX3b7ce014 {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(id: Long): InlineAgentsReposTasksPostResponse201JsonArtifactsItemDataOneOf1X4727faa8 {
        val raw = buildJsonObject {
              put("id", SdkJson.encodeToJsonElement(id))
            }
        val inspection = inspectInlineAgentsReposTasksPostResponse201JsonArtifactsItemDataX3b7ce014(raw)
        if (inspection.size == 0) {
          throw InlineAgentsReposTasksPostResponse201JsonArtifactsItemDataX3b7ce014NoMatchException("InlineAgentsReposTasksPostResponse201JsonArtifactsItemDataX3b7ce014 matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.InlineAgentsReposTasksPostResponse201JsonArtifactsItemDataOneOf1X4727faa8Matches) {
          throw InlineAgentsReposTasksPostResponse201JsonArtifactsItemDataX3b7ce014BranchValidationException("InlineAgentsReposTasksPostResponse201JsonArtifactsItemDataOneOf1X4727faa8 factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw InlineAgentsReposTasksPostResponse201JsonArtifactsItemDataX3b7ce014AmbiguityException("InlineAgentsReposTasksPostResponse201JsonArtifactsItemDataX3b7ce014 matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return InlineAgentsReposTasksPostResponse201JsonArtifactsItemDataOneOf1X4727faa8(
          id = id,
          raw = raw,
        )
      }
    }
  }

  public class InlineAgentsReposTasksPostResponse201JsonArtifactsItemDataOneOf2X637c4919 internal constructor(
    public val baseRef: String,
    public val headRef: String,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineAgentsReposTasksPostResponse201JsonArtifactsItemDataX3b7ce014 {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(baseRef: String, headRef: String): InlineAgentsReposTasksPostResponse201JsonArtifactsItemDataOneOf2X637c4919 {
        val raw = buildJsonObject {
              put("base_ref", baseRef)
              put("head_ref", headRef)
            }
        val inspection = inspectInlineAgentsReposTasksPostResponse201JsonArtifactsItemDataX3b7ce014(raw)
        if (inspection.size == 0) {
          throw InlineAgentsReposTasksPostResponse201JsonArtifactsItemDataX3b7ce014NoMatchException("InlineAgentsReposTasksPostResponse201JsonArtifactsItemDataX3b7ce014 matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.InlineAgentsReposTasksPostResponse201JsonArtifactsItemDataOneOf2X637c4919Matches) {
          throw InlineAgentsReposTasksPostResponse201JsonArtifactsItemDataX3b7ce014BranchValidationException("InlineAgentsReposTasksPostResponse201JsonArtifactsItemDataOneOf2X637c4919 factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw InlineAgentsReposTasksPostResponse201JsonArtifactsItemDataX3b7ce014AmbiguityException("InlineAgentsReposTasksPostResponse201JsonArtifactsItemDataX3b7ce014 matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return InlineAgentsReposTasksPostResponse201JsonArtifactsItemDataOneOf2X637c4919(
          baseRef = baseRef,
          headRef = headRef,
          raw = raw,
        )
      }
    }
  }

  public object Serializer : KSerializer<InlineAgentsReposTasksPostResponse201JsonArtifactsItemDataX3b7ce014> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineAgentsReposTasksPostResponse201JsonArtifactsItemDataX3b7ce014 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineAgentsReposTasksPostResponse201JsonArtifactsItemDataX3b7ce014")
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw InlineAgentsReposTasksPostResponse201JsonArtifactsItemDataX3b7ce014NoMatchException("InlineAgentsReposTasksPostResponse201JsonArtifactsItemDataX3b7ce014 matched 0 branches: expected JSON object")
      val matches = inspectInlineAgentsReposTasksPostResponse201JsonArtifactsItemDataX3b7ce014(rawObject)
      if (matches.size == 0) {
        throw InlineAgentsReposTasksPostResponse201JsonArtifactsItemDataX3b7ce014NoMatchException("InlineAgentsReposTasksPostResponse201JsonArtifactsItemDataX3b7ce014 matched 0 branches: " + matches.failures.joinToString("; "))
      }
      if (matches.size > 1) {
        throw InlineAgentsReposTasksPostResponse201JsonArtifactsItemDataX3b7ce014AmbiguityException("InlineAgentsReposTasksPostResponse201JsonArtifactsItemDataX3b7ce014 matched " + matches.size + " branches; expected exactly 1: " + matches.names.joinToString())
      }
      return when {
        matches.InlineAgentsReposTasksPostResponse201JsonArtifactsItemDataOneOf1X4727faa8Matches -> InlineAgentsReposTasksPostResponse201JsonArtifactsItemDataOneOf1X4727faa8(id = requireNotNull(matches.id), raw = rawObject)
        matches.InlineAgentsReposTasksPostResponse201JsonArtifactsItemDataOneOf2X637c4919Matches -> InlineAgentsReposTasksPostResponse201JsonArtifactsItemDataOneOf2X637c4919(baseRef = requireNotNull(matches.baseRef), headRef = requireNotNull(matches.headRef), raw = rawObject)
        else -> error("unreachable")
      }
    }

    override fun serialize(encoder: Encoder, `value`: InlineAgentsReposTasksPostResponse201JsonArtifactsItemDataX3b7ce014) {
      encoder.requireJsonEncoder("InlineAgentsReposTasksPostResponse201JsonArtifactsItemDataX3b7ce014").encodeJsonElement(value.raw)
    }
  }
}

internal data class InlineAgentsReposTasksPostResponse201JsonArtifactsItemDataX3b7ce014Inspection(
  public val id: Long?,
  public val idDecoded: Boolean,
  public val baseRef: String?,
  public val baseRefDecoded: Boolean,
  public val headRef: String?,
  public val headRefDecoded: Boolean,
  public val InlineAgentsReposTasksPostResponse201JsonArtifactsItemDataOneOf1X4727faa8Matches:
      Boolean,
  public val InlineAgentsReposTasksPostResponse201JsonArtifactsItemDataOneOf2X637c4919Matches:
      Boolean,
  public val rawEmpty: Boolean,
  public val failures: List<String>,
) {
  public val names: List<String>
    get() = buildList {
      if (InlineAgentsReposTasksPostResponse201JsonArtifactsItemDataOneOf1X4727faa8Matches) add("InlineAgentsReposTasksPostResponse201JsonArtifactsItemDataOneOf1X4727faa8")
      if (InlineAgentsReposTasksPostResponse201JsonArtifactsItemDataOneOf2X637c4919Matches) add("InlineAgentsReposTasksPostResponse201JsonArtifactsItemDataOneOf2X637c4919")
    }

  public val size: Int
    get() = names.size
}

private fun inspectInlineAgentsReposTasksPostResponse201JsonArtifactsItemDataX3b7ce014(rawObject: JsonObject): InlineAgentsReposTasksPostResponse201JsonArtifactsItemDataX3b7ce014Inspection {
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
  val InlineAgentsReposTasksPostResponse201JsonArtifactsItemDataOneOf1X4727faa8Matches = idDecoded
  val InlineAgentsReposTasksPostResponse201JsonArtifactsItemDataOneOf2X637c4919Matches = baseRefDecoded && headRefDecoded
  return InlineAgentsReposTasksPostResponse201JsonArtifactsItemDataX3b7ce014Inspection(
    id = id,
    idDecoded = idDecoded,
    baseRef = baseRef,
    baseRefDecoded = baseRefDecoded,
    headRef = headRef,
    headRefDecoded = headRefDecoded,
    InlineAgentsReposTasksPostResponse201JsonArtifactsItemDataOneOf1X4727faa8Matches = InlineAgentsReposTasksPostResponse201JsonArtifactsItemDataOneOf1X4727faa8Matches,
    InlineAgentsReposTasksPostResponse201JsonArtifactsItemDataOneOf2X637c4919Matches = InlineAgentsReposTasksPostResponse201JsonArtifactsItemDataOneOf2X637c4919Matches,
    rawEmpty = rawEmpty,
    failures = buildList {
      if (!InlineAgentsReposTasksPostResponse201JsonArtifactsItemDataOneOf1X4727faa8Matches) add("InlineAgentsReposTasksPostResponse201JsonArtifactsItemDataOneOf1X4727faa8: branch predicate did not match properties 'id'")
      if (!InlineAgentsReposTasksPostResponse201JsonArtifactsItemDataOneOf2X637c4919Matches) add("InlineAgentsReposTasksPostResponse201JsonArtifactsItemDataOneOf2X637c4919: branch predicate did not match properties 'base_ref' and 'head_ref'")
    },
  )
}

private fun JsonObject.stringValue(name: String): String? {
  val primitive = this[name] as? JsonPrimitive ?: return null
  return primitive.takeIf { it.isString }?.content
}
