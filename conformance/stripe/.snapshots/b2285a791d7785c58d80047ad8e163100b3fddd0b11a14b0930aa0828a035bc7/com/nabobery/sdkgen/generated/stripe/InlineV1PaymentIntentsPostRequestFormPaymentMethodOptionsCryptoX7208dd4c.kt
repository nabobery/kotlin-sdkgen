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

public enum class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCryptoX7208dd4cBranch {
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCryptoAnyOf1X5fa5e103,
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCryptoAnyOf2Xa1988795,
}

public sealed class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCryptoX7208dd4cDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCryptoX7208dd4cNoMatchException(
  message: String,
) : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCryptoX7208dd4cDecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCryptoX7208dd4cInspection(
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCryptoAnyOf1X5fa5e103:
      Boolean,
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCryptoAnyOf2Xa1988795:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCryptoAnyOf1X5fa5e103, matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCryptoAnyOf2Xa1988795).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/crypto.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/crypto
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCryptoX7208dd4c.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCryptoX7208dd4c internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCryptoX7208dd4cInspection,
) {
  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCryptoAnyOf1X5fa5e103:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCryptoAnyOf1X5fa5e103? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCryptoAnyOf1X5fa5e103) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCryptoAnyOf1X5fa5e103>(raw) else null }

  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCryptoAnyOf2Xa1988795:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCryptoAnyOf2Xa1988795? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCryptoAnyOf2Xa1988795) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCryptoAnyOf2Xa1988795>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCryptoX7208dd4cBranch>
    get() = buildSet {
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCryptoAnyOf1X5fa5e103) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCryptoX7208dd4cBranch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCryptoAnyOf1X5fa5e103)
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCryptoAnyOf2Xa1988795) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCryptoX7208dd4cBranch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCryptoAnyOf2Xa1988795)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCryptoX7208dd4c {
      val inspection = inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCryptoX7208dd4c(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCryptoX7208dd4cNoMatchException("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCryptoX7208dd4c matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCryptoX7208dd4c(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCryptoX7208dd4c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCryptoX7208dd4c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCryptoX7208dd4c")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCryptoX7208dd4c) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCryptoX7208dd4c").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCryptoX7208dd4c(element: JsonElement): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCryptoX7208dd4cInspection {
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCryptoAnyOf1X5fa5e103 = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCryptoAnyOf1X5fa5e103>()
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCryptoAnyOf2Xa1988795 = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCryptoAnyOf2Xa1988795>()
  return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCryptoX7208dd4cInspection(
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCryptoAnyOf1X5fa5e103 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCryptoAnyOf1X5fa5e103,
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCryptoAnyOf2Xa1988795 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCryptoAnyOf2Xa1988795,
    failures = buildList {
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCryptoAnyOf1X5fa5e103) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCryptoAnyOf1X5fa5e103: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCryptoAnyOf1X5fa5e103")
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCryptoAnyOf2Xa1988795) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCryptoAnyOf2Xa1988795: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCryptoAnyOf2Xa1988795")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
