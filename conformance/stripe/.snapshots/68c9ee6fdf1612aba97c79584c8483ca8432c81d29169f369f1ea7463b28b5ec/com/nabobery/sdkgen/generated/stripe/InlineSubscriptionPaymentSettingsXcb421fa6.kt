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
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineSubscriptionPaymentSettingsXcb421fa6Branch {
  SubscriptionsResourcePaymentSettings,
}

public sealed class InlineSubscriptionPaymentSettingsXcb421fa6DecodingException(
  message: String,
) : SerializationException(message)

public class InlineSubscriptionPaymentSettingsXcb421fa6NoMatchException(
  message: String,
) : InlineSubscriptionPaymentSettingsXcb421fa6DecodingException(message)

internal data class InlineSubscriptionPaymentSettingsXcb421fa6Inspection(
  public val matchesSubscriptionsResourcePaymentSettings: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesSubscriptionsResourcePaymentSettings).count { it }
}

/**
 * Payment settings passed on to invoices created by the subscription.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/subscription/properties/payment_settings
 */
@Serializable(with = InlineSubscriptionPaymentSettingsXcb421fa6.Serializer::class)
public class InlineSubscriptionPaymentSettingsXcb421fa6 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineSubscriptionPaymentSettingsXcb421fa6Inspection,
) {
  public val subscriptionsResourcePaymentSettings: SubscriptionsResourcePaymentSettingsView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesSubscriptionsResourcePaymentSettings) json.decodeFromJsonElement<SubscriptionsResourcePaymentSettingsView>(raw) else null }

  public val matchedBranches: Set<InlineSubscriptionPaymentSettingsXcb421fa6Branch>
    get() = buildSet {
      if (inspection.matchesSubscriptionsResourcePaymentSettings) add(InlineSubscriptionPaymentSettingsXcb421fa6Branch.SubscriptionsResourcePaymentSettings)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineSubscriptionPaymentSettingsXcb421fa6 {
      val inspection = inspectInlineSubscriptionPaymentSettingsXcb421fa6(raw)
      if (inspection.matchCount == 0) {
        throw InlineSubscriptionPaymentSettingsXcb421fa6NoMatchException("InlineSubscriptionPaymentSettingsXcb421fa6 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineSubscriptionPaymentSettingsXcb421fa6(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineSubscriptionPaymentSettingsXcb421fa6> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineSubscriptionPaymentSettingsXcb421fa6 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineSubscriptionPaymentSettingsXcb421fa6")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineSubscriptionPaymentSettingsXcb421fa6) {
      encoder.requireJsonEncoder("InlineSubscriptionPaymentSettingsXcb421fa6").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineSubscriptionPaymentSettingsXcb421fa6(element: JsonElement): InlineSubscriptionPaymentSettingsXcb421fa6Inspection {
  val raw = element as? JsonObject ?: return InlineSubscriptionPaymentSettingsXcb421fa6Inspection(
    matchesSubscriptionsResourcePaymentSettings = false,
    failures = listOf("SubscriptionsResourcePaymentSettings: expected JSON object"),
  )
  val matchesSubscriptionsResourcePaymentSettings = true
  return InlineSubscriptionPaymentSettingsXcb421fa6Inspection(
    matchesSubscriptionsResourcePaymentSettings = matchesSubscriptionsResourcePaymentSettings,
    failures = buildList {
      if (!matchesSubscriptionsResourcePaymentSettings) add("SubscriptionsResourcePaymentSettings: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
