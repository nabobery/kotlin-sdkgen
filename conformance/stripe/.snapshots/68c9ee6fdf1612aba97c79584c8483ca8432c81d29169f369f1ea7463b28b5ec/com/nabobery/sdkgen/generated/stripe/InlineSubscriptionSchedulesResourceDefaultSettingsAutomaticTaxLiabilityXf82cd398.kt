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

public enum class InlineSubscriptionSchedulesResourceDefaultSettingsAutomaticTaxLiabilityXf82cd398Branch {
  ConnectAccountReference,
}

public sealed class InlineSubscriptionSchedulesResourceDefaultSettingsAutomaticTaxLiabilityXf82cd398DecodingException(
  message: String,
) : SerializationException(message)

public class InlineSubscriptionSchedulesResourceDefaultSettingsAutomaticTaxLiabilityXf82cd398NoMatchException(
  message: String,
) : InlineSubscriptionSchedulesResourceDefaultSettingsAutomaticTaxLiabilityXf82cd398DecodingException(message)

internal data class InlineSubscriptionSchedulesResourceDefaultSettingsAutomaticTaxLiabilityXf82cd398Inspection(
  public val matchesConnectAccountReference: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesConnectAccountReference).count { it }
}

/**
 * The account that's liable for tax. If set, the business address and tax registrations required to perform the tax
 * calculation are loaded from this account. The tax transaction is returned in the report of the connected account.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/subscription_schedules_resource_default_settings_automatic_tax/prope
 * rties/liability
 */
@Serializable(with = InlineSubscriptionSchedulesResourceDefaultSettingsAutomaticTaxLiabilityXf82cd398.Serializer::class)
public class InlineSubscriptionSchedulesResourceDefaultSettingsAutomaticTaxLiabilityXf82cd398 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineSubscriptionSchedulesResourceDefaultSettingsAutomaticTaxLiabilityXf82cd398Inspection,
) {
  public val connectAccountReference: ConnectAccountReferenceView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesConnectAccountReference) json.decodeFromJsonElement<ConnectAccountReferenceView>(raw) else null }

  public val matchedBranches:
      Set<InlineSubscriptionSchedulesResourceDefaultSettingsAutomaticTaxLiabilityXf82cd398Branch>
    get() = buildSet {
      if (inspection.matchesConnectAccountReference) add(InlineSubscriptionSchedulesResourceDefaultSettingsAutomaticTaxLiabilityXf82cd398Branch.ConnectAccountReference)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineSubscriptionSchedulesResourceDefaultSettingsAutomaticTaxLiabilityXf82cd398 {
      val inspection = inspectInlineSubscriptionSchedulesResourceDefaultSettingsAutomaticTaxLiabilityXf82cd398(raw)
      if (inspection.matchCount == 0) {
        throw InlineSubscriptionSchedulesResourceDefaultSettingsAutomaticTaxLiabilityXf82cd398NoMatchException("InlineSubscriptionSchedulesResourceDefaultSettingsAutomaticTaxLiabilityXf82cd398 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineSubscriptionSchedulesResourceDefaultSettingsAutomaticTaxLiabilityXf82cd398(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineSubscriptionSchedulesResourceDefaultSettingsAutomaticTaxLiabilityXf82cd398> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineSubscriptionSchedulesResourceDefaultSettingsAutomaticTaxLiabilityXf82cd398 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineSubscriptionSchedulesResourceDefaultSettingsAutomaticTaxLiabilityXf82cd398")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineSubscriptionSchedulesResourceDefaultSettingsAutomaticTaxLiabilityXf82cd398) {
      encoder.requireJsonEncoder("InlineSubscriptionSchedulesResourceDefaultSettingsAutomaticTaxLiabilityXf82cd398").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineSubscriptionSchedulesResourceDefaultSettingsAutomaticTaxLiabilityXf82cd398(element: JsonElement): InlineSubscriptionSchedulesResourceDefaultSettingsAutomaticTaxLiabilityXf82cd398Inspection {
  val raw = element as? JsonObject ?: return InlineSubscriptionSchedulesResourceDefaultSettingsAutomaticTaxLiabilityXf82cd398Inspection(
    matchesConnectAccountReference = false,
    failures = listOf("ConnectAccountReference: expected JSON object"),
  )
  val matchesConnectAccountReference = raw["type"] != null
  return InlineSubscriptionSchedulesResourceDefaultSettingsAutomaticTaxLiabilityXf82cd398Inspection(
    matchesConnectAccountReference = matchesConnectAccountReference,
    failures = buildList {
      if (!matchesConnectAccountReference) add("ConnectAccountReference: required properties 'type' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
