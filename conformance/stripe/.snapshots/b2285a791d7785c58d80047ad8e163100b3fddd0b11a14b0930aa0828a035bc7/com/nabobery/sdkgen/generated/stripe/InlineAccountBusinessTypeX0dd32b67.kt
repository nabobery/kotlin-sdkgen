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
 * The business type.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/account/properties/business_type
 */
@Serializable(with = InlineAccountBusinessTypeX0dd32b67.Serializer::class)
public sealed class InlineAccountBusinessTypeX0dd32b67 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `company`.
   */
  public data object Company : InlineAccountBusinessTypeX0dd32b67() {
    public override val `value`: String = "company"
  }

  /**
   * Documented value. Wire value: `government_entity`.
   */
  public data object GovernmentEntity : InlineAccountBusinessTypeX0dd32b67() {
    public override val `value`: String = "government_entity"
  }

  /**
   * Documented value. Wire value: `individual`.
   */
  public data object Individual : InlineAccountBusinessTypeX0dd32b67() {
    public override val `value`: String = "individual"
  }

  /**
   * Documented value. Wire value: `non_profit`.
   */
  public data object NonProfit : InlineAccountBusinessTypeX0dd32b67() {
    public override val `value`: String = "non_profit"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAccountBusinessTypeX0dd32b67()

  public companion object {
    public fun fromValue(`value`: String): InlineAccountBusinessTypeX0dd32b67 = when (value) {
      Company.value -> Company
      GovernmentEntity.value -> GovernmentEntity
      Individual.value -> Individual
      NonProfit.value -> NonProfit
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineAccountBusinessTypeX0dd32b67> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineAccountBusinessTypeX0dd32b67", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAccountBusinessTypeX0dd32b67 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAccountBusinessTypeX0dd32b67) {
      encoder.encodeString(value.value)
    }
  }
}
