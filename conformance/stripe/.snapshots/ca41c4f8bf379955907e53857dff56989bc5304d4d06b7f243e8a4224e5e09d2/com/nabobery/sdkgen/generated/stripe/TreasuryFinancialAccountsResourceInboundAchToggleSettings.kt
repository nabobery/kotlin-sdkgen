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
 * Toggle settings for enabling/disabling an inbound ACH specific feature
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/treasury_financial_accounts_resource_inbound_ach_toggle_settings
 */
@Serializable(with = TreasuryFinancialAccountsResourceInboundAchToggleSettings.Serializer::class)
public class TreasuryFinancialAccountsResourceInboundAchToggleSettings(
  /**
   * Whether the FinancialAccount should have the Feature.
   */
  public val requested: Boolean,
  /**
   * Whether the Feature is operational.
   */
  public val status: InlineTreasuryFinancialAccountsResourceInboundAchToggleSettingsStatusX3d8f8ab2,
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

    private var statusValue:
        InlineTreasuryFinancialAccountsResourceInboundAchToggleSettingsStatusX3d8f8ab2? = null

    public var status:
        InlineTreasuryFinancialAccountsResourceInboundAchToggleSettingsStatusX3d8f8ab2
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

    public fun build(): TreasuryFinancialAccountsResourceInboundAchToggleSettings {
      check(requestedValue != null) { "requested is required" }
      check(statusValue != null) { "status is required" }
      check(statusDetailsValue != null) { "statusDetails is required" }
      return TreasuryFinancialAccountsResourceInboundAchToggleSettings(
        requested = requested,
        status = status,
        statusDetails = statusDetails,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): TreasuryFinancialAccountsResourceInboundAchToggleSettings = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<TreasuryFinancialAccountsResourceInboundAchToggleSettings> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): TreasuryFinancialAccountsResourceInboundAchToggleSettings {
      val jsonDecoder = decoder.requireJsonDecoder("TreasuryFinancialAccountsResourceInboundAchToggleSettings")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("TreasuryFinancialAccountsResourceInboundAchToggleSettings must be a JSON object")
      val requested = json.decodeRequired<Boolean>(rawObject, "requested")
      val status = json.decodeRequired<InlineTreasuryFinancialAccountsResourceInboundAchToggleSettingsStatusX3d8f8ab2>(rawObject, "status")
      val statusDetails = json.decodeRequired<List<TreasuryFinancialAccountsResourceTogglesSettingStatusDetails>>(rawObject, "status_details")
      return TreasuryFinancialAccountsResourceInboundAchToggleSettings(
        requested = requested,
        status = status,
        statusDetails = statusDetails,
      )
    }

    override fun serialize(encoder: Encoder, `value`: TreasuryFinancialAccountsResourceInboundAchToggleSettings) {
      val jsonEncoder = encoder.requireJsonEncoder("TreasuryFinancialAccountsResourceInboundAchToggleSettings")
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

public fun treasuryFinancialAccountsResourceInboundAchToggleSettings(block: TreasuryFinancialAccountsResourceInboundAchToggleSettings.Builder.() -> Unit): TreasuryFinancialAccountsResourceInboundAchToggleSettings = TreasuryFinancialAccountsResourceInboundAchToggleSettings.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("TreasuryFinancialAccountsResourceInboundAchToggleSettings is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
