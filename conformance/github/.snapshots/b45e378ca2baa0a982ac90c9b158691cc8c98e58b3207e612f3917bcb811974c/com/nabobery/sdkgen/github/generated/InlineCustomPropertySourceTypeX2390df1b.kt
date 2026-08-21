package com.nabobery.sdkgen.github.generated

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * The source type of the property
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/custom-property/properties/source_type
 */
@Serializable(with = InlineCustomPropertySourceTypeX2390df1b.Serializer::class)
public sealed class InlineCustomPropertySourceTypeX2390df1b {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `organization`.
   */
  public data object Organization : InlineCustomPropertySourceTypeX2390df1b() {
    public override val `value`: String = "organization"
  }

  /**
   * Documented value. Wire value: `enterprise`.
   */
  public data object Enterprise : InlineCustomPropertySourceTypeX2390df1b() {
    public override val `value`: String = "enterprise"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCustomPropertySourceTypeX2390df1b()

  public companion object {
    public fun fromValue(`value`: String): InlineCustomPropertySourceTypeX2390df1b = when (value) {
      Organization.value -> Organization
      Enterprise.value -> Enterprise
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineCustomPropertySourceTypeX2390df1b> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineCustomPropertySourceTypeX2390df1b", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCustomPropertySourceTypeX2390df1b = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCustomPropertySourceTypeX2390df1b) {
      encoder.encodeString(value.value)
    }
  }
}
