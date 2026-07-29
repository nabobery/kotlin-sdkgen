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

public enum class InlineSubscriptionsResourcePaymentSettingsPaymentMethodOptionsX5727ff7dBranch {
  SubscriptionsResourcePaymentMethodOptions,
}

public sealed class InlineSubscriptionsResourcePaymentSettingsPaymentMethodOptionsX5727ff7dDecodingException(
  message: String,
) : SerializationException(message)

public class InlineSubscriptionsResourcePaymentSettingsPaymentMethodOptionsX5727ff7dNoMatchException(
  message: String,
) : InlineSubscriptionsResourcePaymentSettingsPaymentMethodOptionsX5727ff7dDecodingException(message)

internal data class InlineSubscriptionsResourcePaymentSettingsPaymentMethodOptionsX5727ff7dInspection(
  public val matchesSubscriptionsResourcePaymentMethodOptions: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesSubscriptionsResourcePaymentMethodOptions).count { it }
}

/**
 * Payment-method-specific configuration to provide to invoices created by the subscription.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/subscriptions_resource_payment_settings/properties/payment_method_op
 * tions
 */
@Serializable(with = InlineSubscriptionsResourcePaymentSettingsPaymentMethodOptionsX5727ff7d.Serializer::class)
public class InlineSubscriptionsResourcePaymentSettingsPaymentMethodOptionsX5727ff7d internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineSubscriptionsResourcePaymentSettingsPaymentMethodOptionsX5727ff7dInspection,
) {
  public val subscriptionsResourcePaymentMethodOptions:
      SubscriptionsResourcePaymentMethodOptionsView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesSubscriptionsResourcePaymentMethodOptions) json.decodeFromJsonElement<SubscriptionsResourcePaymentMethodOptionsView>(raw) else null }

  public val matchedBranches:
      Set<InlineSubscriptionsResourcePaymentSettingsPaymentMethodOptionsX5727ff7dBranch>
    get() = buildSet {
      if (inspection.matchesSubscriptionsResourcePaymentMethodOptions) add(InlineSubscriptionsResourcePaymentSettingsPaymentMethodOptionsX5727ff7dBranch.SubscriptionsResourcePaymentMethodOptions)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineSubscriptionsResourcePaymentSettingsPaymentMethodOptionsX5727ff7d {
      val inspection = inspectInlineSubscriptionsResourcePaymentSettingsPaymentMethodOptionsX5727ff7d(raw)
      if (inspection.matchCount == 0) {
        throw InlineSubscriptionsResourcePaymentSettingsPaymentMethodOptionsX5727ff7dNoMatchException("InlineSubscriptionsResourcePaymentSettingsPaymentMethodOptionsX5727ff7d matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineSubscriptionsResourcePaymentSettingsPaymentMethodOptionsX5727ff7d(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineSubscriptionsResourcePaymentSettingsPaymentMethodOptionsX5727ff7d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineSubscriptionsResourcePaymentSettingsPaymentMethodOptionsX5727ff7d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineSubscriptionsResourcePaymentSettingsPaymentMethodOptionsX5727ff7d")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineSubscriptionsResourcePaymentSettingsPaymentMethodOptionsX5727ff7d) {
      encoder.requireJsonEncoder("InlineSubscriptionsResourcePaymentSettingsPaymentMethodOptionsX5727ff7d").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineSubscriptionsResourcePaymentSettingsPaymentMethodOptionsX5727ff7d(element: JsonElement): InlineSubscriptionsResourcePaymentSettingsPaymentMethodOptionsX5727ff7dInspection {
  val raw = element as? JsonObject ?: return InlineSubscriptionsResourcePaymentSettingsPaymentMethodOptionsX5727ff7dInspection(
    matchesSubscriptionsResourcePaymentMethodOptions = false,
    failures = listOf("SubscriptionsResourcePaymentMethodOptions: expected JSON object"),
  )
  val matchesSubscriptionsResourcePaymentMethodOptions = true
  return InlineSubscriptionsResourcePaymentSettingsPaymentMethodOptionsX5727ff7dInspection(
    matchesSubscriptionsResourcePaymentMethodOptions = matchesSubscriptionsResourcePaymentMethodOptions,
    failures = buildList {
      if (!matchesSubscriptionsResourcePaymentMethodOptions) add("SubscriptionsResourcePaymentMethodOptions: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
