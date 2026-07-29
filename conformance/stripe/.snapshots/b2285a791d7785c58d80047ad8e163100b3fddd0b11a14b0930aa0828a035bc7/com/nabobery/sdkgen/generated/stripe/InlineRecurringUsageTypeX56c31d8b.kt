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
 * Source: sdkgen://source/openapi.json#/components/schemas/recurring/properties/usage_type
 */
@Serializable(with = InlineRecurringUsageTypeX56c31d8b.Serializer::class)
public sealed class InlineRecurringUsageTypeX56c31d8b {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `licensed`.
   */
  public data object Licensed : InlineRecurringUsageTypeX56c31d8b() {
    public override val `value`: String = "licensed"
  }

  /**
   * Documented value. Wire value: `metered`.
   */
  public data object Metered : InlineRecurringUsageTypeX56c31d8b() {
    public override val `value`: String = "metered"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineRecurringUsageTypeX56c31d8b()

  public companion object {
    public fun fromValue(`value`: String): InlineRecurringUsageTypeX56c31d8b = when (value) {
      Licensed.value -> Licensed
      Metered.value -> Metered
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineRecurringUsageTypeX56c31d8b> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineRecurringUsageTypeX56c31d8b", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineRecurringUsageTypeX56c31d8b = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineRecurringUsageTypeX56c31d8b) {
      encoder.encodeString(value.value)
    }
  }
}
