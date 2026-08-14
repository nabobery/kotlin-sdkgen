package io.github.nabobery.sdkgen.generated

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
 * Provider-specific passthrough configuration
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/SpeechRequest/properties/provider
 */
@Serializable(with = InlineSpeechRequestProviderX77399e14.Serializer::class)
public class InlineSpeechRequestProviderX77399e14(
  public val options: ProviderOptions? = null,
) {
  public class Builder {
    public var options: ProviderOptions? = null

    public fun build(): InlineSpeechRequestProviderX77399e14 = InlineSpeechRequestProviderX77399e14(
      options = options,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineSpeechRequestProviderX77399e14 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineSpeechRequestProviderX77399e14> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineSpeechRequestProviderX77399e14 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineSpeechRequestProviderX77399e14")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineSpeechRequestProviderX77399e14 must be a JSON object")
      return InlineSpeechRequestProviderX77399e14(
        options = rawObject["options"]?.let { json.decodeFromJsonElement<ProviderOptions>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineSpeechRequestProviderX77399e14) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineSpeechRequestProviderX77399e14")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.options?.let { put("options", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineSpeechRequestProviderX77399e14(block: InlineSpeechRequestProviderX77399e14.Builder.() -> Unit): InlineSpeechRequestProviderX77399e14 = InlineSpeechRequestProviderX77399e14.build(block)
