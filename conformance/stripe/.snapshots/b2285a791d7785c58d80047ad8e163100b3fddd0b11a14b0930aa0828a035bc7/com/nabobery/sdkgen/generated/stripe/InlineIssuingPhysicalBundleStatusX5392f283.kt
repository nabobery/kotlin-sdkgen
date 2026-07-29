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
 * Whether this physical bundle can be used to create cards.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing.physical_bundle/properties/status
 */
@Serializable(with = InlineIssuingPhysicalBundleStatusX5392f283.Serializer::class)
public sealed class InlineIssuingPhysicalBundleStatusX5392f283 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `active`.
   */
  public data object Active : InlineIssuingPhysicalBundleStatusX5392f283() {
    public override val `value`: String = "active"
  }

  /**
   * Documented value. Wire value: `inactive`.
   */
  public data object Inactive : InlineIssuingPhysicalBundleStatusX5392f283() {
    public override val `value`: String = "inactive"
  }

  /**
   * Documented value. Wire value: `review`.
   */
  public data object Review : InlineIssuingPhysicalBundleStatusX5392f283() {
    public override val `value`: String = "review"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineIssuingPhysicalBundleStatusX5392f283()

  public companion object {
    public fun fromValue(`value`: String): InlineIssuingPhysicalBundleStatusX5392f283 = when (value) {
      Active.value -> Active
      Inactive.value -> Inactive
      Review.value -> Review
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineIssuingPhysicalBundleStatusX5392f283> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineIssuingPhysicalBundleStatusX5392f283", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineIssuingPhysicalBundleStatusX5392f283 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineIssuingPhysicalBundleStatusX5392f283) {
      encoder.encodeString(value.value)
    }
  }
}
