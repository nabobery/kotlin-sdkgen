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
 * Forward-compatible enum for
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1physical_bundles/get/parameters/5/schema.
 *
 * Source: sdkgen://source/openapi.json#/paths/~1v1~1issuing~1physical_bundles/get/parameters/5/schema
 */
@Serializable(with = InlineV1IssuingPhysicalBundlesGetParameterX9515a673.Serializer::class)
public sealed class InlineV1IssuingPhysicalBundlesGetParameterX9515a673 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `custom`.
   */
  public data object Custom : InlineV1IssuingPhysicalBundlesGetParameterX9515a673() {
    public override val `value`: String = "custom"
  }

  /**
   * Documented value. Wire value: `standard`.
   */
  public data object Standard : InlineV1IssuingPhysicalBundlesGetParameterX9515a673() {
    public override val `value`: String = "standard"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1IssuingPhysicalBundlesGetParameterX9515a673()

  public companion object {
    public fun fromValue(`value`: String): InlineV1IssuingPhysicalBundlesGetParameterX9515a673 = when (value) {
      Custom.value -> Custom
      Standard.value -> Standard
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1IssuingPhysicalBundlesGetParameterX9515a673> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1IssuingPhysicalBundlesGetParameterX9515a673", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1IssuingPhysicalBundlesGetParameterX9515a673 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1IssuingPhysicalBundlesGetParameterX9515a673) {
      encoder.encodeString(value.value)
    }
  }
}
