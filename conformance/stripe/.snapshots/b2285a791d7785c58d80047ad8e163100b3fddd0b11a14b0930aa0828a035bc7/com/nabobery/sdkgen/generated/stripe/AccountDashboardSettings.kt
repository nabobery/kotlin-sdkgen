package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.put

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/account_dashboard_settings
 */
@Serializable(with = AccountDashboardSettings.Serializer::class)
public class AccountDashboardSettings(
  /**
   * The display name for this account. This is used on the Stripe Dashboard to differentiate between accounts.
   */
  public val displayName: String? = null,
  /**
   * The timezone used in the Stripe Dashboard for this account. A list of possible time zone values is maintained at
   * the [IANA Time Zone Database](http://www.iana.org/time-zones).
   */
  public val timezone: String? = null,
) {
  public class Builder {
    /**
     * The display name for this account. This is used on the Stripe Dashboard to differentiate between accounts.
     */
    public var displayName: String? = null

    /**
     * The timezone used in the Stripe Dashboard for this account. A list of possible time zone values is maintained at
     * the [IANA Time Zone Database](http://www.iana.org/time-zones).
     */
    public var timezone: String? = null

    public fun build(): AccountDashboardSettings = AccountDashboardSettings(
      displayName = displayName,
      timezone = timezone,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): AccountDashboardSettings = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<AccountDashboardSettings> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): AccountDashboardSettings {
      val jsonDecoder = decoder.requireJsonDecoder("AccountDashboardSettings")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("AccountDashboardSettings must be a JSON object")
      return AccountDashboardSettings(
        displayName = rawObject["display_name"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        timezone = rawObject["timezone"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: AccountDashboardSettings) {
      val jsonEncoder = encoder.requireJsonEncoder("AccountDashboardSettings")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.displayName?.let { put("display_name", it) }
        value.timezone?.let { put("timezone", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun accountDashboardSettings(block: AccountDashboardSettings.Builder.() -> Unit): AccountDashboardSettings = AccountDashboardSettings.build(block)
