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

public enum class InlineV1PaymentLinksPostRequestFormPaymentIntentDataMetadataXdafaa550Branch {
  Branch1,
  InlineV1PaymentLinksPostRequestFormPaymentIntentDataMetadataAnyOf2Xcf10fe0d,
}

public sealed class InlineV1PaymentLinksPostRequestFormPaymentIntentDataMetadataXdafaa550DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentLinksPostRequestFormPaymentIntentDataMetadataXdafaa550NoMatchException(
  message: String,
) : InlineV1PaymentLinksPostRequestFormPaymentIntentDataMetadataXdafaa550DecodingException(message)

internal data class InlineV1PaymentLinksPostRequestFormPaymentIntentDataMetadataXdafaa550Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1PaymentLinksPostRequestFormPaymentIntentDataMetadataAnyOf2Xcf10fe0d:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1PaymentLinksPostRequestFormPaymentIntentDataMetadataAnyOf2Xcf10fe0d).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links~1{payment_link}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/payment_intent_data/properties/metadata.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links~1{payment_link}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/payment_intent_data/properties/metadata
 */
@Serializable(with = InlineV1PaymentLinksPostRequestFormPaymentIntentDataMetadataXdafaa550.Serializer::class)
public class InlineV1PaymentLinksPostRequestFormPaymentIntentDataMetadataXdafaa550 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentLinksPostRequestFormPaymentIntentDataMetadataXdafaa550Inspection,
) {
  public val branch1: JsonObject? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<JsonObject>(raw) else null }

  public val inlineV1PaymentLinksPostRequestFormPaymentIntentDataMetadataAnyOf2Xcf10fe0d:
      InlineV1PaymentLinksPostRequestFormPaymentIntentDataMetadataAnyOf2Xcf10fe0d? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentLinksPostRequestFormPaymentIntentDataMetadataAnyOf2Xcf10fe0d) json.decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormPaymentIntentDataMetadataAnyOf2Xcf10fe0d>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentLinksPostRequestFormPaymentIntentDataMetadataXdafaa550Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1PaymentLinksPostRequestFormPaymentIntentDataMetadataXdafaa550Branch.Branch1)
      if (inspection.matchesInlineV1PaymentLinksPostRequestFormPaymentIntentDataMetadataAnyOf2Xcf10fe0d) add(InlineV1PaymentLinksPostRequestFormPaymentIntentDataMetadataXdafaa550Branch.InlineV1PaymentLinksPostRequestFormPaymentIntentDataMetadataAnyOf2Xcf10fe0d)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentLinksPostRequestFormPaymentIntentDataMetadataXdafaa550 {
      val inspection = inspectInlineV1PaymentLinksPostRequestFormPaymentIntentDataMetadataXdafaa550(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentLinksPostRequestFormPaymentIntentDataMetadataXdafaa550NoMatchException("InlineV1PaymentLinksPostRequestFormPaymentIntentDataMetadataXdafaa550 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentLinksPostRequestFormPaymentIntentDataMetadataXdafaa550(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1PaymentLinksPostRequestFormPaymentIntentDataMetadataXdafaa550> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentLinksPostRequestFormPaymentIntentDataMetadataXdafaa550 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentLinksPostRequestFormPaymentIntentDataMetadataXdafaa550")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentLinksPostRequestFormPaymentIntentDataMetadataXdafaa550) {
      encoder.requireJsonEncoder("InlineV1PaymentLinksPostRequestFormPaymentIntentDataMetadataXdafaa550").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentLinksPostRequestFormPaymentIntentDataMetadataXdafaa550(element: JsonElement): InlineV1PaymentLinksPostRequestFormPaymentIntentDataMetadataXdafaa550Inspection {
  val matchesBranch1 = element.isJsonDecodable<JsonObject>()
  val matchesInlineV1PaymentLinksPostRequestFormPaymentIntentDataMetadataAnyOf2Xcf10fe0d = element.isJsonDecodable<InlineV1PaymentLinksPostRequestFormPaymentIntentDataMetadataAnyOf2Xcf10fe0d>()
  return InlineV1PaymentLinksPostRequestFormPaymentIntentDataMetadataXdafaa550Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1PaymentLinksPostRequestFormPaymentIntentDataMetadataAnyOf2Xcf10fe0d = matchesInlineV1PaymentLinksPostRequestFormPaymentIntentDataMetadataAnyOf2Xcf10fe0d,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match JsonObject")
      if (!matchesInlineV1PaymentLinksPostRequestFormPaymentIntentDataMetadataAnyOf2Xcf10fe0d) add("InlineV1PaymentLinksPostRequestFormPaymentIntentDataMetadataAnyOf2Xcf10fe0d: value does not match InlineV1PaymentLinksPostRequestFormPaymentIntentDataMetadataAnyOf2Xcf10fe0d")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
