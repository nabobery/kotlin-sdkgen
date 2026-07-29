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

public enum class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPromptpayX421583bdBranch {
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xe1266b65,
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X83a9de81,
}

public sealed class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPromptpayX421583bdDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPromptpayX421583bdNoMatchException(
  message: String,
) : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPromptpayX421583bdDecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPromptpayX421583bdInspection(
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xe1266b65:
      Boolean,
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X83a9de81:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xe1266b65, matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X83a9de81).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/promptpay.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/promptpay
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPromptpayX421583bd.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPromptpayX421583bd internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPromptpayX421583bdInspection,
) {
  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xe1266b65:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xe1266b65? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xe1266b65) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xe1266b65>(raw) else null }

  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X83a9de81:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X83a9de81? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X83a9de81) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X83a9de81>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPromptpayX421583bdBranch>
    get() = buildSet {
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xe1266b65) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPromptpayX421583bdBranch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xe1266b65)
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X83a9de81) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPromptpayX421583bdBranch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X83a9de81)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPromptpayX421583bd {
      val inspection = inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPromptpayX421583bd(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPromptpayX421583bdNoMatchException("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPromptpayX421583bd matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPromptpayX421583bd(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPromptpayX421583bd> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPromptpayX421583bd {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPromptpayX421583bd")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPromptpayX421583bd) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPromptpayX421583bd").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPromptpayX421583bd(element: JsonElement): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPromptpayX421583bdInspection {
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xe1266b65 = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xe1266b65>()
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X83a9de81 = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X83a9de81>()
  return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPromptpayX421583bdInspection(
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xe1266b65 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xe1266b65,
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X83a9de81 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X83a9de81,
    failures = buildList {
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xe1266b65) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xe1266b65: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xe1266b65")
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X83a9de81) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X83a9de81: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X83a9de81")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
