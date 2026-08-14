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

public enum class InlineV1SubscriptionsPostRequestFormPaymentSettingsPixXffd425d6Branch {
  InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1Xe3fbfb12,
  InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2Xad250b9b,
}

public sealed class InlineV1SubscriptionsPostRequestFormPaymentSettingsPixXffd425d6DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1SubscriptionsPostRequestFormPaymentSettingsPixXffd425d6NoMatchException(
  message: String,
) : InlineV1SubscriptionsPostRequestFormPaymentSettingsPixXffd425d6DecodingException(message)

internal data class InlineV1SubscriptionsPostRequestFormPaymentSettingsPixXffd425d6Inspection(
  public val matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1Xe3fbfb12: Boolean,
  public val matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2Xad250b9b: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1Xe3fbfb12, matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2Xad250b9b).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_settings/properties/payment_method_options/properties/pix.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_settings/properties/payment_method_options/properties/pix
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormPaymentSettingsPixXffd425d6.Serializer::class)
public class InlineV1SubscriptionsPostRequestFormPaymentSettingsPixXffd425d6 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1SubscriptionsPostRequestFormPaymentSettingsPixXffd425d6Inspection,
) {
  public val inlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1Xe3fbfb12:
      InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1Xe3fbfb12? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1Xe3fbfb12) json.decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1Xe3fbfb12>(raw) else null }

  public val inlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2Xad250b9b:
      InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2Xad250b9b? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2Xad250b9b) json.decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2Xad250b9b>(raw) else null }

  public val matchedBranches:
      Set<InlineV1SubscriptionsPostRequestFormPaymentSettingsPixXffd425d6Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1Xe3fbfb12) add(InlineV1SubscriptionsPostRequestFormPaymentSettingsPixXffd425d6Branch.InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1Xe3fbfb12)
      if (inspection.matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2Xad250b9b) add(InlineV1SubscriptionsPostRequestFormPaymentSettingsPixXffd425d6Branch.InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2Xad250b9b)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1SubscriptionsPostRequestFormPaymentSettingsPixXffd425d6 {
      val inspection = inspectInlineV1SubscriptionsPostRequestFormPaymentSettingsPixXffd425d6(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1SubscriptionsPostRequestFormPaymentSettingsPixXffd425d6NoMatchException("InlineV1SubscriptionsPostRequestFormPaymentSettingsPixXffd425d6 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1SubscriptionsPostRequestFormPaymentSettingsPixXffd425d6(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormPaymentSettingsPixXffd425d6> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionsPostRequestFormPaymentSettingsPixXffd425d6 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionsPostRequestFormPaymentSettingsPixXffd425d6")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionsPostRequestFormPaymentSettingsPixXffd425d6) {
      encoder.requireJsonEncoder("InlineV1SubscriptionsPostRequestFormPaymentSettingsPixXffd425d6").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1SubscriptionsPostRequestFormPaymentSettingsPixXffd425d6(element: JsonElement): InlineV1SubscriptionsPostRequestFormPaymentSettingsPixXffd425d6Inspection {
  val matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1Xe3fbfb12 = element.isJsonDecodable<InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1Xe3fbfb12>()
  val matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2Xad250b9b = element.isJsonDecodable<InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2Xad250b9b>()
  return InlineV1SubscriptionsPostRequestFormPaymentSettingsPixXffd425d6Inspection(
    matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1Xe3fbfb12 = matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1Xe3fbfb12,
    matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2Xad250b9b = matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2Xad250b9b,
    failures = buildList {
      if (!matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1Xe3fbfb12) add("InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1Xe3fbfb12: value does not match InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1Xe3fbfb12")
      if (!matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2Xad250b9b) add("InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2Xad250b9b: value does not match InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2Xad250b9b")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
