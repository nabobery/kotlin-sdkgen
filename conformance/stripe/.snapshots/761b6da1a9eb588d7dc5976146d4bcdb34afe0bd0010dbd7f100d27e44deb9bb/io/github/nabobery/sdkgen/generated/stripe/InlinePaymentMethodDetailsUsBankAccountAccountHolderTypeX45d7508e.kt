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
 * Account holder type: individual or company.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payment_method_details_us_bank_account/properties/account_holder_typ
 * e
 */
@Serializable(with = InlinePaymentMethodDetailsUsBankAccountAccountHolderTypeX45d7508e.Serializer::class)
public sealed class InlinePaymentMethodDetailsUsBankAccountAccountHolderTypeX45d7508e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `company`.
   */
  public data object Company : InlinePaymentMethodDetailsUsBankAccountAccountHolderTypeX45d7508e() {
    public override val `value`: String = "company"
  }

  /**
   * Documented value. Wire value: `individual`.
   */
  public data object Individual : InlinePaymentMethodDetailsUsBankAccountAccountHolderTypeX45d7508e() {
    public override val `value`: String = "individual"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePaymentMethodDetailsUsBankAccountAccountHolderTypeX45d7508e()

  public companion object {
    public fun fromValue(`value`: String): InlinePaymentMethodDetailsUsBankAccountAccountHolderTypeX45d7508e = when (value) {
      Company.value -> Company
      Individual.value -> Individual
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentMethodDetailsUsBankAccountAccountHolderTypeX45d7508e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlinePaymentMethodDetailsUsBankAccountAccountHolderTypeX45d7508e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePaymentMethodDetailsUsBankAccountAccountHolderTypeX45d7508e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePaymentMethodDetailsUsBankAccountAccountHolderTypeX45d7508e) {
      encoder.encodeString(value.value)
    }
  }
}
