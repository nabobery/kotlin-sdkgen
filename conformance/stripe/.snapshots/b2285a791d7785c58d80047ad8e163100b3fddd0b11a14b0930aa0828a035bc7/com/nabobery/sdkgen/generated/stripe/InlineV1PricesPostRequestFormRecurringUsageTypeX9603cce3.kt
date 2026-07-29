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
 * sdkgen://source/openapi.json#/paths/~1v1~1prices/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/recurring/properties/usage_type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1prices/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/recurring/properties/usage_type
 */
@Serializable(with = InlineV1PricesPostRequestFormRecurringUsageTypeX9603cce3.Serializer::class)
public sealed class InlineV1PricesPostRequestFormRecurringUsageTypeX9603cce3 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `licensed`.
   */
  public data object Licensed : InlineV1PricesPostRequestFormRecurringUsageTypeX9603cce3() {
    public override val `value`: String = "licensed"
  }

  /**
   * Documented value. Wire value: `metered`.
   */
  public data object Metered : InlineV1PricesPostRequestFormRecurringUsageTypeX9603cce3() {
    public override val `value`: String = "metered"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1PricesPostRequestFormRecurringUsageTypeX9603cce3()

  public companion object {
    public fun fromValue(`value`: String): InlineV1PricesPostRequestFormRecurringUsageTypeX9603cce3 = when (value) {
      Licensed.value -> Licensed
      Metered.value -> Metered
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1PricesPostRequestFormRecurringUsageTypeX9603cce3> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1PricesPostRequestFormRecurringUsageTypeX9603cce3", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1PricesPostRequestFormRecurringUsageTypeX9603cce3 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1PricesPostRequestFormRecurringUsageTypeX9603cce3) {
      encoder.encodeString(value.value)
    }
  }
}
