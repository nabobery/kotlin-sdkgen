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

public enum class InlineSubscriptionsResourcePaymentMethodOptionsCardX188087bcBranch {
  SubscriptionPaymentMethodOptionsCard,
}

public sealed class InlineSubscriptionsResourcePaymentMethodOptionsCardX188087bcDecodingException(
  message: String,
) : SerializationException(message)

public class InlineSubscriptionsResourcePaymentMethodOptionsCardX188087bcNoMatchException(
  message: String,
) : InlineSubscriptionsResourcePaymentMethodOptionsCardX188087bcDecodingException(message)

internal data class InlineSubscriptionsResourcePaymentMethodOptionsCardX188087bcInspection(
  public val matchesSubscriptionPaymentMethodOptionsCard: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesSubscriptionPaymentMethodOptionsCard).count { it }
}

/**
 * This sub-hash contains details about the Card payment method options to pass to invoices created by the subscription.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/subscriptions_resource_payment_method_options/properties/card
 */
@Serializable(with = InlineSubscriptionsResourcePaymentMethodOptionsCardX188087bc.Serializer::class)
public class InlineSubscriptionsResourcePaymentMethodOptionsCardX188087bc internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineSubscriptionsResourcePaymentMethodOptionsCardX188087bcInspection,
) {
  public val subscriptionPaymentMethodOptionsCard: SubscriptionPaymentMethodOptionsCardView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesSubscriptionPaymentMethodOptionsCard) json.decodeFromJsonElement<SubscriptionPaymentMethodOptionsCardView>(raw) else null }

  public val matchedBranches:
      Set<InlineSubscriptionsResourcePaymentMethodOptionsCardX188087bcBranch>
    get() = buildSet {
      if (inspection.matchesSubscriptionPaymentMethodOptionsCard) add(InlineSubscriptionsResourcePaymentMethodOptionsCardX188087bcBranch.SubscriptionPaymentMethodOptionsCard)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineSubscriptionsResourcePaymentMethodOptionsCardX188087bc {
      val inspection = inspectInlineSubscriptionsResourcePaymentMethodOptionsCardX188087bc(raw)
      if (inspection.matchCount == 0) {
        throw InlineSubscriptionsResourcePaymentMethodOptionsCardX188087bcNoMatchException("InlineSubscriptionsResourcePaymentMethodOptionsCardX188087bc matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineSubscriptionsResourcePaymentMethodOptionsCardX188087bc(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineSubscriptionsResourcePaymentMethodOptionsCardX188087bc> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineSubscriptionsResourcePaymentMethodOptionsCardX188087bc {
      val jsonDecoder = decoder.requireJsonDecoder("InlineSubscriptionsResourcePaymentMethodOptionsCardX188087bc")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineSubscriptionsResourcePaymentMethodOptionsCardX188087bc) {
      encoder.requireJsonEncoder("InlineSubscriptionsResourcePaymentMethodOptionsCardX188087bc").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineSubscriptionsResourcePaymentMethodOptionsCardX188087bc(element: JsonElement): InlineSubscriptionsResourcePaymentMethodOptionsCardX188087bcInspection {
  val raw = element as? JsonObject ?: return InlineSubscriptionsResourcePaymentMethodOptionsCardX188087bcInspection(
    matchesSubscriptionPaymentMethodOptionsCard = false,
    failures = listOf("SubscriptionPaymentMethodOptionsCard: expected JSON object"),
  )
  val matchesSubscriptionPaymentMethodOptionsCard = true
  return InlineSubscriptionsResourcePaymentMethodOptionsCardX188087bcInspection(
    matchesSubscriptionPaymentMethodOptionsCard = matchesSubscriptionPaymentMethodOptionsCard,
    failures = buildList {
      if (!matchesSubscriptionPaymentMethodOptionsCard) add("SubscriptionPaymentMethodOptionsCard: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
