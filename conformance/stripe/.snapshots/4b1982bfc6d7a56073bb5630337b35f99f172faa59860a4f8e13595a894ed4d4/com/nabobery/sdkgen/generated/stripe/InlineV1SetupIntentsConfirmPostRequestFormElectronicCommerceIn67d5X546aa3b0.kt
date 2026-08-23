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
 * Forward-compatible enum for
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}~1confirm/post/requestBody/content/application~1x-ww
 * w-form-urlencoded/schema/properties/payment_method_options/properties/card/properties/three_d_secure/properties/elect
 * ronic_commerce_indicator.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}~1confirm/post/requestBody/content/application~1x-ww
 * w-form-urlencoded/schema/properties/payment_method_options/properties/card/properties/three_d_secure/properties/elect
 * ronic_commerce_indicator
 */
@Serializable(with = InlineV1SetupIntentsConfirmPostRequestFormElectronicCommerceIn67d5X546aa3b0.Serializer::class)
public sealed class InlineV1SetupIntentsConfirmPostRequestFormElectronicCommerceIn67d5X546aa3b0 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `01`.
   */
  public data object _01 : InlineV1SetupIntentsConfirmPostRequestFormElectronicCommerceIn67d5X546aa3b0() {
    public override val `value`: String = "01"
  }

  /**
   * Documented value. Wire value: `02`.
   */
  public data object _02 : InlineV1SetupIntentsConfirmPostRequestFormElectronicCommerceIn67d5X546aa3b0() {
    public override val `value`: String = "02"
  }

  /**
   * Documented value. Wire value: `05`.
   */
  public data object _05 : InlineV1SetupIntentsConfirmPostRequestFormElectronicCommerceIn67d5X546aa3b0() {
    public override val `value`: String = "05"
  }

  /**
   * Documented value. Wire value: `06`.
   */
  public data object _06 : InlineV1SetupIntentsConfirmPostRequestFormElectronicCommerceIn67d5X546aa3b0() {
    public override val `value`: String = "06"
  }

  /**
   * Documented value. Wire value: `07`.
   */
  public data object _07 : InlineV1SetupIntentsConfirmPostRequestFormElectronicCommerceIn67d5X546aa3b0() {
    public override val `value`: String = "07"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1SetupIntentsConfirmPostRequestFormElectronicCommerceIn67d5X546aa3b0()

  public companion object {
    public fun fromValue(`value`: String): InlineV1SetupIntentsConfirmPostRequestFormElectronicCommerceIn67d5X546aa3b0 = when (value) {
      _01.value -> _01
      _02.value -> _02
      _05.value -> _05
      _06.value -> _06
      _07.value -> _07
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1SetupIntentsConfirmPostRequestFormElectronicCommerceIn67d5X546aa3b0> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1SetupIntentsConfirmPostRequestFormElectronicCommerceIn67d5X546aa3b0", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1SetupIntentsConfirmPostRequestFormElectronicCommerceIn67d5X546aa3b0 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1SetupIntentsConfirmPostRequestFormElectronicCommerceIn67d5X546aa3b0) {
      encoder.encodeString(value.value)
    }
  }
}
