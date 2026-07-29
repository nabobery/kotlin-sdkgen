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
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineV1PaymentIntentsPostRequestFormPaymentDetailsOrderReferenceXfaa35622Branch {
  Branch1,
  InlineV1PaymentIntentsPostRequestFormPaymentDetailsOrderReferenceAnyOf2Xbe8c4b02,
}

public sealed class InlineV1PaymentIntentsPostRequestFormPaymentDetailsOrderReferenceXfaa35622DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormPaymentDetailsOrderReferenceXfaa35622NoMatchException(
  message: String,
) : InlineV1PaymentIntentsPostRequestFormPaymentDetailsOrderReferenceXfaa35622DecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormPaymentDetailsOrderReferenceXfaa35622Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentDetailsOrderReferenceAnyOf2Xbe8c4b02:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1PaymentIntentsPostRequestFormPaymentDetailsOrderReferenceAnyOf2Xbe8c4b02).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_details/properties/order_reference.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_details/properties/order_reference
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentDetailsOrderReferenceXfaa35622.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentDetailsOrderReferenceXfaa35622 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentIntentsPostRequestFormPaymentDetailsOrderReferenceXfaa35622Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1PaymentIntentsPostRequestFormPaymentDetailsOrderReferenceAnyOf2Xbe8c4b02:
      InlineV1PaymentIntentsPostRequestFormPaymentDetailsOrderReferenceAnyOf2Xbe8c4b02? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentDetailsOrderReferenceAnyOf2Xbe8c4b02) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentDetailsOrderReferenceAnyOf2Xbe8c4b02>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsPostRequestFormPaymentDetailsOrderReferenceXfaa35622Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1PaymentIntentsPostRequestFormPaymentDetailsOrderReferenceXfaa35622Branch.Branch1)
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentDetailsOrderReferenceAnyOf2Xbe8c4b02) add(InlineV1PaymentIntentsPostRequestFormPaymentDetailsOrderReferenceXfaa35622Branch.InlineV1PaymentIntentsPostRequestFormPaymentDetailsOrderReferenceAnyOf2Xbe8c4b02)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsPostRequestFormPaymentDetailsOrderReferenceXfaa35622 {
      val inspection = inspectInlineV1PaymentIntentsPostRequestFormPaymentDetailsOrderReferenceXfaa35622(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsPostRequestFormPaymentDetailsOrderReferenceXfaa35622NoMatchException("InlineV1PaymentIntentsPostRequestFormPaymentDetailsOrderReferenceXfaa35622 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsPostRequestFormPaymentDetailsOrderReferenceXfaa35622(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentDetailsOrderReferenceXfaa35622> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentDetailsOrderReferenceXfaa35622 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormPaymentDetailsOrderReferenceXfaa35622")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentDetailsOrderReferenceXfaa35622) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormPaymentDetailsOrderReferenceXfaa35622").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormPaymentDetailsOrderReferenceXfaa35622(element: JsonElement): InlineV1PaymentIntentsPostRequestFormPaymentDetailsOrderReferenceXfaa35622Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentDetailsOrderReferenceAnyOf2Xbe8c4b02 = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentDetailsOrderReferenceAnyOf2Xbe8c4b02>()
  return InlineV1PaymentIntentsPostRequestFormPaymentDetailsOrderReferenceXfaa35622Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1PaymentIntentsPostRequestFormPaymentDetailsOrderReferenceAnyOf2Xbe8c4b02 = matchesInlineV1PaymentIntentsPostRequestFormPaymentDetailsOrderReferenceAnyOf2Xbe8c4b02,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentDetailsOrderReferenceAnyOf2Xbe8c4b02) add("InlineV1PaymentIntentsPostRequestFormPaymentDetailsOrderReferenceAnyOf2Xbe8c4b02: value does not match InlineV1PaymentIntentsPostRequestFormPaymentDetailsOrderReferenceAnyOf2Xbe8c4b02")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
