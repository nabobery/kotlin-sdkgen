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

public enum class InlineSubscriptionsResourcePaymentMethodOptionsPixX520b5633Branch {
  SubscriptionPaymentMethodOptionsPix,
}

public sealed class InlineSubscriptionsResourcePaymentMethodOptionsPixX520b5633DecodingException(
  message: String,
) : SerializationException(message)

public class InlineSubscriptionsResourcePaymentMethodOptionsPixX520b5633NoMatchException(
  message: String,
) : InlineSubscriptionsResourcePaymentMethodOptionsPixX520b5633DecodingException(message)

internal data class InlineSubscriptionsResourcePaymentMethodOptionsPixX520b5633Inspection(
  public val matchesSubscriptionPaymentMethodOptionsPix: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesSubscriptionPaymentMethodOptionsPix).count { it }
}

/**
 * This sub-hash contains details about the Pix payment method options to pass to invoices created by the subscription.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/subscriptions_resource_payment_method_options/properties/pix
 */
@Serializable(with = InlineSubscriptionsResourcePaymentMethodOptionsPixX520b5633.Serializer::class)
public class InlineSubscriptionsResourcePaymentMethodOptionsPixX520b5633 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineSubscriptionsResourcePaymentMethodOptionsPixX520b5633Inspection,
) {
  public val subscriptionPaymentMethodOptionsPix: SubscriptionPaymentMethodOptionsPixView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesSubscriptionPaymentMethodOptionsPix) json.decodeFromJsonElement<SubscriptionPaymentMethodOptionsPixView>(raw) else null }

  public val matchedBranches: Set<InlineSubscriptionsResourcePaymentMethodOptionsPixX520b5633Branch>
    get() = buildSet {
      if (inspection.matchesSubscriptionPaymentMethodOptionsPix) add(InlineSubscriptionsResourcePaymentMethodOptionsPixX520b5633Branch.SubscriptionPaymentMethodOptionsPix)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineSubscriptionsResourcePaymentMethodOptionsPixX520b5633 {
      val inspection = inspectInlineSubscriptionsResourcePaymentMethodOptionsPixX520b5633(raw)
      if (inspection.matchCount == 0) {
        throw InlineSubscriptionsResourcePaymentMethodOptionsPixX520b5633NoMatchException("InlineSubscriptionsResourcePaymentMethodOptionsPixX520b5633 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineSubscriptionsResourcePaymentMethodOptionsPixX520b5633(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineSubscriptionsResourcePaymentMethodOptionsPixX520b5633> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineSubscriptionsResourcePaymentMethodOptionsPixX520b5633 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineSubscriptionsResourcePaymentMethodOptionsPixX520b5633")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineSubscriptionsResourcePaymentMethodOptionsPixX520b5633) {
      encoder.requireJsonEncoder("InlineSubscriptionsResourcePaymentMethodOptionsPixX520b5633").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineSubscriptionsResourcePaymentMethodOptionsPixX520b5633(element: JsonElement): InlineSubscriptionsResourcePaymentMethodOptionsPixX520b5633Inspection {
  val raw = element as? JsonObject ?: return InlineSubscriptionsResourcePaymentMethodOptionsPixX520b5633Inspection(
    matchesSubscriptionPaymentMethodOptionsPix = false,
    failures = listOf("SubscriptionPaymentMethodOptionsPix: expected JSON object"),
  )
  val matchesSubscriptionPaymentMethodOptionsPix = true
  return InlineSubscriptionsResourcePaymentMethodOptionsPixX520b5633Inspection(
    matchesSubscriptionPaymentMethodOptionsPix = matchesSubscriptionPaymentMethodOptionsPix,
    failures = buildList {
      if (!matchesSubscriptionPaymentMethodOptionsPix) add("SubscriptionPaymentMethodOptionsPix: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
