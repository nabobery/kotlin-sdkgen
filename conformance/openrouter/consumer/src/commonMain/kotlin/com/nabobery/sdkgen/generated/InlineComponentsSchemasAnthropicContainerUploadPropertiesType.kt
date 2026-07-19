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
 * Forward-compatible enum for
 * sdkgen://source/openapi.yaml#/components/schemas/AnthropicContainerUpload/properties/type.
 */
@Serializable(with = InlineComponentsSchemasAnthropicContainerUploadPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasAnthropicContainerUploadPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `container_upload`.
   */
  public data object ContainerUpload : InlineComponentsSchemasAnthropicContainerUploadPropertiesType() {
    public override val `value`: String = "container_upload"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasAnthropicContainerUploadPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasAnthropicContainerUploadPropertiesType =
      when (value) {
      ContainerUpload.value -> ContainerUpload
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasAnthropicContainerUploadPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasAnthropicContainerUploadPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasAnthropicContainerUploadPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasAnthropicContainerUploadPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
