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
 * The type of amount that will be collected. The amount charged must be exact or up to the value of `amount` param for
 * `fixed` or `maximum` type respectively. Defaults to `maximum`.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/mandate_options_payto/properties/amount_type
 */
@Serializable(with = InlineMandateOptionsPaytoAmountTypeX712f80fa.Serializer::class)
public sealed class InlineMandateOptionsPaytoAmountTypeX712f80fa {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `fixed`.
   */
  public data object Fixed : InlineMandateOptionsPaytoAmountTypeX712f80fa() {
    public override val `value`: String = "fixed"
  }

  /**
   * Documented value. Wire value: `maximum`.
   */
  public data object Maximum : InlineMandateOptionsPaytoAmountTypeX712f80fa() {
    public override val `value`: String = "maximum"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineMandateOptionsPaytoAmountTypeX712f80fa()

  public companion object {
    public fun fromValue(`value`: String): InlineMandateOptionsPaytoAmountTypeX712f80fa = when (value) {
      Fixed.value -> Fixed
      Maximum.value -> Maximum
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineMandateOptionsPaytoAmountTypeX712f80fa> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineMandateOptionsPaytoAmountTypeX712f80fa", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineMandateOptionsPaytoAmountTypeX712f80fa = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineMandateOptionsPaytoAmountTypeX712f80fa) {
      encoder.encodeString(value.value)
    }
  }
}
