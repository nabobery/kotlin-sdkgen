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

public enum class InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsPixXbab8c37aBranch {
  InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X5161cae5,
  InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X6c7f1334,
}

public sealed class InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsPixXbab8c37aDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsPixXbab8c37aNoMatchException(
  message: String,
) : InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsPixXbab8c37aDecodingException(message)

internal data class InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsPixXbab8c37aInspection(
  public val matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X5161cae5:
      Boolean,
  public val matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X6c7f1334:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X5161cae5, matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X6c7f1334).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions/post/requestBody/content/application~1
 * x-www-form-urlencoded/schema/properties/payment_settings/properties/payment_method_options/properties/pix.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions/post/requestBody/content/application~1
 * x-www-form-urlencoded/schema/properties/payment_settings/properties/payment_method_options/properties/pix
 */
@Serializable(with = InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsPixXbab8c37a.Serializer::class)
public class InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsPixXbab8c37a internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsPixXbab8c37aInspection,
) {
  public val inlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X5161cae5:
      InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X5161cae5? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X5161cae5) json.decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X5161cae5>(raw) else null }

  public val inlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X6c7f1334:
      InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X6c7f1334? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X6c7f1334) json.decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X6c7f1334>(raw) else null }

  public val matchedBranches:
      Set<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsPixXbab8c37aBranch>
    get() = buildSet {
      if (inspection.matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X5161cae5) add(InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsPixXbab8c37aBranch.InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X5161cae5)
      if (inspection.matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X6c7f1334) add(InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsPixXbab8c37aBranch.InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X6c7f1334)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsPixXbab8c37a {
      val inspection = inspectInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsPixXbab8c37a(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsPixXbab8c37aNoMatchException("InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsPixXbab8c37a matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsPixXbab8c37a(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsPixXbab8c37a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsPixXbab8c37a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsPixXbab8c37a")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsPixXbab8c37a) {
      encoder.requireJsonEncoder("InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsPixXbab8c37a").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsPixXbab8c37a(element: JsonElement): InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsPixXbab8c37aInspection {
  val matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X5161cae5 = element.isJsonDecodable<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X5161cae5>()
  val matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X6c7f1334 = element.isJsonDecodable<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X6c7f1334>()
  return InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsPixXbab8c37aInspection(
    matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X5161cae5 = matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X5161cae5,
    matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X6c7f1334 = matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X6c7f1334,
    failures = buildList {
      if (!matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X5161cae5) add("InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X5161cae5: value does not match InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X5161cae5")
      if (!matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X6c7f1334) add("InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X6c7f1334: value does not match InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X6c7f1334")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
