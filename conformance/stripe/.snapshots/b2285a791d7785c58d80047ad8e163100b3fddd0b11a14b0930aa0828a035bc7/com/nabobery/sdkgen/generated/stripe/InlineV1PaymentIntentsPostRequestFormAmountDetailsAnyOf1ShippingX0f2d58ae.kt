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

public enum class InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ShippingX0f2d58aeBranch {
  InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ShippingAnyOf1X9f276984,
  InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ShippingAnyOf2X73233e52,
}

public sealed class InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ShippingX0f2d58aeDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ShippingX0f2d58aeNoMatchException(
  message: String,
) : InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ShippingX0f2d58aeDecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ShippingX0f2d58aeInspection(
  public val matchesInlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ShippingAnyOf1X9f276984:
      Boolean,
  public val matchesInlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ShippingAnyOf2X73233e52:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ShippingAnyOf1X9f276984, matchesInlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ShippingAnyOf2X73233e52).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/amount_details/anyOf/0/properties/shipping.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/amount_details/anyOf/0/properties/shipping
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ShippingX0f2d58ae.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ShippingX0f2d58ae internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ShippingX0f2d58aeInspection,
) {
  public val inlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ShippingAnyOf1X9f276984:
      InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ShippingAnyOf1X9f276984? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ShippingAnyOf1X9f276984) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ShippingAnyOf1X9f276984>(raw) else null }

  public val inlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ShippingAnyOf2X73233e52:
      InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ShippingAnyOf2X73233e52? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ShippingAnyOf2X73233e52) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ShippingAnyOf2X73233e52>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ShippingX0f2d58aeBranch>
    get() = buildSet {
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ShippingAnyOf1X9f276984) add(InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ShippingX0f2d58aeBranch.InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ShippingAnyOf1X9f276984)
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ShippingAnyOf2X73233e52) add(InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ShippingX0f2d58aeBranch.InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ShippingAnyOf2X73233e52)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ShippingX0f2d58ae {
      val inspection = inspectInlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ShippingX0f2d58ae(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ShippingX0f2d58aeNoMatchException("InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ShippingX0f2d58ae matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ShippingX0f2d58ae(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ShippingX0f2d58ae> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ShippingX0f2d58ae {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ShippingX0f2d58ae")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ShippingX0f2d58ae) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ShippingX0f2d58ae").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ShippingX0f2d58ae(element: JsonElement): InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ShippingX0f2d58aeInspection {
  val matchesInlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ShippingAnyOf1X9f276984 = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ShippingAnyOf1X9f276984>()
  val matchesInlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ShippingAnyOf2X73233e52 = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ShippingAnyOf2X73233e52>()
  return InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ShippingX0f2d58aeInspection(
    matchesInlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ShippingAnyOf1X9f276984 = matchesInlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ShippingAnyOf1X9f276984,
    matchesInlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ShippingAnyOf2X73233e52 = matchesInlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ShippingAnyOf2X73233e52,
    failures = buildList {
      if (!matchesInlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ShippingAnyOf1X9f276984) add("InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ShippingAnyOf1X9f276984: value does not match InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ShippingAnyOf1X9f276984")
      if (!matchesInlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ShippingAnyOf2X73233e52) add("InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ShippingAnyOf2X73233e52: value does not match InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ShippingAnyOf2X73233e52")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
