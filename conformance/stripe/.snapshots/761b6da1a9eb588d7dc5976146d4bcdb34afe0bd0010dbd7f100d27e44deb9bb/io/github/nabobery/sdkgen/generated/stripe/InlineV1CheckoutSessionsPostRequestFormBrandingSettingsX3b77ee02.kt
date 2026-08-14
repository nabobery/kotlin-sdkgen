package io.github.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * The branding settings for the Checkout Session. This parameter is not allowed if ui_mode is `elements`.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/branding_settings
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormBrandingSettingsX3b77ee02.Serializer::class)
public class InlineV1CheckoutSessionsPostRequestFormBrandingSettingsX3b77ee02(
  public val backgroundColor:
      InlineV1CheckoutSessionsPostRequestFormBrandingSettingsBackgroundColorXe6c9854b? = null,
  public val borderStyle:
      InlineV1CheckoutSessionsPostRequestFormBrandingSettingsBorderStyleXca1f0360? = null,
  public val buttonColor:
      InlineV1CheckoutSessionsPostRequestFormBrandingSettingsButtonColorXf250f03b? = null,
  public val displayName: String? = null,
  public val fontFamily:
      InlineV1CheckoutSessionsPostRequestFormBrandingSettingsFontFamilyX01aef6a2? = null,
  public val icon: InlineV1CheckoutSessionsPostRequestFormBrandingSettingsIconX14815c80? = null,
  public val logo: InlineV1CheckoutSessionsPostRequestFormBrandingSettingsLogoX29580067? = null,
) {
  public class Builder {
    public var backgroundColor:
        InlineV1CheckoutSessionsPostRequestFormBrandingSettingsBackgroundColorXe6c9854b? = null

    public var borderStyle:
        InlineV1CheckoutSessionsPostRequestFormBrandingSettingsBorderStyleXca1f0360? = null

    public var buttonColor:
        InlineV1CheckoutSessionsPostRequestFormBrandingSettingsButtonColorXf250f03b? = null

    public var displayName: String? = null

    public var fontFamily:
        InlineV1CheckoutSessionsPostRequestFormBrandingSettingsFontFamilyX01aef6a2? = null

    public var icon: InlineV1CheckoutSessionsPostRequestFormBrandingSettingsIconX14815c80? = null

    public var logo: InlineV1CheckoutSessionsPostRequestFormBrandingSettingsLogoX29580067? = null

    public fun build(): InlineV1CheckoutSessionsPostRequestFormBrandingSettingsX3b77ee02 = InlineV1CheckoutSessionsPostRequestFormBrandingSettingsX3b77ee02(
      backgroundColor = backgroundColor,
      borderStyle = borderStyle,
      buttonColor = buttonColor,
      displayName = displayName,
      fontFamily = fontFamily,
      icon = icon,
      logo = logo,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormBrandingSettingsX3b77ee02 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormBrandingSettingsX3b77ee02> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CheckoutSessionsPostRequestFormBrandingSettingsX3b77ee02 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CheckoutSessionsPostRequestFormBrandingSettingsX3b77ee02")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CheckoutSessionsPostRequestFormBrandingSettingsX3b77ee02 must be a JSON object")
      return InlineV1CheckoutSessionsPostRequestFormBrandingSettingsX3b77ee02(
        backgroundColor = rawObject["background_color"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormBrandingSettingsBackgroundColorXe6c9854b>(it) },
        borderStyle = rawObject["border_style"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormBrandingSettingsBorderStyleXca1f0360>(it) },
        buttonColor = rawObject["button_color"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormBrandingSettingsButtonColorXf250f03b>(it) },
        displayName = rawObject["display_name"]?.let { json.decodeFromJsonElement<String>(it) },
        fontFamily = rawObject["font_family"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormBrandingSettingsFontFamilyX01aef6a2>(it) },
        icon = rawObject["icon"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormBrandingSettingsIconX14815c80>(it) },
        logo = rawObject["logo"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormBrandingSettingsLogoX29580067>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CheckoutSessionsPostRequestFormBrandingSettingsX3b77ee02) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CheckoutSessionsPostRequestFormBrandingSettingsX3b77ee02")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.backgroundColor?.let { put("background_color", json.encodeToJsonElement(it)) }
        value.borderStyle?.let { put("border_style", json.encodeToJsonElement(it)) }
        value.buttonColor?.let { put("button_color", json.encodeToJsonElement(it)) }
        value.displayName?.let { put("display_name", it) }
        value.fontFamily?.let { put("font_family", json.encodeToJsonElement(it)) }
        value.icon?.let { put("icon", json.encodeToJsonElement(it)) }
        value.logo?.let { put("logo", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1CheckoutSessionsPostRequestFormBrandingSettingsX3b77ee02(block: InlineV1CheckoutSessionsPostRequestFormBrandingSettingsX3b77ee02.Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormBrandingSettingsX3b77ee02 = InlineV1CheckoutSessionsPostRequestFormBrandingSettingsX3b77ee02.build(block)
