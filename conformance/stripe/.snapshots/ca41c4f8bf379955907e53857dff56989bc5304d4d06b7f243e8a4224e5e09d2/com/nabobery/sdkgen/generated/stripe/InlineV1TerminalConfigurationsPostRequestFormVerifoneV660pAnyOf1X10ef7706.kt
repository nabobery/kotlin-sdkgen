package com.nabobery.sdkgen.generated.stripe

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
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1configurations~1{configuration}/post/requestBody/content/applicat
 * ion~1x-www-form-urlencoded/schema/properties/verifone_v660p/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1configurations~1{configuration}/post/requestBody/content/applicat
 * ion~1x-www-form-urlencoded/schema/properties/verifone_v660p/anyOf/0
 */
@Serializable(with = InlineV1TerminalConfigurationsPostRequestFormVerifoneV660pAnyOf1X10ef7706.Serializer::class)
public class InlineV1TerminalConfigurationsPostRequestFormVerifoneV660pAnyOf1X10ef7706(
  public val splashscreen:
      InlineV1TerminalConfigurationsPostRequestFormVerifoneV660pSplashscreenXc51cfe79? = null,
) {
  public class Builder {
    public var splashscreen:
        InlineV1TerminalConfigurationsPostRequestFormVerifoneV660pSplashscreenXc51cfe79? = null

    public fun build(): InlineV1TerminalConfigurationsPostRequestFormVerifoneV660pAnyOf1X10ef7706 = InlineV1TerminalConfigurationsPostRequestFormVerifoneV660pAnyOf1X10ef7706(
      splashscreen = splashscreen,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TerminalConfigurationsPostRequestFormVerifoneV660pAnyOf1X10ef7706 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TerminalConfigurationsPostRequestFormVerifoneV660pAnyOf1X10ef7706> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TerminalConfigurationsPostRequestFormVerifoneV660pAnyOf1X10ef7706 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TerminalConfigurationsPostRequestFormVerifoneV660pAnyOf1X10ef7706")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TerminalConfigurationsPostRequestFormVerifoneV660pAnyOf1X10ef7706 must be a JSON object")
      return InlineV1TerminalConfigurationsPostRequestFormVerifoneV660pAnyOf1X10ef7706(
        splashscreen = rawObject["splashscreen"]?.let { json.decodeFromJsonElement<InlineV1TerminalConfigurationsPostRequestFormVerifoneV660pSplashscreenXc51cfe79>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TerminalConfigurationsPostRequestFormVerifoneV660pAnyOf1X10ef7706) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TerminalConfigurationsPostRequestFormVerifoneV660pAnyOf1X10ef7706")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.splashscreen?.let { put("splashscreen", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TerminalConfigurationsPostRequestFormVerifoneV660pAnyOf1X10ef7706(block: InlineV1TerminalConfigurationsPostRequestFormVerifoneV660pAnyOf1X10ef7706.Builder.() -> Unit): InlineV1TerminalConfigurationsPostRequestFormVerifoneV660pAnyOf1X10ef7706 = InlineV1TerminalConfigurationsPostRequestFormVerifoneV660pAnyOf1X10ef7706.build(block)
