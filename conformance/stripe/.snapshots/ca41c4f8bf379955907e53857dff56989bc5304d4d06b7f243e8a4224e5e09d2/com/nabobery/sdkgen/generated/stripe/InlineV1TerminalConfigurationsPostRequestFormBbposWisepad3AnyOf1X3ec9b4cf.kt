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
 * ion~1x-www-form-urlencoded/schema/properties/bbpos_wisepad3/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1configurations~1{configuration}/post/requestBody/content/applicat
 * ion~1x-www-form-urlencoded/schema/properties/bbpos_wisepad3/anyOf/0
 */
@Serializable(with = InlineV1TerminalConfigurationsPostRequestFormBbposWisepad3AnyOf1X3ec9b4cf.Serializer::class)
public class InlineV1TerminalConfigurationsPostRequestFormBbposWisepad3AnyOf1X3ec9b4cf(
  public val splashscreen:
      InlineV1TerminalConfigurationsPostRequestFormBbposWisepad3SplashscreenXa7ea3b8b? = null,
) {
  public class Builder {
    public var splashscreen:
        InlineV1TerminalConfigurationsPostRequestFormBbposWisepad3SplashscreenXa7ea3b8b? = null

    public fun build(): InlineV1TerminalConfigurationsPostRequestFormBbposWisepad3AnyOf1X3ec9b4cf = InlineV1TerminalConfigurationsPostRequestFormBbposWisepad3AnyOf1X3ec9b4cf(
      splashscreen = splashscreen,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TerminalConfigurationsPostRequestFormBbposWisepad3AnyOf1X3ec9b4cf = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TerminalConfigurationsPostRequestFormBbposWisepad3AnyOf1X3ec9b4cf> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TerminalConfigurationsPostRequestFormBbposWisepad3AnyOf1X3ec9b4cf {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TerminalConfigurationsPostRequestFormBbposWisepad3AnyOf1X3ec9b4cf")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TerminalConfigurationsPostRequestFormBbposWisepad3AnyOf1X3ec9b4cf must be a JSON object")
      return InlineV1TerminalConfigurationsPostRequestFormBbposWisepad3AnyOf1X3ec9b4cf(
        splashscreen = rawObject["splashscreen"]?.let { json.decodeFromJsonElement<InlineV1TerminalConfigurationsPostRequestFormBbposWisepad3SplashscreenXa7ea3b8b>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TerminalConfigurationsPostRequestFormBbposWisepad3AnyOf1X3ec9b4cf) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TerminalConfigurationsPostRequestFormBbposWisepad3AnyOf1X3ec9b4cf")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.splashscreen?.let { put("splashscreen", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TerminalConfigurationsPostRequestFormBbposWisepad3AnyOf1X3ec9b4cf(block: InlineV1TerminalConfigurationsPostRequestFormBbposWisepad3AnyOf1X3ec9b4cf.Builder.() -> Unit): InlineV1TerminalConfigurationsPostRequestFormBbposWisepad3AnyOf1X3ec9b4cf = InlineV1TerminalConfigurationsPostRequestFormBbposWisepad3AnyOf1X3ec9b4cf.build(block)
