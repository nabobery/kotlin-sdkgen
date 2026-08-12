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
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/account_branding_settings
 */
@Serializable(with = AccountBrandingSettings.Serializer::class)
public class AccountBrandingSettings(
  /**
   * (ID of a [file upload](https://stripe.com/docs/guides/file-upload)) An icon for the account. Must be square and at
   * least 128px x 128px.
   */
  public val icon: InlineAccountBrandingSettingsIconXa97b7c89? = null,
  /**
   * (ID of a [file upload](https://stripe.com/docs/guides/file-upload)) A logo for the account that will be used in
   * Checkout instead of the icon and without the account's name next to it if provided. Must be at least 128px x 128px.
   */
  public val logo: InlineAccountBrandingSettingsLogoX1ec3b721? = null,
  /**
   * A CSS hex color value representing the primary branding color for this account
   */
  public val primaryColor: String? = null,
  /**
   * A CSS hex color value representing the secondary branding color for this account
   */
  public val secondaryColor: String? = null,
) {
  public class Builder {
    /**
     * (ID of a [file upload](https://stripe.com/docs/guides/file-upload)) An icon for the account. Must be square and
     * at least 128px x 128px.
     */
    public var icon: InlineAccountBrandingSettingsIconXa97b7c89? = null

    /**
     * (ID of a [file upload](https://stripe.com/docs/guides/file-upload)) A logo for the account that will be used in
     * Checkout instead of the icon and without the account's name next to it if provided. Must be at least 128px x
     * 128px.
     */
    public var logo: InlineAccountBrandingSettingsLogoX1ec3b721? = null

    /**
     * A CSS hex color value representing the primary branding color for this account
     */
    public var primaryColor: String? = null

    /**
     * A CSS hex color value representing the secondary branding color for this account
     */
    public var secondaryColor: String? = null

    public fun build(): AccountBrandingSettings = AccountBrandingSettings(
      icon = icon,
      logo = logo,
      primaryColor = primaryColor,
      secondaryColor = secondaryColor,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): AccountBrandingSettings = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<AccountBrandingSettings> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): AccountBrandingSettings {
      val jsonDecoder = decoder.requireJsonDecoder("AccountBrandingSettings")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("AccountBrandingSettings must be a JSON object")
      return AccountBrandingSettings(
        icon = rawObject["icon"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineAccountBrandingSettingsIconXa97b7c89?>(element) },
        logo = rawObject["logo"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineAccountBrandingSettingsLogoX1ec3b721?>(element) },
        primaryColor = rawObject["primary_color"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        secondaryColor = rawObject["secondary_color"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: AccountBrandingSettings) {
      val jsonEncoder = encoder.requireJsonEncoder("AccountBrandingSettings")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.icon?.let { put("icon", json.encodeToJsonElement(it)) }
        value.logo?.let { put("logo", json.encodeToJsonElement(it)) }
        value.primaryColor?.let { put("primary_color", it) }
        value.secondaryColor?.let { put("secondary_color", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun accountBrandingSettings(block: AccountBrandingSettings.Builder.() -> Unit): AccountBrandingSettings = AccountBrandingSettings.build(block)
