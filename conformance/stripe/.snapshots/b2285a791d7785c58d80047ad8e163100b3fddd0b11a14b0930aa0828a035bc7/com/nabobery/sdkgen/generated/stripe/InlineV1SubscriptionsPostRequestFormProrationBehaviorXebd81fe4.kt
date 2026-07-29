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
 * Determines how to handle [prorations](https://docs.stripe.com/billing/subscriptions/prorations) resulting from the
 * `billing_cycle_anchor`. If no value is passed, the default is `create_prorations`.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/proration_behavior
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormProrationBehaviorXebd81fe4.Serializer::class)
public sealed class InlineV1SubscriptionsPostRequestFormProrationBehaviorXebd81fe4 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `always_invoice`.
   */
  public data object AlwaysInvoice : InlineV1SubscriptionsPostRequestFormProrationBehaviorXebd81fe4() {
    public override val `value`: String = "always_invoice"
  }

  /**
   * Documented value. Wire value: `create_prorations`.
   */
  public data object CreateProrations : InlineV1SubscriptionsPostRequestFormProrationBehaviorXebd81fe4() {
    public override val `value`: String = "create_prorations"
  }

  /**
   * Documented value. Wire value: `none`.
   */
  public data object None : InlineV1SubscriptionsPostRequestFormProrationBehaviorXebd81fe4() {
    public override val `value`: String = "none"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1SubscriptionsPostRequestFormProrationBehaviorXebd81fe4()

  public companion object {
    public fun fromValue(`value`: String): InlineV1SubscriptionsPostRequestFormProrationBehaviorXebd81fe4 = when (value) {
      AlwaysInvoice.value -> AlwaysInvoice
      CreateProrations.value -> CreateProrations
      None.value -> None
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormProrationBehaviorXebd81fe4> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1SubscriptionsPostRequestFormProrationBehaviorXebd81fe4", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionsPostRequestFormProrationBehaviorXebd81fe4 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionsPostRequestFormProrationBehaviorXebd81fe4) {
      encoder.encodeString(value.value)
    }
  }
}
