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

public enum class InlineV1SetupIntentsPostRequestFormPaymentMethodDataAddressX1b9588acBranch {
  InlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf1X277c5743,
  InlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf2X961f1580,
}

public sealed class InlineV1SetupIntentsPostRequestFormPaymentMethodDataAddressX1b9588acDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1SetupIntentsPostRequestFormPaymentMethodDataAddressX1b9588acNoMatchException(
  message: String,
) : InlineV1SetupIntentsPostRequestFormPaymentMethodDataAddressX1b9588acDecodingException(message)

internal data class InlineV1SetupIntentsPostRequestFormPaymentMethodDataAddressX1b9588acInspection(
  public val matchesInlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf1X277c5743: Boolean,
  public val matchesInlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf2X961f1580: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf1X277c5743, matchesInlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf2X961f1580).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_method_data/properties/billing_details/properties/address.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_method_data/properties/billing_details/properties/address
 */
@Serializable(with = InlineV1SetupIntentsPostRequestFormPaymentMethodDataAddressX1b9588ac.Serializer::class)
public class InlineV1SetupIntentsPostRequestFormPaymentMethodDataAddressX1b9588ac internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1SetupIntentsPostRequestFormPaymentMethodDataAddressX1b9588acInspection,
) {
  public val inlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf1X277c5743:
      InlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf1X277c5743? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf1X277c5743) json.decodeFromJsonElement<InlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf1X277c5743>(raw) else null }

  public val inlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf2X961f1580:
      InlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf2X961f1580? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf2X961f1580) json.decodeFromJsonElement<InlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf2X961f1580>(raw) else null }

  public val matchedBranches:
      Set<InlineV1SetupIntentsPostRequestFormPaymentMethodDataAddressX1b9588acBranch>
    get() = buildSet {
      if (inspection.matchesInlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf1X277c5743) add(InlineV1SetupIntentsPostRequestFormPaymentMethodDataAddressX1b9588acBranch.InlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf1X277c5743)
      if (inspection.matchesInlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf2X961f1580) add(InlineV1SetupIntentsPostRequestFormPaymentMethodDataAddressX1b9588acBranch.InlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf2X961f1580)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1SetupIntentsPostRequestFormPaymentMethodDataAddressX1b9588ac {
      val inspection = inspectInlineV1SetupIntentsPostRequestFormPaymentMethodDataAddressX1b9588ac(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1SetupIntentsPostRequestFormPaymentMethodDataAddressX1b9588acNoMatchException("InlineV1SetupIntentsPostRequestFormPaymentMethodDataAddressX1b9588ac matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1SetupIntentsPostRequestFormPaymentMethodDataAddressX1b9588ac(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1SetupIntentsPostRequestFormPaymentMethodDataAddressX1b9588ac> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SetupIntentsPostRequestFormPaymentMethodDataAddressX1b9588ac {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SetupIntentsPostRequestFormPaymentMethodDataAddressX1b9588ac")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SetupIntentsPostRequestFormPaymentMethodDataAddressX1b9588ac) {
      encoder.requireJsonEncoder("InlineV1SetupIntentsPostRequestFormPaymentMethodDataAddressX1b9588ac").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1SetupIntentsPostRequestFormPaymentMethodDataAddressX1b9588ac(element: JsonElement): InlineV1SetupIntentsPostRequestFormPaymentMethodDataAddressX1b9588acInspection {
  val matchesInlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf1X277c5743 = element.isJsonDecodable<InlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf1X277c5743>()
  val matchesInlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf2X961f1580 = element.isJsonDecodable<InlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf2X961f1580>()
  return InlineV1SetupIntentsPostRequestFormPaymentMethodDataAddressX1b9588acInspection(
    matchesInlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf1X277c5743 = matchesInlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf1X277c5743,
    matchesInlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf2X961f1580 = matchesInlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf2X961f1580,
    failures = buildList {
      if (!matchesInlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf1X277c5743) add("InlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf1X277c5743: value does not match InlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf1X277c5743")
      if (!matchesInlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf2X961f1580) add("InlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf2X961f1580: value does not match InlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf2X961f1580")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
