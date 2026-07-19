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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/NamespaceTool/properties/type.
 */
@Serializable(with = InlineComponentsSchemasNamespaceToolPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasNamespaceToolPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `namespace`.
   */
  public data object Namespace : InlineComponentsSchemasNamespaceToolPropertiesType() {
    public override val `value`: String = "namespace"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasNamespaceToolPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasNamespaceToolPropertiesType = when (value) {
      Namespace.value -> Namespace
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasNamespaceToolPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasNamespaceToolPropertiesType",
          PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasNamespaceToolPropertiesType = fromValue(decoder
      .decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasNamespaceToolPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
