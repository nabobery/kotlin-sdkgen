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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineSubscriptionSchedulesResourceDefaultSettingsTransferDataX6aa83edfBranch {
  SubscriptionTransferData,
}

public sealed class InlineSubscriptionSchedulesResourceDefaultSettingsTransferDataX6aa83edfDecodingException(
  message: String,
) : SerializationException(message)

public class InlineSubscriptionSchedulesResourceDefaultSettingsTransferDataX6aa83edfNoMatchException(
  message: String,
) : InlineSubscriptionSchedulesResourceDefaultSettingsTransferDataX6aa83edfDecodingException(message)

internal data class InlineSubscriptionSchedulesResourceDefaultSettingsTransferDataX6aa83edfInspection(
  public val matchesSubscriptionTransferData: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesSubscriptionTransferData).count { it }
}

/**
 * The account (if any) the associated subscription's payments will be attributed to for tax reporting, and where funds
 * from each payment will be transferred to for each of the subscription's invoices.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/subscription_schedules_resource_default_settings/properties/transfer
 * _data
 */
@Serializable(with = InlineSubscriptionSchedulesResourceDefaultSettingsTransferDataX6aa83edf.Serializer::class)
public class InlineSubscriptionSchedulesResourceDefaultSettingsTransferDataX6aa83edf internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineSubscriptionSchedulesResourceDefaultSettingsTransferDataX6aa83edfInspection,
) {
  public val subscriptionTransferData: SubscriptionTransferDataView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesSubscriptionTransferData) json.decodeFromJsonElement<SubscriptionTransferDataView>(raw) else null }

  public val matchedBranches:
      Set<InlineSubscriptionSchedulesResourceDefaultSettingsTransferDataX6aa83edfBranch>
    get() = buildSet {
      if (inspection.matchesSubscriptionTransferData) add(InlineSubscriptionSchedulesResourceDefaultSettingsTransferDataX6aa83edfBranch.SubscriptionTransferData)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineSubscriptionSchedulesResourceDefaultSettingsTransferDataX6aa83edf {
      val inspection = inspectInlineSubscriptionSchedulesResourceDefaultSettingsTransferDataX6aa83edf(raw)
      if (inspection.matchCount == 0) {
        throw InlineSubscriptionSchedulesResourceDefaultSettingsTransferDataX6aa83edfNoMatchException("InlineSubscriptionSchedulesResourceDefaultSettingsTransferDataX6aa83edf matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineSubscriptionSchedulesResourceDefaultSettingsTransferDataX6aa83edf(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineSubscriptionSchedulesResourceDefaultSettingsTransferDataX6aa83edf> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineSubscriptionSchedulesResourceDefaultSettingsTransferDataX6aa83edf {
      val jsonDecoder = decoder.requireJsonDecoder("InlineSubscriptionSchedulesResourceDefaultSettingsTransferDataX6aa83edf")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineSubscriptionSchedulesResourceDefaultSettingsTransferDataX6aa83edf) {
      encoder.requireJsonEncoder("InlineSubscriptionSchedulesResourceDefaultSettingsTransferDataX6aa83edf").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineSubscriptionSchedulesResourceDefaultSettingsTransferDataX6aa83edf(element: JsonElement): InlineSubscriptionSchedulesResourceDefaultSettingsTransferDataX6aa83edfInspection {
  val raw = element as? JsonObject ?: return InlineSubscriptionSchedulesResourceDefaultSettingsTransferDataX6aa83edfInspection(
    matchesSubscriptionTransferData = false,
    failures = listOf("SubscriptionTransferData: expected JSON object"),
  )
  val matchesSubscriptionTransferData = raw["destination"] != null
  return InlineSubscriptionSchedulesResourceDefaultSettingsTransferDataX6aa83edfInspection(
    matchesSubscriptionTransferData = matchesSubscriptionTransferData,
    failures = buildList {
      if (!matchesSubscriptionTransferData) add("SubscriptionTransferData: required properties 'destination' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
