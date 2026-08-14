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
 * /properties/settings/properties/card_issuing.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/settings/properties/card_issuing
 */
@Serializable(with = InlineV1AccountsPostRequestFormSettingsCardIssuingXb0cd03a4.Serializer::class)
public class InlineV1AccountsPostRequestFormSettingsCardIssuingXb0cd03a4(
  public val tosAcceptance:
      InlineV1AccountsPostRequestFormSettingsCardIssuingTosAcceptanceXceb37aae? = null,
) {
  public class Builder {
    public var tosAcceptance:
        InlineV1AccountsPostRequestFormSettingsCardIssuingTosAcceptanceXceb37aae? = null

    public fun build(): InlineV1AccountsPostRequestFormSettingsCardIssuingXb0cd03a4 = InlineV1AccountsPostRequestFormSettingsCardIssuingXb0cd03a4(
      tosAcceptance = tosAcceptance,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1AccountsPostRequestFormSettingsCardIssuingXb0cd03a4 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1AccountsPostRequestFormSettingsCardIssuingXb0cd03a4> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1AccountsPostRequestFormSettingsCardIssuingXb0cd03a4 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsPostRequestFormSettingsCardIssuingXb0cd03a4")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1AccountsPostRequestFormSettingsCardIssuingXb0cd03a4 must be a JSON object")
      return InlineV1AccountsPostRequestFormSettingsCardIssuingXb0cd03a4(
        tosAcceptance = rawObject["tos_acceptance"]?.let { json.decodeFromJsonElement<InlineV1AccountsPostRequestFormSettingsCardIssuingTosAcceptanceXceb37aae>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsPostRequestFormSettingsCardIssuingXb0cd03a4) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1AccountsPostRequestFormSettingsCardIssuingXb0cd03a4")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.tosAcceptance?.let { put("tos_acceptance", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1AccountsPostRequestFormSettingsCardIssuingXb0cd03a4(block: InlineV1AccountsPostRequestFormSettingsCardIssuingXb0cd03a4.Builder.() -> Unit): InlineV1AccountsPostRequestFormSettingsCardIssuingXb0cd03a4 = InlineV1AccountsPostRequestFormSettingsCardIssuingXb0cd03a4.build(block)
