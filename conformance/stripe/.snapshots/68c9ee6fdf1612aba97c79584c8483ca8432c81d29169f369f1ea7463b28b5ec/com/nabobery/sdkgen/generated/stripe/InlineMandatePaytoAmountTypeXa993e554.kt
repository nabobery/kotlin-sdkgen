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
 * The type of amount that will be collected. The amount charged must be exact or up to the value of `amount` param for
 * `fixed` or `maximum` type respectively. Defaults to `maximum`.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/mandate_payto/properties/amount_type
 */
@Serializable(with = InlineMandatePaytoAmountTypeXa993e554.Serializer::class)
public sealed class InlineMandatePaytoAmountTypeXa993e554 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `fixed`.
   */
  public data object Fixed : InlineMandatePaytoAmountTypeXa993e554() {
    public override val `value`: String = "fixed"
  }

  /**
   * Documented value. Wire value: `maximum`.
   */
  public data object Maximum : InlineMandatePaytoAmountTypeXa993e554() {
    public override val `value`: String = "maximum"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineMandatePaytoAmountTypeXa993e554()

  public companion object {
    public fun fromValue(`value`: String): InlineMandatePaytoAmountTypeXa993e554 = when (value) {
      Fixed.value -> Fixed
      Maximum.value -> Maximum
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineMandatePaytoAmountTypeXa993e554> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineMandatePaytoAmountTypeXa993e554", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineMandatePaytoAmountTypeXa993e554 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineMandatePaytoAmountTypeXa993e554) {
      encoder.encodeString(value.value)
    }
  }
}
