package com.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Toggle settings for enabling/disabling a feature
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/treasury_financial_accounts_resource_toggle_settings
 */
@Serializable(with = TreasuryFinancialAccountsResourceToggleSettings.Serializer::class)
public class TreasuryFinancialAccountsResourceToggleSettings(
  /**
   * Whether the FinancialAccount should have the Feature.
   */
  public val requested: Boolean,
  /**
   * Whether the Feature is operational.
   */
  public val status: InlineTreasuryFinancialAccountsResourceToggleSettingsStatusX34733635,
  statusDetails: List<TreasuryFinancialAccountsResourceTogglesSettingStatusDetails>,
) {
  /**
   * Additional details; includes at least one entry when the status is not `active`.
   */
  public val statusDetails: List<TreasuryFinancialAccountsResourceTogglesSettingStatusDetails> =
      statusDetails.toList()

  public class Builder {
    private var requestedValue: Boolean? = null

    public var requested: Boolean
      get() = requireNotNull(requestedValue) { "requested is required" }
      set(`value`) {
        requestedValue = value
      }

    private var statusValue: InlineTreasuryFinancialAccountsResourceToggleSettingsStatusX34733635? =
        null

    public var status: InlineTreasuryFinancialAccountsResourceToggleSettingsStatusX34733635
      get() = requireNotNull(statusValue) { "status is required" }
      set(`value`) {
        statusValue = value
      }

    private var statusDetailsValue:
        List<TreasuryFinancialAccountsResourceTogglesSettingStatusDetails>? = null

    public var statusDetails: List<TreasuryFinancialAccountsResourceTogglesSettingStatusDetails>
      get() = requireNotNull(statusDetailsValue) { "statusDetails is required" }.toList()
      set(`value`) {
        statusDetailsValue = value.toList()
      }

    public fun build(): TreasuryFinancialAccountsResourceToggleSettings {
      check(requestedValue != null) { "requested is required" }
      check(statusValue != null) { "status is required" }
      check(statusDetailsValue != null) { "statusDetails is required" }
      return TreasuryFinancialAccountsResourceToggleSettings(
        requested = requested,
        status = status,
        statusDetails = statusDetails,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): TreasuryFinancialAccountsResourceToggleSettings = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<TreasuryFinancialAccountsResourceToggleSettings> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): TreasuryFinancialAccountsResourceToggleSettings {
      val jsonDecoder = decoder.requireJsonDecoder("TreasuryFinancialAccountsResourceToggleSettings")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("TreasuryFinancialAccountsResourceToggleSettings must be a JSON object")
      val requested = json.decodeRequired<Boolean>(rawObject, "requested")
      val status = json.decodeRequired<InlineTreasuryFinancialAccountsResourceToggleSettingsStatusX34733635>(rawObject, "status")
      val statusDetails = json.decodeRequired<List<TreasuryFinancialAccountsResourceTogglesSettingStatusDetails>>(rawObject, "status_details")
      return TreasuryFinancialAccountsResourceToggleSettings(
        requested = requested,
        status = status,
        statusDetails = statusDetails,
      )
    }

    override fun serialize(encoder: Encoder, `value`: TreasuryFinancialAccountsResourceToggleSettings) {
      val jsonEncoder = encoder.requireJsonEncoder("TreasuryFinancialAccountsResourceToggleSettings")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("requested", json.encodeToJsonElement(value.requested))
        put("status", json.encodeToJsonElement(value.status))
        put("status_details", json.encodeToJsonElement(value.statusDetails))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun treasuryFinancialAccountsResourceToggleSettings(block: TreasuryFinancialAccountsResourceToggleSettings.Builder.() -> Unit): TreasuryFinancialAccountsResourceToggleSettings = TreasuryFinancialAccountsResourceToggleSettings.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("TreasuryFinancialAccountsResourceToggleSettings is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
