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

public enum class InlineV1PaymentIntentsPostRequestFormPaymentMethodDataAddressX54bef4ebBranch {
  InlineV1PaymentIntentsPostRequestFormPaymentMethodDataAnyOf1X37974a8f,
  InlineV1PaymentIntentsPostRequestFormPaymentMethodDataAnyOf2X8eefa882,
}

public sealed class InlineV1PaymentIntentsPostRequestFormPaymentMethodDataAddressX54bef4ebDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormPaymentMethodDataAddressX54bef4ebNoMatchException(
  message: String,
) : InlineV1PaymentIntentsPostRequestFormPaymentMethodDataAddressX54bef4ebDecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormPaymentMethodDataAddressX54bef4ebInspection(
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodDataAnyOf1X37974a8f: Boolean,
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodDataAnyOf2X8eefa882: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodDataAnyOf1X37974a8f, matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodDataAnyOf2X8eefa882).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_data/properties/billing_details/properties/address.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_data/properties/billing_details/properties/address
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodDataAddressX54bef4eb.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodDataAddressX54bef4eb internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodDataAddressX54bef4ebInspection,
) {
  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodDataAnyOf1X37974a8f:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodDataAnyOf1X37974a8f? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodDataAnyOf1X37974a8f) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodDataAnyOf1X37974a8f>(raw) else null }

  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodDataAnyOf2X8eefa882:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodDataAnyOf2X8eefa882? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodDataAnyOf2X8eefa882) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodDataAnyOf2X8eefa882>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsPostRequestFormPaymentMethodDataAddressX54bef4ebBranch>
    get() = buildSet {
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodDataAnyOf1X37974a8f) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodDataAddressX54bef4ebBranch.InlineV1PaymentIntentsPostRequestFormPaymentMethodDataAnyOf1X37974a8f)
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodDataAnyOf2X8eefa882) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodDataAddressX54bef4ebBranch.InlineV1PaymentIntentsPostRequestFormPaymentMethodDataAnyOf2X8eefa882)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsPostRequestFormPaymentMethodDataAddressX54bef4eb {
      val inspection = inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodDataAddressX54bef4eb(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsPostRequestFormPaymentMethodDataAddressX54bef4ebNoMatchException("InlineV1PaymentIntentsPostRequestFormPaymentMethodDataAddressX54bef4eb matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodDataAddressX54bef4eb(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodDataAddressX54bef4eb> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodDataAddressX54bef4eb {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodDataAddressX54bef4eb")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodDataAddressX54bef4eb) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodDataAddressX54bef4eb").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodDataAddressX54bef4eb(element: JsonElement): InlineV1PaymentIntentsPostRequestFormPaymentMethodDataAddressX54bef4ebInspection {
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodDataAnyOf1X37974a8f = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodDataAnyOf1X37974a8f>()
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodDataAnyOf2X8eefa882 = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodDataAnyOf2X8eefa882>()
  return InlineV1PaymentIntentsPostRequestFormPaymentMethodDataAddressX54bef4ebInspection(
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodDataAnyOf1X37974a8f = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodDataAnyOf1X37974a8f,
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodDataAnyOf2X8eefa882 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodDataAnyOf2X8eefa882,
    failures = buildList {
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodDataAnyOf1X37974a8f) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodDataAnyOf1X37974a8f: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodDataAnyOf1X37974a8f")
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodDataAnyOf2X8eefa882) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodDataAnyOf2X8eefa882: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodDataAnyOf2X8eefa882")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
