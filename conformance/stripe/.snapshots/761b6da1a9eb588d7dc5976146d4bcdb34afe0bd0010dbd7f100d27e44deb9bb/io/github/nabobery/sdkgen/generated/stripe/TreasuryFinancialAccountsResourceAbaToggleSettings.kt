package io.github.nabobery.sdkgen.generated.stripe

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
 * Toggle settings for enabling/disabling the ABA address feature
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/treasury_financial_accounts_resource_aba_toggle_settings
 */
@Serializable(with = TreasuryFinancialAccountsResourceAbaToggleSettings.Serializer::class)
public class TreasuryFinancialAccountsResourceAbaToggleSettings(
  /**
   * Whether the FinancialAccount should have the Feature.
   */
  public val requested: Boolean,
  /**
   * Whether the Feature is operational.
   */
  public val status: InlineTreasuryFinancialAccountsResourceAbaToggleSettingsStatusXf80f6c96,
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
        InlineTreasuryFinancialAccountsResourceAbaToggleSettingsStatusXf80f6c96? = null

    public var status: InlineTreasuryFinancialAccountsResourceAbaToggleSettingsStatusXf80f6c96
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

    public fun build(): TreasuryFinancialAccountsResourceAbaToggleSettings {
      check(requestedValue != null) { "requested is required" }
      check(statusValue != null) { "status is required" }
      check(statusDetailsValue != null) { "statusDetails is required" }
      return TreasuryFinancialAccountsResourceAbaToggleSettings(
        requested = requested,
        status = status,
        statusDetails = statusDetails,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): TreasuryFinancialAccountsResourceAbaToggleSettings = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<TreasuryFinancialAccountsResourceAbaToggleSettings> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): TreasuryFinancialAccountsResourceAbaToggleSettings {
      val jsonDecoder = decoder.requireJsonDecoder("TreasuryFinancialAccountsResourceAbaToggleSettings")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("TreasuryFinancialAccountsResourceAbaToggleSettings must be a JSON object")
      val requested = json.decodeRequired<Boolean>(rawObject, "requested")
      val status = json.decodeRequired<InlineTreasuryFinancialAccountsResourceAbaToggleSettingsStatusXf80f6c96>(rawObject, "status")
      val statusDetails = json.decodeRequired<List<TreasuryFinancialAccountsResourceTogglesSettingStatusDetails>>(rawObject, "status_details")
      return TreasuryFinancialAccountsResourceAbaToggleSettings(
        requested = requested,
        status = status,
        statusDetails = statusDetails,
      )
    }

    override fun serialize(encoder: Encoder, `value`: TreasuryFinancialAccountsResourceAbaToggleSettings) {
      val jsonEncoder = encoder.requireJsonEncoder("TreasuryFinancialAccountsResourceAbaToggleSettings")
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

public fun treasuryFinancialAccountsResourceAbaToggleSettings(block: TreasuryFinancialAccountsResourceAbaToggleSettings.Builder.() -> Unit): TreasuryFinancialAccountsResourceAbaToggleSettings = TreasuryFinancialAccountsResourceAbaToggleSettings.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("TreasuryFinancialAccountsResourceAbaToggleSettings is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
