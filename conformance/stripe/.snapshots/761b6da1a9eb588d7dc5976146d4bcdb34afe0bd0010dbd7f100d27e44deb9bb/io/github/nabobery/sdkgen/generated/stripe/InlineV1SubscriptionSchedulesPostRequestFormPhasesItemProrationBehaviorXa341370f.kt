package io.github.nabobery.sdkgen.generated.stripe

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
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules~1{schedule}/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/phases/items/properties/proration_behavior.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules~1{schedule}/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/phases/items/properties/proration_behavior
 */
@Serializable(with = InlineV1SubscriptionSchedulesPostRequestFormPhasesItemProrationBehaviorXa341370f.Serializer::class)
public sealed class InlineV1SubscriptionSchedulesPostRequestFormPhasesItemProrationBehaviorXa341370f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `always_invoice`.
   */
  public data object AlwaysInvoice : InlineV1SubscriptionSchedulesPostRequestFormPhasesItemProrationBehaviorXa341370f() {
    public override val `value`: String = "always_invoice"
  }

  /**
   * Documented value. Wire value: `create_prorations`.
   */
  public data object CreateProrations : InlineV1SubscriptionSchedulesPostRequestFormPhasesItemProrationBehaviorXa341370f() {
    public override val `value`: String = "create_prorations"
  }

  /**
   * Documented value. Wire value: `none`.
   */
  public data object None : InlineV1SubscriptionSchedulesPostRequestFormPhasesItemProrationBehaviorXa341370f() {
    public override val `value`: String = "none"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1SubscriptionSchedulesPostRequestFormPhasesItemProrationBehaviorXa341370f()

  public companion object {
    public fun fromValue(`value`: String): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemProrationBehaviorXa341370f = when (value) {
      AlwaysInvoice.value -> AlwaysInvoice
      CreateProrations.value -> CreateProrations
      None.value -> None
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemProrationBehaviorXa341370f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1SubscriptionSchedulesPostRequestFormPhasesItemProrationBehaviorXa341370f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemProrationBehaviorXa341370f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionSchedulesPostRequestFormPhasesItemProrationBehaviorXa341370f) {
      encoder.encodeString(value.value)
    }
  }
}
