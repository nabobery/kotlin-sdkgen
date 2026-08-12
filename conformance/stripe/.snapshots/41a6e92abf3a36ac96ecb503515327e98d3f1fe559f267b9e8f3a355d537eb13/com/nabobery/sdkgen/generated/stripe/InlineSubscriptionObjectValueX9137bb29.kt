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
 * Source: sdkgen://source/openapi.json#/components/schemas/subscription/properties/object
 */
@Serializable(with = InlineSubscriptionObjectValueX9137bb29.Serializer::class)
public sealed class InlineSubscriptionObjectValueX9137bb29 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `subscription`.
   */
  public data object Subscription : InlineSubscriptionObjectValueX9137bb29() {
    public override val `value`: String = "subscription"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineSubscriptionObjectValueX9137bb29()

  public companion object {
    public fun fromValue(`value`: String): InlineSubscriptionObjectValueX9137bb29 = when (value) {
      Subscription.value -> Subscription
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineSubscriptionObjectValueX9137bb29> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineSubscriptionObjectValueX9137bb29", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineSubscriptionObjectValueX9137bb29 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineSubscriptionObjectValueX9137bb29) {
      encoder.encodeString(value.value)
    }
  }
}
