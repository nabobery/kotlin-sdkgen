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
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_attempt_record/properties/object
 */
@Serializable(with = InlinePaymentAttemptRecordObjectValueX18eafefa.Serializer::class)
public sealed class InlinePaymentAttemptRecordObjectValueX18eafefa {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `payment_attempt_record`.
   */
  public data object PaymentAttemptRecord : InlinePaymentAttemptRecordObjectValueX18eafefa() {
    public override val `value`: String = "payment_attempt_record"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePaymentAttemptRecordObjectValueX18eafefa()

  public companion object {
    public fun fromValue(`value`: String): InlinePaymentAttemptRecordObjectValueX18eafefa = when (value) {
      PaymentAttemptRecord.value -> PaymentAttemptRecord
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentAttemptRecordObjectValueX18eafefa> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlinePaymentAttemptRecordObjectValueX18eafefa", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePaymentAttemptRecordObjectValueX18eafefa = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePaymentAttemptRecordObjectValueX18eafefa) {
      encoder.encodeString(value.value)
    }
  }
}
