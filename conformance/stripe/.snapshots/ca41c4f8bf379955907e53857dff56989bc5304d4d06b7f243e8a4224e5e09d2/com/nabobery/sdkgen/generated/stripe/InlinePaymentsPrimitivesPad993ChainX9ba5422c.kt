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
 * The name of the convenience store chain where the payment was completed.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payments_primitives_payment_records_resource_payment_method_konbini_
 * details_resource_store/properties/chain
 */
@Serializable(with = InlinePaymentsPrimitivesPad993ChainX9ba5422c.Serializer::class)
public sealed class InlinePaymentsPrimitivesPad993ChainX9ba5422c {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `familymart`.
   */
  public data object Familymart : InlinePaymentsPrimitivesPad993ChainX9ba5422c() {
    public override val `value`: String = "familymart"
  }

  /**
   * Documented value. Wire value: `lawson`.
   */
  public data object Lawson : InlinePaymentsPrimitivesPad993ChainX9ba5422c() {
    public override val `value`: String = "lawson"
  }

  /**
   * Documented value. Wire value: `ministop`.
   */
  public data object Ministop : InlinePaymentsPrimitivesPad993ChainX9ba5422c() {
    public override val `value`: String = "ministop"
  }

  /**
   * Documented value. Wire value: `seicomart`.
   */
  public data object Seicomart : InlinePaymentsPrimitivesPad993ChainX9ba5422c() {
    public override val `value`: String = "seicomart"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePaymentsPrimitivesPad993ChainX9ba5422c()

  public companion object {
    public fun fromValue(`value`: String): InlinePaymentsPrimitivesPad993ChainX9ba5422c = when (value) {
      Familymart.value -> Familymart
      Lawson.value -> Lawson
      Ministop.value -> Ministop
      Seicomart.value -> Seicomart
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentsPrimitivesPad993ChainX9ba5422c> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlinePaymentsPrimitivesPad993ChainX9ba5422c", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePaymentsPrimitivesPad993ChainX9ba5422c = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePaymentsPrimitivesPad993ChainX9ba5422c) {
      encoder.encodeString(value.value)
    }
  }
}
