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
 * An object containing device type specific settings for BBPOS WisePOS E readers.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1configurations/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/bbpos_wisepos_e
 */
@Serializable(with = InlineV1TerminalConfigurationsPostRequestFormBbposWiseposEX915c2570.Serializer::class)
public class InlineV1TerminalConfigurationsPostRequestFormBbposWiseposEX915c2570(
  public val splashscreen:
      InlineV1TerminalConfigurationsPostRequestFormBbposWiseposESplashscreenX20ef85ac? = null,
) {
  public class Builder {
    public var splashscreen:
        InlineV1TerminalConfigurationsPostRequestFormBbposWiseposESplashscreenX20ef85ac? = null

    public fun build(): InlineV1TerminalConfigurationsPostRequestFormBbposWiseposEX915c2570 = InlineV1TerminalConfigurationsPostRequestFormBbposWiseposEX915c2570(
      splashscreen = splashscreen,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TerminalConfigurationsPostRequestFormBbposWiseposEX915c2570 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TerminalConfigurationsPostRequestFormBbposWiseposEX915c2570> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TerminalConfigurationsPostRequestFormBbposWiseposEX915c2570 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TerminalConfigurationsPostRequestFormBbposWiseposEX915c2570")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TerminalConfigurationsPostRequestFormBbposWiseposEX915c2570 must be a JSON object")
      return InlineV1TerminalConfigurationsPostRequestFormBbposWiseposEX915c2570(
        splashscreen = rawObject["splashscreen"]?.let { json.decodeFromJsonElement<InlineV1TerminalConfigurationsPostRequestFormBbposWiseposESplashscreenX20ef85ac>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TerminalConfigurationsPostRequestFormBbposWiseposEX915c2570) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TerminalConfigurationsPostRequestFormBbposWiseposEX915c2570")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.splashscreen?.let { put("splashscreen", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TerminalConfigurationsPostRequestFormBbposWiseposEx915c2570(block: InlineV1TerminalConfigurationsPostRequestFormBbposWiseposEX915c2570.Builder.() -> Unit): InlineV1TerminalConfigurationsPostRequestFormBbposWiseposEX915c2570 = InlineV1TerminalConfigurationsPostRequestFormBbposWiseposEX915c2570.build(block)
