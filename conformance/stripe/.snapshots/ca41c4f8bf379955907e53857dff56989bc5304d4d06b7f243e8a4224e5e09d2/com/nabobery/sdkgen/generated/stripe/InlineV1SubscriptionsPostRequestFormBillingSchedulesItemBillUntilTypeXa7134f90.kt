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
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/billing_schedules/items/properties/bill_until/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/billing_schedules/items/properties/bill_until/properties/type
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormBillingSchedulesItemBillUntilTypeXa7134f90.Serializer::class)
public sealed class InlineV1SubscriptionsPostRequestFormBillingSchedulesItemBillUntilTypeXa7134f90 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `duration`.
   */
  public data object Duration : InlineV1SubscriptionsPostRequestFormBillingSchedulesItemBillUntilTypeXa7134f90() {
    public override val `value`: String = "duration"
  }

  /**
   * Documented value. Wire value: `timestamp`.
   */
  public data object Timestamp : InlineV1SubscriptionsPostRequestFormBillingSchedulesItemBillUntilTypeXa7134f90() {
    public override val `value`: String = "timestamp"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1SubscriptionsPostRequestFormBillingSchedulesItemBillUntilTypeXa7134f90()

  public companion object {
    public fun fromValue(`value`: String): InlineV1SubscriptionsPostRequestFormBillingSchedulesItemBillUntilTypeXa7134f90 = when (value) {
      Duration.value -> Duration
      Timestamp.value -> Timestamp
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormBillingSchedulesItemBillUntilTypeXa7134f90> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1SubscriptionsPostRequestFormBillingSchedulesItemBillUntilTypeXa7134f90", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionsPostRequestFormBillingSchedulesItemBillUntilTypeXa7134f90 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionsPostRequestFormBillingSchedulesItemBillUntilTypeXa7134f90) {
      encoder.encodeString(value.value)
    }
  }
}
