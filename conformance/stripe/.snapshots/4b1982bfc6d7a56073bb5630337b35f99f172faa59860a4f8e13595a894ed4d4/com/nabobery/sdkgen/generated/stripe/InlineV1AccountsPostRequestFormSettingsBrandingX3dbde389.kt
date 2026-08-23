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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/settings/properties/branding.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/settings/properties/branding
 */
@Serializable(with = InlineV1AccountsPostRequestFormSettingsBrandingX3dbde389.Serializer::class)
public class InlineV1AccountsPostRequestFormSettingsBrandingX3dbde389(
  public val icon: String? = null,
  public val logo: String? = null,
  public val primaryColor: String? = null,
  public val secondaryColor: String? = null,
) {
  public class Builder {
    public var icon: String? = null

    public var logo: String? = null

    public var primaryColor: String? = null

    public var secondaryColor: String? = null

    public fun build(): InlineV1AccountsPostRequestFormSettingsBrandingX3dbde389 = InlineV1AccountsPostRequestFormSettingsBrandingX3dbde389(
      icon = icon,
      logo = logo,
      primaryColor = primaryColor,
      secondaryColor = secondaryColor,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1AccountsPostRequestFormSettingsBrandingX3dbde389 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1AccountsPostRequestFormSettingsBrandingX3dbde389> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1AccountsPostRequestFormSettingsBrandingX3dbde389 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsPostRequestFormSettingsBrandingX3dbde389")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1AccountsPostRequestFormSettingsBrandingX3dbde389 must be a JSON object")
      return InlineV1AccountsPostRequestFormSettingsBrandingX3dbde389(
        icon = rawObject["icon"]?.let { json.decodeFromJsonElement<String>(it) },
        logo = rawObject["logo"]?.let { json.decodeFromJsonElement<String>(it) },
        primaryColor = rawObject["primary_color"]?.let { json.decodeFromJsonElement<String>(it) },
        secondaryColor = rawObject["secondary_color"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsPostRequestFormSettingsBrandingX3dbde389) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1AccountsPostRequestFormSettingsBrandingX3dbde389")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.icon?.let { put("icon", it) }
        value.logo?.let { put("logo", it) }
        value.primaryColor?.let { put("primary_color", it) }
        value.secondaryColor?.let { put("secondary_color", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1AccountsPostRequestFormSettingsBrandingX3dbde389(block: InlineV1AccountsPostRequestFormSettingsBrandingX3dbde389.Builder.() -> Unit): InlineV1AccountsPostRequestFormSettingsBrandingX3dbde389 = InlineV1AccountsPostRequestFormSettingsBrandingX3dbde389.build(block)
