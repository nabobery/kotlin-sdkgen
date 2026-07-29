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

public enum class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGiropayXbaa417eeBranch {
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGiropayAnyOf1Xf2b01395,
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGiropayAnyOf2Xf5e45c17,
}

public sealed class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGiropayXbaa417eeDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGiropayXbaa417eeNoMatchException(
  message: String,
) : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGiropayXbaa417eeDecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGiropayXbaa417eeInspection(
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGiropayAnyOf1Xf2b01395:
      Boolean,
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGiropayAnyOf2Xf5e45c17:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGiropayAnyOf1Xf2b01395, matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGiropayAnyOf2Xf5e45c17).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/giropay.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/giropay
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGiropayXbaa417ee.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGiropayXbaa417ee internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGiropayXbaa417eeInspection,
) {
  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGiropayAnyOf1Xf2b01395:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGiropayAnyOf1Xf2b01395? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGiropayAnyOf1Xf2b01395) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGiropayAnyOf1Xf2b01395>(raw) else null }

  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGiropayAnyOf2Xf5e45c17:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGiropayAnyOf2Xf5e45c17? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGiropayAnyOf2Xf5e45c17) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGiropayAnyOf2Xf5e45c17>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGiropayXbaa417eeBranch>
    get() = buildSet {
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGiropayAnyOf1Xf2b01395) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGiropayXbaa417eeBranch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGiropayAnyOf1Xf2b01395)
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGiropayAnyOf2Xf5e45c17) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGiropayXbaa417eeBranch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGiropayAnyOf2Xf5e45c17)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGiropayXbaa417ee {
      val inspection = inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGiropayXbaa417ee(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGiropayXbaa417eeNoMatchException("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGiropayXbaa417ee matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGiropayXbaa417ee(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGiropayXbaa417ee> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGiropayXbaa417ee {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGiropayXbaa417ee")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGiropayXbaa417ee) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGiropayXbaa417ee").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGiropayXbaa417ee(element: JsonElement): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGiropayXbaa417eeInspection {
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGiropayAnyOf1Xf2b01395 = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGiropayAnyOf1Xf2b01395>()
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGiropayAnyOf2Xf5e45c17 = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGiropayAnyOf2Xf5e45c17>()
  return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGiropayXbaa417eeInspection(
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGiropayAnyOf1Xf2b01395 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGiropayAnyOf1Xf2b01395,
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGiropayAnyOf2Xf5e45c17 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGiropayAnyOf2Xf5e45c17,
    failures = buildList {
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGiropayAnyOf1Xf2b01395) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGiropayAnyOf1Xf2b01395: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGiropayAnyOf1Xf2b01395")
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGiropayAnyOf2Xf5e45c17) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGiropayAnyOf2Xf5e45c17: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGiropayAnyOf2Xf5e45c17")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
