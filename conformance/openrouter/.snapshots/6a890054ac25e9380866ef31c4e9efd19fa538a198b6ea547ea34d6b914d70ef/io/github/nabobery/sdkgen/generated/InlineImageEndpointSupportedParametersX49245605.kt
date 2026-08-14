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

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/ImageEndpoint/properties/supported_parameters.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ImageEndpoint/properties/supported_parameters
 */
@Serializable(with = InlineImageEndpointSupportedParametersX49245605.Serializer::class)
public class InlineImageEndpointSupportedParametersX49245605() {
  public class Builder {
    public fun build(): InlineImageEndpointSupportedParametersX49245605 = InlineImageEndpointSupportedParametersX49245605(
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineImageEndpointSupportedParametersX49245605 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineImageEndpointSupportedParametersX49245605> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineImageEndpointSupportedParametersX49245605 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineImageEndpointSupportedParametersX49245605")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineImageEndpointSupportedParametersX49245605 must be a JSON object")
      return InlineImageEndpointSupportedParametersX49245605(
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineImageEndpointSupportedParametersX49245605) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineImageEndpointSupportedParametersX49245605")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineImageEndpointSupportedParametersX49245605(block: InlineImageEndpointSupportedParametersX49245605.Builder.() -> Unit): InlineImageEndpointSupportedParametersX49245605 = InlineImageEndpointSupportedParametersX49245605.build(block)
