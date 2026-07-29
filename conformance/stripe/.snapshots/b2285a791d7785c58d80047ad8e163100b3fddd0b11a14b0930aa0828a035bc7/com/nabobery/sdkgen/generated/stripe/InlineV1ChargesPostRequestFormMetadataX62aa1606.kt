package com.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Set
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineV1ChargesPostRequestFormMetadataX62aa1606Branch {
  Branch1,
  InlineV1ChargesPostRequestFormMetadataAnyOf2X7b3438b8,
}

public sealed class InlineV1ChargesPostRequestFormMetadataX62aa1606DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1ChargesPostRequestFormMetadataX62aa1606NoMatchException(
  message: String,
) : InlineV1ChargesPostRequestFormMetadataX62aa1606DecodingException(message)

internal data class InlineV1ChargesPostRequestFormMetadataX62aa1606Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1ChargesPostRequestFormMetadataAnyOf2X7b3438b8: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1ChargesPostRequestFormMetadataAnyOf2X7b3438b8).count { it }
}

/**
 * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
 * for storing additional information about the object in a structured format. Individual keys can be unset by posting
 * an empty value to them. All keys can be unset by posting an empty value to `metadata`.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1charges/post/requestBody/content/application~1x-www-form-urlencoded/schema/
 * properties/metadata
 */
@Serializable(with = InlineV1ChargesPostRequestFormMetadataX62aa1606.Serializer::class)
public class InlineV1ChargesPostRequestFormMetadataX62aa1606 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1ChargesPostRequestFormMetadataX62aa1606Inspection,
) {
  public val branch1: JsonObject? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<JsonObject>(raw) else null }

  public val inlineV1ChargesPostRequestFormMetadataAnyOf2X7b3438b8:
      InlineV1ChargesPostRequestFormMetadataAnyOf2X7b3438b8? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1ChargesPostRequestFormMetadataAnyOf2X7b3438b8) json.decodeFromJsonElement<InlineV1ChargesPostRequestFormMetadataAnyOf2X7b3438b8>(raw) else null }

  public val matchedBranches: Set<InlineV1ChargesPostRequestFormMetadataX62aa1606Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1ChargesPostRequestFormMetadataX62aa1606Branch.Branch1)
      if (inspection.matchesInlineV1ChargesPostRequestFormMetadataAnyOf2X7b3438b8) add(InlineV1ChargesPostRequestFormMetadataX62aa1606Branch.InlineV1ChargesPostRequestFormMetadataAnyOf2X7b3438b8)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1ChargesPostRequestFormMetadataX62aa1606 {
      val inspection = inspectInlineV1ChargesPostRequestFormMetadataX62aa1606(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1ChargesPostRequestFormMetadataX62aa1606NoMatchException("InlineV1ChargesPostRequestFormMetadataX62aa1606 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1ChargesPostRequestFormMetadataX62aa1606(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1ChargesPostRequestFormMetadataX62aa1606> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1ChargesPostRequestFormMetadataX62aa1606 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1ChargesPostRequestFormMetadataX62aa1606")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1ChargesPostRequestFormMetadataX62aa1606) {
      encoder.requireJsonEncoder("InlineV1ChargesPostRequestFormMetadataX62aa1606").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1ChargesPostRequestFormMetadataX62aa1606(element: JsonElement): InlineV1ChargesPostRequestFormMetadataX62aa1606Inspection {
  val matchesBranch1 = element.isJsonDecodable<JsonObject>()
  val matchesInlineV1ChargesPostRequestFormMetadataAnyOf2X7b3438b8 = element.isJsonDecodable<InlineV1ChargesPostRequestFormMetadataAnyOf2X7b3438b8>()
  return InlineV1ChargesPostRequestFormMetadataX62aa1606Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1ChargesPostRequestFormMetadataAnyOf2X7b3438b8 = matchesInlineV1ChargesPostRequestFormMetadataAnyOf2X7b3438b8,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match JsonObject")
      if (!matchesInlineV1ChargesPostRequestFormMetadataAnyOf2X7b3438b8) add("InlineV1ChargesPostRequestFormMetadataAnyOf2X7b3438b8: value does not match InlineV1ChargesPostRequestFormMetadataAnyOf2X7b3438b8")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
