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
 * Source: sdkgen://source/openapi.json#/components/schemas/application_fee/properties/refunds/properties/object
 */
@Serializable(with = InlineApplicationFeeRefundsObjectValueXacf550da.Serializer::class)
public sealed class InlineApplicationFeeRefundsObjectValueXacf550da {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `list`.
   */
  public data object List : InlineApplicationFeeRefundsObjectValueXacf550da() {
    public override val `value`: String = "list"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineApplicationFeeRefundsObjectValueXacf550da()

  public companion object {
    public fun fromValue(`value`: String): InlineApplicationFeeRefundsObjectValueXacf550da = when (value) {
      List.value -> List
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineApplicationFeeRefundsObjectValueXacf550da> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineApplicationFeeRefundsObjectValueXacf550da", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineApplicationFeeRefundsObjectValueXacf550da = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineApplicationFeeRefundsObjectValueXacf550da) {
      encoder.encodeString(value.value)
    }
  }
}
