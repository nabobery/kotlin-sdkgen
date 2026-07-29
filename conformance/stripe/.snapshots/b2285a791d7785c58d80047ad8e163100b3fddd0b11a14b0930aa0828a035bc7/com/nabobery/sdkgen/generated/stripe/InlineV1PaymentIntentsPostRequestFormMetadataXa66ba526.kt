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

public enum class InlineV1PaymentIntentsPostRequestFormMetadataXa66ba526Branch {
  Branch1,
  InlineV1PaymentIntentsPostRequestFormMetadataAnyOf2Xad479630,
}

public sealed class InlineV1PaymentIntentsPostRequestFormMetadataXa66ba526DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormMetadataXa66ba526NoMatchException(
  message: String,
) : InlineV1PaymentIntentsPostRequestFormMetadataXa66ba526DecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormMetadataXa66ba526Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1PaymentIntentsPostRequestFormMetadataAnyOf2Xad479630: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1PaymentIntentsPostRequestFormMetadataAnyOf2Xad479630).count { it }
}

/**
 * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
 * for storing additional information about the object in a structured format. Individual keys can be unset by posting
 * an empty value to them. All keys can be unset by posting an empty value to `metadata`.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/metadata
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormMetadataXa66ba526.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormMetadataXa66ba526 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1PaymentIntentsPostRequestFormMetadataXa66ba526Inspection,
) {
  public val branch1: JsonObject? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<JsonObject>(raw) else null }

  public val inlineV1PaymentIntentsPostRequestFormMetadataAnyOf2Xad479630:
      InlineV1PaymentIntentsPostRequestFormMetadataAnyOf2Xad479630? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormMetadataAnyOf2Xad479630) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormMetadataAnyOf2Xad479630>(raw) else null }

  public val matchedBranches: Set<InlineV1PaymentIntentsPostRequestFormMetadataXa66ba526Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1PaymentIntentsPostRequestFormMetadataXa66ba526Branch.Branch1)
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormMetadataAnyOf2Xad479630) add(InlineV1PaymentIntentsPostRequestFormMetadataXa66ba526Branch.InlineV1PaymentIntentsPostRequestFormMetadataAnyOf2Xad479630)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsPostRequestFormMetadataXa66ba526 {
      val inspection = inspectInlineV1PaymentIntentsPostRequestFormMetadataXa66ba526(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsPostRequestFormMetadataXa66ba526NoMatchException("InlineV1PaymentIntentsPostRequestFormMetadataXa66ba526 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsPostRequestFormMetadataXa66ba526(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormMetadataXa66ba526> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormMetadataXa66ba526 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormMetadataXa66ba526")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormMetadataXa66ba526) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormMetadataXa66ba526").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormMetadataXa66ba526(element: JsonElement): InlineV1PaymentIntentsPostRequestFormMetadataXa66ba526Inspection {
  val matchesBranch1 = element.isJsonDecodable<JsonObject>()
  val matchesInlineV1PaymentIntentsPostRequestFormMetadataAnyOf2Xad479630 = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormMetadataAnyOf2Xad479630>()
  return InlineV1PaymentIntentsPostRequestFormMetadataXa66ba526Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1PaymentIntentsPostRequestFormMetadataAnyOf2Xad479630 = matchesInlineV1PaymentIntentsPostRequestFormMetadataAnyOf2Xad479630,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match JsonObject")
      if (!matchesInlineV1PaymentIntentsPostRequestFormMetadataAnyOf2Xad479630) add("InlineV1PaymentIntentsPostRequestFormMetadataAnyOf2Xad479630: value does not match InlineV1PaymentIntentsPostRequestFormMetadataAnyOf2Xad479630")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
