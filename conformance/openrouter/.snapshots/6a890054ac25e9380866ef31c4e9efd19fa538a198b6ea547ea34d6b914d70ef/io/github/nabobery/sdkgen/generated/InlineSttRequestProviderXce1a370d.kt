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
 * Source: sdkgen://source/openapi.yaml#/components/schemas/STTRequest/properties/provider
 */
@Serializable(with = InlineSttRequestProviderXce1a370d.Serializer::class)
public class InlineSttRequestProviderXce1a370d(
  public val options: ProviderOptions? = null,
) {
  public class Builder {
    public var options: ProviderOptions? = null

    public fun build(): InlineSttRequestProviderXce1a370d = InlineSttRequestProviderXce1a370d(
      options = options,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineSttRequestProviderXce1a370d = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineSttRequestProviderXce1a370d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineSttRequestProviderXce1a370d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineSttRequestProviderXce1a370d")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineSttRequestProviderXce1a370d must be a JSON object")
      return InlineSttRequestProviderXce1a370d(
        options = rawObject["options"]?.let { json.decodeFromJsonElement<ProviderOptions>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineSttRequestProviderXce1a370d) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineSttRequestProviderXce1a370d")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.options?.let { put("options", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineSttRequestProviderXce1a370d(block: InlineSttRequestProviderXce1a370d.Builder.() -> Unit): InlineSttRequestProviderXce1a370d = InlineSttRequestProviderXce1a370d.build(block)
