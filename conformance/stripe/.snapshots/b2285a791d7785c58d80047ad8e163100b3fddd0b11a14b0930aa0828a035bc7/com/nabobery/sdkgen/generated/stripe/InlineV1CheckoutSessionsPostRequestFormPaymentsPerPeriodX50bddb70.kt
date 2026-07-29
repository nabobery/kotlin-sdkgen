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

public enum class InlineV1CheckoutSessionsPostRequestFormPaymentsPerPeriodX50bddb70Branch {
  Branch1,
  InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X2b715b1f,
}

public sealed class InlineV1CheckoutSessionsPostRequestFormPaymentsPerPeriodX50bddb70DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1CheckoutSessionsPostRequestFormPaymentsPerPeriodX50bddb70NoMatchException(
  message: String,
) : InlineV1CheckoutSessionsPostRequestFormPaymentsPerPeriodX50bddb70DecodingException(message)

internal data class InlineV1CheckoutSessionsPostRequestFormPaymentsPerPeriodX50bddb70Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X2b715b1f:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X2b715b1f).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/payment_method_options/properties/payto/properties/mandate_options/properties/payments_per_peri
 * od.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/payment_method_options/properties/payto/properties/mandate_options/properties/payments_per_peri
 * od
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormPaymentsPerPeriodX50bddb70.Serializer::class)
public class InlineV1CheckoutSessionsPostRequestFormPaymentsPerPeriodX50bddb70 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1CheckoutSessionsPostRequestFormPaymentsPerPeriodX50bddb70Inspection,
) {
  public val branch1: Int? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<Int>(raw) else null }

  public val inlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X2b715b1f:
      InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X2b715b1f? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X2b715b1f) json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X2b715b1f>(raw) else null }

  public val matchedBranches:
      Set<InlineV1CheckoutSessionsPostRequestFormPaymentsPerPeriodX50bddb70Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1CheckoutSessionsPostRequestFormPaymentsPerPeriodX50bddb70Branch.Branch1)
      if (inspection.matchesInlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X2b715b1f) add(InlineV1CheckoutSessionsPostRequestFormPaymentsPerPeriodX50bddb70Branch.InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X2b715b1f)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1CheckoutSessionsPostRequestFormPaymentsPerPeriodX50bddb70 {
      val inspection = inspectInlineV1CheckoutSessionsPostRequestFormPaymentsPerPeriodX50bddb70(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1CheckoutSessionsPostRequestFormPaymentsPerPeriodX50bddb70NoMatchException("InlineV1CheckoutSessionsPostRequestFormPaymentsPerPeriodX50bddb70 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1CheckoutSessionsPostRequestFormPaymentsPerPeriodX50bddb70(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormPaymentsPerPeriodX50bddb70> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CheckoutSessionsPostRequestFormPaymentsPerPeriodX50bddb70 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CheckoutSessionsPostRequestFormPaymentsPerPeriodX50bddb70")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CheckoutSessionsPostRequestFormPaymentsPerPeriodX50bddb70) {
      encoder.requireJsonEncoder("InlineV1CheckoutSessionsPostRequestFormPaymentsPerPeriodX50bddb70").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1CheckoutSessionsPostRequestFormPaymentsPerPeriodX50bddb70(element: JsonElement): InlineV1CheckoutSessionsPostRequestFormPaymentsPerPeriodX50bddb70Inspection {
  val matchesBranch1 = element.isJsonDecodable<Int>()
  val matchesInlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X2b715b1f = element.isJsonDecodable<InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X2b715b1f>()
  return InlineV1CheckoutSessionsPostRequestFormPaymentsPerPeriodX50bddb70Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X2b715b1f = matchesInlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X2b715b1f,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match Int")
      if (!matchesInlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X2b715b1f) add("InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X2b715b1f: value does not match InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X2b715b1f")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
