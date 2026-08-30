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
 * Source: sdkgen://source/openapi.json#/components/schemas/source_mandate_notification/properties/object
 */
@Serializable(with = InlineSourceMandateNotificationObjectValueXf8a847b1.Serializer::class)
public sealed class InlineSourceMandateNotificationObjectValueXf8a847b1 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `source_mandate_notification`.
   */
  public data object SourceMandateNotification : InlineSourceMandateNotificationObjectValueXf8a847b1() {
    public override val `value`: String = "source_mandate_notification"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineSourceMandateNotificationObjectValueXf8a847b1()

  public companion object {
    public fun fromValue(`value`: String): InlineSourceMandateNotificationObjectValueXf8a847b1 = when (value) {
      SourceMandateNotification.value -> SourceMandateNotification
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineSourceMandateNotificationObjectValueXf8a847b1> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineSourceMandateNotificationObjectValueXf8a847b1", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineSourceMandateNotificationObjectValueXf8a847b1 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineSourceMandateNotificationObjectValueXf8a847b1) {
      encoder.encodeString(value.value)
    }
  }
}
