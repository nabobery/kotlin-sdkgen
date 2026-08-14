package io.github.nabobery.sdkgen.generated.stripe

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

public enum class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsIdealXdfa7bf6aBranch {
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsIdealAnyOf1X496f35c4,
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsIdealAnyOf2X2e49c3a2,
}

public sealed class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsIdealXdfa7bf6aDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsIdealXdfa7bf6aNoMatchException(
  message: String,
) : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsIdealXdfa7bf6aDecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsIdealXdfa7bf6aInspection(
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsIdealAnyOf1X496f35c4:
      Boolean,
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsIdealAnyOf2X2e49c3a2:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsIdealAnyOf1X496f35c4, matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsIdealAnyOf2X2e49c3a2).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/ideal.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/ideal
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsIdealXdfa7bf6a.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsIdealXdfa7bf6a internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsIdealXdfa7bf6aInspection,
) {
  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsIdealAnyOf1X496f35c4:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsIdealAnyOf1X496f35c4? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsIdealAnyOf1X496f35c4) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsIdealAnyOf1X496f35c4>(raw) else null }

  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsIdealAnyOf2X2e49c3a2:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsIdealAnyOf2X2e49c3a2? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsIdealAnyOf2X2e49c3a2) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsIdealAnyOf2X2e49c3a2>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsIdealXdfa7bf6aBranch>
    get() = buildSet {
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsIdealAnyOf1X496f35c4) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsIdealXdfa7bf6aBranch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsIdealAnyOf1X496f35c4)
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsIdealAnyOf2X2e49c3a2) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsIdealXdfa7bf6aBranch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsIdealAnyOf2X2e49c3a2)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsIdealXdfa7bf6a {
      val inspection = inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsIdealXdfa7bf6a(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsIdealXdfa7bf6aNoMatchException("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsIdealXdfa7bf6a matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsIdealXdfa7bf6a(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsIdealXdfa7bf6a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsIdealXdfa7bf6a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsIdealXdfa7bf6a")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsIdealXdfa7bf6a) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsIdealXdfa7bf6a").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsIdealXdfa7bf6a(element: JsonElement): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsIdealXdfa7bf6aInspection {
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsIdealAnyOf1X496f35c4 = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsIdealAnyOf1X496f35c4>()
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsIdealAnyOf2X2e49c3a2 = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsIdealAnyOf2X2e49c3a2>()
  return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsIdealXdfa7bf6aInspection(
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsIdealAnyOf1X496f35c4 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsIdealAnyOf1X496f35c4,
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsIdealAnyOf2X2e49c3a2 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsIdealAnyOf2X2e49c3a2,
    failures = buildList {
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsIdealAnyOf1X496f35c4) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsIdealAnyOf1X496f35c4: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsIdealAnyOf1X496f35c4")
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsIdealAnyOf2X2e49c3a2) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsIdealAnyOf2X2e49c3a2: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsIdealAnyOf2X2e49c3a2")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
