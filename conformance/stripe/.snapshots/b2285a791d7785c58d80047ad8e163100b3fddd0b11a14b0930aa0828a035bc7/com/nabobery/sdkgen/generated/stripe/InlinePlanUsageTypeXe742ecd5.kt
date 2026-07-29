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
 * Configures how the quantity per period should be determined. Can be either `metered` or `licensed`. `licensed`
 * automatically bills the `quantity` set when adding it to a subscription. `metered` aggregates the total usage based
 * on usage records. Defaults to `licensed`.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/plan/properties/usage_type
 */
@Serializable(with = InlinePlanUsageTypeXe742ecd5.Serializer::class)
public sealed class InlinePlanUsageTypeXe742ecd5 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `licensed`.
   */
  public data object Licensed : InlinePlanUsageTypeXe742ecd5() {
    public override val `value`: String = "licensed"
  }

  /**
   * Documented value. Wire value: `metered`.
   */
  public data object Metered : InlinePlanUsageTypeXe742ecd5() {
    public override val `value`: String = "metered"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePlanUsageTypeXe742ecd5()

  public companion object {
    public fun fromValue(`value`: String): InlinePlanUsageTypeXe742ecd5 = when (value) {
      Licensed.value -> Licensed
      Metered.value -> Metered
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlinePlanUsageTypeXe742ecd5> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlinePlanUsageTypeXe742ecd5", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePlanUsageTypeXe742ecd5 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePlanUsageTypeXe742ecd5) {
      encoder.encodeString(value.value)
    }
  }
}
