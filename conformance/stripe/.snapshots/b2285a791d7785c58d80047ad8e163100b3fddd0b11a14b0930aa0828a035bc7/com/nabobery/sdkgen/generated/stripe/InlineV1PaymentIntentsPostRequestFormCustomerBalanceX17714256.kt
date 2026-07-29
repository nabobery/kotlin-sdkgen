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

public enum class InlineV1PaymentIntentsPostRequestFormCustomerBalanceX17714256Branch {
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X64bf8296,
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X0e8033fa,
}

public sealed class InlineV1PaymentIntentsPostRequestFormCustomerBalanceX17714256DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormCustomerBalanceX17714256NoMatchException(
  message: String,
) : InlineV1PaymentIntentsPostRequestFormCustomerBalanceX17714256DecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormCustomerBalanceX17714256Inspection(
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X64bf8296:
      Boolean,
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X0e8033fa:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X64bf8296, matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X0e8033fa).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/customer_balance.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/customer_balance
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormCustomerBalanceX17714256.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormCustomerBalanceX17714256 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1PaymentIntentsPostRequestFormCustomerBalanceX17714256Inspection,
) {
  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X64bf8296:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X64bf8296? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X64bf8296) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X64bf8296>(raw) else null }

  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X0e8033fa:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X0e8033fa? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X0e8033fa) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X0e8033fa>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsPostRequestFormCustomerBalanceX17714256Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X64bf8296) add(InlineV1PaymentIntentsPostRequestFormCustomerBalanceX17714256Branch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X64bf8296)
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X0e8033fa) add(InlineV1PaymentIntentsPostRequestFormCustomerBalanceX17714256Branch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X0e8033fa)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsPostRequestFormCustomerBalanceX17714256 {
      val inspection = inspectInlineV1PaymentIntentsPostRequestFormCustomerBalanceX17714256(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsPostRequestFormCustomerBalanceX17714256NoMatchException("InlineV1PaymentIntentsPostRequestFormCustomerBalanceX17714256 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsPostRequestFormCustomerBalanceX17714256(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormCustomerBalanceX17714256> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormCustomerBalanceX17714256 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormCustomerBalanceX17714256")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormCustomerBalanceX17714256) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormCustomerBalanceX17714256").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormCustomerBalanceX17714256(element: JsonElement): InlineV1PaymentIntentsPostRequestFormCustomerBalanceX17714256Inspection {
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X64bf8296 = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X64bf8296>()
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X0e8033fa = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X0e8033fa>()
  return InlineV1PaymentIntentsPostRequestFormCustomerBalanceX17714256Inspection(
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X64bf8296 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X64bf8296,
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X0e8033fa = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X0e8033fa,
    failures = buildList {
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X64bf8296) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X64bf8296: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X64bf8296")
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X0e8033fa) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X0e8033fa: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X0e8033fa")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
