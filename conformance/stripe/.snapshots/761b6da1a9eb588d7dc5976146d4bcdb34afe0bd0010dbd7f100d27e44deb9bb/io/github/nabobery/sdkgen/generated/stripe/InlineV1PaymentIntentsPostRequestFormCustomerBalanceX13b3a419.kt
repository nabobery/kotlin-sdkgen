package io.github.nabobery.sdkgen.generated.stripe

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

public enum class InlineV1PaymentIntentsPostRequestFormCustomerBalanceX13b3a419Branch {
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xa5c20ba4,
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X072a487c,
}

public sealed class InlineV1PaymentIntentsPostRequestFormCustomerBalanceX13b3a419DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormCustomerBalanceX13b3a419NoMatchException(
  message: String,
) : InlineV1PaymentIntentsPostRequestFormCustomerBalanceX13b3a419DecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormCustomerBalanceX13b3a419Inspection(
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xa5c20ba4:
      Boolean,
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X072a487c:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xa5c20ba4, matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X072a487c).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/customer_balance.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/customer_balance
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormCustomerBalanceX13b3a419.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormCustomerBalanceX13b3a419 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1PaymentIntentsPostRequestFormCustomerBalanceX13b3a419Inspection,
) {
  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xa5c20ba4:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xa5c20ba4? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xa5c20ba4) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xa5c20ba4>(raw) else null }

  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X072a487c:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X072a487c? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X072a487c) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X072a487c>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsPostRequestFormCustomerBalanceX13b3a419Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xa5c20ba4) add(InlineV1PaymentIntentsPostRequestFormCustomerBalanceX13b3a419Branch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xa5c20ba4)
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X072a487c) add(InlineV1PaymentIntentsPostRequestFormCustomerBalanceX13b3a419Branch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X072a487c)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsPostRequestFormCustomerBalanceX13b3a419 {
      val inspection = inspectInlineV1PaymentIntentsPostRequestFormCustomerBalanceX13b3a419(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsPostRequestFormCustomerBalanceX13b3a419NoMatchException("InlineV1PaymentIntentsPostRequestFormCustomerBalanceX13b3a419 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsPostRequestFormCustomerBalanceX13b3a419(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormCustomerBalanceX13b3a419> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormCustomerBalanceX13b3a419 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormCustomerBalanceX13b3a419")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormCustomerBalanceX13b3a419) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormCustomerBalanceX13b3a419").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormCustomerBalanceX13b3a419(element: JsonElement): InlineV1PaymentIntentsPostRequestFormCustomerBalanceX13b3a419Inspection {
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xa5c20ba4 = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xa5c20ba4>()
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X072a487c = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X072a487c>()
  return InlineV1PaymentIntentsPostRequestFormCustomerBalanceX13b3a419Inspection(
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xa5c20ba4 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xa5c20ba4,
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X072a487c = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X072a487c,
    failures = buildList {
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xa5c20ba4) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xa5c20ba4: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xa5c20ba4")
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X072a487c) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X072a487c: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X072a487c")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
