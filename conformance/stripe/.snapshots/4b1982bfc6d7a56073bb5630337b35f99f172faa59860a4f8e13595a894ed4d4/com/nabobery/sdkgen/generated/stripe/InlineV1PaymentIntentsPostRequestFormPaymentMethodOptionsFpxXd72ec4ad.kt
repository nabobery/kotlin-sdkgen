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

public enum class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFpxXd72ec4adBranch {
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFpxAnyOf1X7b2aba26,
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFpxAnyOf2X2568bb69,
}

public sealed class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFpxXd72ec4adDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFpxXd72ec4adNoMatchException(
  message: String,
) : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFpxXd72ec4adDecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFpxXd72ec4adInspection(
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFpxAnyOf1X7b2aba26:
      Boolean,
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFpxAnyOf2X2568bb69:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFpxAnyOf1X7b2aba26, matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFpxAnyOf2X2568bb69).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/fpx.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/fpx
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFpxXd72ec4ad.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFpxXd72ec4ad internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFpxXd72ec4adInspection,
) {
  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFpxAnyOf1X7b2aba26:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFpxAnyOf1X7b2aba26? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFpxAnyOf1X7b2aba26) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFpxAnyOf1X7b2aba26>(raw) else null }

  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFpxAnyOf2X2568bb69:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFpxAnyOf2X2568bb69? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFpxAnyOf2X2568bb69) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFpxAnyOf2X2568bb69>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFpxXd72ec4adBranch>
    get() = buildSet {
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFpxAnyOf1X7b2aba26) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFpxXd72ec4adBranch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFpxAnyOf1X7b2aba26)
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFpxAnyOf2X2568bb69) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFpxXd72ec4adBranch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFpxAnyOf2X2568bb69)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFpxXd72ec4ad {
      val inspection = inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFpxXd72ec4ad(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFpxXd72ec4adNoMatchException("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFpxXd72ec4ad matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFpxXd72ec4ad(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFpxXd72ec4ad> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFpxXd72ec4ad {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFpxXd72ec4ad")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFpxXd72ec4ad) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFpxXd72ec4ad").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFpxXd72ec4ad(element: JsonElement): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFpxXd72ec4adInspection {
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFpxAnyOf1X7b2aba26 = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFpxAnyOf1X7b2aba26>()
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFpxAnyOf2X2568bb69 = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFpxAnyOf2X2568bb69>()
  return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFpxXd72ec4adInspection(
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFpxAnyOf1X7b2aba26 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFpxAnyOf1X7b2aba26,
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFpxAnyOf2X2568bb69 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFpxAnyOf2X2568bb69,
    failures = buildList {
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFpxAnyOf1X7b2aba26) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFpxAnyOf1X7b2aba26: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFpxAnyOf1X7b2aba26")
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFpxAnyOf2X2568bb69) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFpxAnyOf2X2568bb69: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFpxAnyOf2X2568bb69")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
