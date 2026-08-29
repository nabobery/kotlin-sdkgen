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

public enum class InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsSofortXfe3a4bdcBranch {
  InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xd0eb9c5f,
  InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xf46de172,
}

public sealed class InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsSofortXfe3a4bdcDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsSofortXfe3a4bdcNoMatchException(
  message: String,
) : InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsSofortXfe3a4bdcDecodingException(message)

internal data class InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsSofortXfe3a4bdcInspection(
  public val matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xd0eb9c5f:
      Boolean,
  public val matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xf46de172:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xd0eb9c5f, matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xf46de172).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/payment_method_options/properties/sofort.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/payment_method_options/properties/sofort
 */
@Serializable(with = InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsSofortXfe3a4bdc.Serializer::class)
public class InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsSofortXfe3a4bdc internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsSofortXfe3a4bdcInspection,
) {
  public val inlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xd0eb9c5f:
      InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xd0eb9c5f? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xd0eb9c5f) json.decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xd0eb9c5f>(raw) else null }

  public val inlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xf46de172:
      InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xf46de172? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xf46de172) json.decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xf46de172>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsSofortXfe3a4bdcBranch>
    get() = buildSet {
      if (inspection.matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xd0eb9c5f) add(InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsSofortXfe3a4bdcBranch.InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xd0eb9c5f)
      if (inspection.matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xf46de172) add(InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsSofortXfe3a4bdcBranch.InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xf46de172)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsSofortXfe3a4bdc {
      val inspection = inspectInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsSofortXfe3a4bdc(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsSofortXfe3a4bdcNoMatchException("InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsSofortXfe3a4bdc matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsSofortXfe3a4bdc(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsSofortXfe3a4bdc> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsSofortXfe3a4bdc {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsSofortXfe3a4bdc")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsSofortXfe3a4bdc) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsSofortXfe3a4bdc").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsSofortXfe3a4bdc(element: JsonElement): InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsSofortXfe3a4bdcInspection {
  val matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xd0eb9c5f = element.isJsonDecodable<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xd0eb9c5f>()
  val matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xf46de172 = element.isJsonDecodable<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xf46de172>()
  return InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsSofortXfe3a4bdcInspection(
    matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xd0eb9c5f = matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xd0eb9c5f,
    matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xf46de172 = matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xf46de172,
    failures = buildList {
      if (!matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xd0eb9c5f) add("InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xd0eb9c5f: value does not match InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xd0eb9c5f")
      if (!matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xf46de172) add("InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xf46de172: value does not match InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xf46de172")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
