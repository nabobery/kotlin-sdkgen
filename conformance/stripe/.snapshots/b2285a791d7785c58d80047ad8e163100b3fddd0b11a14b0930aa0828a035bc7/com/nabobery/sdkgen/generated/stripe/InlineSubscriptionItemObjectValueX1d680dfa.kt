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
 * Source: sdkgen://source/openapi.json#/components/schemas/subscription_item/properties/object
 */
@Serializable(with = InlineSubscriptionItemObjectValueX1d680dfa.Serializer::class)
public sealed class InlineSubscriptionItemObjectValueX1d680dfa {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `subscription_item`.
   */
  public data object SubscriptionItem : InlineSubscriptionItemObjectValueX1d680dfa() {
    public override val `value`: String = "subscription_item"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineSubscriptionItemObjectValueX1d680dfa()

  public companion object {
    public fun fromValue(`value`: String): InlineSubscriptionItemObjectValueX1d680dfa = when (value) {
      SubscriptionItem.value -> SubscriptionItem
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineSubscriptionItemObjectValueX1d680dfa> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineSubscriptionItemObjectValueX1d680dfa", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineSubscriptionItemObjectValueX1d680dfa = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineSubscriptionItemObjectValueX1d680dfa) {
      encoder.encodeString(value.value)
    }
  }
}
