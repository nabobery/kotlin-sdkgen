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

public enum class InlineSubscriptionSchedulePhaseConfigurationInvoiceSettingsX552904e1Branch {
  InvoiceSettingSubscriptionSchedulePhaseSetting,
}

public sealed class InlineSubscriptionSchedulePhaseConfigurationInvoiceSettingsX552904e1DecodingException(
  message: String,
) : SerializationException(message)

public class InlineSubscriptionSchedulePhaseConfigurationInvoiceSettingsX552904e1NoMatchException(
  message: String,
) : InlineSubscriptionSchedulePhaseConfigurationInvoiceSettingsX552904e1DecodingException(message)

internal data class InlineSubscriptionSchedulePhaseConfigurationInvoiceSettingsX552904e1Inspection(
  public val matchesInvoiceSettingSubscriptionSchedulePhaseSetting: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInvoiceSettingSubscriptionSchedulePhaseSetting).count { it }
}

/**
 * The invoice settings applicable during this phase.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/subscription_schedule_phase_configuration/properties/invoice_setting
 * s
 */
@Serializable(with = InlineSubscriptionSchedulePhaseConfigurationInvoiceSettingsX552904e1.Serializer::class)
public class InlineSubscriptionSchedulePhaseConfigurationInvoiceSettingsX552904e1 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineSubscriptionSchedulePhaseConfigurationInvoiceSettingsX552904e1Inspection,
) {
  public val invoiceSettingSubscriptionSchedulePhaseSetting:
      InvoiceSettingSubscriptionSchedulePhaseSettingView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInvoiceSettingSubscriptionSchedulePhaseSetting) json.decodeFromJsonElement<InvoiceSettingSubscriptionSchedulePhaseSettingView>(raw) else null }

  public val matchedBranches:
      Set<InlineSubscriptionSchedulePhaseConfigurationInvoiceSettingsX552904e1Branch>
    get() = buildSet {
      if (inspection.matchesInvoiceSettingSubscriptionSchedulePhaseSetting) add(InlineSubscriptionSchedulePhaseConfigurationInvoiceSettingsX552904e1Branch.InvoiceSettingSubscriptionSchedulePhaseSetting)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineSubscriptionSchedulePhaseConfigurationInvoiceSettingsX552904e1 {
      val inspection = inspectInlineSubscriptionSchedulePhaseConfigurationInvoiceSettingsX552904e1(raw)
      if (inspection.matchCount == 0) {
        throw InlineSubscriptionSchedulePhaseConfigurationInvoiceSettingsX552904e1NoMatchException("InlineSubscriptionSchedulePhaseConfigurationInvoiceSettingsX552904e1 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineSubscriptionSchedulePhaseConfigurationInvoiceSettingsX552904e1(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineSubscriptionSchedulePhaseConfigurationInvoiceSettingsX552904e1> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineSubscriptionSchedulePhaseConfigurationInvoiceSettingsX552904e1 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineSubscriptionSchedulePhaseConfigurationInvoiceSettingsX552904e1")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineSubscriptionSchedulePhaseConfigurationInvoiceSettingsX552904e1) {
      encoder.requireJsonEncoder("InlineSubscriptionSchedulePhaseConfigurationInvoiceSettingsX552904e1").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineSubscriptionSchedulePhaseConfigurationInvoiceSettingsX552904e1(element: JsonElement): InlineSubscriptionSchedulePhaseConfigurationInvoiceSettingsX552904e1Inspection {
  val raw = element as? JsonObject ?: return InlineSubscriptionSchedulePhaseConfigurationInvoiceSettingsX552904e1Inspection(
    matchesInvoiceSettingSubscriptionSchedulePhaseSetting = false,
    failures = listOf("InvoiceSettingSubscriptionSchedulePhaseSetting: expected JSON object"),
  )
  val matchesInvoiceSettingSubscriptionSchedulePhaseSetting = true
  return InlineSubscriptionSchedulePhaseConfigurationInvoiceSettingsX552904e1Inspection(
    matchesInvoiceSettingSubscriptionSchedulePhaseSetting = matchesInvoiceSettingSubscriptionSchedulePhaseSetting,
    failures = buildList {
      if (!matchesInvoiceSettingSubscriptionSchedulePhaseSetting) add("InvoiceSettingSubscriptionSchedulePhaseSetting: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
