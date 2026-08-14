package io.github.nabobery.sdkgen.generated.stripe

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
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/settings/properties/treasury.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/settings/properties/treasury
 */
@Serializable(with = InlineV1AccountsPostRequestFormSettingsTreasuryXe27e27b2.Serializer::class)
public class InlineV1AccountsPostRequestFormSettingsTreasuryXe27e27b2(
  public val tosAcceptance:
      InlineV1AccountsPostRequestFormSettingsTreasuryTosAcceptanceX29df31f8? = null,
) {
  public class Builder {
    public var tosAcceptance: InlineV1AccountsPostRequestFormSettingsTreasuryTosAcceptanceX29df31f8?
        = null

    public fun build(): InlineV1AccountsPostRequestFormSettingsTreasuryXe27e27b2 = InlineV1AccountsPostRequestFormSettingsTreasuryXe27e27b2(
      tosAcceptance = tosAcceptance,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1AccountsPostRequestFormSettingsTreasuryXe27e27b2 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1AccountsPostRequestFormSettingsTreasuryXe27e27b2> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1AccountsPostRequestFormSettingsTreasuryXe27e27b2 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsPostRequestFormSettingsTreasuryXe27e27b2")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1AccountsPostRequestFormSettingsTreasuryXe27e27b2 must be a JSON object")
      return InlineV1AccountsPostRequestFormSettingsTreasuryXe27e27b2(
        tosAcceptance = rawObject["tos_acceptance"]?.let { json.decodeFromJsonElement<InlineV1AccountsPostRequestFormSettingsTreasuryTosAcceptanceX29df31f8>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsPostRequestFormSettingsTreasuryXe27e27b2) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1AccountsPostRequestFormSettingsTreasuryXe27e27b2")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.tosAcceptance?.let { put("tos_acceptance", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1AccountsPostRequestFormSettingsTreasuryXe27e27b2(block: InlineV1AccountsPostRequestFormSettingsTreasuryXe27e27b2.Builder.() -> Unit): InlineV1AccountsPostRequestFormSettingsTreasuryXe27e27b2 = InlineV1AccountsPostRequestFormSettingsTreasuryXe27e27b2.build(block)
