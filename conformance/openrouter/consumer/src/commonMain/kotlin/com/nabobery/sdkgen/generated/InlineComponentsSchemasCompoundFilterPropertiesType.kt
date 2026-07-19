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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/CompoundFilter/properties/type.
 */
@Serializable(with = InlineComponentsSchemasCompoundFilterPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasCompoundFilterPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `and`.
   */
  public data object And : InlineComponentsSchemasCompoundFilterPropertiesType() {
    public override val `value`: String = "and"
  }

  /**
   * Documented value. Wire value: `or`.
   */
  public data object Or : InlineComponentsSchemasCompoundFilterPropertiesType() {
    public override val `value`: String = "or"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasCompoundFilterPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasCompoundFilterPropertiesType = when (value) {
      And.value -> And
      Or.value -> Or
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasCompoundFilterPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasCompoundFilterPropertiesType",
          PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasCompoundFilterPropertiesType = fromValue(decoder
      .decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasCompoundFilterPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
