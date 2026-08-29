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
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing.physical_bundle/properties/object
 */
@Serializable(with = InlineIssuingPhysicalBundleObjectValueX0256369a.Serializer::class)
public sealed class InlineIssuingPhysicalBundleObjectValueX0256369a {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `issuing.physical_bundle`.
   */
  public data object IssuingPhysicalBundle : InlineIssuingPhysicalBundleObjectValueX0256369a() {
    public override val `value`: String = "issuing.physical_bundle"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineIssuingPhysicalBundleObjectValueX0256369a()

  public companion object {
    public fun fromValue(`value`: String): InlineIssuingPhysicalBundleObjectValueX0256369a = when (value) {
      IssuingPhysicalBundle.value -> IssuingPhysicalBundle
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineIssuingPhysicalBundleObjectValueX0256369a> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineIssuingPhysicalBundleObjectValueX0256369a", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineIssuingPhysicalBundleObjectValueX0256369a = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineIssuingPhysicalBundleObjectValueX0256369a) {
      encoder.encodeString(value.value)
    }
  }
}
