package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * String representing the object's type. Objects of the same type share the same value.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing.personalization_design/properties/object
 */
@Serializable(with = InlineIssuingPersonalizationDesignObjectValueX8418564b.Serializer::class)
public sealed class InlineIssuingPersonalizationDesignObjectValueX8418564b {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `issuing.personalization_design`.
   */
  public data object IssuingPersonalizationDesign : InlineIssuingPersonalizationDesignObjectValueX8418564b() {
    public override val `value`: String = "issuing.personalization_design"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineIssuingPersonalizationDesignObjectValueX8418564b()

  public companion object {
    public fun fromValue(`value`: String): InlineIssuingPersonalizationDesignObjectValueX8418564b = when (value) {
      IssuingPersonalizationDesign.value -> IssuingPersonalizationDesign
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineIssuingPersonalizationDesignObjectValueX8418564b> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineIssuingPersonalizationDesignObjectValueX8418564b", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineIssuingPersonalizationDesignObjectValueX8418564b = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineIssuingPersonalizationDesignObjectValueX8418564b) {
      encoder.encodeString(value.value)
    }
  }
}
