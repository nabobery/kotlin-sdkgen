package com.nabobery.sdkgen.generated

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
 */
@Serializable(with = InlineComponentsSchemasImageEndpointPropertiesSupportedParameters.Serializer::class)
public class InlineComponentsSchemasImageEndpointPropertiesSupportedParameters() {
  public class Builder {
    public fun build(): InlineComponentsSchemasImageEndpointPropertiesSupportedParameters =
      InlineComponentsSchemasImageEndpointPropertiesSupportedParameters(
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineComponentsSchemasImageEndpointPropertiesSupportedParameters =
      Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineComponentsSchemasImageEndpointPropertiesSupportedParameters> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasImageEndpointPropertiesSupportedParameters {
      val jsonDecoder = decoder.requireJsonDecoder("InlineComponentsSchemasImageEndpointPropertiesSupportedParameters")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlineComponentsSchemasImageEndpointPropertiesSupportedParameters must be a " +
          "JSON object")
      return InlineComponentsSchemasImageEndpointPropertiesSupportedParameters(
      )
    }

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasImageEndpointPropertiesSupportedParameters) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineComponentsSchemasImageEndpointPropertiesSupportedParameters")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineComponentsSchemasImageEndpointPropertiesSupportedParameters(block: InlineComponentsSchemasImageEndpointPropertiesSupportedParameters.Builder.() -> Unit): InlineComponentsSchemasImageEndpointPropertiesSupportedParameters = InlineComponentsSchemasImageEndpointPropertiesSupportedParameters.build(block)
