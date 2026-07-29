package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Additional details on the FinancialAccount Features information.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/treasury_financial_accounts_resource_toggles_setting_status_details
 */
@Serializable(with = TreasuryFinancialAccountsResourceTogglesSettingStatusDetails.Serializer::class)
public class TreasuryFinancialAccountsResourceTogglesSettingStatusDetails(
  /**
   * Represents the reason why the status is `pending` or `restricted`.
   */
  public val code: InlineTreasuryFinancialAccountsResourceTogglesSettingStatusDetailsCodeXbc4381be,
  /**
   * Represents what the user should do, if anything, to activate the Feature.
   */
  public val resolution: InlineTreasuryFinancialAccee56ResolutionX94fe9ba9? = null,
  /**
   * The `platform_restrictions` that are restricting this Feature.
   */
  public val restriction: InlineTreasuryFinancialAccee56RestrictionX20aa7a76? = null,
) {
  public class Builder {
    private var codeValue:
        InlineTreasuryFinancialAccountsResourceTogglesSettingStatusDetailsCodeXbc4381be? = null

    public var code: InlineTreasuryFinancialAccountsResourceTogglesSettingStatusDetailsCodeXbc4381be
      get() = requireNotNull(codeValue) { "code is required" }
      set(`value`) {
        codeValue = value
      }

    /**
     * Represents what the user should do, if anything, to activate the Feature.
     */
    public var resolution: InlineTreasuryFinancialAccee56ResolutionX94fe9ba9? = null

    /**
     * The `platform_restrictions` that are restricting this Feature.
     */
    public var restriction: InlineTreasuryFinancialAccee56RestrictionX20aa7a76? = null

    public fun build(): TreasuryFinancialAccountsResourceTogglesSettingStatusDetails {
      check(codeValue != null) { "code is required" }
      return TreasuryFinancialAccountsResourceTogglesSettingStatusDetails(
        code = code,
        resolution = resolution,
        restriction = restriction,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): TreasuryFinancialAccountsResourceTogglesSettingStatusDetails = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<TreasuryFinancialAccountsResourceTogglesSettingStatusDetails> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): TreasuryFinancialAccountsResourceTogglesSettingStatusDetails {
      val jsonDecoder = decoder.requireJsonDecoder("TreasuryFinancialAccountsResourceTogglesSettingStatusDetails")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("TreasuryFinancialAccountsResourceTogglesSettingStatusDetails must be a JSON object")
      val code = json.decodeRequired<InlineTreasuryFinancialAccountsResourceTogglesSettingStatusDetailsCodeXbc4381be>(rawObject, "code")
      return TreasuryFinancialAccountsResourceTogglesSettingStatusDetails(
        code = code,
        resolution = rawObject["resolution"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineTreasuryFinancialAccee56ResolutionX94fe9ba9?>(element) },
        restriction = rawObject["restriction"]?.let { json.decodeFromJsonElement<InlineTreasuryFinancialAccee56RestrictionX20aa7a76>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: TreasuryFinancialAccountsResourceTogglesSettingStatusDetails) {
      val jsonEncoder = encoder.requireJsonEncoder("TreasuryFinancialAccountsResourceTogglesSettingStatusDetails")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("code", json.encodeToJsonElement(value.code))
        value.resolution?.let { put("resolution", json.encodeToJsonElement(it)) }
        value.restriction?.let { put("restriction", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun treasuryFinancialAccountsResourceTogglesSettingStatusDetails(block: TreasuryFinancialAccountsResourceTogglesSettingStatusDetails.Builder.() -> Unit): TreasuryFinancialAccountsResourceTogglesSettingStatusDetails = TreasuryFinancialAccountsResourceTogglesSettingStatusDetails.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("TreasuryFinancialAccountsResourceTogglesSettingStatusDetails is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
