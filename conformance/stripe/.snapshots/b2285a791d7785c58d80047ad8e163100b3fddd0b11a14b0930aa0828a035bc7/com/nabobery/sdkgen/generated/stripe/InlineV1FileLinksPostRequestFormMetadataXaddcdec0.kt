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

public enum class InlineV1FileLinksPostRequestFormMetadataXaddcdec0Branch {
  Branch1,
  InlineV1FileLinksPostRequestFormMetadataAnyOf2X44894b18,
}

public sealed class InlineV1FileLinksPostRequestFormMetadataXaddcdec0DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1FileLinksPostRequestFormMetadataXaddcdec0NoMatchException(
  message: String,
) : InlineV1FileLinksPostRequestFormMetadataXaddcdec0DecodingException(message)

internal data class InlineV1FileLinksPostRequestFormMetadataXaddcdec0Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1FileLinksPostRequestFormMetadataAnyOf2X44894b18: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1FileLinksPostRequestFormMetadataAnyOf2X44894b18).count { it }
}

/**
 * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
 * for storing additional information about the object in a structured format. Individual keys can be unset by posting
 * an empty value to them. All keys can be unset by posting an empty value to `metadata`.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1file_links/post/requestBody/content/application~1x-www-form-urlencoded/sche
 * ma/properties/metadata
 */
@Serializable(with = InlineV1FileLinksPostRequestFormMetadataXaddcdec0.Serializer::class)
public class InlineV1FileLinksPostRequestFormMetadataXaddcdec0 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1FileLinksPostRequestFormMetadataXaddcdec0Inspection,
) {
  public val branch1: JsonObject? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<JsonObject>(raw) else null }

  public val inlineV1FileLinksPostRequestFormMetadataAnyOf2X44894b18:
      InlineV1FileLinksPostRequestFormMetadataAnyOf2X44894b18? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1FileLinksPostRequestFormMetadataAnyOf2X44894b18) json.decodeFromJsonElement<InlineV1FileLinksPostRequestFormMetadataAnyOf2X44894b18>(raw) else null }

  public val matchedBranches: Set<InlineV1FileLinksPostRequestFormMetadataXaddcdec0Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1FileLinksPostRequestFormMetadataXaddcdec0Branch.Branch1)
      if (inspection.matchesInlineV1FileLinksPostRequestFormMetadataAnyOf2X44894b18) add(InlineV1FileLinksPostRequestFormMetadataXaddcdec0Branch.InlineV1FileLinksPostRequestFormMetadataAnyOf2X44894b18)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1FileLinksPostRequestFormMetadataXaddcdec0 {
      val inspection = inspectInlineV1FileLinksPostRequestFormMetadataXaddcdec0(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1FileLinksPostRequestFormMetadataXaddcdec0NoMatchException("InlineV1FileLinksPostRequestFormMetadataXaddcdec0 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1FileLinksPostRequestFormMetadataXaddcdec0(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1FileLinksPostRequestFormMetadataXaddcdec0> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1FileLinksPostRequestFormMetadataXaddcdec0 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1FileLinksPostRequestFormMetadataXaddcdec0")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1FileLinksPostRequestFormMetadataXaddcdec0) {
      encoder.requireJsonEncoder("InlineV1FileLinksPostRequestFormMetadataXaddcdec0").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1FileLinksPostRequestFormMetadataXaddcdec0(element: JsonElement): InlineV1FileLinksPostRequestFormMetadataXaddcdec0Inspection {
  val matchesBranch1 = element.isJsonDecodable<JsonObject>()
  val matchesInlineV1FileLinksPostRequestFormMetadataAnyOf2X44894b18 = element.isJsonDecodable<InlineV1FileLinksPostRequestFormMetadataAnyOf2X44894b18>()
  return InlineV1FileLinksPostRequestFormMetadataXaddcdec0Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1FileLinksPostRequestFormMetadataAnyOf2X44894b18 = matchesInlineV1FileLinksPostRequestFormMetadataAnyOf2X44894b18,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match JsonObject")
      if (!matchesInlineV1FileLinksPostRequestFormMetadataAnyOf2X44894b18) add("InlineV1FileLinksPostRequestFormMetadataAnyOf2X44894b18: value does not match InlineV1FileLinksPostRequestFormMetadataAnyOf2X44894b18")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
