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

public enum class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAcssDebitXbdbb2dd9Branch {
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xccdf0f83,
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X1e85a389,
}

public sealed class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAcssDebitXbdbb2dd9DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAcssDebitXbdbb2dd9NoMatchException(
  message: String,
) : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAcssDebitXbdbb2dd9DecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAcssDebitXbdbb2dd9Inspection(
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xccdf0f83:
      Boolean,
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X1e85a389:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xccdf0f83, matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X1e85a389).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/acss_debit.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/acss_debit
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAcssDebitXbdbb2dd9.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAcssDebitXbdbb2dd9 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAcssDebitXbdbb2dd9Inspection,
) {
  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xccdf0f83:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xccdf0f83? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xccdf0f83) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xccdf0f83>(raw) else null }

  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X1e85a389:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X1e85a389? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X1e85a389) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X1e85a389>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAcssDebitXbdbb2dd9Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xccdf0f83) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAcssDebitXbdbb2dd9Branch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xccdf0f83)
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X1e85a389) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAcssDebitXbdbb2dd9Branch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X1e85a389)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAcssDebitXbdbb2dd9 {
      val inspection = inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAcssDebitXbdbb2dd9(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAcssDebitXbdbb2dd9NoMatchException("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAcssDebitXbdbb2dd9 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAcssDebitXbdbb2dd9(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAcssDebitXbdbb2dd9> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAcssDebitXbdbb2dd9 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAcssDebitXbdbb2dd9")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAcssDebitXbdbb2dd9) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAcssDebitXbdbb2dd9").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAcssDebitXbdbb2dd9(element: JsonElement): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAcssDebitXbdbb2dd9Inspection {
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xccdf0f83 = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xccdf0f83>()
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X1e85a389 = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X1e85a389>()
  return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAcssDebitXbdbb2dd9Inspection(
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xccdf0f83 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xccdf0f83,
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X1e85a389 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X1e85a389,
    failures = buildList {
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xccdf0f83) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xccdf0f83: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xccdf0f83")
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X1e85a389) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X1e85a389: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X1e85a389")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
