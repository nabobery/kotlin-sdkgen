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

public enum class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUpiX1e35b977Branch {
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUpiAnyOf1Xc57425b0,
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUpiAnyOf2X6296e762,
}

public sealed class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUpiX1e35b977DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUpiX1e35b977NoMatchException(
  message: String,
) : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUpiX1e35b977DecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUpiX1e35b977Inspection(
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUpiAnyOf1Xc57425b0:
      Boolean,
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUpiAnyOf2X6296e762:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUpiAnyOf1Xc57425b0, matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUpiAnyOf2X6296e762).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/upi.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/upi
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUpiX1e35b977.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUpiX1e35b977 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUpiX1e35b977Inspection,
) {
  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUpiAnyOf1Xc57425b0:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUpiAnyOf1Xc57425b0? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUpiAnyOf1Xc57425b0) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUpiAnyOf1Xc57425b0>(raw) else null }

  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUpiAnyOf2X6296e762:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUpiAnyOf2X6296e762? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUpiAnyOf2X6296e762) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUpiAnyOf2X6296e762>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUpiX1e35b977Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUpiAnyOf1Xc57425b0) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUpiX1e35b977Branch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUpiAnyOf1Xc57425b0)
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUpiAnyOf2X6296e762) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUpiX1e35b977Branch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUpiAnyOf2X6296e762)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUpiX1e35b977 {
      val inspection = inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUpiX1e35b977(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUpiX1e35b977NoMatchException("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUpiX1e35b977 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUpiX1e35b977(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUpiX1e35b977> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUpiX1e35b977 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUpiX1e35b977")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUpiX1e35b977) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUpiX1e35b977").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUpiX1e35b977(element: JsonElement): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUpiX1e35b977Inspection {
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUpiAnyOf1Xc57425b0 = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUpiAnyOf1Xc57425b0>()
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUpiAnyOf2X6296e762 = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUpiAnyOf2X6296e762>()
  return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUpiX1e35b977Inspection(
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUpiAnyOf1Xc57425b0 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUpiAnyOf1Xc57425b0,
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUpiAnyOf2X6296e762 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUpiAnyOf2X6296e762,
    failures = buildList {
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUpiAnyOf1Xc57425b0) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUpiAnyOf1Xc57425b0: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUpiAnyOf1Xc57425b0")
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUpiAnyOf2X6296e762) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUpiAnyOf2X6296e762: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUpiAnyOf2X6296e762")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
