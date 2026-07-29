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

public enum class InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaytoEndDateX40ffe715Branch {
  Branch1,
  InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X45e29bed,
}

public sealed class InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaytoEndDateX40ffe715DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaytoEndDateX40ffe715NoMatchException(
  message: String,
) : InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaytoEndDateX40ffe715DecodingException(message)

internal data class InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaytoEndDateX40ffe715Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X45e29bed:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X45e29bed).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/payment_method_options/properties/payto/properties/mandate_options/properties/end_date.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/payment_method_options/properties/payto/properties/mandate_options/properties/end_date
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaytoEndDateX40ffe715.Serializer::class)
public class InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaytoEndDateX40ffe715 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaytoEndDateX40ffe715Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X45e29bed:
      InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X45e29bed? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X45e29bed) json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X45e29bed>(raw) else null }

  public val matchedBranches:
      Set<InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaytoEndDateX40ffe715Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaytoEndDateX40ffe715Branch.Branch1)
      if (inspection.matchesInlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X45e29bed) add(InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaytoEndDateX40ffe715Branch.InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X45e29bed)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaytoEndDateX40ffe715 {
      val inspection = inspectInlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaytoEndDateX40ffe715(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaytoEndDateX40ffe715NoMatchException("InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaytoEndDateX40ffe715 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaytoEndDateX40ffe715(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaytoEndDateX40ffe715> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaytoEndDateX40ffe715 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaytoEndDateX40ffe715")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaytoEndDateX40ffe715) {
      encoder.requireJsonEncoder("InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaytoEndDateX40ffe715").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaytoEndDateX40ffe715(element: JsonElement): InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaytoEndDateX40ffe715Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X45e29bed = element.isJsonDecodable<InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X45e29bed>()
  return InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaytoEndDateX40ffe715Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X45e29bed = matchesInlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X45e29bed,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X45e29bed) add("InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X45e29bed: value does not match InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X45e29bed")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
