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

public enum class InlineV1CustomersSourcesPostRequestFormMetadataX22211fb4Branch {
  Branch1,
  InlineV1CustomersSourcesPostRequestFormMetadataAnyOf2X2fb79299,
}

public sealed class InlineV1CustomersSourcesPostRequestFormMetadataX22211fb4DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1CustomersSourcesPostRequestFormMetadataX22211fb4NoMatchException(
  message: String,
) : InlineV1CustomersSourcesPostRequestFormMetadataX22211fb4DecodingException(message)

internal data class InlineV1CustomersSourcesPostRequestFormMetadataX22211fb4Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1CustomersSourcesPostRequestFormMetadataAnyOf2X2fb79299: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1CustomersSourcesPostRequestFormMetadataAnyOf2X2fb79299).count { it }
}

/**
 * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
 * for storing additional information about the object in a structured format. Individual keys can be unset by posting
 * an empty value to them. All keys can be unset by posting an empty value to `metadata`.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1sources~1{id}/post/requestBody/content/application~1
 * x-www-form-urlencoded/schema/properties/metadata
 */
@Serializable(with = InlineV1CustomersSourcesPostRequestFormMetadataX22211fb4.Serializer::class)
public class InlineV1CustomersSourcesPostRequestFormMetadataX22211fb4 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1CustomersSourcesPostRequestFormMetadataX22211fb4Inspection,
) {
  public val branch1: JsonObject? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<JsonObject>(raw) else null }

  public val inlineV1CustomersSourcesPostRequestFormMetadataAnyOf2X2fb79299:
      InlineV1CustomersSourcesPostRequestFormMetadataAnyOf2X2fb79299? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1CustomersSourcesPostRequestFormMetadataAnyOf2X2fb79299) json.decodeFromJsonElement<InlineV1CustomersSourcesPostRequestFormMetadataAnyOf2X2fb79299>(raw) else null }

  public val matchedBranches: Set<InlineV1CustomersSourcesPostRequestFormMetadataX22211fb4Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1CustomersSourcesPostRequestFormMetadataX22211fb4Branch.Branch1)
      if (inspection.matchesInlineV1CustomersSourcesPostRequestFormMetadataAnyOf2X2fb79299) add(InlineV1CustomersSourcesPostRequestFormMetadataX22211fb4Branch.InlineV1CustomersSourcesPostRequestFormMetadataAnyOf2X2fb79299)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1CustomersSourcesPostRequestFormMetadataX22211fb4 {
      val inspection = inspectInlineV1CustomersSourcesPostRequestFormMetadataX22211fb4(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1CustomersSourcesPostRequestFormMetadataX22211fb4NoMatchException("InlineV1CustomersSourcesPostRequestFormMetadataX22211fb4 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1CustomersSourcesPostRequestFormMetadataX22211fb4(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1CustomersSourcesPostRequestFormMetadataX22211fb4> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CustomersSourcesPostRequestFormMetadataX22211fb4 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CustomersSourcesPostRequestFormMetadataX22211fb4")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersSourcesPostRequestFormMetadataX22211fb4) {
      encoder.requireJsonEncoder("InlineV1CustomersSourcesPostRequestFormMetadataX22211fb4").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1CustomersSourcesPostRequestFormMetadataX22211fb4(element: JsonElement): InlineV1CustomersSourcesPostRequestFormMetadataX22211fb4Inspection {
  val matchesBranch1 = element.isJsonDecodable<JsonObject>()
  val matchesInlineV1CustomersSourcesPostRequestFormMetadataAnyOf2X2fb79299 = element.isJsonDecodable<InlineV1CustomersSourcesPostRequestFormMetadataAnyOf2X2fb79299>()
  return InlineV1CustomersSourcesPostRequestFormMetadataX22211fb4Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1CustomersSourcesPostRequestFormMetadataAnyOf2X2fb79299 = matchesInlineV1CustomersSourcesPostRequestFormMetadataAnyOf2X2fb79299,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match JsonObject")
      if (!matchesInlineV1CustomersSourcesPostRequestFormMetadataAnyOf2X2fb79299) add("InlineV1CustomersSourcesPostRequestFormMetadataAnyOf2X2fb79299: value does not match InlineV1CustomersSourcesPostRequestFormMetadataAnyOf2X2fb79299")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
