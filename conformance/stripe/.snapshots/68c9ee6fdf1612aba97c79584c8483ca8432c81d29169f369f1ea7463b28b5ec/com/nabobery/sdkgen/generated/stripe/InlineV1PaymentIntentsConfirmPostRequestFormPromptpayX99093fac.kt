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

public enum class InlineV1PaymentIntentsConfirmPostRequestFormPromptpayX99093facBranch {
  InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xbbd6c095,
  InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X7c371fcd,
}

public sealed class InlineV1PaymentIntentsConfirmPostRequestFormPromptpayX99093facDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsConfirmPostRequestFormPromptpayX99093facNoMatchException(
  message: String,
) : InlineV1PaymentIntentsConfirmPostRequestFormPromptpayX99093facDecodingException(message)

internal data class InlineV1PaymentIntentsConfirmPostRequestFormPromptpayX99093facInspection(
  public val matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xbbd6c095:
      Boolean,
  public val matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X7c371fcd:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xbbd6c095, matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X7c371fcd).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/payment_method_options/properties/promptpay.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/payment_method_options/properties/promptpay
 */
@Serializable(with = InlineV1PaymentIntentsConfirmPostRequestFormPromptpayX99093fac.Serializer::class)
public class InlineV1PaymentIntentsConfirmPostRequestFormPromptpayX99093fac internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1PaymentIntentsConfirmPostRequestFormPromptpayX99093facInspection,
) {
  public val inlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xbbd6c095:
      InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xbbd6c095? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xbbd6c095) json.decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xbbd6c095>(raw) else null }

  public val inlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X7c371fcd:
      InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X7c371fcd? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X7c371fcd) json.decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X7c371fcd>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsConfirmPostRequestFormPromptpayX99093facBranch>
    get() = buildSet {
      if (inspection.matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xbbd6c095) add(InlineV1PaymentIntentsConfirmPostRequestFormPromptpayX99093facBranch.InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xbbd6c095)
      if (inspection.matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X7c371fcd) add(InlineV1PaymentIntentsConfirmPostRequestFormPromptpayX99093facBranch.InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X7c371fcd)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsConfirmPostRequestFormPromptpayX99093fac {
      val inspection = inspectInlineV1PaymentIntentsConfirmPostRequestFormPromptpayX99093fac(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsConfirmPostRequestFormPromptpayX99093facNoMatchException("InlineV1PaymentIntentsConfirmPostRequestFormPromptpayX99093fac matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsConfirmPostRequestFormPromptpayX99093fac(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsConfirmPostRequestFormPromptpayX99093fac> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsConfirmPostRequestFormPromptpayX99093fac {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsConfirmPostRequestFormPromptpayX99093fac")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsConfirmPostRequestFormPromptpayX99093fac) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsConfirmPostRequestFormPromptpayX99093fac").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsConfirmPostRequestFormPromptpayX99093fac(element: JsonElement): InlineV1PaymentIntentsConfirmPostRequestFormPromptpayX99093facInspection {
  val matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xbbd6c095 = element.isJsonDecodable<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xbbd6c095>()
  val matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X7c371fcd = element.isJsonDecodable<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X7c371fcd>()
  return InlineV1PaymentIntentsConfirmPostRequestFormPromptpayX99093facInspection(
    matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xbbd6c095 = matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xbbd6c095,
    matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X7c371fcd = matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X7c371fcd,
    failures = buildList {
      if (!matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xbbd6c095) add("InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xbbd6c095: value does not match InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xbbd6c095")
      if (!matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X7c371fcd) add("InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X7c371fcd: value does not match InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X7c371fcd")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
