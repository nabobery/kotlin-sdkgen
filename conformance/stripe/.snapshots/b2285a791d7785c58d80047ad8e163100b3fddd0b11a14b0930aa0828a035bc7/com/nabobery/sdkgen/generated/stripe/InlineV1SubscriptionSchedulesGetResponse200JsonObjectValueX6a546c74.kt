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
 * String representing the object's type. Objects of the same type share the same value. Always has the value `list`.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules/get/responses/200/content/application~1json/schema/p
 * roperties/object
 */
@Serializable(with = InlineV1SubscriptionSchedulesGetResponse200JsonObjectValueX6a546c74.Serializer::class)
public sealed class InlineV1SubscriptionSchedulesGetResponse200JsonObjectValueX6a546c74 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `list`.
   */
  public data object List : InlineV1SubscriptionSchedulesGetResponse200JsonObjectValueX6a546c74() {
    public override val `value`: String = "list"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1SubscriptionSchedulesGetResponse200JsonObjectValueX6a546c74()

  public companion object {
    public fun fromValue(`value`: String): InlineV1SubscriptionSchedulesGetResponse200JsonObjectValueX6a546c74 = when (value) {
      List.value -> List
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1SubscriptionSchedulesGetResponse200JsonObjectValueX6a546c74> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1SubscriptionSchedulesGetResponse200JsonObjectValueX6a546c74", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionSchedulesGetResponse200JsonObjectValueX6a546c74 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionSchedulesGetResponse200JsonObjectValueX6a546c74) {
      encoder.encodeString(value.value)
    }
  }
}
