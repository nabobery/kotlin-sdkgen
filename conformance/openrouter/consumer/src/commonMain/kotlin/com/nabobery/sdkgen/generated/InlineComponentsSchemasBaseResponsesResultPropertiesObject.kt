package com.nabobery.sdkgen.generated

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/BaseResponsesResult/properties/object.
 */
@Serializable(with = InlineComponentsSchemasBaseResponsesResultPropertiesObject.Serializer::class)
public sealed class InlineComponentsSchemasBaseResponsesResultPropertiesObject {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `response`.
   */
  public data object Response : InlineComponentsSchemasBaseResponsesResultPropertiesObject() {
    public override val `value`: String = "response"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasBaseResponsesResultPropertiesObject()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasBaseResponsesResultPropertiesObject = when (value) {
      Response.value -> Response
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasBaseResponsesResultPropertiesObject> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasBaseResponsesResultPropertiesObject", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasBaseResponsesResultPropertiesObject =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasBaseResponsesResultPropertiesObject) {
      encoder.encodeString(value.value)
    }
  }
}
