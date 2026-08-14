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
 * Only `maximum` is supported.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/invoice_mandate_options_payto/properties/amount_type
 */
@Serializable(with = InlineInvoiceMandateOptionsPaytoAmountTypeX50c97cfc.Serializer::class)
public sealed class InlineInvoiceMandateOptionsPaytoAmountTypeX50c97cfc {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `fixed`.
   */
  public data object Fixed : InlineInvoiceMandateOptionsPaytoAmountTypeX50c97cfc() {
    public override val `value`: String = "fixed"
  }

  /**
   * Documented value. Wire value: `maximum`.
   */
  public data object Maximum : InlineInvoiceMandateOptionsPaytoAmountTypeX50c97cfc() {
    public override val `value`: String = "maximum"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineInvoiceMandateOptionsPaytoAmountTypeX50c97cfc()

  public companion object {
    public fun fromValue(`value`: String): InlineInvoiceMandateOptionsPaytoAmountTypeX50c97cfc = when (value) {
      Fixed.value -> Fixed
      Maximum.value -> Maximum
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineInvoiceMandateOptionsPaytoAmountTypeX50c97cfc> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineInvoiceMandateOptionsPaytoAmountTypeX50c97cfc", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineInvoiceMandateOptionsPaytoAmountTypeX50c97cfc = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineInvoiceMandateOptionsPaytoAmountTypeX50c97cfc) {
      encoder.encodeString(value.value)
    }
  }
}
