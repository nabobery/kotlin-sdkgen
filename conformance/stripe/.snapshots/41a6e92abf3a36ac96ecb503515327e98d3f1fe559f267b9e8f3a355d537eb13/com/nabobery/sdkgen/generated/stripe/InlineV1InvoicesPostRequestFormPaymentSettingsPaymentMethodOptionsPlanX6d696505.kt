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

public enum class InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPlanX6d696505Branch {
  InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X5b9ae254,
  InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X81083759,
}

public sealed class InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPlanX6d696505DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPlanX6d696505NoMatchException(
  message: String,
) : InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPlanX6d696505DecodingException(message)

internal data class InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPlanX6d696505Inspection(
  public val matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X5b9ae254: Boolean,
  public val matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X81083759: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X5b9ae254, matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X81083759).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/payment_settings/properties/payment_method_options/properties/card/anyOf/0/properties/installm
 * ents/properties/plan.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/payment_settings/properties/payment_method_options/properties/card/anyOf/0/properties/installm
 * ents/properties/plan
 */
@Serializable(with = InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPlanX6d696505.Serializer::class)
public class InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPlanX6d696505 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPlanX6d696505Inspection,
) {
  public val inlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X5b9ae254:
      InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X5b9ae254? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X5b9ae254) json.decodeFromJsonElement<InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X5b9ae254>(raw) else null }

  public val inlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X81083759:
      InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X81083759? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X81083759) json.decodeFromJsonElement<InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X81083759>(raw) else null }

  public val matchedBranches:
      Set<InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPlanX6d696505Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X5b9ae254) add(InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPlanX6d696505Branch.InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X5b9ae254)
      if (inspection.matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X81083759) add(InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPlanX6d696505Branch.InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X81083759)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPlanX6d696505 {
      val inspection = inspectInlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPlanX6d696505(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPlanX6d696505NoMatchException("InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPlanX6d696505 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPlanX6d696505(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPlanX6d696505> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPlanX6d696505 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPlanX6d696505")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPlanX6d696505) {
      encoder.requireJsonEncoder("InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPlanX6d696505").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPlanX6d696505(element: JsonElement): InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPlanX6d696505Inspection {
  val matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X5b9ae254 = element.isJsonDecodable<InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X5b9ae254>()
  val matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X81083759 = element.isJsonDecodable<InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X81083759>()
  return InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPlanX6d696505Inspection(
    matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X5b9ae254 = matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X5b9ae254,
    matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X81083759 = matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X81083759,
    failures = buildList {
      if (!matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X5b9ae254) add("InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X5b9ae254: value does not match InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X5b9ae254")
      if (!matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X81083759) add("InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X81083759: value does not match InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X81083759")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
