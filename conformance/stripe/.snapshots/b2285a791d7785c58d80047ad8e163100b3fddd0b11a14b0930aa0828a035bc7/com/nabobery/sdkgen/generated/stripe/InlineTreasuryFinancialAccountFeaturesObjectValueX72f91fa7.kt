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
 * Source: sdkgen://source/openapi.json#/components/schemas/treasury.financial_account_features/properties/object
 */
@Serializable(with = InlineTreasuryFinancialAccountFeaturesObjectValueX72f91fa7.Serializer::class)
public sealed class InlineTreasuryFinancialAccountFeaturesObjectValueX72f91fa7 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `treasury.financial_account_features`.
   */
  public data object TreasuryFinancialAccountFeatures : InlineTreasuryFinancialAccountFeaturesObjectValueX72f91fa7() {
    public override val `value`: String = "treasury.financial_account_features"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineTreasuryFinancialAccountFeaturesObjectValueX72f91fa7()

  public companion object {
    public fun fromValue(`value`: String): InlineTreasuryFinancialAccountFeaturesObjectValueX72f91fa7 = when (value) {
      TreasuryFinancialAccountFeatures.value -> TreasuryFinancialAccountFeatures
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineTreasuryFinancialAccountFeaturesObjectValueX72f91fa7> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineTreasuryFinancialAccountFeaturesObjectValueX72f91fa7", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineTreasuryFinancialAccountFeaturesObjectValueX72f91fa7 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineTreasuryFinancialAccountFeaturesObjectValueX72f91fa7) {
      encoder.encodeString(value.value)
    }
  }
}
