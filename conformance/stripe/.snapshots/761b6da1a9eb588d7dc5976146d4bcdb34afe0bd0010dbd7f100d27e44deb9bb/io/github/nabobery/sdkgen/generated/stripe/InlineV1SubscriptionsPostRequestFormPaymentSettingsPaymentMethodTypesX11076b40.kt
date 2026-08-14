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
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineV1SubscriptionsPostRequestFormPaymentSettingsPaymentMethodTypesX11076b40Branch {
  Branch1,
  InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2Xf24d42fd,
}

public sealed class InlineV1SubscriptionsPostRequestFormPaymentSettingsPaymentMethodTypesX11076b40DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1SubscriptionsPostRequestFormPaymentSettingsPaymentMethodTypesX11076b40NoMatchException(
  message: String,
) : InlineV1SubscriptionsPostRequestFormPaymentSettingsPaymentMethodTypesX11076b40DecodingException(message)

internal data class InlineV1SubscriptionsPostRequestFormPaymentSettingsPaymentMethodTypesX11076b40Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2Xf24d42fd: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2Xf24d42fd).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_settings/properties/payment_method_types.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_settings/properties/payment_method_types
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormPaymentSettingsPaymentMethodTypesX11076b40.Serializer::class)
public class InlineV1SubscriptionsPostRequestFormPaymentSettingsPaymentMethodTypesX11076b40 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1SubscriptionsPostRequestFormPaymentSettingsPaymentMethodTypesX11076b40Inspection,
) {
  public val branch1: List<InlineV1SubscriptionsPostRequestFormPaymentSettingsItemX9be7d3f9>? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<List<InlineV1SubscriptionsPostRequestFormPaymentSettingsItemX9be7d3f9>>(raw) else null }

  public val inlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2Xf24d42fd:
      InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2Xf24d42fd? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2Xf24d42fd) json.decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2Xf24d42fd>(raw) else null }

  public val matchedBranches:
      Set<InlineV1SubscriptionsPostRequestFormPaymentSettingsPaymentMethodTypesX11076b40Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1SubscriptionsPostRequestFormPaymentSettingsPaymentMethodTypesX11076b40Branch.Branch1)
      if (inspection.matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2Xf24d42fd) add(InlineV1SubscriptionsPostRequestFormPaymentSettingsPaymentMethodTypesX11076b40Branch.InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2Xf24d42fd)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1SubscriptionsPostRequestFormPaymentSettingsPaymentMethodTypesX11076b40 {
      val inspection = inspectInlineV1SubscriptionsPostRequestFormPaymentSettingsPaymentMethodTypesX11076b40(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1SubscriptionsPostRequestFormPaymentSettingsPaymentMethodTypesX11076b40NoMatchException("InlineV1SubscriptionsPostRequestFormPaymentSettingsPaymentMethodTypesX11076b40 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1SubscriptionsPostRequestFormPaymentSettingsPaymentMethodTypesX11076b40(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormPaymentSettingsPaymentMethodTypesX11076b40> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionsPostRequestFormPaymentSettingsPaymentMethodTypesX11076b40 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionsPostRequestFormPaymentSettingsPaymentMethodTypesX11076b40")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionsPostRequestFormPaymentSettingsPaymentMethodTypesX11076b40) {
      encoder.requireJsonEncoder("InlineV1SubscriptionsPostRequestFormPaymentSettingsPaymentMethodTypesX11076b40").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1SubscriptionsPostRequestFormPaymentSettingsPaymentMethodTypesX11076b40(element: JsonElement): InlineV1SubscriptionsPostRequestFormPaymentSettingsPaymentMethodTypesX11076b40Inspection {
  val matchesBranch1 = element.isJsonDecodable<List<InlineV1SubscriptionsPostRequestFormPaymentSettingsItemX9be7d3f9>>() && (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
  val matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2Xf24d42fd = element.isJsonDecodable<InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2Xf24d42fd>()
  return InlineV1SubscriptionsPostRequestFormPaymentSettingsPaymentMethodTypesX11076b40Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2Xf24d42fd = matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2Xf24d42fd,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match List")
      if (!matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2Xf24d42fd) add("InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2Xf24d42fd: value does not match InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2Xf24d42fd")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
