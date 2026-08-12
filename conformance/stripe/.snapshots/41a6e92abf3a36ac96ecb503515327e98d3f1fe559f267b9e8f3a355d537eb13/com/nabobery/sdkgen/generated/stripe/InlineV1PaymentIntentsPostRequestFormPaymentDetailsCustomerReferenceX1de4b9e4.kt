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

public enum class InlineV1PaymentIntentsPostRequestFormPaymentDetailsCustomerReferenceX1de4b9e4Branch {
  Branch1,
  InlineV1PaymentIntentsPostRequestFormPaymentDetailsAnyOf1AnyOf2Xbb319dfb,
}

public sealed class InlineV1PaymentIntentsPostRequestFormPaymentDetailsCustomerReferenceX1de4b9e4DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormPaymentDetailsCustomerReferenceX1de4b9e4NoMatchException(
  message: String,
) : InlineV1PaymentIntentsPostRequestFormPaymentDetailsCustomerReferenceX1de4b9e4DecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormPaymentDetailsCustomerReferenceX1de4b9e4Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentDetailsAnyOf1AnyOf2Xbb319dfb:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1PaymentIntentsPostRequestFormPaymentDetailsAnyOf1AnyOf2Xbb319dfb).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_details/anyOf/0/properties/customer_reference.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_details/anyOf/0/properties/customer_reference
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentDetailsCustomerReferenceX1de4b9e4.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentDetailsCustomerReferenceX1de4b9e4 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentIntentsPostRequestFormPaymentDetailsCustomerReferenceX1de4b9e4Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1PaymentIntentsPostRequestFormPaymentDetailsAnyOf1AnyOf2Xbb319dfb:
      InlineV1PaymentIntentsPostRequestFormPaymentDetailsAnyOf1AnyOf2Xbb319dfb? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentDetailsAnyOf1AnyOf2Xbb319dfb) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentDetailsAnyOf1AnyOf2Xbb319dfb>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsPostRequestFormPaymentDetailsCustomerReferenceX1de4b9e4Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1PaymentIntentsPostRequestFormPaymentDetailsCustomerReferenceX1de4b9e4Branch.Branch1)
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentDetailsAnyOf1AnyOf2Xbb319dfb) add(InlineV1PaymentIntentsPostRequestFormPaymentDetailsCustomerReferenceX1de4b9e4Branch.InlineV1PaymentIntentsPostRequestFormPaymentDetailsAnyOf1AnyOf2Xbb319dfb)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsPostRequestFormPaymentDetailsCustomerReferenceX1de4b9e4 {
      val inspection = inspectInlineV1PaymentIntentsPostRequestFormPaymentDetailsCustomerReferenceX1de4b9e4(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsPostRequestFormPaymentDetailsCustomerReferenceX1de4b9e4NoMatchException("InlineV1PaymentIntentsPostRequestFormPaymentDetailsCustomerReferenceX1de4b9e4 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsPostRequestFormPaymentDetailsCustomerReferenceX1de4b9e4(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentDetailsCustomerReferenceX1de4b9e4> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentDetailsCustomerReferenceX1de4b9e4 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormPaymentDetailsCustomerReferenceX1de4b9e4")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentDetailsCustomerReferenceX1de4b9e4) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormPaymentDetailsCustomerReferenceX1de4b9e4").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormPaymentDetailsCustomerReferenceX1de4b9e4(element: JsonElement): InlineV1PaymentIntentsPostRequestFormPaymentDetailsCustomerReferenceX1de4b9e4Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentDetailsAnyOf1AnyOf2Xbb319dfb = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentDetailsAnyOf1AnyOf2Xbb319dfb>()
  return InlineV1PaymentIntentsPostRequestFormPaymentDetailsCustomerReferenceX1de4b9e4Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1PaymentIntentsPostRequestFormPaymentDetailsAnyOf1AnyOf2Xbb319dfb = matchesInlineV1PaymentIntentsPostRequestFormPaymentDetailsAnyOf1AnyOf2Xbb319dfb,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentDetailsAnyOf1AnyOf2Xbb319dfb) add("InlineV1PaymentIntentsPostRequestFormPaymentDetailsAnyOf1AnyOf2Xbb319dfb: value does not match InlineV1PaymentIntentsPostRequestFormPaymentDetailsAnyOf1AnyOf2Xbb319dfb")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
