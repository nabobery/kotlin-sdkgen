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

public enum class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSatispayX0e1297d9Branch {
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSatispayAnyOf1X8b89066f,
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSatispayAnyOf2Xea205de2,
}

public sealed class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSatispayX0e1297d9DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSatispayX0e1297d9NoMatchException(
  message: String,
) : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSatispayX0e1297d9DecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSatispayX0e1297d9Inspection(
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSatispayAnyOf1X8b89066f:
      Boolean,
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSatispayAnyOf2Xea205de2:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSatispayAnyOf1X8b89066f, matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSatispayAnyOf2Xea205de2).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/satispay.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/satispay
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSatispayX0e1297d9.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSatispayX0e1297d9 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSatispayX0e1297d9Inspection,
) {
  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSatispayAnyOf1X8b89066f:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSatispayAnyOf1X8b89066f? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSatispayAnyOf1X8b89066f) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSatispayAnyOf1X8b89066f>(raw) else null }

  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSatispayAnyOf2Xea205de2:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSatispayAnyOf2Xea205de2? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSatispayAnyOf2Xea205de2) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSatispayAnyOf2Xea205de2>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSatispayX0e1297d9Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSatispayAnyOf1X8b89066f) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSatispayX0e1297d9Branch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSatispayAnyOf1X8b89066f)
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSatispayAnyOf2Xea205de2) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSatispayX0e1297d9Branch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSatispayAnyOf2Xea205de2)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSatispayX0e1297d9 {
      val inspection = inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSatispayX0e1297d9(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSatispayX0e1297d9NoMatchException("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSatispayX0e1297d9 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSatispayX0e1297d9(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSatispayX0e1297d9> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSatispayX0e1297d9 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSatispayX0e1297d9")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSatispayX0e1297d9) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSatispayX0e1297d9").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSatispayX0e1297d9(element: JsonElement): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSatispayX0e1297d9Inspection {
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSatispayAnyOf1X8b89066f = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSatispayAnyOf1X8b89066f>()
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSatispayAnyOf2Xea205de2 = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSatispayAnyOf2Xea205de2>()
  return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSatispayX0e1297d9Inspection(
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSatispayAnyOf1X8b89066f = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSatispayAnyOf1X8b89066f,
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSatispayAnyOf2Xea205de2 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSatispayAnyOf2Xea205de2,
    failures = buildList {
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSatispayAnyOf1X8b89066f) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSatispayAnyOf1X8b89066f: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSatispayAnyOf1X8b89066f")
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSatispayAnyOf2Xea205de2) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSatispayAnyOf2Xea205de2: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSatispayAnyOf2Xea205de2")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
