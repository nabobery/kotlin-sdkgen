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

public enum class InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsXcbb7398dBranch {
  InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1X855adc61,
  InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf2X58e50326,
}

public sealed class InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsXcbb7398dDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsXcbb7398dNoMatchException(
  message: String,
) : InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsXcbb7398dDecodingException(message)

internal data class InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsXcbb7398dInspection(
  public val matchesInlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1X855adc61: Boolean,
  public val matchesInlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf2X58e50326: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1X855adc61, matchesInlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf2X58e50326).count { it }
}

/**
 * Payment-method-specific configuration.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links~1{payment_link}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/payment_method_options
 */
@Serializable(with = InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsXcbb7398d.Serializer::class)
public class InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsXcbb7398d internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsXcbb7398dInspection,
) {
  public val inlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1X855adc61:
      InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1X855adc61? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1X855adc61) json.decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1X855adc61>(raw) else null }

  public val inlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf2X58e50326:
      InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf2X58e50326? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf2X58e50326) json.decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf2X58e50326>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsXcbb7398dBranch>
    get() = buildSet {
      if (inspection.matchesInlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1X855adc61) add(InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsXcbb7398dBranch.InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1X855adc61)
      if (inspection.matchesInlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf2X58e50326) add(InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsXcbb7398dBranch.InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf2X58e50326)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsXcbb7398d {
      val inspection = inspectInlineV1PaymentLinksPostRequestFormPaymentMethodOptionsXcbb7398d(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsXcbb7398dNoMatchException("InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsXcbb7398d matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsXcbb7398d(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsXcbb7398d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsXcbb7398d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsXcbb7398d")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsXcbb7398d) {
      encoder.requireJsonEncoder("InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsXcbb7398d").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentLinksPostRequestFormPaymentMethodOptionsXcbb7398d(element: JsonElement): InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsXcbb7398dInspection {
  val matchesInlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1X855adc61 = element.isJsonDecodable<InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1X855adc61>()
  val matchesInlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf2X58e50326 = element.isJsonDecodable<InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf2X58e50326>()
  return InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsXcbb7398dInspection(
    matchesInlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1X855adc61 = matchesInlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1X855adc61,
    matchesInlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf2X58e50326 = matchesInlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf2X58e50326,
    failures = buildList {
      if (!matchesInlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1X855adc61) add("InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1X855adc61: value does not match InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1X855adc61")
      if (!matchesInlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf2X58e50326) add("InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf2X58e50326: value does not match InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf2X58e50326")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
